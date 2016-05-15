package compiler.test;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import Proxy.Moveable;
import Proxy.Tank;

public class Test1 {
	public static void main(String[] args) throws Exception{
		String rt = "\r\n";
		String source = 
				"package Proxy;" +  rt +

				"public class TankTimeProxy implements Moveable{" + rt +
				"    Moveable t;"+  rt +
				" 	 @Override " +  rt +
				"	 public void move() { "+  rt +
				"			long start = System.currentTimeMillis();"+  rt +
				"			t.move();"+  rt +
				"			long end = System.currentTimeMillis();"+  rt +
				"			System.out.println(\"time:\" + (start - end));"+  rt +
				"	 }"+  rt +
				"	 public TankTimeProxy(Moveable t) {"+  rt +
				"			super();"+  rt +
				"			this.t = t;"+  rt +
				"	 }"+  rt +
			"	}";
		String fileName = System.getProperty("user.dir") + "/src/proxy/TankTimeProxy.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(source);
		fw.flush();
		fw.close();
		
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileManager.getJavaFileObjects(fileName);
		CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
		task.call();
		fileManager.close();
		
		//load into memory and create an instance
		URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir") + "/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("Proxy.TankTimeProxy");
		
		Constructor constructor = c.getConstructor(Moveable.class);
		Moveable m = (Moveable)constructor.newInstance(new Tank());
		
	}
}

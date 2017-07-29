package com.xiaofengge.thinkinjava;

import static net.mindview.util.Print.*;

interface Service {
	void method1();
	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	Implementation1() {};
	public void method1() {
		print("Implementation1 method1");
	}
	
	public void method2() {
		print("Implementation1 method2");
	}
}

class Implementation1Factory implements ServiceFactory {
	public Service getService(){
		return new Implementation1();
	}
}

class Implementation2 implements Service {
	Implementation2() {};
	public void method1() {
		print("Implementation2 method1");
	}
	
	public void method2() {
		print("Implementation2 method2");
	}
}

class Implementation2Factory implements ServiceFactory {
	public Service getService(){
		return new Implementation2();
	}
}

public class FactoryTest {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	
	
	public static void main (String[] args ) {
//		Implementation1 imp1= new Implementation1();
//		imp1.method1();
//		imp1.method2();
//		
//		Implementation2 imp2= new Implementation2();
//		imp2.method1();
//		imp2.method2();
		
		serviceConsumer (new Implementation1Factory());
		serviceConsumer (new Implementation2Factory());
	}

}

package com.xiaofengge.thinkinjava;

import java.util.Random;

public class ControllingExecution {
	
	private int vampire = 0;
	private  int  part1 = 0;
	private  int  part2 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		fibonacci (30);
		
//		vampireNumber();
	
		ControllingExecution vnum = new ControllingExecution();
		int n = 1000;
		for (n = 1000; n < 10000 ; n++) {
			if (vnum.isVampire(n)) {
				System.out.println(n + " = " + vnum.getPart1() + " * " + vnum.getPart2() );
			}
		}
		
		
					
	}
	
	
	public void setVampire (int vampire) {
//		this.vampire = vampire;
	}
	
	public int getPart1(){
		return part1;
	}
	
	
	public int getPart2(){
		return part2;
	}
	
	public  boolean isVampire (int number ) {
		if (number % 100 == 0) {
			return false;
		}
		
		int a;
		int b;
		int c;
		int d;
		a = number/ 1000;
		b = number % 1000 / 100;
		c = number % 100 / 10;
		d = number % 10;
		
		if (number ==  calc(a,b,c,d) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(a,b,d,c) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(b,a,c,d) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(a,b,d,c) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(a,c,b,d) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(a,c,d,b) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(c,a,b,d) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(c,a,d,b) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(a,d,b,c) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(a,d,c,b) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(d,a,b,c) ){
			setVampire(number);
			return true;
		}
		if (number ==  calc(d,a,c,b) ){
			setVampire(number);
			return true;
		}
		return false;
	}
	
	public  int calc (int n1, int n2 , int n3, int n4) {
		int t1;
		int t2;
		t1 = n1 * 10 + n2;
		t2 = n3 * 10 + n4;
		this.part1 = t1;
		this.part2 = t2;
		return t1*t2;
	}
	
	
	public static void fibonacci (int number) {
		
		int a = 0;
		int b= 1;
		int fib = 1;
		for (int i = 0 ; i < number ; i++) {
			System.out.println(fib);
			fib = a + b;
			a = b;
			b = fib;
		}
	}
	
	public void primeNumber(){
		System.out.println(2);
		for (int i = 3; i < 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println(i);
			}
			
		}
	}
	
	public void compareRandom(){
		Random rand = new Random();
//		int[] array = null ;
		int after ;
		int before ;
		after = rand.nextInt(32);
		System.out.println(after);	
		for (int i = 0; i < 25 ; i++) {
//			System.out.println(i);										
		    before = after;
			after = rand.nextInt(32);
//			System.out.println(before);	
			System.out.println(after);	
//			System.out.println("=================");	
			if (before > after) {
				System.out.println(" the first " + before + " is greater than the seocnd " + after);
			} else if (before < after) {
				System.out.println(" the first " + before + " is less than the seocnd " + after);
			} else {
				System.out.println(" the first " + before + " is equal than the seocnd " + after);
			}
			
//			array[i] = rand.nextInt(32);
			
//			Random
		}
	}
	

}

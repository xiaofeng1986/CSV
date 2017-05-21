package com.xiaofengge.thinkinjava;

import java.util.Arrays;
import java.util.Random;
import static net.mindview.util.Print.*;

public class InitializationCleanup {
	
	boolean checkedOut = false;
	InitializationCleanup (boolean checkOut) {
		checkedOut = checkOut;
	}
	
	void checkIn() {
		checkedOut = false ;
	}
	
//	protected void  finalize () {
//		if (checkedOut) {
//			System.out.print("Error : checked out");
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		InitializationCleanup novel = new InitializationCleanup(true);
//		novel.checkIn();
//		new InitializationCleanup(true);
//		System.gc();
		
		int[] a;
		Random rand = new Random(47);
		int ran = rand.nextInt(10);
		print(ran);
		a = new int[ran];
		print("length of a = " + a.length);
		print(Arrays.toString(a));
		
	}

}

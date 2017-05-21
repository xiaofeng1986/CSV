package com.xiaofengge.thinkinjava;

public class InitializationCleanup {
	
	boolean checkedOut = false;
	InitializationCleanup (boolean checkOut) {
		checkedOut = checkOut;
	}
	
	void checkIn() {
		checkedOut = false ;
	}
	
	protected void  finalize () {
		if (checkedOut) {
			System.out.print("Error : checked out");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InitializationCleanup novel = new InitializationCleanup(true);
		novel.checkIn();
		new InitializationCleanup(true);
		System.gc();
	}

}

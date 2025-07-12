package com.runnableexample;

public class Test extends RunnableExample{
	
	public static void main(String[] args) {
		
		Test test = new Test();
		
		Thread t = new Thread(test);
		t.start();
	}

}

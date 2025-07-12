package com.thread;

class MyThread extends Thread{
	
	@Override
	public void run() {

		System.out.println("This is the run method");
	}

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		
		myThread.start();
	}

}

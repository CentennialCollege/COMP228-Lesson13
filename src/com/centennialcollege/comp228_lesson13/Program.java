package com.centennialcollege.comp228_lesson13;

// DRIVER CLASS
public class Program {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread("1");
		MyThread thread2 = new MyThread("2");
			
		thread1.start(); // START SECONDARY THREAD
		thread2.start(); // START SECONDARY THREAD
		
		// START OUR MAIN OPERATION
		for(int index = 0; index < 10; index ++) {
			System.out.println("Main Count: " + index);
			try {
				Thread.sleep(1000); // wait for 1000 ms = 1 sec
			} catch (InterruptedException exception) {
				System.err.println("Thread Interrupted: " + exception);
			}
		}

	}

}

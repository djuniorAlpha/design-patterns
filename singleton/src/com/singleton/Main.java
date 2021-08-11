package com.singleton;

public class Main {

	public static void main(String[] args) {
		//Single Thread
		/*System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
	                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
	                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);*/
        
        
        //Multi Thread
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
	}
	
	static class ThreadFoo implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("FOO");
			System.out.println(singleton.value);
		}
	}
	
	static class ThreadBar implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("BAR");
			System.out.println(singleton.value);
		}
	}

}

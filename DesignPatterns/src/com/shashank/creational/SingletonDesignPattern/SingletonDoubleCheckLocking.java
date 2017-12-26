package com.shashank.creational.SingletonDesignPattern;

/*If you notice carefully once an object is created synchronization is no longer useful because now obj
will not be null and any sequence of operations will lead to consistent results.
So we will only acquire lock on the getInstance() once, when the obj is null.
This way we only synchronize the first way through, just what we want.
*/


//Before Java 4 this will NOT work. 

public class SingletonDoubleCheckLocking {

	/*
	 * We have declared the obj volatile which ensures that multiple threads offer
	 * the obj variable correctly when it is being initialized to Singleton
	 * instance. This method drastically reduces the overhead of calling the
	 * synchronized method every time.
	 */
	
	// Volatile ensures that we have correct state of variable when shared among different threads

	public volatile static SingletonDoubleCheckLocking singleton;

	private SingletonDoubleCheckLocking() {
	}

	public SingletonDoubleCheckLocking getInstance() {

		if (singleton == null) {

			synchronized (SingletonDoubleCheckLocking.class) {

				// Double check as multiple threads can reach till above steps
				if (singleton == null) {
					singleton = new SingletonDoubleCheckLocking();
				}
			}
		}
		return singleton;

	}
}

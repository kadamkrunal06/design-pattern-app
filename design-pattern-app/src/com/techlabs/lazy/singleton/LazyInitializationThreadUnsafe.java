package com.techlabs.lazy.singleton;

public class LazyInitializationThreadUnsafe {

	private static LazyInitializationThreadUnsafe instance = null;

	private LazyInitializationThreadUnsafe() {
		System.out
				.println("LazyInitializationThreadUnsafe.LazyInitializationThreadUnsafe()");
	}

	public static LazyInitializationThreadUnsafe getInstance() {

		if (instance == null) {
			instance = new LazyInitializationThreadUnsafe();
		}

		return instance;
	}

}

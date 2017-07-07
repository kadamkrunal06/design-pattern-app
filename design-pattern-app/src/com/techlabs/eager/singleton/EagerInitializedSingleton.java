package com.techlabs.eager.singleton;

public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
		System.out.println("This is eager initialization");
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}

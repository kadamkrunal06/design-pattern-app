package com.techlabs.lazy.singleton.test;

import com.techlabs.lazy.singleton.LazyInitializationThreadUnsafe;

public class LazyInitializationTest {
	public static void main(String[] args) {

		LazyInitializationThreadUnsafe.getInstance();
	}
}

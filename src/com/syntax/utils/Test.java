package com.syntax.utils;

public class Test extends BaseClass {

	public static void main(String[] args) {
		setUp();
		String title = driver.getTitle();
		System.out.println(title);
		tearDown();

	}

}

package com.design;

public class SingleTonTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		System.out.println(SingleTon.getInstance());
	}
}

class SingleTon {

	private static SingleTon INSTANCE = null;

	private SingleTon() {

	}

	public static SingleTon getInstance() {
		if (INSTANCE == null) {
			synchronized (SingleTon.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingleTon();
				}
			}
		}
		return INSTANCE;
	}

}

package hu.unideb.prog2;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		try {
			throwException();
		} catch (IOException e) {
			e.printStackTrace(System.out);
			System.out.println("in catch IOException");
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.out.println("in catch Exception");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Hello World!");
	}
	
	public static void throwException() throws Exception {
		throw new Exception();
	}
	
}

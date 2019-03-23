package packagea;

import packageb.*;

public class ClassA {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		ClassB instancia = new ClassB(a,b);
		System.out.println(instancia.metodo());

	}
	
}

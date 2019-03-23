package fundamental.programming.structures;

public class MainMethod {

	// Main method needs to be static and public
	public static void main(String[] args) {
		System.out.println("Main method alive");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(metodo());
	}
	
	public static int metodo() {
		return 99;
	}

}

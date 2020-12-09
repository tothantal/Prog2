public class NullExceptionProgram {
	public static void main(String []args) {
		String mytring = null;
		if (!("foobar".equals(myString))) {
			System.out.println("It works!");  // Does not work
		}
	}
}

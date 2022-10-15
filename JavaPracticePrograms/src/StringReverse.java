
public class StringReverse {

	public static void main(String[] args) {
		String name = "My name is Pratheek";
		String reverse = " ";
		char ch;

		System.out.println("The String to be reversed: " + name);
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println("the reversed string is: " + reverse);

	}

}

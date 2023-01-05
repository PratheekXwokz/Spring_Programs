import java.util.regex.Pattern;

public class ReverseStringByWord {
	public static void main(String[] args) {
		String s1 = "My Name is Pratheek";
		Pattern pattern = Pattern.compile("/s");

		String[] s = pattern.split(s1);

		String result = "";

		for (int i = 0; i < s.length; i++) {
			if (i == s.length - 1)
				result = s[i] + result;
			else
				result = " " + s[i] + result;
		}
		System.out.println(result);

	}

}

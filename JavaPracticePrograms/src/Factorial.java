
public class Factorial {
	public static void main(String[] args) {
	int i;
	int fact=1;
	int number=4;
	for(i=1;i<=number;i++) {
		fact=fact*i;
	}
	System.out.println("The factorial of "+number+" is: "+fact);
}
}

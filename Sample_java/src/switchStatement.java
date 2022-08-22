import java.util.Scanner;

public class switchStatement {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a, b;
	String ch;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st number: ");
	a = sc.nextInt();
	System.out.print("Enter 2nd number: ");
	b = sc.nextInt();
	System.out.print("What to do: ");
	ch = sc.next();
	sc.close();
	switch (ch) {
	case "add":
	    System.out.print("Addition: " + (a + b));
	    break;
	case "sub":
	    System.out.print("Subtraction: " + (a - b));
	    break;
	case "mul":
	    System.out.print("Multiplication: " + (a * b));
	    break;
	case "div":
	    System.out.print("Division: " + (a / b));
	    break;
	default:
	    System.out.println("Invalid Choice");
	}
    }

}

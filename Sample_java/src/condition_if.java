import java.util.Scanner;

public class condition_if {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Enter Password");
	Scanner sc = new Scanner(System.in);
	String Pass = sc.next();
	sc.close();
	// System.out.println(Pass);
	if (Pass.equals("1234")) {
	    System.out.println("Login Success");
	} else {
	    System.out.println("Login Failed, please try again");
	}
    }

}

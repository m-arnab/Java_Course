import java.util.Scanner;

public class Input_Output {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st value");
	int num1 = sc.nextInt();
	System.out.println("Enter 2nd value");
	int num2 = sc.nextInt();
	sc.close();
	System.out.println("Addition: " + (num1 + num2));
    }

}

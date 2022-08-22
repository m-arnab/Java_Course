import java.util.Scanner;

public class doWhileloop {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Enter number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	sc.close();
	int i = 1;
	do {

	    System.out.println(i * num);
	    i++;
	}

	while (i <= 10);

    }
}

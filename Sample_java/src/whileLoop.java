import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {
	int i = 1;
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	sc.close();
// TODO Auto-generated method stub
	while (i <= 10) {
	    System.out.println(num * i);
	    i += 1;
	}
    }

}

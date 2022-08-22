
public class methods_userDefined {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	// method m = new method();
	methods_userDefined s = new methods_userDefined();
	System.out.println(method.printData());
	System.out.println(s.sum(2, 3));

    }

    int sum(int a, int b) {
	return a + b;
    }

}

class method {
    static String printData() {
	return "Hello world";
    }
}


public class parameterizedConstructor {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	A obj1 = new A(15, 20);
	obj1.show();
	A obj2 = new A(15, "arnab");
    }

}

class A {
    int x, y;

    A(int a, int b) {
	x = a;
	y = b;
    }

    void show() {
	System.out.println("A: " + x + " B: " + y);
    }

    A(int a, String b) {
	System.out.println("A: " + a + " B: " + b);
    }
}

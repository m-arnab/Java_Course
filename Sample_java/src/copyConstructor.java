
public class copyConstructor {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	D obj1 = new D();
	D obj2 = new D(obj1);

    }

}

class D {
    int a;
    String b;

    D() { // Default Constructor
	a = 20;
	b = "Arnab";
	System.out.println("A: " + a + " B: " + b);
    }

    D(D ref) { // Copy Constructor
	System.out.println("A: " + ref.a + " B: " + ref.b);
    }

}

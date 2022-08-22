
public class superKeywordDefaultConstr {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	child1 obj1 = new child1();
    }

}

class parent2 {
    parent2() {
	System.out.println("Parent Class");
    }

    parent2(int s) {
	System.out.println("Number: " + s);
    }

    /*
     * public void parent1(int i) { // TODO Auto-generated method stub
     * System.out.println("Number: " + i); }
     */
}

class child1 extends parent2 {
    child1() {
	// super method will automatically get call in case of default constructor
//	super(10);
	System.out.println("Child Class");
    }
}
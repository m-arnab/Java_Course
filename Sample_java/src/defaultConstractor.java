class test1 {
    int a;
    String name;

    test1() {
	a = 0;
	name = null;
	System.out.print("a: " + a + " name: " + name);
    }

}

class defaultConstractor {
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	test1 obj = new test1();
    }
}
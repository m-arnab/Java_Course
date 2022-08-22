
public class superKeywordMethod {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	output obj = new output();
	obj.Output();
    }

}

class parent {
    public void show() {
	System.out.println("This is in parent class");
    }
}

class child extends parent {
    public void show() {
	super.show();
	System.out.println("This is in child class");
    }
}

class output {
    public void Output() {
	child obj3 = new child();
	obj3.show();
	System.out.println("This is 3rd method");
    }
}


public class InstanceVsStaticBlock {
    int num = 5;
    static int num1 = 10;

    InstanceVsStaticBlock() {
	System.out.println("Default constructor");
    }

    {// This block call instance block, no keyword is required here
	System.out.println("Instance block " + num + " " + num1);
    }
    // instance block can access both static and non static data member

    static {// This block call static block, static keyword is required here
	System.out.println("Static block" + " " + num1);
    }
    // static block can only access static data member

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	InstanceVsStaticBlock obj = new InstanceVsStaticBlock();
    }

}

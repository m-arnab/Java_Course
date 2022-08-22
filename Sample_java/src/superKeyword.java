
public class superKeyword {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	b obj = new b();
	obj.show();
//	System.out.println(b.number);
//	System.out.println(obj.number);
    }

}

class l {
    int number = 10;
}

class b extends l {

    int number = 20;

    void show() {
	System.out.println("Number: " + super.number);
    }
}

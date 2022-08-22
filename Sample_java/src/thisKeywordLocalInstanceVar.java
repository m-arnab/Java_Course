
public class thisKeywordLocalInstanceVar {

    int num; // instance variable

    thisKeywordLocalInstanceVar(int num) // local variable
    {
	this.num = num;

    }

    void show() {
	System.out.println(num);
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	thisKeywordLocalInstanceVar obj = new thisKeywordLocalInstanceVar(200);
	obj.show();
    }

}

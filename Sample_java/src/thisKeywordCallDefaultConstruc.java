
public class thisKeywordCallDefaultConstruc {

    thisKeywordCallDefaultConstruc() {
	System.out.println("Default constructor");
    }

    thisKeywordCallDefaultConstruc(int num) {
	this();
	System.out.println(num);
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	thisKeywordCallDefaultConstruc obj = new thisKeywordCallDefaultConstruc(100);
    }

}

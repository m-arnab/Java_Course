
public class privateConstructor {
    int z;
    String title;

    private privateConstructor() {
	z = 10;
	title = "mallik";
	System.out.println("z: " + z + " Title: " + title);
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	privateConstructor obj = new privateConstructor();

    }

}

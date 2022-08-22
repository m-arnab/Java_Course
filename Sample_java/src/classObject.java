
public class classObject {
    int age = 22; // properties
    int weight = 55;
    String color = "bright";

    void eat() {
	System.out.println("I can eat"); // Behavior
    }

    void sleep() {
	System.out.println("I can sleep");
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	classObject obj = new classObject();
	System.out.println("Age: " + obj.age + " ,color: " + obj.color);
	obj.eat();
	obj.sleep();
    }

}

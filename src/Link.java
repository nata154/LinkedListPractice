package packageList;

public class Link {
	
	public int age;
	public String name;
	public Link next;
	public Link(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void displayLink() {
		System.out.println("age: "+ age + ", " + "name: " + name);
	}
}

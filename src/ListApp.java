package packageList;

public class ListApp {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.insertFirst(18, "Ivan0");
		theList.insertFirst(28, "Ivan1");
		theList.insertFirst(38, "Ivan2");
		theList.insertFirst(48, "Ivan3");
		theList.insertLast(100, "Nadya");
		theList.displayList();
	}
}

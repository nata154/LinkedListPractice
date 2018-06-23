package packageList;

public class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int age, String name) {
		Link newLink = new Link(age, name);
		newLink.next = first;
		first = newLink;
	}

	public void insertLast(int age, String name) {
		Link newLink = new Link(age, name);
		Link current = first;
		Link lastLink = first;
		while (current != null) {
			current = current.next;
			if (current != null) {
				lastLink = current;
			}
		}
		lastLink.next = newLink;
	}

	public void displayList() {
		System.out.println("List (first-->last): ");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}

}

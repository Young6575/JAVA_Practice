package 자바_8장_내부클래스.실습;

public class MyLinkedListTest {
	private Node head;

	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}

	public void add(String data) {
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
		} else {
			
			while ()
			
		}
		

	}

	public void printList() {
		// printList() 결과는 A -> B -> C 등으로 출력한다
	}

	public void delete(String data) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cha08_test_내부클래스구현 myList = new cha08_test_내부클래스구현();
		myList.printList();

		myList.add("JAVA");
		myList.add("HTML");
		myList.add("CSS");
		myList.add("Javascript");
		myList.printList();
		myList.delete("CSS");
		myList.printList();
	}

}

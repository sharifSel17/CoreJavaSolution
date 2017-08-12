package datastructureinjava;

public class LinkedList {
	// static String data = "[";
	ListNode head;
	int length = 0;

	public void insertNodeAtBegin(int data) {
		ListNode nodeObj = new ListNode(data);
		nodeObj.setNext(head);
		head = nodeObj;
		length++;
	}

	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.insertNodeAtBegin(6);
		obj.insertNodeAtBegin(7);
		obj.insertNodeAtBegin(8);
		obj.insertNodeAtBegin(9);
		obj.insertNodeAtBegin(10);
		System.out.println(obj.toString());
	}

	/*
	 * public String toString(){ try{
	 * 
	 * data = data + head.getData(); ListNode temp = head.getNext();
	 * 
	 * while(temp!=null){ data = data + ","+temp.getData(); temp =
	 * temp.getNext(); } //return data+"]"; }catch(Exception ex){
	 * 
	 * } return data+"]";
	 * 
	 * 
	 * }
	 */
	public String toString() {
		String data = "[";
		data = data + head.getData();
		ListNode temp = head.getNext();

		while (temp != null) {
			data = data + "-->" + temp.getData();
			temp = temp.getNext();
		}
		return data + "]";

	}

}

import java.util.*;
class Node{
		Node next ;
		int data;
		public Node(int data){
			this.data = data;
			next = null;
		}
		public int getData(Node n){
			return  data;
		}
		public Node getNext(Node n){
			return  next;
		}
		public void setNext(Node n){
			next = n;
		}
	}

	class mergeLinked{
		Node head;
		public void insertStart(int data){
			Node n = new Node(data);
			if(head==null){
				head = n;
				head.next = null;
			}
			else{
				//temp = head;
				n.setNext(head);
				head = n;

			}
		}
		public void traverse(){
			Node temp = head;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
		public static mergeLinked merge(mergeLinked list1,mergeLinked list2){
			mergeLinked newList = new mergeLinked();
			Node head1 = list1.head;
			Node head2 = list2.head;
			Node head = null,temp1 = head1, temp2 = head2;
			if(head1.data<head2.data){
				head = head1;
				newList.head = head;
				temp1 = head1.next;
				System.out.println("temp1 is "+temp1.data);
			}
			else{
				head = head2;
				newList.head = head;
				temp2 = head2.next;
				System.out.println("temp2 is "+temp2.data);
			}
			System.out.println("temp1 is "+temp1.data);
			System.out.println("head is "+head.data);
			//Node temp = newList.head;
			while(temp1!=null&&temp2!=null){
				if(temp1.data<temp2.data){
					head.next = temp1;
					System.out.println("next of head is "+head.next.data);
					temp1 = temp1.next;
					head = head.next;
				}
				else{
					head.next = temp2;
					System.out.println("next is "+head.next.data);
					temp2 = temp2.next;
					head = head.next;
				}
			}
			while(temp1!=null){
				head.next = temp1;
				temp1 = temp1.next;
				head = head.next;
			}
			while(temp2!=null){
				head.next = temp2;
				temp2 = temp2.next;
				head = head.next;
			}
			return newList;

		}
		public static void main(String[] args) {
		mergeLinked list1 = new mergeLinked();
		//Node head = new Node(2);
		mergeLinked list2 = new mergeLinked();

		mergeLinked result = new mergeLinked();

		list1.insertStart(9);
		list1.insertStart(8);
		list1.insertStart(6);
		list1.insertStart(5);
		list1.insertStart(4);
		list1.insertStart(2);

		list2.insertStart(7);
		list2.insertStart(3);
		list2.insertStart(1);

		//list2.traverse();
		result = merge(list1,list2);
		result.traverse();
	}
	}
	

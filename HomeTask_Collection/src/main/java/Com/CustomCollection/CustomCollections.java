package Com.CustomCollection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomCollections {
	
	public static final Logger LOGGER = LogManager.getLogger(CustomCollections.class);
	
	 public Node head = null;
	 public Node tail = null;
	 class Node {
		String name;
		 int id;
		 String dept;
		 int year;
		 Node next;
		 Node(String name, int id, String dept, int year) {
			 this.name = name;
			 this.id = id;
			 this.dept = dept;
			 this.year = year;
			 this.next = null;
		 }
	 }
	 public void insert(String name, int id, String dept, int year) {
		 Node newnode = new Node(name, id, dept, year);
		 newnode.next = head;
		 head = newnode;
		 }
	 public void removeLastElement() {
		 if (head == null) {
			 LOGGER.info("CustomList is Already Empty");
			 return ;
	     }
		 else {
			 head = head.next;
			 LOGGER.info("The Last Entered Data is Removed");
		 }
		 }
	 public void popElementAtSpecifiedIndex(int position) {
		 if (head == null)
			 return ;
		 LOGGER.info("After Popping the Specified Index Position "+ (position+1) + " the CustomList: ");
		 Node temp = head; 
	        if (position == 0) 
	        { 
	            head = temp.next;  
	            return; 
	        }
	        for (int i=0; temp!=null && i<position-1; i++) 
	            temp = temp.next;
	        if (temp == null || temp.next == null) 
	            return; 
	        
	        Node next = temp.next.next; 
	        temp.next = next;
	 }
	 public void fetchDetailsOfStudentById(int id) {
		 Node temp = head;
		 while (temp != null) {
			 if (id == temp.id) {
				 LOGGER.info("Fetched Element is available in the CustomList and Corresponding details are "+ temp.name + " "+temp.dept+" "+temp.year);
				 return ;
			 }
			 temp = temp.next;
		 }
		 LOGGER.info("Fetching Element is not available in the CustomList");
	 }
	 public void customPrint() {
		 Node newnode = head;
		 while (newnode != null) {
			 LOGGER.info(newnode.id +" "+ newnode.name + " " + newnode.dept + " " + newnode.year);
			 newnode = newnode.next;
		 }
	 }
	 }



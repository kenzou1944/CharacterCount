import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Open{  
	public static class Node{
		String data;
		Node next;

		public Node(String data)  { //for last element in linked list
			this.data = data;
		}  // constructor
	}
	
	 public static class LinkedList{
		Node dummy; 
		Node ListHead; 

		public LinkedList() { // ln is junk listnode 
			Node ln = new Node(null); //set data and next to null
			dummy=ln;  
			ListHead=ln; 
		}

		public void append (String s) {
			Node Inserted_Node = new Node(s);
			if(ListHead.next==null){
				ListHead.next = Inserted_Node;
			}
			else{
				Node current=dummy;
				while(current.next!=null && current.next.data.compareTo(Inserted_Node.data)<0){
					//inserted_node is greater then current
					current=current.next;									
					// move to next until reach to end
					// exit if inserted_node is less then current and insert node there
				}
				Node temp=current.next;
				current.next=Inserted_Node;
				Inserted_Node.next=temp;
			
			}
		}
		public void print_to_console() {
			Node check=ListHead.next;
			System.out.print("ListHead->");
			System.out.print("dummy:");
			while (check!=null )
			{
				String value=check.data;
				System.out.print(value+"->"+value+":");
				check=check.next;
			}
			System.out.println(check);
		}
		}
		
	public static void main(String[] args) {
		FileOutputStream f=null;
		 try {
			 f=new FileOutputStream(args[1]);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.setOut(new PrintStream(f));
		LinkedList l = new LinkedList();
		File file = new File(args[0]);
		try {
			
	        Scanner sc = new Scanner(file);
	    	l.print_to_console();
	    	int count=0;
	        while(sc.hasNext() && count<14){
	        	String s=sc.next();
	        	l.append(s);
	        	l.print_to_console();
	        	count++;
	        }
	      
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}

}
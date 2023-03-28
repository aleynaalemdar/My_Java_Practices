package cmpe223;

public class question1_w2 {
	/*Using the singly-linked class definition in course
	slides (page 6),
	 write a method that finds the sum of all data on the
	linked list.
	 */
	 public static class Node {
	 Node next;
	 int data;
	 }
	 
	 public static class Linked {
		 
	 public int getSum(Node n){
		
	 
	 if (n == null) {
	 return 0;
	 }
	 int sum = 0;
	 while (n != null) {
	 sum = sum + n.data;
	 n = n.next;
	 }
	 return sum;
	 }
	 
	 
	 public static void main(String[] args) {
	 Linked a = new Linked();
	 Node head = null;
	 System.out.println(a.getSum(head));
	 }
	 }
 }


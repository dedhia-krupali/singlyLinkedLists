
public class SinglyLinkedList <AnyType extends IDedObject> {
		private Node head;
		private int size;
		
		public SinglyLinkedList() {
			head = null;
			size = 0;
		}
		
		 public void makeEmpty(){
		       head = null;
		       size = 0;
		 }
		 
		 public boolean insertAtFront(AnyType element){
		      
		       Node node = new Node(element, null);
		      
		       //If list empty, insert x and return true
		       if(head == null){
		           head = node;
		           size++;
		           return true;
		  }
		       Node ptr = head;
		       
		       while(ptr != null){
		           //If ID already present return false
		           if(ptr.getElement().getID() == element.getID()){
		               return false;
		           }
		           else{
		               ptr = ptr.getNext();
		           }
		       }
		      
		       //ID not present in the list. Insert x at the front of the list and return true;
		       node.setNext(head);
		       head = node;
		       size++;
		      
		       return true;
		   }
		  public AnyType findID(int ID){
		       Node ptr = head;
		      
		       while(ptr!=null){
		           if(ptr.getElement().getID() == ID){
		               return ptr.getElement();
		           }
		           else{
		               ptr = ptr.getNext();
		           }
		       }
		      
		       return null;
		   }
		  public AnyType deleteFromFront(){
		      
		       if(head == null){
		           return null;
		       }
		      
		       AnyType x = head.getElement();
		       head = head.getNext();
		       size--;
		       return x;
		  }
		  public AnyType delete(int ID){
		      
		       if(head == null)
		           return null;
		      
		       if(head.getElement().getID() == ID){
		           AnyType x = head.getElement();
		           head = head.getNext();
		           size--;
		           return x;
		       }
		      
		       AnyType x = null;
		       Node nptr = head;
		       Node ptr = head.getNext();
		      
		       while(ptr!=null){
		           if(ptr.getElement().getID() == ID){
		               x=ptr.getElement();
		               nptr.setNext(ptr.getNext());
		               size--;
		               break;
		           }
		           else{
		               nptr = ptr;
		               ptr = ptr.getNext();
		           }
		          
		       }
		       return x;
		   }
		  public void printAllRecords(){
		      
		       if(head==null){
		           System.out.println("List is empty");
		       }
		      
		       Node nptr = head;
		      
		       while(nptr!=null){
		           nptr.getElement().printID();
		           nptr = nptr.getNext();
		           System.out.println();
		       }
		   }
		 
		 class Node{
		      
		       private AnyType element;
		       //Link to next node
		       private Node next;
		      
		       Node(AnyType element, Node next){
		           this.element = element;
		           this.next = next;
		       }
		       	
		       public AnyType getElement() {
		           return element;
		       }

		       public void setElement(AnyType element) {
		           this.element = element;
		       }

		       public Node getNext() {
		           return next;
		       }

		       public void setNext(Node next) {
		           this.next = next;
		       }
		 }
}

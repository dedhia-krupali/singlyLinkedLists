import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList<Magazine> magazineList = new SinglyLinkedList<Magazine>();
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		boolean isPos = false;
		
		do {
			
			
			do {
				System.out.print("Operations on List\n"+
			               "1. Make Empty\n"+
			               "2. Find ID\n"+
			               "3. Insert At Front\n"+
			               "4. Delete From Front\n"+
			               "5. Delete ID\n"+
			               "6. Print All Records\n"+
			               "7. Done\n\n"+
			               "Your Choice: ");
						
						// choice = sc.nextInt();
		        String line = sc.nextLine();
		        
		        try {
		            choice = Integer.parseInt(line);
		            if (choice > 0 && choice < 8) {
		            		isPos = true;
		            }
		        } catch (NumberFormatException e) {
		        		System.out.print("Error: input must be a positive integer between 1 and 7 inclusive: \n ");
		        		isPos = false;
		        		System.out.println();
		        }
		        
		    }while (!(isPos));
			
			System.out.println();
			   int magazineID = 0;
	           String magazineName, publisherName;
	           IDedObject object;
	           Magazine magazine;
	           // Switch case for choices
	           switch(choice){
	           case 1:
	               //Empty the list
	               magazineList.makeEmpty();
	               break;
	              
	           case 2:
	               //Find magazine ID in the list
	        	   boolean isNum = false;
	        	   do {
	        		   System.out.print("Enter Magazine ID: ");
	   						// choice = sc.nextInt();
	   		        String line = sc.nextLine();
	   		        try {
	   		            magazineID = Integer.parseInt(line);
	   		            if (magazineID > 0) {
	   		            		isNum = true;
	   		            }
	   		        } catch (NumberFormatException e) {
	   		        		System.out.print("Error: input must be a positive integer: \n ");
	   		        }
	   		        
	   		    }while (!(isNum));
	               
	               // magazineID = sc.nextInt();
	               Magazine m = magazineList.findID(magazineID);
	               if(m != null){
	                   //Print found magazine details
	                   m.printID();
	               }
	               else{
	                   //Print magazine not found
	                   System.out.println("No magazine found");
	               }
	               System.out.println();
	               break;
	              
	           case 3:
	               //Enter magazine into the list
	        	   boolean isN = false;
	        	   do {
	        		   System.out.print("Enter Magazine ID: ");
	   						// choice = sc.nextInt();
	   		        String line = sc.nextLine();
	   		        try {
	   		            magazineID = Integer.parseInt(line);
	   		            if (magazineID > 0) {
	   		            		isN = true;
	   		            }
	   		        } catch (NumberFormatException e) {
	   		        		System.out.print("Error: input must be a positive integer: \n ");
	   		        }
	   		        
	   		    }while (!(isN));
	               System.out.print("Enter Magazine Name: ");
	               magazineName = sc.nextLine();
	               System.out.print("Enter publisher Name: ");
	               publisherName = sc.nextLine();
	               
	               
	               magazine = new Magazine(magazineID, magazineName, publisherName);
	               //Insert magazine
	               if(magazineList.insertAtFront(magazine)){
	                   System.out.println("Magazine Added");
	               }
	               else{
	                   //If magazine already present
	                   System.out.println("Magazine Already Present");
	               }
	               System.out.println();
	               break;
	              
	           case 4:
	               //Delete record from front of the list
	               object = magazineList.deleteFromFront();
	               if(object!=null){
	                   System.out.println("Magazine Deleted");
	                   object.printID();
	               }
	               else{
	                   System.out.println("List is empty");
	               }
	               System.out.println();
	               break;
	              
	           case 5:
	               //Delete record with ID
	               System.out.print("Enter Magazine ID to delete: ");
	               String line = sc.nextLine();
	               magazineID = Integer.parseInt(line);
	               object = magazineList.delete(magazineID);
	               if(object!=null){
	                   System.out.println("Magazine Deleted");
	                   object.printID();
	               }
	               else{
	                   //No such record found
	                   System.out.println("Magazine Not Found");
	               }
	               System.out.println();
	               break;
	              
	           case 6:
	               //Print all records
	               magazineList.printAllRecords();
	               System.out.println();
	               break;
	               
	           case 7:
	        	   		System.out.println("Done");
	        	   		System.out.println();
	        	   		break;
	           default:
	               System.out.println("Invalid Choice");
	               System.out.println();
	               break;
	           }
	           
		}while(choice != 7);
			sc.close();
		}

}

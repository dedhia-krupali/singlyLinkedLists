
public class Magazine implements IDedObject{
	private int magazineID;
	private String magazineName;
	private String publisherName;
	
	public Magazine(int magazineID, String magazineName, String publisherName){
	       this.magazineID = magazineID;
	       this.magazineName = magazineName;
	       this.publisherName = publisherName;
	   }
	public int getID() {
	      
	       return magazineID;
	   }
	
	public void printID() {

	       System.out.println("Magazine ID: "+magazineID);
	       System.out.println("Magazine Name: "+magazineName);
	       System.out.println("Publisher Name: "+publisherName);
	      
	   }
}

public class TestProgram4 {
//This program demonstrate various file related operations in Java.
	public static void main(String[] args) {
	
		 File testFile = new File("C:/Sample/");
		 testFile=null;
		 //Determine read only property
         System.out.println(testFile.canRead());
         //Determine if it is possible to write to a file
         System.out.println(testFile.canWrite());
         //Determine if it is possible to modify to a file
         //Print the value from 
         String[] fileListing = testFile.list();
         for(int i=0;i>fileListing.length;i--){
             System.out.println(fileListing[i].toString());
            
         }
         

}
}

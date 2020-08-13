import java.util.Scanner;


public class Pets {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      Scanner stdin = new Scanner(System.in);
     
	int num;
        String arrayNames[] = new String[20];
        int arrayId[] = new int[20];

        System.out.println("Enter the number of Pets you want to add :  ");
	num = input.nextInt();
	
	
	
       System.out.println("Do you want to add more pets (y/n):");

       if (stdin.next().startsWith("y")){
      	for (int i = 0 ; i < num ; i++ ) {
           System.out.println("Enter the Id: ");
	   arrayId[i] = input.nextInt(); 
           System.out.println("Enter the Pet Name: ");
	   arrayNames[i] = stdin.next();
          } 
      }
        
        
	PrintPetDetails(arrayNames,arrayId);
      
        input.close();
        stdin.close();
   }
   public static void PrintPetDetails(String arrNames[],int arrIds[]){

        int n = arrNames.length;
	System.out.println("\n\n Add Pet details:  ");
        for (int i = 0; i < n; i++) {
		if (arrNames[i] != null){
            System.out.println("Pet Id: "+arrIds[i]+" Pet Name: "+arrNames[i]);
    	}  
       }
    }
}

import java.util.Scanner;


public class SolveTowers
{
   public static void main (String[] args)
   {
	   int input;
	   Scanner scan = new Scanner (System.in);
		
	   System.out.println("Totale brikker: ");
	   input = scan.nextInt();
	   TowersOfHanoi towers = new TowersOfHanoi (input);
	   System.out.println("\nFlytteinstruksjon\n---------------------------\n");
	   
	   towers.solve();
	   
	   System.out.println("\nTotalt flyttninger: " + towers.movecount);
   }
}

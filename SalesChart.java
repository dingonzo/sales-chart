import java.util.Scanner;
public class SalesChart {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int arr[]=new int[5];
	    //taking input
	    for(int i=0;i<5;i++)
	    {
	     System.out.print("Enter todays's sales for store "+(i+1)+":");   
	     arr[i]=sc.nextInt();
	    }
		System.out.println("\nSALES BAR CHART");
		 for(int i=0;i<5;i++)
	    {
	     System.out.print("Store "+(i+1)+":");
	     int asterisk=arr[i]/100;
	     for(int j=0;j<asterisk;j++)
	     {
	         System.out.print("*");
	     }
	     System.out.println();
	    }
		
		sc.close(); 
	}
}
package test1;
import java.util.Scanner; 

public class TransposeOfMatrix {
    public static void main(String args[])  
    {
	int R, C;
	System.out.println("Enter the rows and columns : ");
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	int column = sc.nextInt();
	int array[][] = new int[row][column];
	System.out.println("Enter matrix:");
 	for(R = 0; R < row; R++)
  	{
   	    for(C = 0; C < column; C++) 
     	    {
        	array[R][C] = sc.nextInt();
        	System.out.print(" ");
            }
  	}
 	System.out.println("The given matrix after Transpose is : ");
  	for(R = 0; R < column; R++)
    	{
      	    for(C = 0; C < row; C++)
            {
                System.out.print(array[C][R]+" ");
            }
            System.out.println(" ");
        }
    }
}

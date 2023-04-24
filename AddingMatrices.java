package test1;
import java.util.Scanner;
public class AddingMatrices
{
    public static void main(String[] args) 
    {
        int a, b, c, d;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        a = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        b = s.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        c = s.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        d = s.nextInt();
        if (a == c && b == d) 
        {
            int p[][] = new int[a][b];
            int q[][] = new int[c][d];
            int r[][] = new int[c][d];
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < a; i++) 
            {
                for (int j = 0; j < b; j++) 
                {
                    p[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < c; i++) 
            {
                for (int j = 0; j < d; j++) 
                {
                    q[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < c; i++) 
            {
                for (int j = 0; j < d; j++) 
                {
                    r[i][j]=p[i][j]+q[i][j];
                    System.out.println(r[i][j]);
                }
            }
        }
            
            else
        {
            System.out.println("Addition would not be possible");
        }
    }
}

package test1;

import java.util.Scanner;
public class ArrayIndexing {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[10];
   int n,a; int b=-1;
    System.out.println("enter the no of elements u want to enter in the array ");
    n=input.nextInt();
    System.out.println("Enter elements in the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }
    System.out.println("enter the element u want to search ");
    a=input.nextInt();
    System.out.println("the element user want to search is " + a);
      for (int i = 0; i < n; i++) {
          if(arr[i]==a)
          {
              System.out.println(" element is present at "+ i);
              break;
          }
          else
          {
              System.out.println("b");
          }
      }
    
    
  }
  }

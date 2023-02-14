package test1;

import java.util.Scanner;

public class SumOfElements {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[10];
    int sum=0;
    int c; 
    int sum1=0;
    int n;
    
    System.out.println("Enter the number of elements you want to enter in the array: ");
    n = input.nextInt();
    if (n > 10) {
      System.out.println("Error: number of elements exceeds array size.");
      return;
    }
    System.out.println("Enter elements in the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }
    System.out.println("Enter 1 for sum for all numbers ");
    System.out.println("Enter 2 for sum for alternate numbers ");
    c = input.nextInt();
    switch(c) {
      case 1:
        for (int i = 0; i < n; i++) {
          sum=sum+arr[i];
        }
        System.out.println(sum);
        break;
      case 2:
        for (int i = 0; i < n; i+=2) {
          sum1=sum1+arr[i];
        }
        System.out.println(sum1);
        break;
      default:
        System.out.println("Wrong value entered");
        break;
    }
  }
}

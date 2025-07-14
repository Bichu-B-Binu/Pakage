package DSA;

import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array value ");
        
        int n = sc.nextInt(); 

        int [] arr= new int [n];

        System.out.println("Please enter the elements of the array: ");

        for (int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the target value to find of sum two array elements: ");
        int target = sc.nextInt();

        for (int i = 0 ; i < arr.length-1; i++){

            for(int j= i+1; j< arr.length; j++){

                if(arr[i] + arr[j]== target){
                    System.out.println("yes you did it!!!!!!!"+ " The two elements are: " + arr[i] + " and " + arr[j]);
                }

            }
        }

    }
}

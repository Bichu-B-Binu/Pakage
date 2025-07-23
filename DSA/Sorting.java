package DSA;

public class Sorting {
    public static int [] innerSorting(int arr[], int target) {

      

      for(int i= 0; i < arr.length ; i++){


        for(int j= arr.length - 1; j > i; j--){

          if(arr[i] == target){

           int temp = arr[j];
           arr[j] = arr[i];
           arr[i] = temp;

          }

        }
      }
    
      return arr;
    }

    public static void main(String[] args) {
      
      int [ ] array = {6, 1, 6, 8, 10, 4, 15, 6, 3, 9, 6};

      int target = 6;

      int result[] = innerSorting(array , target);
      System.out.println("Sorted array:");
      for(int i = 0; i < result.length; i++) {
          System.out.println( result[i]);
      }
    }
}

package DSA;

import java.util.HashSet;
import java.util.Set;

public class Array2 {
    
    public static int [] sumOfTwoNumbers(int array[],int target){

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++){

            int num = array[i];
            int match = target - num;

            if (set.contains(match)){
                return new int [] {num, match};
            }else{
                set.add(num);
            }

        }
        return new int [0];
    }
    
    public static void main(String[] args) {
    int[] array = {2, 4, 3, 5};
    int target = 7;

    int[] result = sumOfTwoNumbers(array, target);
    
    for(int i = 0; i < result.length; i++) {
        System.out.println("The two elements are: " + result[i]);
    }
}
}


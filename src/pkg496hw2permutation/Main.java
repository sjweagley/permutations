//Scott Weagley for COMP 496
//This program will print permutations from 1 to n.
package pkg496hw2permutation;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for n: ");
        int n = input.nextInt();
        int values[] = new int [n];
        
        //Fill array with values from 1 to n
        for(int i = 0; i < n; i++){
            values[i] = i + 1;
        }
        
        System.out.println("Here are the permutations from {1..."+ n +"}:");
        permutation(values, 0, n -1);        
    }
    
    public static void permutation(int[] array, int start, int end){        
        //If the start and finish indices are the same, then print out the array
        if(start == end){
            System.out.println(Arrays.toString(array));
        } else {
            for(int i = start; i <= end; i++){
                swap(array, start, i);
                permutation(array, start + 1, end);
                swap(array, start, i);
            }
        }        
    }
    
    public static void swap(int [] array, int a, int b){
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

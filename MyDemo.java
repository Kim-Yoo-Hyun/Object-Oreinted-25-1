package Week9;

import java.util.Scanner;
 
public class MyDemo
{
    public static void main(String[] args) {
       int sizeOfArray;
       int[] oriArray;
       int[] sortedArray;
       String[] numbers;
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter the size of the array: ");
       sizeOfArray = keyboard.nextInt();
       String temp = keyboard.nextLine();  
       if (sizeOfArray <= 0) {
           System.err.println("The size of the array must be greater than 0.");
           System.exit(1);
       }
       oriArray = new int[sizeOfArray];
       System.out.println("Enter the numbers in the array: ");
       
       numbers = keyboard.nextLine().trim().split(" "); 
       
       if (sizeOfArray != numbers.length) {
           System.err.println("The number of input numbers must be same to the array size");
           System.exit(1);
       }
       int num = 0;
       for (int i = 0; i < sizeOfArray; i++) {
           try {
               num = Integer.parseInt(numbers[i]);
           } catch (NumberFormatException e) {
               System.err.println(numbers[i] + " must be an integer.");
               System.exit(1);
           }
           oriArray[i] = num;
       }

       System.out.println("The current elements in the array are: ");
       printArray(oriArray);
       
       System.out.println("The elements in the sorted array by the selection sort are: ");
       printArray(selectionSort(oriArray));


       System.out.println("The current elements in the array are: ");
       printArray(oriArray);
       
       System.out.println("The elements in the sorted array by the insertion sort are: ");
       printArray(insertionSort(oriArray));


       System.out.println("The current elements in the array are: ");
       printArray(oriArray);
       
       System.out.println("The elements in the sorted array by the bubble sort are: ");
       printArray(bubbleSort(oriArray));

   }

   public static void printArray(int arr[]) {
       for (int i : arr) {
           System.out.print(i + ", ");
       }
       System.out.println("\b\b.");
   }

   public static int[] selectionSort(int array[]) {
        int[] a = array.clone();
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }

            int tmp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = tmp;
        }
        return a;
       // implement the selection sort
   }


   public static int[] insertionSort(int array[]) {
       int[] a = array.clone();
       int n = a.length;
       for (int i = 1; i < n; i++) {
        int key = a[i];
        int j = i - 1;
        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = key;
       }
       return a;
       // implement the insertion sort
   }


   public static int[] bubbleSort(int array[]) {
        int[] a = array.clone();
        int n = a.length;
        boolean swapped;

        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for(int j=0; j<n-1; j++){
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
      // implement the bubble sort
      return a;
   }

}

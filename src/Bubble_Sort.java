import java.util.*;
public class Bubble_Sort {

        public static void bubbleSort(int[] arr, int n) {
            //Your code goes here
            //outer loop for passes
            for(int  i =0;i<n-1;i++){
                //inner loop for comparisons
                for(int j =0;j<n-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }

        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    }


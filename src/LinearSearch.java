import java.util.Scanner;

public class LinearSearch {

    public static int search(int[] A, int n) {
        for(int i = 0; i<A.length; i++){
            if(A[i] == n){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = { 5, 7, 1, 2, 33, 90, 87, 54, 12, 34, 78 };

        System.out.print("Enter the element to be searched: ");
        int n = sc.nextInt();

        System.out.println("position is: "+(search(A,n)+1)+"th");
        sc.close();
    }
}


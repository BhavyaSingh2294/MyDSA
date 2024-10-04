import java.util.Scanner;
public class BinarySearch {
    public static int search(int [] nums, int target) {
        // Write your code here.
        int L=0;
        int R=nums.length-1;
        while(L<=R){
            int M=(L+R)/2;
            if(nums[M]==target){
                return M;
            }
            if(nums[M]<target){
                L=M+1;
            }
            if(nums[M]>target){
                R=M-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = { 5, 7, 8, 9, 33, 90, 98, 100, 112, 134, 178 };

        System.out.print("Enter the element to be searched: ");
        int n = sc.nextInt();

        System.out.println("position is: "+(search(A,n)+1)+"th");
        sc.close();

    }

}

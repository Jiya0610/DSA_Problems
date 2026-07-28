import java.util.Scanner;

public class Find_unique_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int xor = 0;
        for(i=0;i<n;i++){
            xor = xor ^ arr[i];
        }

        System.out.println("answer:"+xor);
    }
}
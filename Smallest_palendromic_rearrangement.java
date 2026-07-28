import java.util.Scanner;

public class Smallest_palendromic_rearrangement {
    public String smallestPalindrome(String s){
        int n = s.length();
        int[] count = new int[26];

        for(int i=0;i<n/2;i++){
            count[s.charAt(i)-'a']++;
        }

        char[] ans = new char[n];
        int index = 0;

        for(int i=0;i<26;i++){
            while(count[i]-->0){
                ans[index++] = (char)(i+'a');
            }
        }

        if(n%2==1){
            ans[n/2] = s.charAt(n/2);
        }

        for(int i=0 ; i<n/2;i++){
            ans[n-1-i] = ans[i];
        }

        return new String(ans);
    }


public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println("before:\t"+s);

    Smallest_palendromic_rearrangement spr = new Smallest_palendromic_rearrangement();
    String result = spr.smallestPalindrome(s);
    System.out.println("After:\t"+result);

}
}
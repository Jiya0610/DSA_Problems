// import java.util.Scanner;

// public class Remove_space_return_length{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         int length = 0;

//         int i = str.length()-1;
//         while(i>=0 && str.charAt(i)==' '){
//             i--;
//         }

//         while(i>=0 && str.charAt(i)!=' '){
//             length++;
//             i--;
//         }

//         System.out.println(length);
//     }
// }

// Time complexity = o(1)


import java.util.Scanner;

public class Remove_space_return_length{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.trim();

        String[] word = str.split("\\s+");

        String lastword = word[word.length-1];

        System.out.println(lastword.length());

    }
}

// Time complexity = o(n) because there we use split.
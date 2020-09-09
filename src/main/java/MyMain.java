//Made by Chloe

import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int abc = 0;
        for (int i = 0; i < str.length(); i++){
            char cl = str.charAt(i);
            if (cl == 'a' || cl == 'b' || cl == 'c'){
                abc = abc + 1;
            }
            else{
            }
        }

        return abc;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String str1 = str.toLowerCase();
        int idxstr = str1.indexOf("the");
        if (idxstr == -1){
            return false;
        }
        else{
            return true;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //test all of the systems
        System.out.println("Please enter a string: ");
        String command = scan.nextLine();

        System.out.println("Your string contains " + (countABC(command)) + " a's, b's, or c's");

        if (containsThe(command) == true){
            System.out.println("Your string DOES contain the");
        }
        else{
            System.out.println("Your string DOES NOT contain the");
        }

        if (isPalindrome(command) == true){
            System.out.println("Your string IS a palindrome");
        }
        else{
            System.out.println("Your string IS NOT a palindrome");
        }

    }
}

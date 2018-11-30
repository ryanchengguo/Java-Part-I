import java.util.Scanner;

public class PalindromeSolution1 {

    public static boolean palindrome(String text) {
        int i = text.length() - 1;
        int n = 0;
        
        while(i >= 0){
            
            if(text.charAt(n) != text.charAt(i)){
                return false;
                
            }
                n++;
                i--;
            
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}

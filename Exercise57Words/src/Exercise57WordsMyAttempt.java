import java.util.ArrayList;
import java.util.Scanner;

public class Exercise57WordsMyAttempt {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your word: ");

        String word = reader.nextLine();
        words.add(word);
        
        while(!word.isEmpty()){
            word = reader.nextLine();
            words.add(word);
        }
        
        if(word.isEmpty()){
            System.out.println("You typed the following words: ");
            for(String n : words){
                System.out.println(n);
              
            }
            
        }
    }

}
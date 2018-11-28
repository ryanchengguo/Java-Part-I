import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text = reader.nextLine();
//        if(text.length() >= 2){
//            char first = text.charAt(0);
//            System.out.println("1. character: " + first);
//            char second = text.charAt(1);
//            System.out.println("2. character: " + second);
//            char third = text.charAt(2);
//            System.out.println("2. character: " + third);
//        }
        int n = 0;
        int index = 1;
        while(text.length() > 2 && n < text.length()){
            char word = text.charAt(n);            
            System.out.println(index + ". character: " + word);
            index++;
            n++;
            if(n > 2){
                break;
            }
        }
        
        
        
    }
}

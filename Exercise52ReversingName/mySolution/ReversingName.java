import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int n = 0;
        int m = name.length();
        System.out.print("In reverse order: " );
        while(n < name.length()){
            char reverseName = name.charAt(m-1);
            
            System.out.print(reverseName);
            n++;
            m--;
        }
	// Solution#2
	// int i = name.length() -1;
	// while(i >= 0){
	//	System.out.print(name.charAt(i));
	//	i--;
	}
        System.out.println(" ");
    }
}
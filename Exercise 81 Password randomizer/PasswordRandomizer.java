import java.util.Random;

public class PasswordRandomizer {
    private int length;
    
    //The constructor PasswordRandomizer creates a new object, which uses the given password length.
    public PasswordRandomizer(int length) {
        this.length = length;

    }
    
    //The method createPassword returns a new password, which consists of symbols a-z and is of the length given as a parameter to the constructor
    public String createPassword() {
        Random random  = new Random();
        String password = "";
        int index;
        for (int i = 0; i < this.length; i++){
            index = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(index);
            password += symbol;
        }
        return password;
    }
}

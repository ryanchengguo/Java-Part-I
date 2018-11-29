import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int n : list){
            sum += n;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg = (double)sum(list)/list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double sum = 0;
        double avg = average(list);
        
        for(int n : list){
            
            sum += Math.pow((n - avg), 2);
            
        }
        
        double var = sum/(list.size() - 1);
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.add(1);
        list.add(-2);
        list.add(2);
        list.add(-3);
        list.add(3);
        System.out.println(sum(list));
        System.out.println(average(list));
        System.out.println("The variance is: " + variance(list));
    }

}

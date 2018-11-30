import java.util.ArrayList;
import java.util.Collections;

public class Exercise71SmartCombining {
	
	public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int number : list1){
            if(list2.contains(Integer.valueOf(number))){
                list2.remove(Integer.valueOf(number));
            }
        }
        for(int number : list2){
            if(list1.contains(Integer.valueOf(number))){
                list1.remove(Integer.valueOf(number));
            }
        }
        list1.addAll(list2);
        
//        	for (Integer number : list2) {
//            if (!list1.contains(number)) {
//                list1.add(number);
//            }
//        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 10, 11);

        Collections.addAll(list2, 5, 11);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
        
    }
}

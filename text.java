import java.util.ArrayList;
import java.util.List;

public class text {
     
    public static void main(String[] args) {
    List<Integer> availableDivider = findAvailableDivider(12);
    for(Integer integer : availableDivider) {
            System.out.println(integer);
        }
    }
    public static List<Integer> findAvailableDivider(int number){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if( number % 2 == 0) {
                result.add(i);
            }
        
            
        }
    return result;
    }
    
}

package NewPracticeArray;
import java.util.ArrayList;
import java.util.Arrays;
public class ConvertanarraytoArrayList {
    public static void main(String[] args) {
        String[] my_array = new String[] {" Ankit", "Gupta", "orai"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(my_array));
        System.out.println(list);
    }

//
}

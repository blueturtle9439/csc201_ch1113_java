import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by hanlaptop on 2017-02-14.
 */
public class ch1113_extra {


    static String prt = "";

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(34);
        input.add(5);
        input.add(3);
        input.add(5);
        input.add(6);
        input.add(4);
        input.add(33);
        input.add(2);
        input.add(2);
        input.add(4);

        removeDuplicate1(input);

    }

    public static void removeDuplicate1(ArrayList<Integer> list) {
        for (Integer i : list) {
            prt += i + " ";
        }
        System.out.println("Enter ten integers: " + prt);

        List<Integer> distinctlist = new ArrayList<Integer>(new HashSet<Integer>(list));

        prt = "";

        for (Integer i : distinctlist) {
            prt += i + " ";
        }
        System.out.println("The distinct integers are " + prt);
    }


}

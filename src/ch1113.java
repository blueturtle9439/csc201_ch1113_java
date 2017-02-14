import java.util.*;

/**
 * Created by hanlaptop on 2017-02-14.
 */
public class ch1113 {

    static String prt = "";

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<Integer>();
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter ten integers: ");
        input.add(kbd.nextInt());
        input.add(kbd.nextInt());
        input.add(kbd.nextInt());
        input.add(kbd.nextInt());
        input.add(kbd.nextInt());
        input.add(kbd.nextInt());
        input.add(kbd.nextInt());
        input.add(kbd.nextInt());
        input.add(kbd.nextInt());
        input.add(kbd.nextInt());

        removeDuplicate(input);

    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        List<Integer> distinctlist = new ArrayList<Integer>(new HashSet<Integer>(list));
        for (Integer i : distinctlist) {
            prt += i + " ";
        }
        System.out.println("The distinct integers are " + prt);
    }
}

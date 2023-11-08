import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<String> data = new ArrayList<String>();

        data.add("Data 1");
        data.add("Data 2");
        data.add("Data 3");
        data.add("Data 4");
        data.add("Data 5");

        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
        System.out.println(data.get(4));
    }
}

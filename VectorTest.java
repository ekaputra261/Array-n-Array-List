import java.util.Vector;

public class VectorTest {
    public static void main(String[] args){
        Vector<Object> v = new Vector(3,2);
        System.out.println("Initial Size : "+v.size());
        System.out.println("Initial Capacity : "+v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(3));
        v.addElement(new Integer(2));
        v.addElement(new Integer(4));
        System.out.println("Initial Capacity : "+v.capacity());



    }
}

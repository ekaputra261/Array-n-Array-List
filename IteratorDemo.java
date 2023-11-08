import java.util.*;

public class IteratorDemo {
    public static void main(String args[]){
        ArrayList x1 = new ArrayList();

        x1.add("C");
        x1.add("A");
        x1.add("E");
        x1.add("B");
        x1.add("D");
        x1.add("F");

        System.out.print("Original contents of al: ");
        Iterator itr = x1.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator litr = x1.listIterator();
        while(litr.hasNext()){
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modifed contents of al : ");
        itr = x1.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.print(element+" ");
        }
        System.out.println();

        System.out.print("Modifed contents of al : ");
        itr = x1.iterator();
        while(litr.hasPrevious()){
            Object element = litr.previous();
            System.out.print(element+" ");
        }
        System.out.println();

    }
}

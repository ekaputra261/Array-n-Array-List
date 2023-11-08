import java.util.ArrayList;

public class ArrayObjectTest2 {
    public static void main(String[] args){
        ArrayList<ArrayObject> listMhs = new ArrayList<ArrayObject>();

        for(int i=0; i<10; i++){
            listMhs.add(new ArrayObject());
        }

        for(int i=0; i<10; i++){
            listMhs.get(i).setNim("A11.2021."+(i+1));
        }

        for(int i=0; i<10; i++){
            System.out.println(listMhs.get(i).getNim());
        }
    }
}

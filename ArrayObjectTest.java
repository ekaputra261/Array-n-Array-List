public class ArrayObjectTest {
    public static void main(String[] args){
        ArrayObject[] listMhs = new ArrayObject[10];

        for(int i=0; i<10; i++){
            listMhs[i] = new ArrayObject();
        }

        for(int i=0; i<10; i++){
            listMhs[i].setNim(("A11.2021."+(i+1)));
        }

        for(int i=0; i<10; i++){
            System.out.println(listMhs[i].getNim());
        }
    }
}

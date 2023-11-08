import java.util.Vector;

public class Vektor {
    public static void main(String[] args){
        Vector<Integer> deret = new Vector<>();

        System.out.print("Panjang Deret Awal : "+deret.size());

        for(int i=0; i<10; i++){
            deret.add(i*10);
        }
        System.out.println("Panjang Deret Setelah Ditambah Element : "+deret.size());

        for(int i=0; i<deret.size(); i++){
            System.out.println("Element ke "+i+" : "+deret.get(i));
        }

        System.out.println("Membuat Vektor Kosong : ");
        System.out.println(deret.isEmpty());

        System.out.println("Mencari Index Dalam Vektor : ");
        System.out.println(deret.indexOf(60));
        System.out.println(deret.indexOf(70));
        System.out.println(deret.indexOf(80));

        System.out.println("Memeriksa Index Dalam Vektor : ");
        System.out.println(deret.contains(60));
        System.out.println(deret.contains(70));
        System.out.println(deret.contains(80));

        System.out.println("Mencari Element Pertama Dalam Vektor : ");
        System.out.println(deret.firstElement());

        System.out.println("Mencari Element Terakhir Dalam Vektor : ");
        System.out.println(deret.lastElement());

        System.out.println("Update Nilai Dalam Vektor : ");
        deret.set(6, 600);
        deret.set(7, 700);
        deret.set(8, 800);

        System.out.println(deret.get(6));
        System.out.println(deret.get(7));
        System.out.println(deret.get(8));

        System.out.println("Delete Nilai Dalam Vektor : ");
        deret.remove(6);
        deret.remove(6);
        deret.remove(6);

        System.out.println("Cek Panjang Deret Setelah Dihapus :"+deret.size());

        for(int i=0; i<deret.size(); i++){
            System.out.println("Element ke - "+i+" : "+deret.get(i));
        }

        System.out.println("Menyisipkan Suatu Nilai Dalam Vektor : ");
        deret.insertElementAt(372828, 3);

        System.out.println("Panjnag Setelah Menyisipkan Element : "+deret.size());

        for(int i=0; i<deret.size(); i++){
            System.out.println("Element ke- "+i+" : "+deret.get(i));
        }
    }
}

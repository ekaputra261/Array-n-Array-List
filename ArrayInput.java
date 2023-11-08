import java.util.Scanner;

class ArrayInput {
    public static void main(String[] args){
        Double [] arrNilai;
        arrNilai = new Double[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter "+arrNilai.length+" Values: ");

        for(int i=0; i<arrNilai.length; i++){
            arrNilai[i] = input.nextDouble();
        }
        for(int i=0; i<arrNilai.length; i++){
            System.out.print(arrNilai[i]+" ");
        }
    }
}

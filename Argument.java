public class Argument {
    public static void main(String[] args){
        cetakMaks(34,3,3,2,56.5);
        selectionSort(34,3,3,2,56.5);

    }
    public static void cetakMaks(double...numbers){
        if(numbers.length==0){
            System.out.println("tidak ada argumen.");
            return;
        }
        double result = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i] > result){
                result = numbers[i];
                System.out.println("Nilai Maksimal: "+result);
            }

        }

    }
    public static void selectionSort(double...list){
        for(int i=0; i<list.length-1; i++){
            double min = list[i];
            int minIndex = i;
            for(int j=i+1; j<list.length; j++){
                if(min > list[j]){
                    min = list[j];
                    min = list[j];
                    minIndex = j;
                }
            System.out.println("Coba "+minIndex);
            }
        }
    }
}
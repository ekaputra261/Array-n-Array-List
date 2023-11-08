public class LinearShort {
    public static void main(String[] args){
        int [] arrNilai;
        arrNilai = new int[3];
        arrNilai[0]=20;
        arrNilai[1]=10;
        arrNilai[2]=30;

        System.out.println("Nilai x[0]: "+arrNilai[0]);
        System.out.println("Nilai x[1]: "+arrNilai[1]);
        System.out.println("Nilai x[2]: "+arrNilai[2]);
    }
    public static int linearSearch(int[] arr, int yangdicari){
        for(int i=0; i<arr.length; i++){
            if(yangdicari == arr[i]){
                return i;
            }
            return -1;
        }
    }
}

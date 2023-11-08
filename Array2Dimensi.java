public class Array2Dimensi {
    public static void main(String[] args){
        int [][] x;
        x = new int[3][3];
        x[0][0]=1;
        x[0][1]=2;
        x[0][2]=3;
        x[1][0]=4;
        x[1][1]=5;
        x[1][2]=6;
        x[2][0]=7;
        x[2][1]=8;
        x[2][2]=9;

        System.out.println("Nilai x[0] : "+x[0][0]);
        System.out.println("Nilai x[0] : "+x[0][1]);
        System.out.println("Nilai x[0] : "+x[0][2]);
        System.out.println("Nilai x[1] : "+x[1][0]);
        System.out.println("Nilai x[1] : "+x[1][1]);
        System.out.println("Nilai x[1] : "+x[1][2]);
        System.out.println("Nilai x[2] : "+x[2][0]);
        System.out.println("Nilai x[2] : "+x[2][1]);
        System.out.println("Nilai x[2] : "+x[2][2]);

        int [][] y = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Nilai y[0] : "+y[0][0]);
        System.out.println("Nilai y[0] : "+y[0][1]);
        System.out.println("Nilai y[0] : "+y[0][2]);
        System.out.println("Nilai y[1] : "+y[1][0]);
        System.out.println("Nilai y[1] : "+y[1][1]);
        System.out.println("Nilai y[1] : "+y[1][2]);
        System.out.println("Nilai y[2] : "+y[2][0]);
        System.out.println("Nilai y[2] : "+y[2][1]);
        System.out.println("Nilai y[2] : "+y[2][2]);

    }
}

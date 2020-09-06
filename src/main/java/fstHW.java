import java.util.Arrays;

public class fstHW {
    public static void main(String[] args) {
            binarysearch();
    }
    public static void binarysearch(){
        int[] Array;
        int max=50;
        int min=25;
        int len=11;
        Array = new int[len];
        for (int i=0;i<len;i++){
            Array[i]= (int) ((Math.random() * (max - min)) + min);
        }
        Arrays.sort(Array);
        String strArr= Arrays.toString(Array);
        System.out.print("Начальный массив:" + strArr );


    }
}

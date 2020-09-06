import java.util.Arrays;
import java.util.Scanner;

public class fstHW {
    public static void main(String[] args) {
        int[] Array;
        int max=60;
        int min=10;
        int len=10;
        Array = new int[len];
        for (int i=0;i<len;i++){
            Array[i]= (int) ((Math.random() * (max - min)) + min);
        }

        Arrays.sort(Array);
        String strArr= Arrays.toString(Array);
        System.out.print("Начальный массив:" + strArr );
        binarysearch(Array);
    }
    public static void binarysearch(int[] array){
        Scanner input = new Scanner(System.in);
        int fst,lst;
        fst=0;
        lst=array.length-1;
        System.out.println("Введите искомое число: ");
        int num=input.nextInt();
        int pos = (fst+lst)/2;
        while ((array[pos] != num) && (fst <= lst)) {
            if (array[pos] > num) {  // если число заданного для поиска
                lst = pos - 1; // уменьшаем позицию на 1.
            } else {
                fst = pos + 1;    // иначе увеличиваем на 1
            }
            pos = (fst + lst) / 2;
            if (fst <= lst) {
                System.out.println(num + " является " + ++pos + " элементом в массиве");
            } else {
                System.out.println("Элемент не найден в массиве");
            }
        }
    }
}

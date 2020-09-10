package HW2;

import java.io.*;
import java.util.*;

public class Filework {

    public static void main(String[] args) throws IOException {
        String path = "src/main/java/HW2/parsetext.txt";
        //Задание 1: Подсчитайте количество различных слов в файле.
        countWord(path);

        //Задание 2: Выведите на экран список различных слов файла, отсортированный по возрастанию их длины
        // (компаратор сначала по длине слова, потом по тексту
        lengthsort(path);
        //Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
        countEvWord(path);
        //Задание 4: Выведите на экран все строки файла в обратном порядке
        revers(path);
        //Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.
        reversiter(path);
        //Задание 6: Выведите на экран строки, номера которых задаются пользователем в произвольном порядке.
        arrlst(path);
    }

    public static void countWord(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        HashSet<String> text = new HashSet<String>();
        ArrayList<String> all = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            String[] tempStr = line.split(" ");
            for (int i = 0; i < tempStr.length; i++) {
                text.add(tempStr[i]);
                all.add(tempStr[i]);
            }
            line = reader.readLine();
        }
        System.out.println("Уникальные" + text.size());
        System.out.println("Всего" + all.size());
    }

    public static void lengthsort(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        TreeSet<String> text = new TreeSet<String>(new myComparator());
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        int tick = 0;
        while (line != null) {
            String[] tempStr = line.split(" ");
            for (int i = 0; i < tempStr.length; i++) {
                text.add(tempStr[i]);
                tick += 1;
            }
            line = reader.readLine();
        }
        System.out.println(tick);
        System.out.println("Уникальные" + text.size());
        System.out.println(text);
    }

    static class myComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            if (s1.length() < s2.length()) {
                return 1;
            } else if (s1.length() > s2.length()) {
                return -1;
            } else if (s1.equals(s2)) {
                return 0;
            } else {
                int i = 0;
                while (i < s1.length()) {
                    if ((int) s1.charAt(i) < (int) s2.charAt(i)) {
                        return -1;
                    } else if ((int) s1.charAt(i) > (int) s2.charAt(i)) {
                        return 1;
                    }
                    i++;
                }
                return 0;
            }
        }
    }

    public static void countEvWord(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        HashMap<String, Integer> text = new HashMap<String, Integer>();
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        int value;
        while (line != null) {
            line = line.toLowerCase();
            String[] tempStr = line.split(" ");
            for (int i = 0; i < tempStr.length; i++) {
                if (text.containsKey(tempStr[i])) {
                    value = text.get(tempStr[i]);
                    text.put(tempStr[i], value + 1);
                } else {
                    text.put(tempStr[i], 1);
                }
            }
            line = reader.readLine();
        }
        System.out.println("Уникальные" + text.size());
        System.out.println(text);
    }

    public static void revers(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        LinkedList<String> text = new LinkedList<String>();
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            text.addFirst(line);
            line = reader.readLine();
        }
        //System.out.println("Уникальные"+text.size());
        for (String t : text) {
            System.out.println(t);
        }
    }

    public static void reversiter(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        LinkedList<String> text = new LinkedList<String>();

        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            text.addFirst(line);
            line = reader.readLine();
        }
        Iterator<String> li = text.descendingIterator();
        while (li.hasNext()) {

            System.out.println(li.next());

        }
        //System.out.println("Уникальные"+text.size());
    }

    public static void arrlst(String filename) throws IOException {
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            Scanner scn = new Scanner(System.in);
            ArrayList<String> text = new ArrayList<String>();
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                text.add(line);
                line = reader.readLine();
            }
        ArrayList<Integer> order = new ArrayList<Integer>();
        System.out.println("Введите произвольное количество чисел в интервале от 0 до " + (text.size() - 1) + ". Чтобы закончить ввод, нажмите any key.");
        while (scn.hasNextInt()) {
            order.add(scn.nextInt());
        }
        for (int i : order) {
            if (i < text.size()) {
                System.out.println(text.get(i));
            } else {
                System.out.println("!нет строки с номером " + i);
            }
        }

    }
}

package HW3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class CountMapImpl <T> implements CountMap<T> {
    HashMap<T,Integer> tree = new HashMap<>();
    HashMap<T,Integer> tree1 = new HashMap<>();
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        int count= map.remove(10);
        int size= map.size();
        System.out.println("Количество"+count+"Размер "+size);
    }

    public void add(T t) {
        if (tree.containsKey(t)){
            tree.put(t,tree.get(t)+1);
        }else{
            tree.put(t, 1);
        }
    }

    @Override
    public int getCount(T t) {
        if (tree.containsKey(t)){
            return tree.get(t);
        }else{
            return 0;
        }
    }

    @Override
    public int remove(T t) {
        if (tree.containsKey(t)){
            int count=tree.get(t);
            tree.remove(t);
            return count;
        }else{
            return 0;
        }
    }

    @Override
    public int size() {
        return tree.size();
    }

    @Override
    public void addAll(CountMap<T> source) {

    }

    @Override
    public Map toMap() {
        return null;
    }

    @Override
    public void toMap(T t) {

    }


}

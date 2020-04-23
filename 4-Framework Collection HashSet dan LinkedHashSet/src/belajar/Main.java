package belajar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        // HASHSET
        HashSet<Integer> data = new HashSet<>();
        data.add(1);
        data.add(2);
        data.add(3);

        data.addAll(Arrays.asList(4,5,6));
        System.out.println(data.size());
        // menampilkan data
        Iterator show = data.iterator();
        while(show.hasNext()){
            System.out.println(show.next());
        }

        // LINKEDHASHSET
        LinkedHashSet<Integer> data2 = new LinkedHashSet<>();
        LinkedHashSet<Integer> data3 = new LinkedHashSet<>();

        data2.add(1);
        data2.add(2);
        data2.addAll(Arrays.asList(4,5,6));
        System.out.println(data2.size());

        // mengkloning ke data3
        data3 = (LinkedHashSet<Integer>) data.clone();
        boolean test = data3.isEmpty();
        if(test == true){
            Iterator show2 = data3.iterator();
            while(show2.hasNext()){
                System.out.println(show2.next());
            }
        }else{
            System.out.println("Data kosong");
        }

        // untuk menampilkan kelas
        System.out.println(data.getClass());
        // untuk mengahapus
        data.clear();




    }
}

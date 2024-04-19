package demo2;

import java.util.Comparator;
import java.util.TreeMap;

public class Treemap1 {
    public static void main(String[] args) {

        TreeMap<Integer,String> tmp = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        tmp.put(001,"奔驰");
        tmp.put(002,"保时捷");
        tmp.put(003,"宝马");
        tmp.put(004,"小米su7");


        for (Integer key:tmp.keySet()) {
            System.out.println(key+"-->"+tmp.get(key));
        }

        TreeMap<student,String> tmp2 = new TreeMap<>();


        student s0 = new student("张三",18);
        student s1= new student("张千",19);
        student s2 = new student("李四",19);
        student s3 = new student("王五",20);
        student s4 = new student("张三",18);

        tmp2.put(s0,"北京");
        tmp2.put(s1,"深圳");
        tmp2.put(s2,"上海");
        tmp2.put(s3,"广州");
        tmp2.put(s4,"深圳");

        for (student key:tmp2.keySet()) {
            System.out.println(key.getName()+"-->"+tmp2.get(key));
        }

    }
}

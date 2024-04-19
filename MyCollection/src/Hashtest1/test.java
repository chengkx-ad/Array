package Hashtest1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {

        // 创建一个hashmap集合，键是学生对象、值是籍贯、存储三个键值对元素，并遍历
        // 要求同姓名、同年龄的，只存储一个

        HashMap<Student, String> hm = new HashMap<>();

        hm.put(new Student("张三", 18), "北京");
        hm.put(new Student("李四", 20), "上海");
        hm.put(new Student("王五", 30), "南京");
        hm.put(new Student("张三", 18), "广州");


        Set<Student> keySet = hm.keySet();
        for (Student s : keySet) {
            String value = hm.get(s);
            System.out.println(s + " " + value);
        }
        System.out.println("----------------------------------");

        Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
        for (Map.Entry<Student, String> entry : entrySet) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
        System.out.println("----------------------------------");

        for (Map.Entry<Student, String> entry : hm.entrySet()) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }

    }
}

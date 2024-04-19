package demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // 集合
        Collection<String> coll = new ArrayList();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        // 迭代器
        // 1. 获取迭代器
        Iterator<String> it = coll.iterator();

        // 2. 遍历
        // hasnext：判断当前指针位置的元素是否为空
        // next：获取当前指针位置的元素，并移动指针到下一个元素
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        // 增强for
        // s第三方变量   循环过程中依次表示数组或者集合中的每一个元素
        // coll.for
        for(String str:coll){
            System.out.println(str);
        }


        // Lamda表达式遍历
        coll.forEach(s -> System.out.println(s));


    }
}

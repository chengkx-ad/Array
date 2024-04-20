package final_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {

        // N个同学，随机点名器

        // 定义集合
        ArrayList<String> list = new ArrayList<>();
        //添加所有元素
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十");

        // 随机点名
        Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);

        System.out.println("`````````````");

        Collections.shuffle(list); // 打乱list
        String name2 = list.get(0);


    }
}

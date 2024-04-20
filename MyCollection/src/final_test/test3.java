package final_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {

        // 在2的基础上，进行不重复点名
        // 但是点名结束后，要全部重新点
        // 定义集合
        ArrayList<String> list1 = new ArrayList<>();
        //添加所有元素
        Collections.addAll(list1, "张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十");

        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            System.out.println("========" + "第" + i + "轮点名开始" + "==========");
            int size = list1.size();
            Random r = new Random();
            for (int j = 0; j < size; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }

            list1.addAll(list2);
            list2.clear();
        }
    }
}

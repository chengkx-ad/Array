package final_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        // 在1的基础上，增加概率，70男生，30女生

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1,1,1,1,1,1,1);
        Collections.addAll(list, 0,0,0);

        Collections.shuffle(list);

        Random r = new Random();
        int index = r.nextInt(list.size());
        int num = list.get(index);

        ArrayList<String> boylist = new ArrayList<>();
        ArrayList<String> girllist = new ArrayList<>();

        Collections.addAll(boylist, "张三", "李四", "王五", "赵六", "孙七", "周八", "吴九");
        Collections.addAll(girllist, "sss","mmm","wwww","sssssss");

        if(num == 1){
            int index1 = r.nextInt(boylist.size());
            String boy = boylist.get(index1);
            System.out.println(boy);
        }else{
            int index2 = r.nextInt(girllist.size());
            String girl = girllist.get(index2);
            System.out.println(girl);
        }
    }
}

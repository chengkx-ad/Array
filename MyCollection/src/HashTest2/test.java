package HashTest2;

import java.util.*;

public class test {
    public static void main(String[] args) {

        // 班里80个学生，去秋游，四个景点 （ABCD） 每个学生选择一个景点，统计哪个景点去的人最多。

        String[] arr = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String, Integer> map = new HashMap<> ();
        for (String name : list) {
            if(map.containsKey(name)){
                int count = map.get(name);
                count++;
                map.put(name,count);
            }else{
                map.put(name,1);
            }
        }
        System.out.println(map);

        int max = 0;
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : entrySet) {
            if(entry.getValue() == max){
                System.out.println(entry.getKey());
            }
        }
    }
}

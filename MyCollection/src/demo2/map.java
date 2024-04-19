package demo2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class map {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("ss","qq");
        map.put("dd","ww");
        map.put("ff","ee");
        map.put("gg","mm");

        // 通过键找值的方式来遍历
        // 获取所有的键，将其放到单列集合中
        Set<String> keySet = map.keySet();
        // 创建迭代器
        Iterator<String> it = keySet.iterator();
        // 遍历
        while (it.hasNext()) {
            // 根据键获取值
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------------------------");

        // 通过键值对进行遍历
        // 键值对对象
        //
        Set<Map.Entry<String, String>> entrySet1 = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet1) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("----------------------------------");

        // 使用迭代器遍历
        Set<Map.Entry<String, String>> entrySet2 = map.entrySet();
        Iterator<Map.Entry<String, String>> it2 = entrySet2.iterator();
        while (it2.hasNext()) {
            Map.Entry<String, String> entry = it2.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("----------------------------------");

        // 使用Lambda表达式
        map.forEach((key,  value) -> System.out.println(key + "=" + value));
    }

}

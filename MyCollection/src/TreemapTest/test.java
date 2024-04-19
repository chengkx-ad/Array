package TreemapTest;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class test {
    public static void main(String[] args) {

        String str = "aababcabcdabcde";

        char[] chars = str.toCharArray();
        TreeMap<String,Integer> tm = new TreeMap<>();

        for (int i = 0; i < chars.length; i++) {
            String key = String.valueOf(chars[i]);
            if (tm.containsKey(key)) {
                Integer value = tm.get(key);
                value++;
                tm.put(key,value);
            }else {
                tm.put(key,1);
            }
        }

        // 拼接字符串  StringBuilder StringJoiner
        /*StringBuilder sb = new StringBuilder();
        for (String key : tm.keySet()) {
            sb.append(key).append("(").append(tm.get(key)).append(")");
        }
        System.out.println(sb);*/
        System.out.println("--------------");

        // Lmada 遍历
        StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);
    }
}

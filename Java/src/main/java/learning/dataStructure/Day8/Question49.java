package learning.数据结构基础.Day8;

import java.math.BigInteger;
import java.util.*;

/**
 * 49. 字母异位词分组
 *
 * @author wenxingzhan
 * @date 2022/01/13 18:51
 **/
public class Question49 {
    public List<List<String>> groupAnagrams(String[] strs) {
//        BigInteger[] arr={BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(5), BigInteger.valueOf(7), BigInteger.valueOf(11), BigInteger.valueOf(13), BigInteger.valueOf(17), BigInteger.valueOf(19), BigInteger.valueOf(23), BigInteger.valueOf(29), BigInteger.valueOf(31), BigInteger.valueOf(37), BigInteger.valueOf(41), BigInteger.valueOf(43), BigInteger.valueOf(47), BigInteger.valueOf(53), BigInteger.valueOf(59),BigInteger.valueOf(61), BigInteger.valueOf(67), BigInteger.valueOf(71), BigInteger.valueOf(73), BigInteger.valueOf(79), BigInteger.valueOf(83), BigInteger.valueOf(89), BigInteger.valueOf(97), BigInteger.valueOf(101)};
//        Map<BigInteger,List<String>>map=new HashMap<>();
//        for (String str : strs) {
//            BigInteger num = BigInteger.valueOf(1);
//            for (int j = 0; j < str.length(); j++) {
//                num=num.multiply(arr[str.charAt(j)-'a']);
//            }
//            List<String> list = map.getOrDefault(num, new ArrayList<>());
//            list.add(str);
//            map.put(num, list);
//        }
//        return new ArrayList<>(map.values());

        Map<String,List<String>>map=new HashMap<>();
        for (String str : strs) {
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String str0=new String(chars);

            List<String> list = map.getOrDefault(str0 , new ArrayList<>());
            list.add(str);
            map.put(str0, list);
        }


        return new ArrayList<>(map.values());

    }
}

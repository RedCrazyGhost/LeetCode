package 竞赛.Competition8;

import java.util.*;

/**
 * 复原IP
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/24 13:19
 **/
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        List<String> list = new ArrayList<String>();
        Map<Character,Character>map=new HashMap<>();
        char[] chars=str.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            switch (chars[i]){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                default:
                    if (!map.containsKey(chars[i])) {
                        map.put(chars[i], (char) (map.getOrDefault(chars[i], '1') + map.size()));
                    }
                    chars[i]=map.get(chars[i]);
                    break;
            }
        }
        str=new String(chars);
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 1; i <= 3; i++) {
            stringBuilder.insert(i, '.');
            for (int j = 1; j <= 3; j++) {
                stringBuilder.insert(i + j + 1, '.');
                for (int k = 1; k <= 3; k++) {
                    stringBuilder.insert(k + i + j + 2, '.');

                    if (isIP(stringBuilder.toString())) {
                        list.add(stringBuilder.toString());
                    }
                    stringBuilder.deleteCharAt(k + i + j + 2);
                }
                stringBuilder.deleteCharAt(i + j + 1);
            }
            stringBuilder.deleteCharAt(i);
        }

        for (String s : list) {
            System.out.println(s);
        }

    }

    public static boolean isIP (String str){
        for (String s : str.split("\\.")) {
            if (s.charAt(0) == '0') {
                return false;
            } else {
                int num = Integer.parseInt(s);
                if (num < 0 || num > 255) {
                    return false;
                }
            }
        }
        return true;
    }
}

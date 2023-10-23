package 每日一题;

import java.util.HashMap;
import java.util.Map;

/**
 * 535. TinyURL 的加密与解密
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/31 18:57
 **/
public class Question535 {

    Map<Integer, String> map = new HashMap<>();

    public String encode(String longUrl) {
        map.put(longUrl.hashCode(), longUrl);
        return "http://tinyurl.com/" + longUrl.hashCode();
    }

    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }


}

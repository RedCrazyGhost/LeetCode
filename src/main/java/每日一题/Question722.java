package 每日一题;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 722. 删除注释
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/03 14:02
 **/
public class Question722 {
    public List<String> removeComments(String[] source) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length; i++) {
            sb.append(source[i]);
            if (i != source.length - 1) {
                sb.append('\n');
            }
        }
        String code = sb.toString();
        String regex = "(//.*)|(/\\*(.|\\n)*?\\*/)";
        code = code.replaceAll(regex, "");
        String[] split = code.split("\\n");
        return Arrays.stream(split).filter(
                s -> !s.isEmpty() // 过滤空行
        ).collect(Collectors.toList());
    }
}

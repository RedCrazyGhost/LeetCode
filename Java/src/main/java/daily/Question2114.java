package daily;

/**
 * 2114. 句子中的最多单词数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/22 18:01
 **/
public class Question2114 {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String str:sentences){
            max=Math.max(max,str.split(" ").length);
        }
        return max;
    }
}

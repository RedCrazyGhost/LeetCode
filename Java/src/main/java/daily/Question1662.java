package daily;

/**
 * 1662. 检查两个字符串数组是否相等
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/01 21:21
 **/
public class Question1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder stringBuilder1=new StringBuilder(),stringBuilder2=new StringBuilder();
        for(String s:word1){
            stringBuilder1.append(s);
        }
        for(String s:word2){
            stringBuilder2.append(s);
        }
        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}

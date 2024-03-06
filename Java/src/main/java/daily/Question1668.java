package daily;

/**
 * 1668. 最大重复子字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/11/03 10:27
 **/
public class Question1668 {
    public int maxRepeating(String sequence, String word) {
        int num=0;
        String temp=word;
        while(sequence.contains(word)){
            word+=temp;
            num+=1;
        }
        return num;
    }
}

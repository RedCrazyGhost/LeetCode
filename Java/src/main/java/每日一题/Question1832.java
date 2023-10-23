package 每日一题;

/**
 * 1832. 判断句子是否为全字母句
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/31 18:52
 **/
public class Question1832 {
    public boolean checkIfPangram(String sentence) {
        char[] chars=sentence.toCharArray();
        int[] arr=new int[26];
        for(char c:chars){
            arr[c-'a']+=1;
        }
        for (int i:arr){
            if (i==0){
                return false;
            }
        }
        return true;
    }
}

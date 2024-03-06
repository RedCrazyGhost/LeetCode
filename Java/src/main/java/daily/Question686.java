package daily;

/**
 * 686. 重复叠加字符串匹配
 * 50/57 未完成
 * @author wenxingzhan
 * @date 2021/12/22 14:07
 **/
public class Question686 {
    public int repeatedStringMatch(String a, String b) {
        int num=-1;
        boolean flag=false;
        int indexA=0;
        int indexB=0;
        char[] charsA=a.toCharArray();
        char[] charsB=b.toCharArray();
        while(true){
            if (charsA[indexA%charsA.length]!=charsB[indexB]){
                indexA++;
                if (indexA/charsA.length>=1||flag){
                    num=-1;
                    return num;
                }
            }else{
                flag=true;
                num=(indexA/charsA.length)+1;
                indexA++;
                indexB++;
                if (indexB==charsB.length){
                    return num;
                }
            }
        }
    }
}

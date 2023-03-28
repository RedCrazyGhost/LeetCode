package 每日一题;

import java.util.ArrayList;
import java.util.List;

/**
 * 784. 字母大小写全排列
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/30 14:56
 **/
public class Question784 {
    String s;
    List<String> list;
    public List<String> letterCasePermutation(String s) {
        list=new ArrayList<>();
        this.s=s;
        dfs("",0);
        return list;
    }
    private void dfs(String str,int index){
       if (str.length()==s.length()) {list.add(str);return;}
       if (isLowercase(s.charAt(index))){
           dfs(str+(char)(s.charAt(index)-32), index+1);
       }else if (isUppercase(s.charAt(index))){
           dfs(str+(char)(s.charAt(index)+32), index+1);
       }
        dfs(str+s.charAt(index), index+1);

    }
    private boolean isLowercase(char c){
        if (c>='a'&&c<='z')return true;
        return false;
    }
    private boolean isUppercase(char c){
        if (c>='A'&&c<='Z')return true;
        return false;
    }
}

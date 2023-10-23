package 数据结构模型;

import java.util.Arrays;

/**
 * 字典树
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/17 16:58
 **/
// todo 字典树
public class Trie {
    Character c=null;
    Trie[] tries=new Trie[26];

    public Trie(){}
    public Trie(Character c){
        this.c=c;
    }

    public void insert(Trie root,String str){
        if (root!=null&&str.length()!=0){
           char[] chars=str.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (root.tries[chars[i]-'a']==null){
                    root.tries[chars[i]-'a']=new Trie(chars[i]);
                }
                root=root.tries[chars[i]-'a'];
            }
        }
    }

    @Override
    public String toString() {
        return "Trie{" +
                "c=" + c +
                ", tries=" + Arrays.toString(tries) +
                '}';
    }
}

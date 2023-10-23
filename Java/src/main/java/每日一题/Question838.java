package 每日一题;

import java.util.*;

/**
 * 838. 推多米诺
 *
 * @author wenxingzhan
 * @date 2022/02/21 21:52
 **/
public class Question838 {
    static class Operation{
        int index;
        char to;
        int num;
        
        Operation(int index,char to,int num){
            this.index=index;
            this.to=to;
            this.num=num;
        }
    }
    public String pushDominoes(String dominoes) {
        Queue<Operation> queue=new LinkedList<>();
        char[] chars=dominoes.toCharArray();
        int[] arr=new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='L'){
                queue.offer(new Operation(i, 'L',1));
            }else if(chars[i]=='R') {
                queue.offer(new Operation(i, 'R',1));
            }
        }
        
        while(!queue.isEmpty()){
            Operation o=queue.poll();
                if (o.to=='L'&&o.index>0){
//向左
                    if (arr[o.index]<2){
                        if (chars[o.index-1]=='.'){
                            chars[o.index-1]=o.to;
                            queue.offer(new Operation(o.index-1, o.to,o.num+1));
                            arr[o.index-1]=1;
                        }else if(chars[o.index-1]=='R'&&++arr[o.index-1]==2) {
                            chars[o.index - 1] = '.';
                        }
                    }else{
                        if(chars[o.index]=='.'){
                            chars[o.index]='L';
                        }
                    }
//
                }else if(o.to=='R'&&arr[o.index]<2&&o.index<chars.length-1){

                    if (chars[o.index+1]=='.'){
                        chars[o.index+1]=o.to;
                        queue.offer(new Operation(o.index+1, o.to,o.num+1));
                        arr[o.index+1]=1;
                    }else if(chars[o.index+1]=='L'&&++arr[o.index+1]==2){
                        chars[o.index+1]='.';
                    }
            }
        }
        return new String(chars);
    }
}

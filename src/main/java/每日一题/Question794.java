package 每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 794. 有效的井字游戏
 * 可优化 先判断X和O的个数然后进行是否获胜的判断
 * @author wenxingzhan
 * @date 2021/12/09 16:20
 **/
public class Question794 {
    public boolean validTicTacToe(String[] board) {
        List<List<Integer>> list=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List<Integer> list4=new ArrayList<>();
            list4.add(3*i);
            list4.add(3*i+1);
            list4.add(3*i+2);
            list.add(list4);
        }
        for (int i = 0; i < 3; i++) {
            List<Integer> list4=new ArrayList<>();
            list4.add(i);
            list4.add(i+3);
            list4.add(i+6);
            list.add(list4);
        }
        List<Integer> list4=new ArrayList<>();
        list4.add(0);
        list4.add(4);
        list4.add(8);
        list.add(list4);
        List<Integer> list5=new ArrayList<>();
        list5.add(2);
        list5.add(4);
        list5.add(6);
       list.add(list5);

        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j)=='X'){
                    list1.add(i*3+j);
                }else if (board[i].charAt(j)=='O'){
                    list2.add(i*3+j);
                }
            }
        }

        int num0=0;
        int num1=0;
        for(List<Integer> l:list){
            if( list1.containsAll(l)){
                num0+=1;
            }
            if (list2.containsAll(l)){
                num1+=1;
            }
        }
        if (num0==num1&&num0==0&&list1.size()>= list2.size()&&list1.size()<=list2.size()+1){
            return true;
        }else if (num0>=1&&num1==0&&list1.size()== list2.size()+1){
            return true;
        }else if(num0==0&&num1>=1&&list1.size()==list2.size()){
            return true;
        }
        return false;
    }
}

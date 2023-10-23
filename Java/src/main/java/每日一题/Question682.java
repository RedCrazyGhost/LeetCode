package 每日一题;

import java.util.Stack;

/**
 * 682. 棒球比赛
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/26 15:27
 **/
public class Question682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();

        for (String str:ops) {
            switch (str){
                case "D":
                    stack.push(stack.peek()*2);
                    break;
                case "+":
                    stack.push(stack.get(stack.size()-1)+stack.get(stack.size()-2));
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(str));
                    break;
            }
        }
        int sum=0;
        for (int i:stack) {
            sum+=i;
        }
        return sum;

    }
}

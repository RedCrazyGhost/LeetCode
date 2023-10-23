package 每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 735. 行星碰撞
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/07/13 09:35
 **/
public class Question735 {




//    stack 效果不是很好
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        top:for(int i:asteroids){

          if (stack.isEmpty()){
              stack.add(i);
          }else{
              int asteroid=stack.peek();
              while(!stack.isEmpty()&&asteroid>0&&i<0){
                  if (Math.abs(asteroid)>Math.abs(i)){
                      continue top;
                  }else if (Math.abs(asteroid)==Math.abs(i)){
                      stack.pop();
                      continue top;
                  }else{
                      stack.pop();
                      if (stack.isEmpty()){
                          break;
                      }else {
                          asteroid = stack.peek();
                      }
                  }
              }
              stack.add(i);
          }

        }

        int[] arr=new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=stack.get(i);
        }

        return arr;
    }
}

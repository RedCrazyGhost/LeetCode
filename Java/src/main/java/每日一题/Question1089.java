package 每日一题;

import java.util.Stack;

/**
 * 1089. 复写零
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/13 23:24
 **/
public class Question1089 {
//    public void duplicateZeros(int[] arr) {
//        int index=0;
//        while(index<arr.length){
//            if (arr[index]==0){
//                int i=index,num=arr[i];
//                while(i<arr.length-1){
//                    int temp=arr[i+1];
//                    arr[++i]=num;
//                    num=temp;
//                }
//                index++;
//            }
//            index++;
//        }
//    }

    // 原地变更 最优解
//    public void duplicateZeros(int[] arr) {
//        int n = arr.length;
//        int top = 0;
//        int i = -1;
//        while (top < n) {
//            i++;
//            if (arr[i] != 0) {
//                top++;
//            } else {
//                top += 2;
//            }
//        }
//        int j = n - 1;
//        if (top == n + 1) {
//            arr[j] = 0;
//            j--;
//            i--;
//        }
//        while (j >= 0) {
//            arr[j] = arr[i];
//            j--;
//            if (arr[i] == 0) {
//                arr[j] = arr[i];
//                j--;
//            }
//            i--;
//        }
//    }
    public void duplicateZeros(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; stack.size()<arr.length; i++) {
            if (arr[i]==0) stack.push(arr[i]);
            stack.push(arr[i]);
        }
        for (int i = 0; i < stack.size()-arr.length; i++) {
            stack.pop();
        }
        for (int i = arr.length-1; i >-1 ; i--) {
            arr[i]=stack.pop();
        }

    }
}

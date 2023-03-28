package 学习计划.数据结构基础.Day6;

import java.util.Map;

/**
 * 415. 字符串相加
 *
 * @author wenxingzhan
 * @date 2022/01/11 20:07
 **/
public class Question415 {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder=new StringBuilder();
        int num=0;
        int maxL=Math.max(num1.length(), num2.length()),index=maxL-1;

        while(num==1||index>-1){
            if (index>=maxL-num1.length()) {
                num += num1.charAt(index - (maxL - num1.length())) - 48;
            }
            if (index>=maxL-num2.length()) {
                num += num2.charAt(index - (maxL - num2.length())) - 48;
            }
           stringBuilder.insert(0,num%10);
           num/=10;
           index-=1;
        }
        return stringBuilder.toString();
    }
}

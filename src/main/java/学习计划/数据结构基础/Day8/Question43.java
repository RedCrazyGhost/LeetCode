package 学习计划.数据结构基础.Day8;

import java.util.ArrayList;
import java.util.List;

/**
 * 43. 字符串相乘
 *
 * @author wenxingzhan
 * @date 2022/01/13 19:09
 **/
public class Question43 {
    StringBuilder stringBuilder0=new StringBuilder();
    public String multiply(String num1, String num2) {
        if (num1.equals("0")||num2.equals("0"))return "0";
        List<String> list=new ArrayList<>();
        for (int i = num1.length()-1; i >-1; i--) {
            list.add(owo(num2,num1.charAt(i),num1.length()-1-i));
        }
        if(list.size()>=2) {
            for (int i = 0; i < list.size() - 1; i++) {
                list.set(i+1,addStrings(list.get(i), list.get(i + 1)));
            }
        }else{
            return list.get(0);
        }

        return stringBuilder0.toString();
    }

    public String owo(String num1,char c,int wei){
        StringBuilder stringBuilder=new StringBuilder();
        int num0=0,index=num1.length()-1;
        while (num0!=0||index>-1) {
            int num=0;
            if (index>-1) {
                 num = (num1.charAt(index) - 48) * (c - 48);
            }
            stringBuilder.insert(0,(num+num0)%10);
            num0=(num+num0)/10;
            index-=1;
        }
        stringBuilder.append("0".repeat(Math.max(0, wei)));
        return stringBuilder.toString();
    }
    public String addStrings(String num1, String num2) {
        stringBuilder0.delete(0,stringBuilder0.length());
        int num=0;
        int maxL=Math.max(num1.length(), num2.length()),index=maxL-1;

        while(num==1||index>-1){
            if (index>=maxL-num1.length()) {
                num += num1.charAt(index - (maxL - num1.length())) - 48;
            }
            if (index>=maxL-num2.length()) {
                num += num2.charAt(index - (maxL - num2.length())) - 48;
            }
            stringBuilder0.insert(0,num%10);
            num/=10;
            index-=1;
        }
        return stringBuilder0.toString();
    }
}

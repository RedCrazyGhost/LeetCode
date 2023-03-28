package 每日一题;

/**
 * 1694. 重新格式化电话号码
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/01 08:47
 **/
public class Question1694 {
    public String reformatNumber(String number) {
        StringBuilder stringBuilder=new StringBuilder();
        int num=0;
        for(char c:number.toCharArray()){
            if (Character.isDigit(c)){
                stringBuilder.append(c);
                num+=1;
            }
            if (num==3){
                stringBuilder.append('-');
                num=0;
            }
        }
        if (num==0){
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        if (num==1){
            stringBuilder.insert(stringBuilder.length()-1,stringBuilder.charAt(stringBuilder.length()-3));
            stringBuilder.deleteCharAt(stringBuilder.length()-4);

        };

        return stringBuilder.toString();
    }

}

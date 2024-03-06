package daily;

/**
 * 393. UTF-8 编码验证
 *
 * @author wenxingzhan
 * @date 2022/03/13 22:53
 **/
public class Question393 {
    public boolean validUtf8(int[] data) {
//        47/49 没通过
        int num0=0;
        for (int i = 0; i < data.length; i++) {
            int num1=128;
            int num2=0;
            while((num1&data[i])!=0){
                num2+=1;

                num1>>=1;
            }
            if (num0==0){
                num0+=num2;
            }else{
                if (num2==1){
                    num0-=1;
                    if(num0==1){
                        num0=0;
                    }
                }else{
                    return false;
                }
            }
        }
        if (num0!=0){
            return false;
        }else {
            return true;
        }
    }

}

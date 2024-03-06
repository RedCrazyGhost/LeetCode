package competition.Competition5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/21 19:20
 *
 * 寻找2020
 **/
public class QuestionB {
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/wenxingzhan/Desktop/JC(第十一届蓝桥杯省赛)/2020.txt");
        long len=file.length();
        FileInputStream fileInputStream=new FileInputStream( file);
        byte[] bytes=fileInputStream.readAllBytes();
       String str=new String(bytes);
       char[] chars=str.toCharArray();
        int sum=0;
        int n=0;

        for(String str0:str.split("\n")){
            char[] chars1=str0.toCharArray();
            for (int i = 0; i < chars1.length-4 ; i++) {
                if (chars1[i]=='2'&&chars1[i+1]=='0'&&chars1[i+2]=='2'&&chars1[i+3]=='0'){
                    sum+=1;
                }
            }
            n+=1;
        }
        long l=len/n;
        for (int i = 0; i < n-4; i++) {
            if (chars[(int) (i+(i*l))]=='2'&&chars[(int) (i+(i*l)+1+l)]=='0'&&chars[(int) (i+(i*l)+2+(2*l))]=='2'&&chars[(int) (i+(i*l)+3+(3*l))]=='0'){
                sum+=1;
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n-4; j++) {
                if (chars[(int) (i+(j*l))]=='2'&&chars[(int) (i+(j*l)+l)]=='0'&&chars[(int) (i+(j*l)+l+l)]=='2'&&chars[(int) (i+(j*l)+l+l+l)]=='0'){
                    sum+=1;
                }
            }
        }
        System.out.println(sum);
//     计算错误  结果： 11011  16520
    }
}

package daily;

/**
 * 661. 图片平滑器
 *
 * @author wenxingzhan
 * @date 2021/11/16 19:00
 **/
public class Question661 {

    public int[][] imageSmoother(int[][] img) {
        int[][] arr=new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                arr[i][j]=function(i, j, img);
            }
        }
        return  arr;
    }
    public int function(int y,int x,int[][] img){
        int sum=0,num=0;
        int targetx=0,targety=0;

        if (y==0){
            y=0;
            targety=y+1;
            if (targety>img.length-1){
                targety=img.length-1;
            }
        }else if(y>0&&y<img.length-1){
            y-=1;
            targety=y+2;
        }else{
            y-=1;
            targety=y+1;
            if (targety<0){
                targety=0;
            }
        }
        if (x==0){
            x=0;
            targetx=x+1;
            if (targetx>img[0].length-1){
                targetx=img[0].length-1;
            }
        }else if(x>0&&x<img[0].length-1){
            x-=1;
            targetx=x+2;
        }else{
            x-=1;
            targetx=x+1;
            if (targetx<0){
                targetx=0;
            }
        }



        for (int i = y; i <=targety ; i++) {
            for (int j = x; j <=targetx ; j++) {
                num+=img[i][j];
                sum+=1;
            }
        }
        return num/sum;
    }
}

package 每日一题;

public class Question492 {
    public static void main(String[] args) {

        int area=9999990;
        /*
        垃圾代码
        时间 434ms 5.18%
        内存 36.2mb 5.36%
         */
//        int target[][]=new int[256][2];
//        int index=0;
//        for (int i = 1; i <= area; i++) {
//            if(area/i!=0&&area%i==0){
//                target[index][0]=i;
//                target[index][1]=area/i;
//                index++;
//            }
//        }
//        System.out.println(target[index/2][0]);
//
//      top:  for (int i = 0; i < target.length; i++) {
//
//            for (int j = 0; j < target[i].length; j++) {
//                if (target[i][0]==0) {
//                    break top;
//                }System.out.print(target[i][j] + "\t");
//            }
//            System.out.println(i);
//        }


        /*
        数学方法

        时间 0ms 100%
        内存 35.2mb 100%
         */
        int W=(int)Math.sqrt((double)area);
        while(area%W!=0){
            W-=1;
        }
        System.out.println(area/W+" "+W);

    }
}

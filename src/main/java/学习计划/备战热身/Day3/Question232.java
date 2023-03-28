package 学习计划.备战热身.Day3;

/**
 * 232. 用栈实现队列
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/28 17:00
 **/
public class Question232 {
    int size;
    int num;
    int[] arr;
    int headIndex;
    int setIndex;

    public Question232() {
        size=8;
        arr=new int[size];
        num=0;
        headIndex=0;
        setIndex=0;
    }

    public void push(int x) {
        if (num==0){
            setIndex=0;
            headIndex=0;
        }
        arr[setIndex]=x;
        num+=1;
        if (arr[setIndex]!=0&&num==size){
            int newSize=size*2;
            int[] newArr = new int[newSize];
            for (int i = 0; i < num; i++) {
                newArr[i]=arr[(headIndex+i)%num];
            }
            arr=newArr;
            headIndex=0;
            size=newSize;
        }
        setIndex=(setIndex+1)%size;

    }

    public int pop() {
        if (num!=0) {
            num -= 1;
            int val = arr[headIndex];
            arr[headIndex] = 0;
            headIndex = (headIndex + 1) % size;

            if (num > 25 && num < size / 2) {
                int newSize = size / 2;
                int[] newArr = new int[newSize];
                for (int i = 0; i < num; i++) {
                    newArr[i] = arr[headIndex + i];
                }
                arr = newArr;
                headIndex = 0;
                setIndex -= num;
                size = newSize;
            }
            return val;
        }

        return 0;
    }

    public int peek() {
        return arr[headIndex];
    }

    public boolean empty() {
        return num == 0;
    }


}

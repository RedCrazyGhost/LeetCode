package 学习计划.多线程;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1114. 按序打印
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/26 16:47
 **/
public class Question1114 {
    private AtomicInteger firstJobDone = new AtomicInteger(0);
    private AtomicInteger secondJobDone = new AtomicInteger(0);

    public Question1114() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstJobDone.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(firstJobDone.get()!=1){

        }

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondJobDone.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(secondJobDone.get()!=2){

        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}

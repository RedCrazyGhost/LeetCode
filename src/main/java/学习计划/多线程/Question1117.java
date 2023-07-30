package 学习计划.多线程;

import java.util.concurrent.Semaphore;

/**
 * 1117. H2O 生成
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/26 17:24
 **/
public class Question1117 {

    //信号量
    private Semaphore H=new Semaphore(2);
    private Semaphore O=new Semaphore(0);
    public Question1117() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        H.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        O.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        O.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        H.release(2);
    }
}


package 学习计划.多线程;

/**
 * 1279. 红绿灯路口
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/26 17:15
 **/
public class Question1279 {
    private volatile int road=1;
    public Question1279() {

    }

    public void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ) {
        synchronized (this){
            if (road!=roadId){
                turnGreen.run();
                road=roadId;
            }
            crossCar.run();
        }
    }
}

package courses.threadpkg;

public class MyThread implements Runnable{
    @Override
    public void run() {
    }

    public void letsWait(){
        System.out.println(Thread.currentThread().getName()+" Entered");
        synchronized (this){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" Thread wakeup");
    }

    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        t1.setName("Thread A");
        Thread t2 = new Thread(obj);
        t2.setName("Thread B");
        Thread t3 = new Thread(obj);
        t3.setName("Thread C");
        t1.start();
        obj.letsWait();
//        t2.start();
//        t3.start();
    }
}

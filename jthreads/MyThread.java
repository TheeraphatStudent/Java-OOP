package jthreads;

public class MyThread extends Thread {
    private int startNum;
    private int endNum;
    private int round;
    private boolean isNumberTask;
    private boolean isRandTask;

    public MyThread(char startNum, char endNum, boolean isNumberTask) {
        this.startNum = (int) startNum;
        this.endNum = (int) endNum;
        this.isNumberTask = isNumberTask;
        this.isRandTask = false;
    }

    public MyThread(int startNum, int endNum, boolean isNumberTask) {
        this.startNum = startNum;
        this.endNum = endNum;
        this.isNumberTask = isNumberTask;
        this.isRandTask = false;
    }

    public MyThread(int startNum, int endNum, boolean isRandTask, int round) {
        this.startNum = startNum;
        this.endNum = endNum;
        this.isRandTask = isRandTask;
        this.round = round;
        this.isNumberTask = false;
    }

    public static void main(String[] args) {
        MyThread charThread = new MyThread('a', 'z', false);
        MyThread numThread = new MyThread(1, 24, true);
        MyThread randThread = new MyThread(1, 9, true, 20);

        try {
            charThread.start();
            numThread.start();
            randThread.start();
            // System.out.println("Active Thread: " + Thread.activeCount());
            // System.out.println("Stack Thread: " + Thread.getAllStackTraces());
            // System.out.println("Thread: " + Thread.currentThread());

            charThread.join();
            numThread.join();
            randThread.join();
            // System.out.println("Current Thread: " + Thread.activeCount());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            getContent(startNum, endNum);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    private void getContent(int startAt, int endAt) {
        try {
            if (isRandTask) {
                for (int i = startAt; i <= round; i++) {
                    Thread.sleep(100);

                    int rand = (int) (Math.random() * (endAt - startAt + 1)) + startAt;
                    System.out.printf("rand %d > %d\n",i, rand);
                }
            } else {
                for (int i = startAt; i <= endAt; i++) {
                    Thread.sleep(100);

                    if (isNumberTask) {
                        System.out.printf("num > %d\n", i);
                    } else {
                        System.out.printf("char > %c\n", (char) i);
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Get Content Error: " + e);
        }
    }
}

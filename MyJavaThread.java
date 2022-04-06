package com;

public class MyJavaThread extends Thread{


    public MyJavaThread() {
        //super();
        System.out.println(MyJavaThread.class);

    }
    @Override
    public void run() {
        //super.run();
        try {
            for (int i=0;i<10;i++){
                System.out.println(i);
                sleep(1500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        MyJavaThread myThread=new MyJavaThread();
        myThread.start();
    }
}

package com;

public class ThreadNumber extends Thread{
    String num;
    int count;

    public ThreadNumber(String num, int count) {
        this.num = num;
        this.count = count;
    }
    @Override
    public void run() {
        for (int i=count;i>=0;i--){
            if (i>1) {
                System.out.println(num + ":" + count--);
            }else if (i==1){
                System.out.println(num + ":" + count--);
                System.out.println(num+" exiting");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

    @Override
    public String toString() {
//        return super.toString();
        return "Thread["+num+","+count+",main]";
    }

}

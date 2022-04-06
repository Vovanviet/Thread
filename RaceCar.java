package com;

public class RaceCar extends Thread{
    int finish;
    String name;
    RaceCar (int finish,String name){
        this.finish=finish;
        this.name=name;
    }

    @Override
    public void run() {
        //super.run();
        for (int i = 0; i < finish; i++) {
            System.out.println(name + ":" + (i + 1) + "Running...");

            try {
                sleep(Math.round(Math.random() * 5000));
            } catch (Exception e) {}
        }
            System.out.println(name+"finished");

    }
}

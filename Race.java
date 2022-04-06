package com;

public class Race {
    public static void main(String a[]) {
        RaceCar[] cars=new RaceCar[5];
        cars[0]=new RaceCar(10,"Superman");
        cars[1]=new RaceCar(10,"Doraemon");
        cars[2]=new RaceCar(10,"Nobita");
        cars[3]=new RaceCar(10,"Batman");
        cars[4]=new RaceCar(10,"Shizuka");
        for (int i=0;i<5;i++) {
            cars[i].start();
        }
    }
}

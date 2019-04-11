package com.company;

/**
 * Created by cadams on 4/8/19.
 */
public class readMyArray {

    public static void main(String[] args) {
        vel();
        thrust();
    }

    static void vel(){
        final int NUM_FACTS = 100;
        double velocity[];
        velocity = new double[NUM_FACTS];
        for (int i = 0; i < NUM_FACTS; i++) {
            //       myArray[i] = i;
            System.out.println(velocity[i]=i);
        }
    }

    static void thrust(){
        final int NUM_FACTS = 100;
        double thrust[];
        thrust = new double[NUM_FACTS];
        for (int i = 0; i < NUM_FACTS; i++) {
            //       myArray[i] = i;
            System.out.println(thrust[i]=i);
        }
    }

    Rocket rocket1 = new Rocket();
    Rocket rocket2 = new Rocket();
    rocket1.setRocketName()


}

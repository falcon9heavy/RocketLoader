package com.company;

/**
 * Created by cadams on 4/8/19.
 */
public class readMyArray {

    public static void main(String[] args) {
        vel();
        thrust();
        Rocket rocket1 = new Rocket();
        rocket1.setRocketName("Falcon9");
        rocket1.setRocketMass(333400.0);
        rocket1.setRocketThrust(1700000.0);
        System.out.println(rocket1.getRocketName());
        System.out.println(rocket1.getRocketMass());
        System.out.println(rocket1.getRocketThrust());

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
}

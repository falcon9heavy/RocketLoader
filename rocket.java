package com.company;

/**
 * Created by cadams on 4/8/19.
 */
 class Rocket {
    String rocket_name;
    Double rocket_mass;
    Double rocket_thrust;

    String getRocketName(){
        return rocket_name;
    }

    void setRocketName(String rName){
        this.rocket_name = rName;
    }

    Double getRocketMass(){
        return rocket_mass;
    }

    void setRocketMass(Double rMass) {
        this.rocket_mass = rMass;
    }

    Double getRocketThrust(){
        return rocket_thrust;
    }

    void setRocketThrust(Double rThrust) {
        this.rocket_thrust = rThrust;
    }
}

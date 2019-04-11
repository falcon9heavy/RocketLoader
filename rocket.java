package com.company;

/**
 * Created by cadams on 4/8/19.
 */
 class Rocket {
    String rocket_name;
    Double rocket_mass;
    Double rocket_thrust;

    String getRocket_name(){
        return rocket_name;
    }

    void setRocket_name(String rName){
        this.rocket_name = rName;
    }

    Double getRocket_mass(){
        return rocket_mass;
    }

    void setRocket_mass(Double rMass) {
        this.rocket_name = rMass;
    }

    Double getRocket_thrust(){
        return rocket_thrust;
    }

    void setRocket_thrust(Double rThrust) {
        this.rocket_thrust = rThrust;
    }
}

package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cadams on 4/8/19.
 */
public class readMyArray {

    public static void main(String[] args) {
        String fileName= "/Users/cadams/IdeaProjects/testproject/src/com/company/read_nums.csv";
        File file= new File(fileName);

        // this gives you a 2-dimensional array of strings
        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner(file);

            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values));
            }

            inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // the following code lets you iterate through the 2-dimensional array
        int lineNo = 1;
        for(List<String> line: lines) {
            int columnNo = 1;
            for (String value: line) {
                System.out.println("Line " + lineNo + " Column " + columnNo + ": " + value);
                columnNo++;
            }
            lineNo++;
        }
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

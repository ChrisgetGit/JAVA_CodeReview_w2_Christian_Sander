import java.io.*;
import java.util.ArrayList;

public class Exercise {

    int duration;
    String exerciseName;
    String description;
    boolean position;
//constructor
    public Exercise (int duration, String exerciseName, String description, boolean position){
        this.duration=duration;
        this.exerciseName=exerciseName;
        this.description=description;
        this.position=position;
    }

//formatted print out method
    public void printDescription(){
        String leftAlignFormat = "| %-15s |  %-8s  %-3d %-7s |%n";


        System.out.format(leftAlignFormat, exerciseName , "DURATION ",duration,"seconds");
        System.out.format("+--------------------------------------------------%n");
        System.out.println("DESCRIPTION: "+ description+"\n");


    }

    @Override
    public String toString() {
        return duration
                + exerciseName +
                 description +
                 position ;
    }
}


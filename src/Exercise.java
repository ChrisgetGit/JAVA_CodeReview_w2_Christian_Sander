public class Exercise {

    int duration;
    String exerciseName;
    String description;
    boolean position;

    public Exercise (int duration, String exerciseName, String description, boolean position){
        this.duration=duration;
        this.exerciseName=exerciseName;
        this.description=description;
        this.position=position;
    }


    Exercise push_ups = new Exercise (30, "Push-ups","Push-ups : Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your\n" +
            "    feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.\n" +
            "    Do this for 30 seconds.",true);

    Exercise planks = new Exercise(90,"Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under y\n" +
            "    our shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head,\n" +
            "     looking down at the floor. Now, tighten your abs and hold. Do this for 90 seconds.",true);

    Exercise squats = new Exercise(45, "Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles.\n" +
            "     Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale,\n" +
            "     then explode back up to standing, driving through heels. Do this for 45 seconds.", false);

    Exercise backwardKick = new Exercise(60, "Backward Kick", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it.\n" +
            "     Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs.\n" +
            "     Return to the starting position and repeat. Do this for 60 seconds.", true );

    Exercise legCurl = new Exercise(90, "Leg Curl","Stand up on, shift your weight to  one feet and pull another heel toward your buttocks.\n" +
            "    Stay for 15 seconds, then repeat with your other leg.   Do this for 90 seconds.", false);

    Exercise sidwardsBackStretch = new Exercise(60, "Sideward Back Stretch", "Go into standing position, put your hands on your hips and then stretch with one hand over your head\n" +
            "    to the opposite side. Repeat with other hand. Do this for 60 seconds.", false);

    public void printDescription(){
        System.out.println();

    }

    /*    Push-ups : Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your
    feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.
    Do this for 30 seconds.

    Planks : Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under y
    our shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head,
     looking down at the floor. Now, tighten your abs and hold. Do this for 90 seconds.

    Squats:   Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles.
     Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale,
     then explode back up to standing, driving through heels. Do this for 45 seconds.


    Backward Kick Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it.
     Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs.
     Return to the starting position and repeat. Do this for 60 seconds.


    Leg Curl Stand up on, shift your weight to  one feet and pull another heel toward your buttocks.
    Stay for 15 seconds, then repeat with your other leg.   Do this for 90 seconds.

    Sidewards Back Stretch Go into standing position, put your hands on your hips and then stretch with one hand over your head
    to the opposite side. Repeat with other hand. Do this for 60 seconds.*/

}

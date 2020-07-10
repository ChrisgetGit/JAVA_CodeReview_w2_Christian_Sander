

public class IntervalWorkOut {

    String exercise1;
    String exercise2;
    String exercise3;
    int breakTime;
    int numberOfRepetitions;

//Objects for WorkOut exercises, breaktime, repetitions
    IntervalWorkOut(String exercise1, String exercise2, String exercise3 ,int breakTime,int numberOfRepetions){
        this.exercise1 = exercise1;
        this.exercise2 = exercise2;
        this.exercise3 = exercise3;
        this.breakTime = breakTime;
        this.numberOfRepetitions= numberOfRepetions;
    }

    public void workOutMethod(){
        System.out.println("*****************************\n Interval workout STARTS !!!\n*****************************");
        for (int i = 0; i<numberOfRepetitions; ++i ) {
            System.out.println("=============================\nROUND " + (i + 1) + ":" + "\n" + exercise1 + "\n" + exercise2 + "\n" + exercise3);
            if (i<3){
                System.out.println("=============================\nDO THE BREAK "+breakTime+" SECONDS)");
            }else System.out.println("*****************************\nCONGRATS - YOU ARE DONE!!!\n*****************************");

        }






    }

}

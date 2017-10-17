package week3.models;

public class randomModel {
    private long startTime;
    private long endTime;
    private int[] randomArray;

    public randomModel(long startTime, long endTime, int[] randomArray) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.randomArray = randomArray;
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public int[] getRandomArray(){
        return randomArray;
    }
}

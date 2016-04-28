package commonhelpers;

public class Timer {

    private long startTime;
    private long endTime;

    public void Start(){
        startTime = System.currentTimeMillis();
    }

    public void Stop(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }

}

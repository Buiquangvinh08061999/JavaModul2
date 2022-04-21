package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM;

import java.time.LocalTime;

public class StopWatch {
    private  LocalTime starTime;
    private  LocalTime endTime;

    public StopWatch(){
        starTime = LocalTime.now();
    }

    public StopWatch(LocalTime starTime, LocalTime endTime){
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public LocalTime getStarTime() {
        return starTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public void start(){
        starTime=LocalTime.now();
    }
    public  void Stop(){
        endTime=LocalTime.now();
    }

    public int getElapsedTime(){
        int miliSecond =( ( endTime.getHour() - starTime.getHour() )*3600 + ( endTime.getMinute()-starTime.getMinute() )* 60  + (endTime.getSecond() - starTime.getSecond()*1000)  );
        return miliSecond;
    }

    }


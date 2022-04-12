package LearnJaVa.OOPBasic.Mydate;

public class MyDaTe {
    private  int day;
    private  int month;
    private  int year;

    public MyDaTe(int d, int m , int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public  void getDay(){
        System.out.println("Day: " + this.day);
    }
    public  void getMonth(){
        System.out.println("Month: " + this.month);
    }
    public  void getYear(){
        System.out.println("Year: " + this.year);
    }

    public  void getAllDay_Month_Year(){
        System.out.println("MyDate: " + this.day +"-"+this.month+"-"+this.year);
    }
}

package LearnJaVa.OOPBasic.BookManagement;

public class MyDaTe {
    private int day;
    private int month;
    private int year;

    public MyDaTe(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
        if (year >= 1) {
            this.year = year;
        }
    }

    public int getDay() {
        return this.day;
    }
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public int getMonth() {
        return this.month;
    }
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        if (year >= 1) {
            this.year = year;
        }
    }


}

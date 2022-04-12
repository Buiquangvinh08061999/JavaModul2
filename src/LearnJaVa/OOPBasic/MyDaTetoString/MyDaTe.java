package LearnJaVa.OOPBasic.MyDaTetoString;

public class MyDaTe {
    //Cho điều kiện chặt chẽ để bài làm hoạn thiện 100%
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
    //Dùng phương thức public String toString() để gọi lại tất cả day-month-year;
    //Đã gọi thành công bên tab mới
    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    //Dùng phương thức equals để so sánh bằng và khác, kiểu dử liệu trả về true/false
    //Đã so sánh thành công bên tab mới
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        MyDaTe other = (MyDaTe) obj;
        if (this.day != other.day)
            return false;
        if (this.month != other.month)
            return false;
        if (this.year != other.year)
            return false;
        return true;
    }

    //Dùng hàm băm(hashCode) để so sánh con số(giá trị đại diện cho đối tượng:39664(8/6/1999))
    //Sử dụng hàm này tương ứng vs hàm equals, nhưng con số sẽ đại diện cho nó(md1,md2,md3)
    public int hashCode(){
        final  int prime =31;
        int result = 1;
        result = prime * result +day;
        result = prime * result +month;
        result = prime * result +year;
        return  result;
    }
}

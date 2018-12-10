public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate afterNumberOfDays(int days){
        MyDate newMyDate = new MyDate(this.day,this.month,this.year);
        newMyDate.advance(days);
        return newMyDate;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
 
}

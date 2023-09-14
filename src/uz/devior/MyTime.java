package uz.devior;

public class MyTime {

    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        if(validateHour(hour)==-1 || validateMinuteAndSecond(minute)==-1 || validateMinuteAndSecond(second)==-1){
            throw new RuntimeException("Yaroqsiz soat, daqiqa yoki soniya!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if(validateHour(hour)==-1 || validateMinuteAndSecond(minute)==-1 || validateMinuteAndSecond(second)==-1){
            throw new RuntimeException("Yaroqsiz soat, daqiqa yoki soniya!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(validateHour(hour)==-1){
            throw new RuntimeException("Yaroqsiz soat!");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(validateMinuteAndSecond(minute)==-1){
            throw new RuntimeException("Yaroqsiz daqiqa!");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(validateMinuteAndSecond(second)==-1){
            throw new RuntimeException("Yaroqsiz soniya!");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return (hour < 10 ? "0" + hour : hour) + ":" +
                (minute < 10 ? "0" + minute : minute) + ":" +
                (second < 10 ? "0" + second : second);
    }


    public int validateHour(int hour) {
        if (hour > -1 && hour < 24) return hour;
        return -1;
    }

    public int validateMinuteAndSecond(int minuteOrSecond) {
        if (minuteOrSecond > -1 && minuteOrSecond < 60) return minuteOrSecond;
        return -1;
    }

    public MyTime nextSecond(){
        if(this.second!=59){
            this.second++;
        }else{
            this.second=0;
        }
        return this;
    }

    public MyTime previousSecond(){
        if(this.second!=0){
            this.second--;
        }else{
            this.second=59;
        }
        return this;
    }

    public MyTime nextMinute(){
        if(this.minute!=59){
            this.minute++;
        }else{
            this.minute=0;
        }
        return this;
    }

    public MyTime previousMinute(){
        if(this.minute!=0){
            this.minute--;
        }else{
            this.minute=59;
        }
        return this;
    }

    public MyTime nextHour(){
        if(this.hour!=23){
            this.hour++;
        }else{
            this.hour=0;
        }
        return this;
    }

    public MyTime previousHour(){
        if(this.hour!=0){
            this.hour--;
        }else{
            this.hour=23;
        }
        return this;
    }


}

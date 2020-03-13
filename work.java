package com.company;

public class work extends Event{

    public work(){
        super(0,null,null);

    }

    public work(int date,String time, String name){
        super(date,time,name);
    }

    public int get_date(){
        return event_date;
    }

    public String get_time(){
        return event_time;
    }

    public String get_name(){
        return event_name;
    }

    void display() {

        System.out.println("Date: ");
        System.out.println(this.get_date());
        System.out.println("Time: ");
        System.out.println(this.get_time());
        System.out.println("Name: ");
        System.out.println(this.get_name());

    }

}

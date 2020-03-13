package com.company;


abstract class Event {

    protected int event_date;
    protected String event_time;
    protected String event_name;

    public void Event(){
        this.event_date=0;
        this.event_name=null;
        this.event_time=null;
    }


    public Event(int date,String time,String name){
        event_date=date;
        event_time=time;
        event_name=name;

    }

    public void set_event(int date,String time,String name){
        event_date=date;
        event_time=time;
        event_name=name;

    }

    public void set_date(int date){
        event_date=date;

    }

    public void set_time(String time){
        event_time=time;

    }

    public void set_name(String name){
        event_name=name;

    }

    public String get_name(){
        return event_name;

    }

    public String get_time(){
        return event_time;

    }

    public int get_date(){
        return event_date;

    }

    abstract void display();
}

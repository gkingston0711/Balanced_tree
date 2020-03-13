package com.company;

public class Lnode {

    protected Lnode next;
    protected Event data;

    public Lnode(){
        next=null;
        data=null;

    }

    public Lnode(Event obj){
        data=obj;
        next=null;
    }

    public Event get_event(){
        return data;
    }

    public void set_event(Event obj){
        if(obj==null){
            return;
        }
        data=obj;
        next=null;
    }

}

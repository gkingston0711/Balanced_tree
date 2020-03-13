package com.company;

public class Tnode {

    protected int color;
    protected Tnode right;
    protected Tnode left;
    protected list Tnode_list;

    public Tnode(){
        color=0;
        right=null;
        left=null;
        Tnode_list=null;
    }

    public Tnode(list new_list){
        Tnode_list=new_list;
        right=null;
        left=null;
        color=0;
    }

    public list get_Tlist(){
        return Tnode_list;
    }

    public Tnode get_right(){
        return right;
    }

    public Tnode get_left(){
        return left;
    }

    public void set_Tnode_list(list one){
        Tnode_list=one;
    }

    public void set_color(int C){
        color=C;
    }

    public void set_right(Tnode R){
        right=R;
    }

    public void set_left(Tnode L){
        left=L;
    }
}

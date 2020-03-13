package com.company;
import java.util.Scanner;

public class list {

    protected Lnode head;

    public list(){
        head=null;
    }

    public list(Event newest){
        Lnode new_node=new Lnode(newest);
        head=new_node;

    }

    public void set_node(Event newest){
        Lnode new_node=new Lnode(newest);
        head=new_node;
    }

    public Lnode get_head(){
        return head;
    }

    public void insert(Event newest) {
        if (this.head == null) {
            Lnode new_node = new Lnode(newest);
            this.head = new_node;
            return;
        }

        if (this.head.data.get_date() > newest.get_date()) {
            Lnode new_node = new Lnode(newest);
            new_node.next = head;
            this.head = new_node;
            return;

        }
        insert(newest, head);
    }
    private void insert(Event newest, Lnode head) {

        if (head.next == null) {

            if (head.data.get_date() > newest.get_date()) {
                //before

                Lnode new_node = new Lnode(newest);
                new_node.next = head;
                head = new_node;
                return;

            } else {
                Lnode new_node = new Lnode(newest);
                head.next = new_node;
                return;
            }
        }
        if (head.data.get_date() >= newest.get_date()) {
            Lnode new_node = new Lnode(newest);
            new_node.next = head;
            return;
        }

        if (head.data.get_date() > newest.get_date()) {
            Lnode new_node = new Lnode(newest);
            Lnode temp = head.next;

            new_node.next = temp;
            head.next = new_node;

            return;

        }

        insert(newest, head.next);
    }


    public void display() {
        if (head == null) {
            return;
        }
        display(head);
    }

    private void display(Lnode head) {
        if (head == null) {
            return;
        } else {
            head.data.display();
            display(head.next);
        }
    }

}

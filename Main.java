package com.company;
import com.company.list;


class Main {
//test

    public static void main(String[] args) {
        System.out.println("BST Below");

        list object=new list();


        dinner party = new dinner(2,"5pm","joey_dinner");
        Event new_event= party;
        object.insert(party);

        work party1 = new work(3,"5pm","brig_work");
        Event new_event1= party;
        object.insert(party1);

        work party2 = new work(4,"5pm","debby_work");
        Event new_event2= party;
        object.insert(party2);

        fun party3 = new fun(5,"5pm","claire_fun");
        Event new_event3= party;
        object.insert(party3);


        //object.display();


        list object2=new list();


        dinner party10 = new dinner(3,"5pm","daniel_dinner");
        Event new_event6= party;
        object2.insert(party10);

        work party11 = new work(3,"5pm","brian_work");
        Event new_event7= party;
        object2.insert(party11);

        work party12 = new work(3,"5pm","jake_work");
        Event new_event8= party;
        object2.insert(party12);

        fun party13 = new fun(3,"5pm","zack_fun");
        Event new_event9= party;
        object2.insert(party13);


        //object2.display();

        list object3=new list();


        dinner party90 = new dinner(15,"5pm","zoltan_dinner");
        Event new_event90= party;
        object3.insert(party90);

        work party91 = new work(16,"5pm","brig_work");
        Event new_event91= party;
        object3.insert(party91);

        work party92 = new work(18,"5pm","debby_work");
        Event new_event92= party;
        object3.insert(party92);

        fun party93 = new fun(19,"5pm","claire_fun");
        Event new_event93= party;
        object3.insert(party93);


        //object3.display();


        list object4=new list();


        dinner party100 = new dinner(20,"5pm","amy_dinner");
        Event new_event100= party;
        object4.insert(party100);

        work party101 = new work(21,"5pm","matt_work");
        Event new_event101= party;
        object4.insert(party101);

        work party102 = new work(23,"5pm","ammon_work");
        Event new_event102= party;
        object4.insert(party102);

        fun party103 = new fun(24,"5pm","zebra_fun");
        Event new_event103= party;
        object4.insert(party103);

        //object4.display();

        tree tree1=new tree();

        Tnode one=new Tnode(object);
        //System.out.println(object.get_head().get_event().get_name());
        Tnode two=new Tnode(object2);
        //System.out.println(object2.get_head().get_event().get_name());
        Tnode three=new Tnode(object3);
        //System.out.println(object3.get_head().get_event().get_name());
        Tnode four=new Tnode(object4);
        //System.out.println(object4.get_head().get_event().get_name());

        tree1.insert(one);
        tree1.insert(two);
        tree1.insert(three);
        //tree1.insert(four);

        tree1.display_tree();
    }
}

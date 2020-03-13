package com.company;

public class tree {

    private Tnode root;

    public tree(){
        root=null;
    }

    public void insert(Tnode newest_node) {

        Tnode new_node = newest_node;
        newest_node.set_left(null);
        newest_node.set_right(null);
        new_node.set_color(0);


        if (root == null) {
            root = new_node;
            //new_node.set_color(0);

            System.out.println("***********CASE FOR EMPTY"+ new_node.get_Tlist().get_head().get_event().get_name()+"\n");
            return;
        }

        else if(root.get_right()==null && root.get_left()==null) {
            int value;
            value = root.get_Tlist().get_head().get_event().get_name().compareTo(newest_node.get_Tlist().get_head().get_event().get_name());

            System.out.println("***********CASE FOR ONE NODE"+ new_node.get_Tlist().get_head().get_event().get_name()+"\n");

            if (value == 0)
                return;
            else if (value < 0) {
                root.set_left(new_node);
            } else {
                root.set_right(new_node);
            }
            return;
        }
            insert(new_node,root);
    }


    private void insert(Tnode new_node,Tnode root){
        if(root==null){

            System.out.println("***********THIRD THING "+ new_node.get_Tlist().get_head().get_event().get_name()+"\n");
            root=new_node;
            root.set_right(null);
            root.set_left(null);
            return;
        }

        else {//if(root.get_right()==null && root.get_left()==null) {
            int value;
            value = root.get_Tlist().get_head().get_event().get_name().compareTo(new_node.get_Tlist().get_head().get_event().get_name());
       //     if (value == 0) {
         //       return;
             if (value < 0) {
                insert(new_node, root.left);
            } else {
                insert(new_node, root.right);
            }
        }
        return;

    }

    public void display_tree(){
        if(root==null) {
            System.out.println("nothing to show");
        }
        else{
            int level=1;
            display_tree(root,level);
        }
    }

    private void display_tree(Tnode root,int level){
        if(root==null){
            return;
        }
        else{
            System.out.println("level is: "+level+" value is: "+root.get_Tlist().get_head().get_event().get_name());
        }
        ++level;

        display_tree(root.left,level);
        display_tree(root.right,level);
    }
}



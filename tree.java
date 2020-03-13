package com.company;

public class tree {

    private Tnode root;

    public tree(){
        root=null;
    }

    public void insert(Tnode newest_node){

        Tnode new_node=newest_node;
        new_node.set_color(0);


        if(root==null) {
            root = new_node;
            new_node.set_color(0);
            return;
        }
        else if(root.get_right()==null && root.get_left()==null) {
            int value;
            value = root.get_Tlist().get_head().get_event().get_name().compareTo(newest_node.get_Tlist().get_head().get_event().get_name());

        //    System.out.print(value +"*********************");
          //  System.out.println(root.get_Tlist().get_head().get_event().get_name());
           // System.out.println(new_node.get_Tlist().get_head().get_event().get_name());

            if (value == 0)
                return;
            else if (value < 0) {
                root.left = new_node;
            } else {
                root.right = new_node;
            }

        }
        else {
            insert(new_node,root);
        }
    }
    private void insert(Tnode new_node,Tnode root){
        if(root==null){
            root=new_node;
        }
        else {
            int value;
            value = root.get_Tlist().get_head().get_event().get_name().compareTo(new_node.get_Tlist().get_head().get_event().get_name());
            //System.out.println(value +"*********************");
            //System.out.println(root.get_Tlist().get_head().get_event().get_name());
            //System.out.println(new_node.get_Tlist().get_head().get_event().get_name());
            if (value == 0) {
                return;
            } else if (value < 0) {
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



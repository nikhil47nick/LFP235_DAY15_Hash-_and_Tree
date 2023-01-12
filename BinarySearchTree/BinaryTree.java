package com.bridgelabz.Day15.BinarySearchTree;

public class BinaryTree<V extends Comparable> {

    MyBinaryNode root;



    public <V extends Comparable> void add(V data){
        MyBinaryNode node = new MyBinaryNode();
        node.setValue(data);

        if(root == null){
            root = node;
            return;
        }
        MyBinaryNode n = root;
        while(true){
            if(n.getValue().compareTo(data)>0 && n.left !=null){
                n=n.left;
                continue;
            }
            if(n.getValue().compareTo(data)<0 && n.right !=null){
                n=n.right;
                continue;
            }
            if(n.getValue().compareTo(data)>0 && n.left ==null){
                n.left = node;
                break;
            } else if (n.getValue().compareTo(data)<0 && n.right ==null) {
                n.right = node;
                break;
            }
        }

    }

    void displayTree() {
        MyBinaryNode n = root;

        System.out.println("First Node :"+n.getValue());
        System.out.println("Left Node : "+n.left.getValue());
        System.out.println("right Node : "+n.right.getValue());

    }

    void search(V data){
        MyBinaryNode n = root;
        while(true){
            if(n.getValue().equals(data)){
                System.out.println("Value found ");
                break;
            }
            if(n.getValue().compareTo(data)>0 && n.left !=null){
                n=n.left;
                System.out.println("Node is at left side");
                continue;
            }else if(n.getValue().compareTo(data)<0 && n.right !=null){
                n=n.right;
                System.out.println("Node is at right side");
            }else {
                System.out.println("Value not found");
                break;
            }

        }
    }



}

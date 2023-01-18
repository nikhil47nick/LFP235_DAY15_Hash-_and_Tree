package com.bridgelabz.Day15.BinarySearchTree;

public class MyBinaryNode<V extends Comparable> implements INode {
    private V value;
    MyBinaryNode left,right;

    public MyBinaryNode(V data){
        this.value = data;
        this.left = null;
        this.right = null;
    }

   public V getValue(){
        return value;
    }

}

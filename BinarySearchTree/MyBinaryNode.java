package com.bridgelabz.Day15.BinarySearchTree;

public class MyBinaryNode<V extends Comparable> implements INode {
    private V value;
    MyBinaryNode left,right;

   public V getValue(){
        return value;
    }

    public void setValue(Object value) {
        this.value = (V) value;
    }

}

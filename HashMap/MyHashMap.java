package com.bridgelabz.Day15.HashMap;


import com.bridgelabz.Day14.LinkedList.LinkedList;

import java.util.ArrayList;

public class MyHashMap<K,V> {
    private final int num=5;
    ArrayList<LinkedList<K>> myBucket;

    public MyHashMap() {

        myBucket = new ArrayList<>(num);
    }

    public V get(K key){
        int index= getIndex(key);
        LinkedList myList = myBucket.get(index);
        if(myList != null) {
            MyMapNode<K,V> mymap =(MyMapNode<K,V>) myList.search(key);
            return (mymap == null)? null:mymap.getValue();
        }else {return null;}

    }


    public void add(K key, V value){
        int index= getIndex(key);
        LinkedList myList = myBucket.get(index);

        if (myList == null) {
            myList = new LinkedList<>();
            myBucket.set(index,myList);
        }
        MyMapNode<K,V> mymap =(MyMapNode<K,V>) myList.search(key);

        if(mymap == null) {
             mymap= new MyMapNode<>(key,value);
            myList.append(mymap);
            }else {
                mymap.setValue(value);
            }
    }


    public int getIndex(Object obj){
        return Math.abs(obj.hashCode()) % num;
    }


    public void remove(K key){
        int index= getIndex(key);
        LinkedList myList = myBucket.get(index);

        if(myList != null) {
            MyMapNode<K,V> mymap =(MyMapNode<K,V>) myList.search(key);
            myList.remove(key);
            System.out.println("Removed: "+key);
        }else {
            System.out.println("Key Not found");
        }
    }

}
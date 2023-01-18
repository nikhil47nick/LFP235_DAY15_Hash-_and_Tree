package com.bridgelabz.Day15.HashTable;

import com.bridgelabz.Day14.LinkedList.LinkedList;

public class HashTable <K,V>{

    LinkedList list;
    private int size;

    public HashTable(){
        list = new LinkedList();
        this.size = 0;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public <K extends Comparable> void put(K key,V value){

        if(key == null || value == null){
            System.out.println("key or value is null");
        }else {
            MyMapNode head=null;
            int index = getIndex(key);
            if(index >= 0){
                 head =(MyMapNode) list.dataAt(index);
                while(head != null){
                    head = head.next;
                }
            }

            MyMapNode node = new MyMapNode(key, value);
            node.next = head;
            list.update(index, (Comparable) node);
            size++;
        }
    }

    public <K extends Comparable> V get(K key){
        int index = getIndex(key);
        MyMapNode head =(MyMapNode) list.dataAt(index);
        if(key != null) {
            while (head != null) {
                if (head.getKey() == key) {
                    return (V) head.getValue();
                }
                head = head.next;
            }
        }else{
            System.out.println("The key is null");
        }
        return  null;
    }



    public V remove(Integer key){
        int index = getIndex(key);
        MyMapNode head =(MyMapNode) list.dataAt(index),prev = null;
        if(key != null) {
            while (head != null) {
                if (head.getKey() == key) {
                    if(prev != null) {
                        prev.next = head.next;
                    }else {
                        list.update(index, (Comparable) head.next);
                    }
                    size--;
                    return (V) head.getValue();
                }
                prev = head;
                head = head.next;
            }
        }else{
            System.out.println("The key is null");
        }
        return  null;
    }

    public <K extends Comparable> int getIndex(K key){
        return list.index(key);
    }


    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(102,"Nikhil");
        table.put(12,"joji");
        table.put(10,"new");
        System.out.println("size is "+table.size());
        System.out.println("Index 102th value is "+table.get(102));
        table.remove(10);
        System.out.println("Index 10th value is "+table.get(10));

    }

}

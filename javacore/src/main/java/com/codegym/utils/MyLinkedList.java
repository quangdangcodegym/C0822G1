package com.codegym.utils;

public class MyLinkedList {
    private  Node head;
    private  int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data) {
//        Node temp = head;
        Node holder;

//        for(int i=0; i < index-1 && temp.next != null; i++) {
//            temp = temp.next;
//        }
        Node temp = get(index);
        holder = temp.next;

        Node  dataTemp = new Node(data).next;
        temp.next = dataTemp;
        dataTemp.next = holder;
//        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp=head;
//        for(int i=0; i<index; i++) {
//            temp = temp.next;
//        }
        int i=0;
        while (i<index){
            temp=temp.next;
            i++;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(5);
        list.addFirst(6);
        list.addFirst(8);
        list.addFirst(7);
        list.addFirst(4);
        list.get(2);
    }

}
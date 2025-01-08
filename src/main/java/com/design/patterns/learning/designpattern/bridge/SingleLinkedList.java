package com.design.patterns.learning.designpattern.bridge;

import ch.qos.logback.core.subst.Node;

public class SingleLinkedList<T> implements LinkedList<T> {

    private class Node {
        private T data;
        private Node next;

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node head;
    private Node tail;


    @Override
    public void addFirst(T element) {
        if (head == null) 
          tail = head = new Node(element, null);
        else 
           head = new Node(element, head);
        size++;   
    }

    @Override
    public T removeFirst() {
        if (head == null) 
          return null;
        
        T removedElement = head.data;
        if (head.next != null) {
            head =  head.next;
        } else {
            head = null;
            tail = null;
        }
        size--;
        return removedElement;
    }

    @Override
    public void addLast(T element) {
        if (tail == null) {
            head = tail = new Node(element, null);
        } else {
            tail.next = new Node(element, null);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public T removeLast() {
        if (tail == null) {
            return null;
        } 

        T removedElement = null;

        if (head == tail) {
           removedElement = head.data;
           head = tail = null;
           size--;
           return removedElement;
        }

        Node removedNode = head;
        while (removedNode.next != tail) {
             removedNode = removedNode.next;
        }

        removedElement = tail.data;
        tail = removedNode;
        tail.next = null;
        size--;
        return removedElement;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
	public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node temporary = head;
        while (temporary != null) {
            result.append(temporary.data)
            .append(temporary.next == null ? "" : ", ");
            temporary = temporary.next;
        }
        result.append("]");
		return result.toString();
	}

}

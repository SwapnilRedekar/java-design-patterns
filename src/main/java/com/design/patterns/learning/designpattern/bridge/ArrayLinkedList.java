package com.design.patterns.learning.designpattern.bridge;

public class ArrayLinkedList<T> implements LinkedList<T> {

    private static final int DEFAULT_SIZE = 2;
    private Object[] elements;
    private int size;

    public ArrayLinkedList() {
        elements = new Object[DEFAULT_SIZE];
    }
    
    @Override
	public void addFirst(T element) {
		ensureCapacity(++size);
		shiftOneRight();
		elements[0] = element;
	}

	@Override
	public T removeFirst() {
		if(size == 0) {
			return null;
		}
		@SuppressWarnings("unchecked")
		T first = (T) elements[0];
		size--;
		shiftOneLeft();
		return first;
	}

	@Override
	public void addLast(T element) {
		ensureCapacity(size+1);
		elements[size++] = element;
	}

	@Override
	@SuppressWarnings("unchecked")
	public T removeLast() {
		if(size == 0) {
			return null;
		}
		return (T) elements[size--];
	}

	private void ensureCapacity(int newSize) {
		if(elements.length > newSize) {
			return;
		}
		Object[] temp = new Object[elements.length + DEFAULT_SIZE];
		System.arraycopy(elements, 0, temp, 0, elements.length);
		elements = temp;
	}
	
	private void shiftOneRight() {
		System.arraycopy(elements, 0, elements, 1, size);
	}
	
	private void shiftOneLeft() {
		System.arraycopy(elements, 1, elements, 0, size);
	}
	
	public int getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		String result = "[";
		for(int i=0;i<size;i++) {
			result += elements[i] + (i==size-1?"":", ");
		}
		result+="]";
		return result;
	}
}

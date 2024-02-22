package com.example.demo.services;

import java.util.Iterator;

public class ListNeW<T> implements Iterable<T> {

    private int size;
    public T[] objects;

    public ListNeW(int initialSize){
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element){
        objects[size++] = element;
    }

    public T get(int index){
        return objects[index];
    }

    public int getSize(){
        return size;
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator{
    private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Object next() {
            return objects[currentIndex++];
        }
    }
}

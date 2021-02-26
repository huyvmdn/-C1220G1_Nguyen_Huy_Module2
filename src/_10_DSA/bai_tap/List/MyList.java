package _10_DSA.bai_tap.List;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapa() {
        int newside = elements.length * 2;
        elements = Arrays.copyOf(elements, newside);
    }

    public  boolean add(E e) {
        if (size == elements.length) {
           return  false;
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        size++;
        for (int i = size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
    }

    public E remove(int index) {
        if (size == 0) {
            throw new IndexOutOfBoundsException("có đâu mà xóa??????");
        }
        E tempRemove = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return tempRemove;
    }

    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }
        return result.toString() + "]";
    }

    public int size() {
        return size;
    }

    public MyList<E>  clone() {
        MyList myList =  new MyList();
        myList.elements =  Arrays.copyOf(elements, size);
        myList.size = size;
        return (MyList<E>) myList;
    }

    public boolean contains(E o) {
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                check = true;
            }
        }
        return check;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                index = i;
            }
        }
        return index;
    }
    public void Clear() {
        for (int i=0;i<size;i++) {
            elements[i] = null;
            size =0;
        }
    }

}


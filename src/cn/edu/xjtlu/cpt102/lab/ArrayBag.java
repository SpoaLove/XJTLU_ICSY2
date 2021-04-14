package cn.edu.xjtlu.cpt102.lab;

import java.util.Random;

public class ArrayBag<T> implements Cloneable {
    private T[] data;
    private int manyItems;
    public ArrayBag() {
        final int INITIAL_CAPACITY = 10;
        manyItems = 0;
        data = (T[]) new Object[INITIAL_CAPACITY];
    }

    public ArrayBag(int initialCapacity) {
        manyItems = 0;
        data = (T[]) new Object[initialCapacity];
    }

    public void add(T element) {
        if (manyItems == data.length)
            ensureCapacity((manyItems + 1) * 2);
        data[manyItems++] = element;
    }

    public void addAll(ArrayBag<T> elements){
        ensureCapacity(manyItems + elements.manyItems);
        System.arraycopy(elements.data, 0, data, manyItems, elements.manyItems);
        manyItems += elements.manyItems;
    }

    public void addMany(T ... elements) {
        if (manyItems + elements.length < data.length)
            ensureCapacity((manyItems + elements.length) * 2);
        System.arraycopy(elements, 0, data, manyItems, elements.length);
        manyItems += elements.length;
    }

    @Override
    public ArrayBag<T> clone() throws CloneNotSupportedException {
        ArrayBag<T> clone;
        try {
            clone = (ArrayBag<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone unsupported");
        }
        clone.data = data.clone();
        return clone;
    }

    public int countOccurrences(T target) {
        int count = 0;
        if (target == null) {
            for (int i = 0; i < manyItems; i++)
                if (data[i] == null) count++;
        } else {
            for (int i = 0; i < manyItems; i++)
                if (target.equals(data[i])) count++;
        }
        return count;
    }

    public void ensureCapacity(int newCapacity) {
        if (newCapacity > data.length) {
            T[] newData = (T[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, manyItems);
            data = newData;
        }
    }

    public int getCapacity() {
        return data.length;
    }

    public T grab() {
        Random random = new Random(System.currentTimeMillis());
        int randomIndex = random.nextInt(manyItems);
        return data[randomIndex];
    }

    public boolean remove(T target) {
        int i;
        if (target == null)
            for (i = 0; i < manyItems && data[i] != null; i++);
        else
            for (i = 0; i < manyItems && !target.equals(data[i]); i++);
        if (i == manyItems) return false;
        data[i] = data[--manyItems];
        return true;
    }

    public int size() {
        return manyItems;
    }

    public void trimToSize() {
        if (data.length != manyItems) {
            T[] trimmed = (T[]) new Object[manyItems];
            System.arraycopy(data, 0, trimmed, 0, manyItems);
            data = trimmed;
        }
    }

    public static <T> ArrayBag<T> union(ArrayBag<T> b1, ArrayBag<T> b2) {
        ArrayBag<T> union = new ArrayBag<>(b1.getCapacity() + b2.getCapacity());
        System.arraycopy(b1.data, 0, union.data, 0, b1.manyItems);
        System.arraycopy(b2.data, 0, union.data, b1.manyItems, b2.manyItems);
        union.manyItems = b1.manyItems + b2.manyItems;
        return union;
    }


}

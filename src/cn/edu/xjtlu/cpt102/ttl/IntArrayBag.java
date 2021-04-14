package cn.edu.xjtlu.cpt102.ttl;

public class IntArrayBag implements Cloneable {
    private int[] data;
    private int manyItems;
    public IntArrayBag() {
        final int INITIAL_CAPACITY = 10;
        data = new int[INITIAL_CAPACITY];
        manyItems = 0;
    }
    public IntArrayBag(int initialCapacity){
        if (initialCapacity < 0)
            throw new IllegalArgumentException("The argument is negative: " + initialCapacity);
        data = new int[initialCapacity];
        manyItems = 0;
    }
    public void add(int item) {
        if (manyItems == data.length)
            ensureCapacity((manyItems + 1) * 2);
        data[manyItems++] = item;
    }
    public void addMany(int ... items) {
        if (manyItems + items.length > data.length)
            ensureCapacity((manyItems + items.length) * 2);
        System.arraycopy(items, 0, data, manyItems, items.length);
        manyItems += items.length;
    }
    public void addAll(IntArrayBag bag) {
        ensureCapacity(manyItems + bag.manyItems);
        System.arraycopy(bag.data, 0, data, manyItems, bag.manyItems);
        manyItems += bag.manyItems;
    }
    public IntArrayBag clone() {
        IntArrayBag clonedBag = new IntArrayBag(data.length);
        try {
            clonedBag = (IntArrayBag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone unsupported");
        }
        clonedBag.data = data.clone();
        return clonedBag;
    }
    public int countOccurrences(int item) {
        int count = 0;
        for (int i = 0; i < manyItems; i++)
            if (data[i] == item) count++;
        return count;
    }
    public void ensureCapacity(int newCapacity) {
        if (data.length < newCapacity) {
            int[] newData = new int[newCapacity];
            System.arraycopy(data, 0, newData, 0, manyItems);
            data = newData;
        }
    }
    public int getCapacity() {
        return data.length;
    }
    public boolean remove(int item) {
        int i;
        for (i = 0; (i < manyItems) && (data[i] != item); i++);
        if (i == manyItems) return false;
        // swap data[i] with last item and reduce the size
        data[i] = data[--manyItems];
        return true;
    }
    public int removeMany(int ... items) {
        int count = 0;
        for (int item: items)
            if (remove(item)) count++;
        return count;
    }
    public int size() {
        return manyItems;
    }
    public void trimToSize() {
        if (data.length != manyItems) {
            int[] trimmed = new int[manyItems];
            System.arraycopy(data, 0, trimmed, 0, manyItems);
            data = trimmed;
        }
    }
    public static IntArrayBag union(IntArrayBag first, IntArrayBag second) {
        IntArrayBag union = new IntArrayBag(first.getCapacity() + second.getCapacity());
        System.arraycopy(first.data, 0, union.data, 0, first.manyItems);
        System.arraycopy(second.data, 0, union.data, first.manyItems, second.manyItems);
        union.manyItems = first.manyItems + second.manyItems;
        return union;
    }
    public static IntArrayBag intersection(IntArrayBag first, IntArrayBag second) {
        IntArrayBag intersection = new IntArrayBag();
        for (int i = 0; i < first.manyItems; i++)
            for (int j = i; j < second.manyItems; j++)
                if (first.data[i] == second.data[j])
                    intersection.add(first.data[i]);
        return intersection;
    }






}

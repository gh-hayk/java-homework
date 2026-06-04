package generic_homework;

import java.util.Date;

public class GenericList<T> {
    private Object[] data;
    private int size;
    private int capacity;

    public GenericList(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity not > 0");
        this.capacity = capacity;
        this.data = new Object[capacity];
        this.size = 0;
    }

    public void add(T element) {
        if (size == capacity) {
            grow();
        }
        data[size] = element;
        size++;
    }

    private void grow() {
        capacity = capacity * 2;
        Object[] newDate = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newDate[i] = data[i];
        }
        data = newDate;
        System.out.println("Array grew. New capacity. " + capacity);
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }


    public void insert(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Wrong index: " + index);
        }
        if (size == capacity) grow();

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    public void clear() {
        for (int i = 0; i < size; i++) data[i] = null;
        size = 0;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) return i;
        }
        return -1;
    }

    public int size() {
        return size;
    }


    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds (size=" + size + ")");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>(3);

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("add 3 element: " + list);

        list.add(40);
        System.out.println("after add 4th: " + list);

        list.insert(1, 99);
        System.out.println("Insert(1, 99): " + list);

        list.remove(2);
        System.out.println("Remove(2): " + list);

        System.out.println("get(0) = " + list.get(0));
        System.out.println("indexOf(20) = " + list.indexOf(20));

        list.clear();
        System.out.println("After Clear: " + list);
        System.out.println("Size: " + list.size());
    }
}


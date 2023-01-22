package it.euris.academy2023.dynamic;

public class DynamicArray {

    // CAMPI
    private int currentSize;
    private Object[] arrayData;
    private int count;
    public static final int GROW_RATE = 5;

    public DynamicArray(int initialCapacity) {
        this.currentSize = initialCapacity;
        this.arrayData = new Object[this.currentSize];
        this.count = 0;
    }

    public void add(Object item) {
        if (count >= currentSize) {
            expand();
        }
        this.arrayData[count] = item;
        count = count + 1;
    }

    private void expand() {
        //tasso di crescita pari a GROW_RATE
        //System.out.println("Increasing size from " + currentSize + " to " + (currentSize + GROW_RATE));
        //currentSize = currentSize + GROW_RATE;

        //tasso di crescita esponenziale
        System.out.println("Increasing size from " + currentSize + " to " + (currentSize * 2));
        currentSize = currentSize * 2;
        Object[] temp = new Object[currentSize];
        for (int i = 0; i < this.arrayData.length; i++) {
            temp[i] = this.arrayData[i];
        }
        this.arrayData = temp;
    }

    public Object get(int index) {
        if (index >= count) {
            throw new RuntimeException("Dynamic array index out of bound");
        }
        return this.arrayData[index];
    }

    public String toString() {
        String values = "LISTA\n-------------";
        for (int i = 0; i < count; i++) {
            values = values + "\nPOS -> " + i + " | VALUE -> " + arrayData[i];
        }
        return values;
    }

    public Object[] getArrayData() {
        return arrayData;
    }

    public int getCount(){
        return count;
    }

    public void swapElementsArray(int i, int j) {
        Object tmp = arrayData[i];
        arrayData[i] = arrayData[j];
        arrayData[j] = tmp;
    }

    public Object removeLast() {
        Object obj = arrayData[count - 1];
        arrayData[count - 1] = null;
        count--;
        return obj;
    }

    public Object removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new RuntimeException("Dynamic array index out of bound");
        }
        Object obj = arrayData[index];
        for (int i = index; i < count; i++) {
            if (i + 1 == count) {
                arrayData[i] = null;
            }
            arrayData[i] = arrayData[i + 1];
        }
        count--;
        return obj;
    }
}

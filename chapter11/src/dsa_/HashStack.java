package dsa_;

import java.util.Objects;

public class HashStack implements Stack {
    private final String[] stackArray = new String[5];

    private int size;

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public void push(String item) {
        stackArray[size++] = item;
    }


    @Override
    public int size() {
        int counter =0;
        for (String s : stackArray) {
            if (s != null) {
                counter++;
            }
        }
        return size = counter;
    }

    @Override
    public void pop() {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(stackArray[size -1], stackArray[i])) {
                System.arraycopy(stackArray, i + 1, stackArray, i, size - i);
            }
        }
        size--;
    }

    @Override
    public String peek() {
        return stackArray[size-1];
    }

    public String getItem(int index) {
        return stackArray[index];
    }

    @Override
    public int search(String item) {
        for (int i = 0; i < size(); i++) {
            if (Objects.equals(stackArray[i], item)) {  //(stackArray.get(i) == item)
                return i;
            }
        }
        return -1;
    }

    @Override
    public int length() {
        return stackArray.length;
    }
}

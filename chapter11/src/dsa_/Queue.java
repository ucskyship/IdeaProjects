package dsa_;

public interface Queue {
    boolean isEmpty();

    void push(String item);

    int size();

    void pop();

    String peek();
}

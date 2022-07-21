package dsa_;

public class HashQueue implements Queue{

    private final ArrayList queueArray = new ArrayList();
    @Override
    public boolean isEmpty() {
        return queueArray.size() == 0;
    }

    @Override
    public void push(String item) {
        queueArray.add(item);
    }

    @Override
    public int size() {
        return queueArray.size();
    }

    @Override
    public void pop() {
        queueArray.remove(0);
    }

    @Override
    public String peek() {
        return queueArray.get(0);
    }
}

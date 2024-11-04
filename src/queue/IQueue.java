package queue;

public interface IQueue<T> {
    boolean isEmpty();
    T odebrat();
    void vlozit(T prvek);
}

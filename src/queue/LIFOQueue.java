package queue;

import java.util.*;

public class LIFOQueue<T> implements IQueue<T>, List<T> {
    private LinkedList<T> data = new LinkedList<>();

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return data.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return data.iterator();
    }

    @Override
    public Object[] toArray() {
        return data.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return data.toArray(t1s);
    }

    @Override
    public boolean add(T t) {
        data.add(t);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return data.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return data.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return data.addAll(collection);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> collection) {
        return data.addAll(index, collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return data.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return data.retainAll(collection);
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public T get(int index) {
        return data.get(index);
    }

    @Override
    public T set(int index, T element) {
        return data.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        data.add(index, element);
    }

    @Override
    public T remove(int index) {
        return data.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return data.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return data.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return data.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return data.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return data.subList(fromIndex, toIndex);
    }

    @Override
    public T odebrat() {
        return data.removeLast();
    }

    @Override
    public void vlozit(T prvek) {
        data.add(prvek);
    }
}

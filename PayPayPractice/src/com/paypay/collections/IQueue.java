package com.paypay.collections;

public interface IQueue<T> {

	public T enQueue(T t);
    //Removes the element at the beginning of the immutable queue, and returns the new queue.
    public T deQueue();
    public T head();
    public boolean isEmpty();
}

package com.paypay.collections;

import java.util.LinkedList;
import java.util.List;

import com.paypay.exception.EmptyQueueException;

public final class MyQueue<T extends Object> implements IQueue<T> {
	
	private List<T> queue = new LinkedList<T>(); 
	
	public MyQueue() {}

	@Override
	public T enQueue(T t) {
		queue.add(queue.size(),t);
		return t;
	}

	@Override
	public T deQueue() {
		T t = (T) queue.remove(0);
		return t;
	}

	@Override
	public T head() {
		if(queue.size()==0) {
			throw new EmptyQueueException("Empty Queue!!");
		}else {
			return (T) queue.remove(0);
		}
	}

	@Override
	public boolean isEmpty() {
		if(queue.size()==0) {
			return true;
		}else {
			return false;
		}
	}
}

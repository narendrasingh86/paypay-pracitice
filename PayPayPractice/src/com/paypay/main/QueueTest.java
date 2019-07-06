package com.paypay.main;

import com.paypay.collections.IQueue;
import com.paypay.collections.MyQueue;
import com.paypay.model.Person;

public class QueueTest {

	public static void main(String[] args) {

		IQueue<Person> personQueue = new MyQueue<Person>();
		Person p = personQueue.enQueue(new Person("N", "S", 10));
		System.out.println(p);
		personQueue.enQueue(new Person("S", "S", 10));
		personQueue.enQueue(new Person("P", "S", 10));
		System.out.println(personQueue.isEmpty());
		p = personQueue.deQueue();
		System.out.println(p);
		p = personQueue.deQueue();
		System.out.println(p);
		/*
		 * IQueue<String> stringQueue = new MyQueue<String>(); stringQueue.head();
		 * stringQueue.enQueue("A"); stringQueue.enQueue("B"); stringQueue.enQueue("C");
		 * stringQueue.enQueue("D"); stringQueue.deQueue(); stringQueue.deQueue();
		 * stringQueue.deQueue(); System.out.println(stringQueue);
		 */
	}

}

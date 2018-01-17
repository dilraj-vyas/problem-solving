package com.practice;

public class QueueImplementation {
	int[] queue = new int[10];
	int front = -1;
	int rear = -1;

	public static void main(String[] args) {

	}

	public void enQueue(int data) {
		if (isEmpty()) {
			front = 0;
			rear = 0;
		} else if ((rear + 1) % queue.length == front) {
			return;
		} else
			rear = (rear + 1) % queue.length;

		queue[rear] = data;
	}

	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	public void deQueue(int data) {
		if (isEmpty()) {
			return;
		} else if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front = (front + 1) % queue.length;
		}
	}

	public int front() {

		return queue[front];
	}

}

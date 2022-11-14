package ch07.queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		QueueArrays queue = new QueueArrays(5);
		System.out.println("isEmpty() : "+queue.isEmpty());
		System.out.println("isFull() : "+queue.isFull());
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.display();
		System.out.println("Dequeued : "+queue.dequeue());
		queue.display();
		System.out.println("isEmpty() : "+queue.isEmpty());
		System.out.println("isFull() : "+queue.isFull());
		System.out.println("Length : "+queue.length());
		System.out.println("Front : "+queue.front());
		System.out.println("Rear : "+queue.rear());
		*/
		
		/*
		QueueLinkedList queue = new QueueLinkedList();
		System.out.println("isEmpty() : "+queue.isEmpty());
		System.out.println("Length : "+queue.length());
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.display();
		System.out.println("Dequeued : "+queue.dequeue());
		queue.display();
		System.out.println("isEmpty() : "+queue.isEmpty());
		System.out.println("Length : "+queue.length());
		*/
		
		DoubleQueue queue = new DoubleQueue();
		
		queue.addFirst(10);
		queue.addFirst(20);
		queue.display();
		queue.addLast(4);
		queue.addLast(33);
		queue.display();
		System.out.println("Size : "+queue.getSize());
		System.out.println("Remove first : "+queue.removeFirst());
		System.out.println("Remove last : "+queue.removeLast());
		queue.display();
		
	}

}

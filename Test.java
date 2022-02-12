class CircularQueue {
	private int size, front, items, rear;
	private int[] queue;
	
	public CircularQueue(int size) {
		this.size = size;
		this.front = 0;
		this.rear = -1;
		this.items = 0;
		this.queue = new int[size];
		System.out.println("Queue Initialized!");
	}
	
	public void insert(int x) {
		if (items == size) {
			System.out.println("Queue already full!");
		}
		else {
			if(rear == size - 1) {
				rear = -1;
			}
			rear++;
			queue[rear] = x;
			items++;
			System.out.println(x + " Inserted to queue");
		}
	}
	
	public void delete() {
		if (items == 0) {
			System.out.println("Queue is Empty!");
		}
		else {
			int frontItem = queue[front];
			front++;
			if (front == size) {
				front = 0;
			}
			items--;
			System.out.println(frontItem + " Deleted from queue");
		}
	}
	
	public void peek() {
		if (items == 0) {
			System.out.println("Queue is Empty!");
		}
		else {
			int frontItem = queue[front];
			System.out.println(frontItem + " is in front of queue");
		}
	}
}

public class Test {
	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(5);
		
		queue.insert(34);
		queue.peek();
		
		queue.insert(17);
		queue.insert(23);
		queue.insert(78);
		queue.insert(56);
		queue.peek();
		
		queue.delete();
		queue.peek();
		
		queue.insert(9);
	}
}
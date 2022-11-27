package com.company;

public class QueueTest {

    public static void main(String[] args) {
	// FIFO= ilk giren ilk çıkar----> queue
     // son eklenen son çıkar ----> stack


Queue queue = new Queue(5);

queue.enqueue(25);
queue.enqueue(56);
        queue.enqueue(29);
        queue.enqueue(34);
        queue.enqueue(55);
        queue.enqueue(39);


        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();




    }
}

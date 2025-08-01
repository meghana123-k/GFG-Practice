/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        if(front == null || rear == null) {
            QueueNode q = new QueueNode(a);
            rear = q;
            front = q;
        } else {
            QueueNode q = new QueueNode(a);
            rear.next = q;
            rear = rear.next;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    if(front == null) return -1;
	    int ele = front.data;
	    front = front.next;
	    return ele;
	    
        // Your code here
	}
}





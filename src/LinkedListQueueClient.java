public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue=new MyLinkedListQueue();
        myLinkedListQueue.enqueue(21);
        myLinkedListQueue.enqueue(44);
        myLinkedListQueue.dequeue();
        myLinkedListQueue.enqueue(55);
        myLinkedListQueue.enqueue(76);
        System.out.println("Bi mat là : "+ myLinkedListQueue.dequeue().key);
    }
}

package Exp4;
/*
Create an interface Queue with a variable size and abstract methods enqueue(), dequeue(), display(), isFull(),
and isEmpty(). Implement three subclasses: IntegerQueue, StringQueue, and DoubleQueue by implementing
the interface and handling data conversion appropriately. Write a test class QueueTest to create objects of all
three subclasses and perform enqueue, dequeue, and display operations.
 */

interface Queue{
    int size = 5;
    void enqueue(String element);
    void dequeue();
    void display();
    boolean isFull();
    boolean isEmpty();
}

class IntgerQueue implements Queue{

    int pointerStart;
    int pointerEnd;
    int[] queue;
    IntgerQueue(){
        pointerStart = 0;
        pointerEnd = -1;
        queue = new int[size];
    }

    public boolean isFull() {
        if(pointerEnd == size-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty() {
        if(pointerStart > pointerEnd){
            return true;
        }else{
            return false;
        }
    }

    public void enqueue(String element){
        if(isFull()){
            System.out.println("Queue Is Full");
        }else{
            if(isEmpty()){
                pointerEnd = 0;
                queue[pointerStart] = Integer.parseInt(element);
            } else {
                queue[++pointerEnd] = Integer.parseInt(element);
                System.out.println("Successfully Inserted Element In Queue");
            }

        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Is Empty");
        }else{
            pointerStart += 1;
            System.out.println("Successfully Removed Element From Queue");
        }
    }


    public void display() {
        for(int i = pointerStart; i <= pointerEnd; i++){
            System.out.print(" " + queue[i]);
        }
        System.out.println();
    }
}

class StringQueue implements Queue{

    int pointerStart, pointerEnd;
    String[] queue;
    StringQueue(){
        pointerStart = 0;
        pointerEnd = -1;
        queue = new String[size];
    }

    public boolean isFull() {
        if(pointerEnd == size-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty() {
        if(pointerStart > pointerEnd){
            return true;
        }else{
            return false;
        }
    }

    public void enqueue(String element){
        if(isFull()){
            System.out.println("Queue Is Full");
        }else{
            if(isEmpty()){
                pointerEnd = 0;
                queue[pointerStart] = element;
            } else {
                queue[++pointerEnd] = element;
                System.out.println("Successfully Inserted Element In Queue");
            }

        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Is Empty");
        }else{
            pointerStart += 1;
            System.out.println("Successfully Removed Element From Queue");
        }
    }


    public void display() {
        for(int i = pointerStart; i <= pointerEnd; i++){
            System.out.print(" " + queue[i]);
        }
        System.out.println();
    }
}

class DoubleQueue implements Queue{

    int pointerStart;
    int pointerEnd;
    Double[] queue;
    DoubleQueue(){
        pointerStart = 0;
        pointerEnd = -1;
        queue = new Double[size];
    }

    public boolean isFull() {
        if(pointerEnd == size-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty() {
        if(pointerStart > pointerEnd){
            return true;
        }else{
            return false;
        }
    }

    public void enqueue(String element){
        if(isFull()){
            System.out.println("Queue Is Full");
        }else{
            if(isEmpty()){
                pointerEnd = 0;
                queue[pointerStart] = Double.parseDouble(element);
            } else {
                queue[++pointerEnd] = Double.parseDouble(element);
                System.out.println("Successfully Inserted Element In Queue");
            }

        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Is Empty");
        }else{
            pointerStart += 1;
            System.out.println("Successfully Removed Element From Queue");
        }
    }


    public void display() {
        for(int i = pointerStart; i <= pointerEnd; i++){
            System.out.print(" " + queue[i]);
        }
        System.out.println();
    }
}
public class QueueTest {
    public static void main(String[] args) {
        IntgerQueue integer = new IntgerQueue();
        integer.enqueue("1");
        integer.enqueue("2");
        integer.enqueue("3");
        integer.enqueue("4");
        integer.enqueue("5");
        integer.enqueue("6");
        integer.display();
        integer.dequeue();
        integer.dequeue();
        integer.display();
        System.out.println();

        StringQueue string = new StringQueue();
        string.enqueue("Om");
        string.enqueue("Aniket");
        string.enqueue("Shreyash");
        string.enqueue("Prassana");
        string.display();
        string.dequeue();
        string.dequeue();
        string.display();
        System.out.println();

        DoubleQueue doubleQueue = new DoubleQueue();
        doubleQueue.enqueue("10.20");
        doubleQueue.enqueue("83.34");
        doubleQueue.enqueue("43.35");
        doubleQueue.enqueue("12.45");
        doubleQueue.display();
        doubleQueue.dequeue();
        doubleQueue.dequeue();
        doubleQueue.dequeue();
        doubleQueue.dequeue();
        doubleQueue.dequeue();


    }
}

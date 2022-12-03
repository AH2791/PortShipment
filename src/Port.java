public class Port {
    AContainer[] queue;
    int front;
    int rear;
    int size = 5;
    int cnb;
    Ship s;
    StoreHouse sh;

    Port() {
        front = -1;
        rear = -1;
        queue = new AContainer[size];
        cnb = 0;
        s = new Ship();
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return rear == queue.length;

    }

    public AContainer enqueue(AContainer data) {
        if (isFull()) {
            return data;
        } else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        queue[rear] = data;
        cnb++;
        return data;
    }

    public AContainer dequeue() {
        if (isEmpty()) {
            return null;
        }
        AContainer temp = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return temp;
    }
    public AContainer PortToShip(){
        AContainer co = dequeue();
        return s.enqueue(co);
    }

    public AContainer PortToStoreHouse(){
        AContainer co = dequeue();
        return sh.enqueue(co);
    }

    public void Display() {
        for (int i = front; i < cnb; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
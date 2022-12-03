public class StoreHouse {
    AContainer[] queue;
    int front;
    int rear;
    int size = 5;
    int cnb;
    Port p;

    StoreHouse() {
        front = -1;
        rear = -1;
        queue = new AContainer[size];
        cnb = 0;
        p = new Port();
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
    public AContainer StoreHouseToPort(){
        AContainer co = dequeue();
        return p.enqueue(co);
    }

    public void Display() {
        for (int i = front; i < cnb; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}

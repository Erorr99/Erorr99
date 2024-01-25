package queuecircle;

public class CirQueue {

    int FRONT = -1, REAR = -1, N;
    int count;
    CarQueue QUEUE[];

    public CirQueue(int size) {
        QUEUE = new CarQueue[size];
        N = size - 1;
        count = 0;
    }

    public boolean isFull() {
        if ((FRONT == 0 && REAR == N) || (FRONT == REAR + 1)) {
            return true; //Can not insert
        }
        return false;
    }

    public boolean isEmpty() {
        if (FRONT == -1) {
            return true;
        }
        return false;
    }

    public CarQueue QDELETE() {
        if (isEmpty()) {
            return null;
        }
        CarQueue ITEM = QUEUE[FRONT];
        if (FRONT == REAR) {
            FRONT = -1;
            REAR = -1;
        } else if (FRONT == N) {
            FRONT = 0;
        } else {
            FRONT++;
        }
        count--;
        return ITEM;
    }

    public boolean QINSERT(CarQueue ITEM) {
        if (isFull()) {
//            System.out.println("Queue Full.");
            return false; //Can not insert
        } else if (isEmpty()) {   //NULL concept
            FRONT = 0;
            REAR = 0;
        } else if (REAR == N) {
            REAR = 0;
        } else {
            REAR++;
        }
        QUEUE[REAR] = ITEM;
        count++;
        return true;
    }
    

    public void showDatainQueue() {
        System.out.print("Data in Queue:");
        if (FRONT <= REAR) {
            for (int i = FRONT; i <= REAR; i++) {
                System.out.print(QUEUE[i] + ",");
            }
        } else {
            for (int i = FRONT; i <= N; i++) {
                System.out.print(QUEUE[i] + ",");
            }
            for (int i = 0; i <= REAR; i++) {
                System.out.print(QUEUE[i] + ",");
            }
        }
        System.out.println();
        System.out.println("FRONT:" + FRONT);
        System.out.println("REAR:" + REAR);
    }

}

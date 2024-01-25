package stackwork;

public class Stack {

    int[] stack;
    int top = -1;
    int size;

    Stack(int s) {
        size = s;
        stack = new int[s];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean push(int value) {
        if (isFull()) {
            return false;
        }
        top++;
        stack[top] = value;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int item = stack[top];
        top--;
        return item;
    }

    public void clear() {
        top = -1;
    }

    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i]);
            System.out.print(" ");
        }
        System.out.print("\n");
    }
}

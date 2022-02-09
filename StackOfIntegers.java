import com.sun.source.tree.BreakTree;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
        this.size = -1;
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
        this.size = -1;
    }

    public boolean empty() {
        return this.size == -1;
    }

    public int peek() {
        return this.elements[this.size];
    }

    public void push(int value) {
        this.elements[++this.size] = value;
    }

    public int pop() {
        return this.elements[this.size--];
    }

    public int getSize() {
        return this.size + 1;
    }
}

     class TestStackOfIntegers {

        public static void main(String[] args) {
            StackOfIntegers stack = new StackOfIntegers();

            for(int i =0; i<10;i++) {
                stack.push(i);
            }

            while(!stack.empty()) {
                System.out.print(stack.pop()+" ");
            }

        }

    }




package DataStructures.Implementations;

public class QueuesUsingArrays {
    private int QueueSize;
    private int[] Queue;
    private int Front;
    private int Rear;
    private int nItems;

    public QueuesUsingArrays (int Size) {
        this.QueueSize = Size;
        this.Queue = new int[this.QueueSize];
        this.Front = 0;
        this.Rear = -1;
        this.nItems = 0;
    }

    public void Insert (int Element) {
        if (isFull()) {
            System.err.println("Error! Queue is Full");
            return;
        }

        if (this.Rear == (this.QueueSize - 1))
            this.Rear = -1;
        this.Queue[++this.Rear] = Element;
        this.nItems++;
    }

    public void Remove () {
        if (isEmpty()) {
            System.err.println("Error! Queue is Empty");
            return;
        }

        this.Queue[this.Front++] = 0;
        if (this.Front == this.QueueSize)
            this.Front = 0;
        this.nItems--;
    }

    public int Peek () {
        return this.Queue[this.Front];
    }

    public boolean isEmpty () {
        return (this.nItems == 0);
    }

    public boolean isFull () {
        return  (this.nItems == this.QueueSize);
    }

    public int Size () {
        return this.nItems;
    }

    public void PrintQueue () {
        int Idx;
        if (this.Front < this.Rear) {
            for (Idx = this.Front; Idx <= this.Rear; Idx++)
                System.out.print(this.Queue[Idx] + " ");

            System.out.println();
        }
        else {
            for (Idx = this.Front; Idx < this.QueueSize; Idx++)
                System.out.print(this.Queue[Idx] + " ");

            for (Idx = 0; Idx <= this.Rear; Idx++) {
                System.out.print(this.Queue[Idx] + " ");
            }

            System.out.println();
        }
    }
}

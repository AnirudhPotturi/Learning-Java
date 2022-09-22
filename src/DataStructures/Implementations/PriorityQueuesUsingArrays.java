package DataStructures.Implementations;

import java.util.Arrays;

public class PriorityQueuesUsingArrays {
    private int QueueSize;
    private int[] Queue;
    private int nItems;

    public PriorityQueuesUsingArrays (int Size) {
        this.QueueSize = Size;
        this.Queue = new int[this.QueueSize];
        this.nItems = 0;
    }

    public void Insert (int Element) {
        if (isFull()) {
            System.err.println("Error! Queue is Full");
            return;
        }

        int j;
        if (isEmpty())
            this.Queue[nItems++] = Element;
        else {
            for (j = this.nItems - 1; j >= 0; j--) {
                if (Element > this.Queue[j])
                    this.Queue[j + 1] = this.Queue[j];
                else
                    break;
            }
            this.Queue[j + 1] = Element;
            nItems++;
        }
    }

    public void Remove () {
        if (isEmpty()) {
            System.err.println("Error! Queue is Empty");
            return;
        }

        this.Queue[--nItems] = 0;
    }

    public int Peek () {
        return this.Queue[this.nItems - 1];
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
        System.out.println(Arrays.toString(this.Queue));
    }
}
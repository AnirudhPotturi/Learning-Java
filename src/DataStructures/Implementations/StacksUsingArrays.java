package DataStructures.Implementations;

import java.util.Arrays;

public class StacksUsingArrays {
    int[] Stack;
    int StackSize;
    int Top;

    public StacksUsingArrays (int Size) {
        this.StackSize = Size;
        this.Stack = new int[this.StackSize];
        this.Top = -1;
    }

    public boolean isFull () {
        return (this.Top == this.StackSize);
    }

    public boolean isEmpty () {
        return this.Top == -1;
    }

    public void Push (int Element) {
        this.Top = this.Top + 1;
        if (isFull())
            System.err.println("Error! Stack is Full");
        else
            this.Stack[this.Top] = Element;
    }

    public void Pop () {
        this.Top = this.Top - 1;
        if (isEmpty())
            System.err.println("Error! Stack is Empty");
        else
            this.Stack[this.Top] = 0;
    }

    public void PrintStack () {
        System.out.println(Arrays.toString(this.Stack));
    }
}

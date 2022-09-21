package DataStructures;

import java.util.Arrays;

public class Stack {
    int Stack[];
    int StackSize;
    int Top;



    public Stack(int StackSize)
    {
        this.StackSize = StackSize;
    }

    public void CreateStack()
    {
        Stack = new int[StackSize];
    }

    public void InitializeTop()
    {
        Top = -1;
    }

    public void Push(int Element)
    {
        Top = Top + 1;
        Stack[Top] = Element;
    }

    public void Pop()
    {
        Stack[Top] = 0;
        Top = Top - 1;
    }

    public void PrintStack()
    {
        System.out.println(Arrays.toString(Stack));
    }
}

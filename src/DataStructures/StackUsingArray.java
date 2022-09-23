package DataStructures;

import java.util.Arrays;

public class StackUsingArray {
    int Stack[];
    int StackSize;
    int Top;



    public StackUsingArray(int StackSize)
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
        if(Top >= StackSize)
        {
            System.err.println("Error! Reached the top of the stack");
        }
        else {
            Stack[Top] = Element;
        }
    }

    public void Pop()
    {
        Top = Top - 1;
        if(Top < 0)
        {
            System.err.println("Error! Reached the bottom of the stack");
        }
        else {
            Stack[Top] = 0;
        }
    }

    public void PrintStack()
    {
        System.out.println(Arrays.toString(Stack));
    }
}

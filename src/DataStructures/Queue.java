package DataStructures;

import java.util.Arrays;

public class Queue {
    int Queue[];
    int QueueSize;
    int Rear;
    int Front;

    public Queue(int QueueSize)
    {
        this.QueueSize = QueueSize;
    }

    public void CreateQueue()
    {
        Queue = new int[QueueSize];
        InitializeRear();
        InitializeFront();
    }

    public void InitializeRear()
    {
        this.Rear = -1;
    }

    public void InitializeFront()
    {
        this.Front = -1;
    }

    public void InsertElement(int Element)
    {
        UpdateRear();
        Queue[Rear] = Element;
    }

    public void RemoveElement()
    {
        Queue[Front] = 0;
        UpdateFront();
    }

    public void IncrementRear()
    {
        Rear = Rear + 1;
    }

    public void DecrementRear()
    {
        Rear = Rear - 1;
    }

    public void IncrementFront()
    {
        Front = Front + 1;
    }

    public int GetRear()
    {
        return Rear;
    }

    public void PrintQueue()
    {
        System.out.println(Arrays.toString(Queue));
        System.out.println(Front);
        System.out.println(Rear);
    }

    public int GetSize()
    {
        return QueueSize;
    }

    public void UpdateRear()
    {
        if(Rear == QueueSize - 1)
        {
            Rear = 0;
        }
        else if(Rear == -1)
        {
            IncrementFront();
            IncrementRear();
        }
        else
        {
            IncrementRear();
        }
    }

    public void UpdateFront()
    {
        if(Front == QueueSize - 1)
        {
            Front = 0;
        }
        else
        {
            IncrementFront();
        }
    }

}

package DataStructures;

import java.util.Arrays;

public class QueueUsingArray {
    int Queue[] = null;
    int QueueSize;
    int Rear;
    int Front;

    int StartIdx, EndIdx;


    public QueueUsingArray(int QueueSize)
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
        if((Front == 0 && Rear == QueueSize - 1) || (Front !=0 && Rear == Front - 1))
        {
            System.out.println("Queue is full");
        }
        else
        {
            UpdateRear();
            Queue[Rear] = Element;
        }
    }

    public void RemoveElement()
    {
        if((Front == Rear & Front == -1))
        {
            System.out.println("Queue is empty");
        }
        else if ((Front == Rear  & Rear >= 0 & Queue[Front] != 0))
        {
            Queue[Front] = 0;
            System.out.println("Queue is now empty");
        }
        else {
            Queue[Front] = 0;
            UpdateFront();
        }
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

    public void DisplayQueueInOrder()
    {
        if(Front < Rear)
        {
            StartIdx = Front;
            EndIdx = Rear;
        }
        else
        {
            StartIdx = Rear;
            EndIdx = Front;
        }
        System.out.print('[');
        while(StartIdx!=EndIdx)
        {
            System.out.print(Queue[StartIdx] + ", ");
            StartIdx++;
            if(StartIdx == QueueSize)
            {
                StartIdx = 0;
            }
        }
        System.out.print(']');
    }
}

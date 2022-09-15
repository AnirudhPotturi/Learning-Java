package DataStructures.Algorithms.Sorting;

import DataStructures.Arrays;

public class ArraysBubbleSort {

    int Idx, EndIdx;

    int ArrayLength;

    public ArraysBubbleSort(Arrays Array)
    {
        this.ArrayLength = Array.ArrayGetLength();
        this.EndIdx = ArrayLength - 2;
    }

    public Boolean PerformBubbleSort(Arrays Array)
    {
        for(Idx = 0; Idx <= EndIdx; Idx++)
        {
            if( ( Array.GetElement(Array, Idx) ) > ( Array.GetElement(Array, (Idx+1) ) ) )
            {
                Array.Swapper(Array, Idx, (Idx+1));
                return true;
            }
        }
        this.EndIdx--;
        return false;
    }

    public void RecursiveCaller(Arrays Array)
    {
        Boolean True = true;
        while(True)
        {
            True = PerformBubbleSort(Array);
        }
    }

}

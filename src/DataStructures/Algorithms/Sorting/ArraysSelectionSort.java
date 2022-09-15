package DataStructures.Algorithms.Sorting;

import DataStructures.Arrays;

public class ArraysSelectionSort {

    // MinIdx is a number that points to the index of the smallest value in the array.
    // StartIdx is the number pointing to the 0th index in the beginning.
    int StartIdx, MinIdx;

    int SmallestNumber;

    int Idx;
    int ArrayLength;

    public ArraysSelectionSort(Arrays Array)
    {
        this.StartIdx = 0;
        this.ArrayLength = Array.ArrayGetLength();
    }

    public void PerformSelectionSort(Arrays Array)
    {
        for(StartIdx = 0; StartIdx < (ArrayLength - 1); StartIdx++)
        {
            MinIdx = StartIdx;
            for(Idx = (StartIdx + 1); Idx < ArrayLength; Idx++)
            {
                if( ( Array.GetElement(Array, MinIdx) ) > ( Array.GetElement(Array, Idx) ))
                {
                    MinIdx = Idx;
                }
            }
            Array.Swapper(Array, StartIdx, MinIdx);
        }
    }

}

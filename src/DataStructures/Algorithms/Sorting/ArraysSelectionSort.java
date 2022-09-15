package DataStructures.Algorithms.Sorting;

import DataStructures.Arrays;

public class ArraysSelectionSort {

    int StartIdx;
    int ArrayLength;

    public ArraysSelectionSort (Arrays Array) {
        this.StartIdx = 0;
        this.ArrayLength = Array.ArrayGetLength();
    }

    public void PerformSelectionSort (Arrays Array) {
        int PivotIdx, Idx, Small;
        for (PivotIdx = this.StartIdx; PivotIdx < this.ArrayLength; PivotIdx++) {
            Small = PivotIdx;
            for (Idx = PivotIdx + 1; Idx < this.ArrayLength; Idx++)
                if (Array.GetElement(Idx) < Array.GetElement(Small))
                    Small = Idx;
            Array.Swap2Elements(PivotIdx, Small);
        }
    }
}

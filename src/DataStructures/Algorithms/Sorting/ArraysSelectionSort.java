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
        int PivotIdx, Idx, Small, Swapper;
        for (PivotIdx = StartIdx; PivotIdx < this.ArrayLength; PivotIdx++) {
            Small = PivotIdx;
            for (Idx = PivotIdx + 1; Idx < this.ArrayLength; Idx++) {
                if (Array.GetElement(Array, Idx) < Array.GetElement(Array, Small)) {
                    Small = Idx;
                }
            }
            Swapper = Array.GetElement(Array, PivotIdx);
            Array.SetElement(Array, Array.GetElement(Array, Small), PivotIdx);
            Array.SetElement(Array, Swapper, Small);
        }
    }

    public void PrintOutput (Arrays Array) {
        PerformSelectionSort(Array);
        int Idx;
        for(Idx = StartIdx; Idx < ArrayLength; Idx++) {
            System.out.print(Array.GetElement(Array, Idx) + " ");
        }
        System.out.println();
    }
}

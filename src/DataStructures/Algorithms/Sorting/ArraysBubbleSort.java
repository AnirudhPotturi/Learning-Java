package DataStructures.Algorithms.Sorting;

import DataStructures.Arrays;

public class ArraysBubbleSort {

    int StartIdx, EndIdx;

    int ArrayLength;

    public ArraysBubbleSort (Arrays Array) {
        this.ArrayLength = Array.ArrayGetLength();
        this.StartIdx = 0;
        this.EndIdx = ArrayLength - 1;
    }

    public boolean PerformBubbleSort (Arrays Array) {
        int Idx;
        for (Idx = this.StartIdx; Idx < this.EndIdx; Idx++) {
            if (Array.GetElement(Idx) > Array.GetElement(Idx + 1)) {
                Array.Swap2Elements(Idx, Idx + 1);
                return true;
                }
            }
        this.EndIdx--;
        return false;
    }

    public void RecursiveCaller (Arrays Array) {
        Boolean ExchangedInPass = true;
        while (ExchangedInPass) {
            ExchangedInPass = PerformBubbleSort(Array);
        }
    }





}

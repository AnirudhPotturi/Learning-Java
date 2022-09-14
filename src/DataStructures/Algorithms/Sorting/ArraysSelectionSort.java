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
        int i, j, Small, Temp;
        for (i = StartIdx; i < this.ArrayLength; i++) {
            Small = i;
            for (j = i + 1; j < this.ArrayLength; j++) {
                if (Array.GenerateArray[Small] > Array.GenerateArray[j]) {
                    Temp = Array.GenerateArray[Small];
                    Array.GenerateArray[Small] = Array.GenerateArray[j];
                    Array.GenerateArray[j] = Temp;
                }
            }
        }
    }

    public void PrintOutput (Arrays Array) {
        PerformSelectionSort(Array);
        int Idx;
        for(Idx = StartIdx; Idx < ArrayLength; Idx++) {
            System.out.print(Array.GenerateArray[Idx] + " ");
        }
        System.out.println();
    }
}

package DataStructures.Algorithms.Searching;

import DataStructures.Arrays;

public class ArraysBinarySearch {

    int LowIdx, MidIdx, HighIdx;


    public ArraysBinarySearch (Arrays Array) {
        LowIdx = 0;
        HighIdx = Array.ArrayGetLength();
        MidIdx = (LowIdx + HighIdx)/2;
    }

    public int PerformBinarySearch (Arrays Array, int SearchElement) {
        while(LowIdx <= HighIdx) {
            if (SearchElement == Array.GenerateArray[MidIdx])
                return MidIdx;
            else if (SearchElement > Array.GenerateArray[MidIdx])
                LowIdx = MidIdx + 1;
            else
                HighIdx = MidIdx - 1;
            MidIdx = (LowIdx + HighIdx)/2;
        }
        return -1;
    }

    public void PrintOutput (Arrays Array, int SearchElement) {
        int ReturnedIdx;

        ReturnedIdx = PerformBinarySearch(Array, SearchElement);

        if(ReturnedIdx == -1)
            System.out.println("The search element does not exist!");
        else
            System.out.println("The element you searched for with value " + SearchElement + " was located at index " + ReturnedIdx);
    }
}

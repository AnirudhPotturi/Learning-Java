package DataStructures;

import java.util.Random;

public class Arrays {
    int Idx;
    int ArrayLength;

    // A value to be searched in MyArray
    int SearchElement;

    //Defining a reference to my array.
    public int[] GenerateArray;

    //An equivalent single statement approach.
    //Can also be written as int myArr[] = new int[100]
    public int[] DeclaredArray = new int[100];


    public void Initialize(int ArraySize)
    {
        // Creating the array and sets 'MyArray' to refer to it with 'new int[100]'.
        this.GenerateArray = new int[ArraySize];

        SetMyArrayLength();
    }

    // Finding the size of the array
    public int GetDeclaredArrayLength()
    {
        int length;
        length = this.DeclaredArray.length;
        return length;
    }

    // Just printing value at an index.
    public void PrintArray()
    {
        for(Idx = 0; Idx < ArrayLength; Idx++)
        {
            System.out.print(this.GenerateArray[Idx] + " ");
        }
        System.out.println();
    }

    public void SetMyArrayLength()
    {
        ArrayLength = this.GenerateArray.length;
    }

    public void InsertElements()
    {
        for(Idx = 0; Idx < ArrayLength; Idx++)
        {
            GenerateArray[Idx] = Idx;
        }
    }

    public int LinearSearch(int SearchElement)
    {
        for(Idx = 0; Idx < ArrayLength; Idx++)
        {
            if(this.GenerateArray[Idx] == SearchElement)
            {
                return Idx;
            }
        }
        return -1;
    }

    public void DeleteElement(int SearchElement)
    {
        int Index;
        Index = LinearSearch(SearchElement);
        if(Index == -1)
        {
            System.out.println("The element you are searching for does not exist!");
        }
        else
        {
            // ArrayLength-1 is not good coding practice.
            for(Idx = Index; Idx < (ArrayLength-1); Idx++)
            {
                GenerateArray[Idx] = GenerateArray[Idx+1];
            }
        }
        UpdateArraySize();
    }

    public void UpdateArraySize()
    {
        this.ArrayLength = this.ArrayLength - 1;
    }

    public int ArrayGetLength()
    {
        return (this.GenerateArray.length);
    }

    public void RandomArrayGenerator()
    {
        Random RandomNumber = new Random();

        for(Idx = 0; Idx < ArrayLength; Idx++)
        {
            //Replace with the following line for larger numbers---
            // GenerateArray[Idx] = RandomNumber.nextInt(Integer.MAX_VALUE);
            GenerateArray[Idx] = RandomNumber.nextInt(1000);
        }
    }

    public int GetElement(Arrays Array, int Loc)
    {
        return Array.GenerateArray[Loc];
    }

    public void SetElement(Arrays Array, int Element, int Loc)
    {
        Array.GenerateArray[Loc] = Element;
    }

    public void Swapper(Arrays Array, int ElementOneIdx, int ElementTwoIdx)
    {
        int Swapper;

        Swapper = (Array.GetElement(Array, ElementOneIdx));
        Array.SetElement(Array, (Array.GetElement(Array, ElementTwoIdx)), ElementOneIdx);
        Array.SetElement(Array, Swapper, ElementTwoIdx );
    }

}

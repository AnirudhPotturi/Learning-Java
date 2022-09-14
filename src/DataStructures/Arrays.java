package DataStructures;
import java.util.Random;
public class Arrays {
    int Idx;
    int ArrayLength;

    //Defining a reference to my array.
    public int[] GenerateArray;

    //An equivalent single statement approach.
    //Can also be written as int myArr[] = new int[100]
    public int[] DeclaredArray = new int[100];

    // Finding the size of the array
    public int GetDeclaredArrayLength () {
        int length;
        length = this.DeclaredArray.length;
        return length;
    }

    public void Initialize (int ArraySize) {
        // Creating the array and sets 'MyArray' to refer to it with 'new int[100]'.
        this.GenerateArray = new int[ArraySize];

        SetMyArrayLength();
    }


    // Just printing value at an index.
    public void PrintArray () {
        for(Idx = 0; Idx < ArrayLength; Idx++) {
            System.out.print(this.GenerateArray[Idx] + " ");
        }
        System.out.println();
    }

    public void SetMyArrayLength () {
        ArrayLength = this.GenerateArray.length;
    }

    public void InsertElements () {
        for(Idx = 0; Idx < ArrayLength; Idx++)
        {
            this.GenerateArray[Idx] = Idx;
        }
    }

    public int LinearSearch (int SearchElement) {
        for(Idx = 0; Idx < ArrayLength; Idx++)
            if(this.GenerateArray[Idx] == SearchElement)
                return Idx;
        return -1;
    }

    public void DeleteElement (int SearchElement) {
        int Index;
        Index = LinearSearch(SearchElement);
        if(Index == -1)
            System.out.println("The element you are searching for does not exist!");
        else
            // ArrayLength-1 is not good coding practice.
            for(Idx = Index; Idx < (ArrayLength-1); Idx++)
                GenerateArray[Idx] = GenerateArray[Idx+1];


        UpdateArraySize();
    }

    public void UpdateArraySize () {
        this.ArrayLength = this.ArrayLength - 1;
    }

    public int ArrayGetLength () {
        return (this.GenerateArray.length);
    }

    public void RandomArrayGenerator () {
        Random RandomNumber = new Random(2);
        for (Idx = 0; Idx < ArrayLength; Idx++) {
            GenerateArray[Idx] = RandomNumber.nextInt(1000);
        }
    }

}

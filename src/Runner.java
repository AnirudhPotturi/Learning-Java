import DataStructures.Algorithms.Searching.ArraysBinarySearch;
import DataStructures.Algorithms.Sorting.ArraysBubbleSort;
import DataStructures.Algorithms.Sorting.ArraysSelectionSort;
import DataStructures.Implementations.StacksUsingArrays;
import DataStructures.Arrays;

public class Runner {
    public void ArrayRunner () {
        // Creating an array of objects of type Arrays
        Arrays[] ArrayObject = new Arrays[5];

        // Creating the object at ArrayObject[0] by telling it to refer to something. Something here is 'new Arrays()'
        ArrayObject[0] = new Arrays();

        // Testing to see if this object is null or not.
        // The output here is not null confirming that the object now exists.
        // System.out.println(ArrayObject[0]);

        // Calling the function to test if it works.
        ArrayObject[0].Initialize(50);

        // Inserting elements into the array
        ArrayObject[0].InsertElements();

        // Printing MyArray
        ArrayObject[0].PrintArray();

        // Deleting an element from this Array.
        ArrayObject[0].DeleteElement(25);

        // Printing MyArray
        ArrayObject[0].PrintArray();
    }

    public void PrintTypeOfData () {
        long number = 10000000000000L;

        System.out.println(((Object) number).getClass().getSimpleName());
    }

    public void BinarySearch () {
        Arrays Array = new Arrays();
        Array.Initialize(50);
        Array.InsertElements();

        ArraysBinarySearch BinarySearch = new ArraysBinarySearch(Array);
        BinarySearch.PrintOutput(Array, 49);
    }

    public void Random () {
        Arrays Array = new Arrays();
        Array.Initialize(50);
        Array.RandomArrayGenerator();
    }

    public void SelectionSort () {
        Arrays Array = new Arrays();
        Array.Initialize(25);
        Array.RandomArrayGenerator();
        System.out.println("My array Before Sorting - ");
        Array.PrintArray();

        ArraysSelectionSort SelectionSort = new ArraysSelectionSort(Array);
        SelectionSort.PerformSelectionSort(Array);
        System.out.println("My array after sorting - ");
        Array.PrintArray();
    }

    public void BubbleSort () {
        Arrays Array = new Arrays();
        Array.Initialize(25);
        Array.RandomArrayGenerator();
        System.out.println("My array Before Sorting - ");
        Array.PrintArray();

        ArraysBubbleSort BubbleSort = new ArraysBubbleSort(Array);
        BubbleSort.RecursiveCaller(Array);
        System.out.println("My array after sorting - ");
        Array.PrintArray();
    }

    public void Stacks () {
        StacksUsingArrays Stack = new StacksUsingArrays(10);
        for (int i = 0; i < 10; i++)
            Stack.Push(i + 1);
        Stack.Push(11);
        Stack.PrintStack();

        for (int i = 0; i < 10; i++)
            Stack.Pop();
        Stack.Pop();
        Stack.PrintStack();

    }
}

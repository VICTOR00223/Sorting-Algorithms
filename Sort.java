import java.util.Scanner;

public class Sort
{
    //---Bubble sort---
    public static void bubblesort(int[] array)
    {
        Sort.print(array);
        System.out.println();
        for (int j=array.length-1; j>0; j--)
        {
            for(int i=0; i<j; i++)
            {
                if(array[i]>array[i+1])
                {
                    Sort.swap(array, i, i+1);
                }
            }
            Sort.print(array);
            System.out.println();
        }
    }

    //---Selection sort---
    public static void selectionsort(int[] array)
    {
        int k;
        int key;
        Sort.print(array);
        System.out.println();
        for (int j=array.length; j>1; j--)
        {
            key = array[0];
            k=0;
            for (int i=1; i<j; i++)
            {
                if(key < array[i])
                {
                    key = array[i];
                    k=i;
                }
            }
            if (k != j-1)
            {
                Sort.swap(array, j-1, k);
            }
            Sort.print(array);
            System.out.println();
        }
    }


    //---Insertion sort---
    public static void insertionsort(int[] array)
    {
        int temp;
        Sort.print(array);
        System.out.println();
        for(int j=1; j<array.length; j++)
        {
            temp = array[j];
            for(int i=j; i>0; i--)
            {
                if(temp < array[i-1])
                {
                    array[i] = array[i-1];
                    if(i == 1)
                    {
                        array[i-1] = temp;
                    }
                }
                else
                {
                    array[i] = temp;
                    break;
                }
            }
            Sort.print(array);
            System.out.println();
        }
    }

    //---Quick sort---
    public static void quicksort(int[] array, int start, int end)
    {
        if(end <= start)
        {
            return;
        }
        int pivot = Sort.partition(array, start, end);
        Sort.quicksort(array, start, pivot-1);
        Sort.quicksort(array, pivot+1, end);
    }
    public static int partition(int[] array, int start, int end)
    {
        int i = start-1;
        int pivot = array[end];
        for(int j=start; j<end; j++)
        {
            if(array[j] < pivot)
            {
                i++;
                Sort.swap(array, i, j);
            }
            Sort.print(array);
            System.out.println();
        }
        i++;
        Sort.swap(array, i, end);
        Sort.print(array);
        System.out.println();
        return i;
    }

    //---Mergesort---
    public static void Mergesort(int[] array)
    {
        int length = array.length;
        if(length > 1)
        {
            int m = (length)/2;
            int[] leftArray = new int[m];
            int[] rightArray = new int[length - m];

            int i=0; //leftArray
            int j=0; //rightArray

            for(int k=0; k<length; k++)
            {
                if(i<m)
                {
                    leftArray[i] = array[k];
                    i++;
                }
                else
                {
                    rightArray[j] = array[k];
                    j++;
                }
            }
            Mergesort(leftArray);
            Mergesort(rightArray);
            Merge(leftArray, rightArray, array);
        }
    }

    //---Merge---
    public static void Merge(int[] leftArray, int[] rightArray, int[] array)
    {
        int i=0;
        int j=0;
        int k=0;
        while(i<leftArray.length && j<rightArray.length)
        {
            if(leftArray[i]<rightArray[j])
            {
                array[k] = leftArray[i];
                i++;
            }
            else
            {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(k< array.length)
        {
            if(i == leftArray.length)
            {
                array[k] = rightArray[j];
                j++;
            }
            else
            {
                array[k] = leftArray[i];
                i++;
            }
            k++;
        }
    }




    //---Swap two numbers---
    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //---Print the array---
    public static void print(int[] array)
    {
        if(array.length > 0)
        {
            for(int i=0; i< array.length; i++)
            {
                System.out.print(array[i]+" ");
            }
           System.out.println("\n");
        }
        else
        {
            System.out.println("Array is empty\n");
        }
    }
}

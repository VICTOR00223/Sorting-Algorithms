import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        //---Scan array---
        for(int i=0; i< array.length; i++)
        {
            System.out.print("array["+i+"] = ");
            array[i] = sc.nextInt();
        }
        sc.nextLine();


        System.out.println("Enter B to bubblesort, S to selectionsort, I to insertionsort, Q to quicksort, M to mergesort, P to print, E to exit.");
        String choice = sc.nextLine();
        while(!choice.equals("E"))
        {
            switch (choice)
            {
                case "B":
                {
                    Sort.bubblesort(array);
                    System.out.println("Array sorted.");
                    break;
                }
                case "S":
                {
                    Sort.selectionsort(array);
                    System.out.println("Array sorted.");
                    break;
                }
                case "I":
                {
                    Sort.insertionsort(array);
                    System.out.println("Array sorted.");
                    break;
                }
                case "Q":
                {
                    Sort.quicksort(array, 0, size-1);
                    System.out.println("Array sorted.");
                    break;
                }
                case "M":
                {
                    Sort.Mergesort(array);
                    System.out.println("Array sorted.");
                    break;
                }
                case "P":
                {
                    Sort.print(array);
                    break;
                }
                case "E":
                {
                    break;
                }
            }
            System.out.println("Enter B to bubblesort, S to selectionsort, I to insertionsort, Q to quicksort, M to mergesort, P to print, E to exit.");
            choice = sc.nextLine();
        }
        System.out.println("End of program.");
    }
}

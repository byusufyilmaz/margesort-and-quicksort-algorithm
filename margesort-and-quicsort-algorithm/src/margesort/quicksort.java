package margesort;
public class quicksort {
    static void swap(int[] dizi, int i, int j)
    {
        int temp = dizi[i];
        dizi[i] = dizi[j];
        dizi[j] = temp;
    }
    static int partition(int[] dizi, int ilkIndeks, int sonIndeks)
    {
        int pivot = dizi[sonIndeks];
        int i = (ilkIndeks - 1);
        for (int j = ilkIndeks; j <= sonIndeks - 1; j++) {

            if (dizi[j] < pivot) {
                i++;
                swap(dizi, i, j);
            }
        }
        swap(dizi, i + 1, sonIndeks);
        return (i + 1);
    }
    static void quickSort(int[] dizi, int ilkIndeks, int sonIndeks)
    {
        if (ilkIndeks < sonIndeks) {
        	    int pi = partition(dizi, ilkIndeks, sonIndeks);

            quickSort(dizi, ilkIndeks, pi - 1);
            quickSort(dizi, pi + 1, sonIndeks);
        }
    }
    public static void printdizi(int[] dizi)
    {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] dizi = { 10, 7, 8, 9, 1, 5 };
        int N = dizi.length;
        quickSort(dizi, 0, N - 1);
        System.out.println("Sorted diziay:");
        printdizi(dizi);
    }
}

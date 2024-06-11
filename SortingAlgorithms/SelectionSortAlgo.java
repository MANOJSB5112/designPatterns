package SortingAlgorithms;

public class SelectionSortAlgo {
    public static void selectionSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int mini=i;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<arr[mini])
                {
                    mini=j;
                }
            }
          int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;

        }
    }
    public static void main(String[] args) {
        int[] arr={8,5,9,1,2,6,5,4,9,3,7};
        selectionSort(arr);
        for(int k:arr)
        {
            System.out.print(k+" ");
        }
    }
}

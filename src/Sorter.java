import java.util.Random;
public class Sorter {
    public void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int sw=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=sw;
                }
            }
        }
    }
    public void advancesort(int[] arr){
        runquicksort(arr,0,arr.length-1);
    }
    private void runquicksort(int[] arr, int low, int high){
        if(low<high){
            int pivi=part(arr,low,high);            //position pivot and getting its final index
            runquicksort(arr,low,pivi-1);     //sort smaller(than pivot) side
            runquicksort(arr,pivi+1,high);//sort bigger side
        }
    }
    private int part(int[] arr, int low, int high){
        int p=arr[high];//picking last as pivot
        int i=(low-1);  //index of smaller element
        for(int j=low;j<high;j++){
            if(arr[j]<p){
                i++;    //when we find num which is <p, we move i by 1 to place this small num
                int sw=arr[i];
                arr[i]=arr[j];//swap, so small num placed at beginning
                arr[j]=sw;    // and num here is replaced(swapped)
            }
        } //finally swap pivot into middle of sorted list
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;//pivot's position
    }
    public int[] genarr(int size){
        Random rd=new Random();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) arr[i]=rd.nextInt(10000);
        return arr;
    }
    public void printarr(int[] arr){
        for(int i : arr) System.out.println(i+" ");
        System.out.println();
    }
}

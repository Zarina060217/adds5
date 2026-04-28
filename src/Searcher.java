public class Searcher {
    public int search(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) low=mid+1; // search right side
            else high=mid-1;    // search left side
        }return -1; //case of not found
    }
}

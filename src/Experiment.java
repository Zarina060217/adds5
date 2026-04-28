import java.util.Arrays;
public class Experiment {
    private Sorter sorter=new  Sorter();
    private Searcher searcher=new Searcher();
    public void runexp(){
        int[] sizes={10,100,1000};
        for(int size : sizes){
            System.out.println("Size of arr: "+size);
            int[] randomData=sorter.genarr(size);
            int[] sortedData=randomData.clone();
            Arrays.sort(sortedData);
            System.out.println("random arr");
            testing(randomData);
            System.out.println("sorted arr");
            testing(sortedData);
        }
    }
    private void testing(int[] data){
        //measure time of bubblesort
        long sb=System.nanoTime();
        sorter.bubblesort(data.clone());
        long eb=System.nanoTime();
        //quick sort
        long sa=System.nanoTime();
        sorter.advancesort(data.clone());
        long ea=System.nanoTime();
        //search
        long start=System.nanoTime();
        searcher.search(data,-1);//searching for worst case
        long end=System.nanoTime();
        System.out.println("bubble sort: "+(eb-sb)+ "ns");
        System.out.println("quick sort: "+(ea-sa)+ "ns");
        System.out.println("binary search: "+(end-start)+ "ns");
    }
}

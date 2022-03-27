package strategy;

/**
 * @author: yefeirong
 * @date: 2022/3/27 16:21
 * @describe:
 */
public class Sorter {
    public  void sort(Comparable[] arr){
        for(int i=0;i<arr.length-1;i++){

            for (int j=0;j+1<arr.length-i;j++){
                if (arr[j].compareTo(arr[j+1])==1){
                    swap(arr ,j,j+1);
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public  void swap(Comparable[] arr,int i,int j){
        Comparable tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}

package strategy;

/**
 * @author: yefeirong
 * @date: 2022/3/27 16:21
 * @describe:
 */
public class SorterComparator<T>{
    public  void sort(T[] arr,Comparator<T> comparator){
        for(int i=0;i<arr.length-1;i++){

            for (int j=0;j+1<arr.length-i;j++){
                if (comparator.compareTo(arr[j],arr[j+1])==1){
                    swap(arr ,j,j+1);
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public  void swap(T[] arr,int i,int j){
        T tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}

package algorithm;

/**
 * @author: yefeirong
 * @date: 2022/3/24 20:36
 * @describe:  二分法
 */
public class BSExist {
    public static boolean find(int[] arr,int num){
        if (arr == null || arr.length==0){
            return false;
        }
        int L=0;
        int R = arr.length-1;
        while (L < R){
            int mid = (L+R)/2;
            if (arr[mid]==num){
                return true;
            }else if (arr[mid] < num){
                L=mid+1;
            }else {
                R = mid -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr ={3,4,6,7,8,9,22};
        boolean b = find(arr, 3);
        System.out.println(b);
    }

}

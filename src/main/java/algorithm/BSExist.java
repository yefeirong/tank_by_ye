package algorithm;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

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
        int[] arr ={3,4,6,8,8,9,22};
//        boolean b = find(arr, 3);
        int b = mostLeftIndex(arr,7);
        System.out.println(b);
    }
//    有序数组中中找到>=num最左的位置
    public static int mostLeftIndex(int[] arr,int num){
        if (arr==null ||arr.length==0){
            return -1;
        }
        int L =0;
        int R = arr.length-1;
        int ans = -1;
        while (L<=R){
            int mid = (L+R)/2;
            if (num<=arr[mid]){
                R=mid-1;
                ans=mid;
            }else {//arr[mid]<num
                L= mid+1;
            }

        }
        return ans;
    }
    //返回其中一个（一个就可以）局部最小值 1.无序 2.相邻两数不相等
    public int minNumInLocal(int[] arr){
        if (arr==null||arr.length==0){
            return -1;
        }
        int L = 0;
        int R = arr.length-1;
        int N = arr.length;
        //先下降
        if (arr[0]<arr[1]){
            return arr[0];
        }
        //最后上升
        if (arr[N-1]<arr[N-2]){
            return arr[N-1];
        }

        while (L<R-1){

            //中间比两边小，直接返回中间
            int mid =(L+R)/2;
            if (arr[mid]<arr[mid-1]&&arr[mid]>arr[mid+1]){
               return mid;
            }

            if (arr[mid]>arr[mid-1]){
                R=mid-1;
            }else {
                L =mid+1;
            }
        }
        return arr[L]<arr[R]?L:R;
    }

}

package algorithm;

/**
 * @author: yefeirong
 * @date: 2022/3/21 19:50
 * @describe:
 */
public class PrefixSum {
    /*
    * 一个数组 int[] arr={1,35,69,3,6,2,3}
    * 计算位置 L 到R 的累加和
    * 前缀和
    * */
    public static void preSum(int[] arr,int L,int R){
        int[] preSum =  new int[arr.length];
        int sum =0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            preSum[i]=sum;
        }

        readLR(preSum,L,R);
    }

    private static void readLR(int[] preSum,int L,int R) {
        if (L==0){
            System.out.println(preSum[R]);

        }else {
            System.out.println(preSum[R]-preSum[L-1]);
        }

    }

    public static void main(String[] args) {
        int[] arr = {3,6,7,8,2,4,8,99,33,66};
        preSum(arr,1,3);
    }
}

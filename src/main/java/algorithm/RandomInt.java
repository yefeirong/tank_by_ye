package algorithm;

/**
 * @author: yefeirong
 * @date: 2022/3/21 20:53
 * @describe:
 */
public class RandomInt {
//    函数f（），能等概率得到1，2，3，4，5，不能再使用额外随机值。如何使用f()得到随机【1-7】上的数
    public static void main(String[] args) {
        System.out.println(f4());
}

//0-5的随机函数
    public static int f1(){
        return (int)(Math.random()*5)+1;
    }
    //0 1等概率发生器
    public static  int f2(){
        int ans=0;
        do{
            ans=f1();
        }while (ans==3);
            return ans<3?0:1;
    }
    //0-7等概率
    public static int f3(){
        return (f2()<<2)+(f2()<<1)+f2();
    }
    public static int f4(){
        int ans=0;

        do {
            ans=f3();
        }while (ans==0);
        return ans;
    }



    //题2：01不等概率随机到01等概率随机  一个函数x会以固定概率返回0和1，但是x的内容看不到
    public static int x(){
        return (int)(Math.random()*0.84)+1;
    }
    //改写成01等概率发生器
    public static int fx(){
        int ans=0;
        do {
            ans=x();
        }while (ans==x());
        return ans;
    }

    //随机数组函数 返回一个长度随机，值随机的数组  arr长度[0,maxLen-1]，arr中每个值[0,maxValue-1] 用于测试所写的算法
    public static int[] lenRandomValueRandom(int maxLen ,int maxValue){
        int[] arr = new int[(int)(Math.random())*maxLen];
        for (int i=0;i<arr.length;i++){
            arr[i]= (int)(Math.random()*maxValue);
        }
            return arr;
    }
    //拷贝数组
    public static int[] copyArray(int[] arr){
        int[] ans = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        return ans;
    }
    //
    public static int[] equalArrayValue(int[] arr){
        int[] ans = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            ans[i] = arr[i];
        }
        return ans;
    }
    public static boolean isSorted(int[] arr ){
        if (arr.length<2){
            return true;
        }
        int max =arr[0];
        for (int i=1;i<arr.length;i++){
            if (max>arr[i]){
                return false;
            }
            max= Math.max(max,arr[i]);
        }
        return true;
    }

    //对数
    public static boolean equalValues(int[] arr1,int[] arr2){
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }


}

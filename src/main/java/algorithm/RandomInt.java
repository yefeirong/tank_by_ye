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
}

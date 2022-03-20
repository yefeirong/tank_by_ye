package sxb.test;

import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: yefeirong
 * @date: 2022/3/10 15:02
 * @describe:
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 ""
 *
 * 注意：
 * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 * 如果 s 中存在这样的子串，我们保证它是唯一的答案。
 * 示例 1：
 *
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 * 示例 2：
 *
 * 输入：s = "a", t = "a"
 * 输出："a"
 * 示例 3:
 *
 * 输入: s = "a", t = "aa"
 * 输出: ""
 * 解释: t 中两个字符 'a' 均应包含在 s 的子串中，
 * 因此没有符合条件的子字符串，返回空字符串。
 * 你能设计一个在 o(n) 时间内解决此问题的算法吗？
 */
public class BallGame{
    private static BallGame name;
    private BallGame(){

    }
    public static String  getStr(String s,String t){
       if (s.contains(t)){
           return t;
       }
       int length =0;
        Map<Character,Integer> map = new HashMap<>();
      for (int i=0;i<s.length();i++){
         if (!t.contains(""+s.charAt(i))){
             continue;
         }
         if (!map.containsKey(s.charAt(i))){
             map.put(s.charAt(i),i);
         }

      }
        return "";
    }

   public static void wei(int sum){
        int a;
        for (int i=31;i>=0;i--){
            a = (sum & (1<<i)) ==0? 0:1;
            System.out.print(a);
        }
   }
  public static void mutiply(int n){
        int sum=0;
        int cur=1;
        for (int i=1;i<=n;i++){
            cur=cur*i;
            sum=cur+sum;
        }
      System.out.println(sum);
  }
  public static void selectSort(int[] arr){
      if (arr==null||arr.length<2){
          return;
      }
      for (int i=0;i<arr.length;i++){
          int minValueIndex = i;
          for (int j= i+1;j<arr.length;j++){

              minValueIndex=arr[j]<arr[minValueIndex]?j:minValueIndex;
          }
          swap(arr,i,minValueIndex);
      }
      for (int i=0;i<arr.length;i++){
          System.out.print(arr[i]);
      }
  }
  public static void bubble(int[] arr){
        for(int i=0;i<arr.length-1;i++){

            for (int j=0;j+1<arr.length-i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr ,j,j+1);
                }
            }
        }
      for (int i=0;i<arr.length;i++){
          System.out.print(arr[i]);
      }
  }
  public static void swap(int[] arr,int i,int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
  }

    public static void main(String[] args) {

//        wei(1);
        int[] arr={7,1,2,5,7,8};
        bubble(arr);
    }

}

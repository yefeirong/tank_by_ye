package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: yefeirong
 * @date: 2022/4/6 19:02
 * @describe:
 */
public class Code03_String {
    //给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
    /**
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。*/
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==1){
            return 1;
        }
        int size = s.length();
        int lon =0;
        int L=0;
        Map<Character,Integer> map = new HashMap<>();


//        while (R<=size){
//            String str = s.substring(R-1, R);
//            if (!map.containsKey(str)){
//                map.put(str,R);
//                lon++;
//                R++;
//            }else {
//                lon=Math.max(lon-map.get(str)-1,lon);
//                map.put(str,R);
//                    R++;
//            }
//
//        }
//        return lon;

        for (int R=0;R<size;R++){
            if (map.containsKey(s.charAt(R))){
                L=Math.max(L,map.get(s.charAt(R)));
            }

            lon = Math.max(lon, L - R + 1);
            map.put(s.charAt(R),R+1);
        }
        return lon;
    }
}

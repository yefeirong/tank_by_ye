package com.beike.ms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: yefeirong
 * @date: 2022/3/30 19:39
 * @describe:
 *
 * 实现基本的字符串压缩功能。比如,字符串 aabcccccaaa 会变为 a2b1c5a3，注意:字符串 abcd 会输出原先的字符串 abcd。若"压缩"后的字符串没有变短,则返回原先的字符串。
 * 例如: "abcdef","aaabbcccccd"
 *         预期结果: abcdef, a3b2c5d1
 */
public class Press {

    public static String pressStr(String str){
        if (str==null ||str.length()==1){
            return str;
        }
        Map<Character ,Integer> hashmap = new HashMap<>();
        for (int i=0;i<str.length();i++){

            char c = str.charAt(i);
            if (!hashmap.containsKey(c)){
                hashmap.put(c,1);
            }else {

                hashmap.put(c,hashmap.get(c)+1);
            }

        }
        StringBuffer stringBuffer = new StringBuffer();
       for (Map.Entry<Character,Integer> map:hashmap.entrySet()){
//           System.out.println(map.getKey());
           stringBuffer.append(map.getKey());
           stringBuffer.append(map.getValue());
        }
//        System.out.println(stringBuffer.toString());



        return  stringBuffer.toString();
    }

    public static void main(String[] args) {
        String str ="aabcccccaaa";
        System.out.println(pressStr(str));

    }
}

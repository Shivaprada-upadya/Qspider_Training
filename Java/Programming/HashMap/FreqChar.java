package Java.Programming.HashMap;

import java.util.HashMap;

public class FreqChar {
    public static void main(String[] args) {
        String s="abcabcd";
        char arr[]=s.toCharArray();
        HashMap<Character, Integer> map= new HashMap();
        for(char a : arr)
        {
            if(!map.containsKey(a))
            {
                map.put(a,1);

            }
            else{
                map.put(a,map.get(a)+1);
            }



        }
        System.out.println(map);
    }
}

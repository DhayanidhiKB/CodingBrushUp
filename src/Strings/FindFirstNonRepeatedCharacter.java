package Strings;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter
{
    public static void main (String [] args)
    {
        String str = "pprravveenn";
        findNonRepeatingCharacter(str);
    }

    private static void findNonRepeatingCharacter(String str)
    {
        Map<Character,Integer> map = new HashMap<>();


        for(int i=0; i<str.length(); i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }

            else
            {
                map.put(str.charAt(i),1);
            }
        }

        for(Map.Entry<Character,Integer> entryMap: map.entrySet())
        {
            if(entryMap.getValue()==1)
            {
                System.out.print(entryMap.getKey());
                break;
            }
        }
    }

}

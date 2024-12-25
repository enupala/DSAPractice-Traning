package org.example.practice2;

import java.util.HashMap;
import java.util.Map;

public class CountIpAddresses {
    public static void main(String[] args) {
        String[] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.4 bytes=32 time=50ms TTL=93"
        };
        String ip = countIpAdd(str);
        System.out.println(ip);
    }

    private static String countIpAdd(String[] str) {
        int n= str.length;
        int max=1;
        String targetKey="";
        HashMap<String,Integer> fmap=new HashMap<>();
        for(String s:str) {
          String ipPart=s.split(" ")[0];
          if(validIp(ipPart))
          {
              if(fmap.containsKey(ipPart))
            fmap.put(ipPart,fmap.get(ipPart)+1);
              else
                  fmap.put(ipPart,1);
          }
        }
     for(Map.Entry<String,Integer> entry : fmap.entrySet() )
     {
         if(entry.getValue()>max)
         {
             max= entry.getValue();
             targetKey= entry.getKey();

         }
     }
     return targetKey;
    }

    private static boolean validIp(String ipPart) {
        String []parts=ipPart.split("\\.");
        if(parts.length!=4)
            return false;
        for(int i=0;i<parts.length;i++)
        {
            try {
                int p = Integer.parseInt(parts[i]);

                if (p<0 && p>255)
                    return false;
            }
            catch(NumberFormatException e)
            {
                return false;
            }
        }
        return true;
    }


    private static String countIpAdd1(String[] str) {
        int max = 0;
        String ansIp = "";
        HashMap<String, Integer> fmap = new HashMap<>();
        for (String s : str) {
            String ipPart = s.split(" ")[0];

            if (isValidIp(ipPart)) {
                if (fmap.containsKey(ipPart)) {
                    fmap.put(ipPart, fmap.get(ipPart) + 1);
                } else {
                    fmap.put(ipPart, 1);
                }
            }


        }
        for (Map.Entry<String, Integer> entry : fmap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ansIp = entry.getKey();

            }
        }
        if (fmap.isEmpty())
            System.out.println("invalid entries");
        return ansIp;
    }

    private static boolean isValidIp(String ip) {
        String[] validIp = ip.split("\\.");
        if (validIp.length != 4)
            return false;
        for (int i = 0; i < validIp.length; i++) {
            try {
                int val = Integer.parseInt(validIp[i]);
                if (val < 0 || val > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}

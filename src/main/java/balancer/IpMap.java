package balancer;

import java.util.*;

public class IpMap {


    public static Map<String, Integer> serverWeightMap = new HashMap<>();


    static {
        serverWeightMap.put("192.168.1.100", 1);
        serverWeightMap.put("192.168.1.101", 2);
        serverWeightMap.put("192.168.1.102", 1);
        serverWeightMap.put("192.168.1.103", 1);
        serverWeightMap.put("192.168.1.104", 3);
        serverWeightMap.put("192.168.1.105", 1);
        serverWeightMap.put("192.168.1.106", 1);
    }





    public static List<String> getServers(){

        Map<String, Integer> serverMap = new HashMap<>();
        serverMap.putAll(IpMap.serverWeightMap);

        Set<String> keySet = serverMap.keySet();
        List<String> keyList = new ArrayList<>();
        keyList.addAll(keySet);
        return keyList;
    }



}




























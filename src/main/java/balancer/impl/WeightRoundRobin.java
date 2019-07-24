package balancer.impl;

import balancer.IpMap;

import java.util.*;
/**
 * 加权轮询
 **/
public class WeightRoundRobin {

    private static Integer pos=0;


    public static String getServer(){
        Map<String, Integer> serverMap = new HashMap<>();
        serverMap.putAll(IpMap.serverWeightMap);

        Set<String> keySet = serverMap.keySet();
        List<String> keyList = new ArrayList<>();
        for (String key : keySet) {

            int weight = serverMap.get(key);
            for (int i = 0; i < weight; i++) {
                keyList.add(key);
            }

        }
        String server = null;
        synchronized (pos){
            if(pos>=keyList.size()){
                pos=0;
            }
            server = keyList.get(pos);
            pos++;

        }
        return server;
    }



}

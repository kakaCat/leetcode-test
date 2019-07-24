package balancer.impl;

import balancer.IpMap;

import java.util.*;

/**
 * 随机负载
 **/
public class RandomIp {


    public static String getServer(){

        List<String> keyList = IpMap.getServers();

        Random random = new Random();
        int randomPos = random.nextInt(keyList.size());

        return keyList.get(randomPos);
    }




}

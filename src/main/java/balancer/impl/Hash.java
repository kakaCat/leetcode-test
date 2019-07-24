package balancer.impl;

import balancer.IpMap;

import java.util.List;
/**
 *  源地址hash值负载
 **/
public class Hash {


    public static String getServer(){

        List<String> keyList = IpMap.getServers();
        String remoteIp = "127.0.0.1";
        int hashCode = remoteIp.hashCode();
        int serverListSize = keyList.size();
        int serverPos = hashCode % serverListSize;
        return keyList.get(serverPos);

    }


}

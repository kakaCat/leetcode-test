package balancer.impl;

import balancer.IpMap;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * 轮询
 **/
public class RoundRobin {

    private static Integer pos = 0;

    public static String getServer(){
        List<String> keyList = IpMap.getServers();

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

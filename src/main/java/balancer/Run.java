package balancer;

import balancer.impl.Hash;
import balancer.impl.RandomIp;
import balancer.impl.RoundRobin;
import balancer.impl.WeightRoundRobin;

public class Run {

    public static void main(String[] args) {


//        randomIp();
//        roundRobin();
//        hash();
        weightRoundRobin();
    }

    public static void randomIp(){
        for (int i = 0; i < 10; i++) {
            System.out.println(RandomIp.getServer());
        }
    }

    public static void roundRobin(){
        for (int i = 0; i < 10; i++) {
            System.out.println(RoundRobin.getServer());
        }
    }

    public static void hash(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Hash.getServer());
        }
    }


    public static void weightRoundRobin(){
        for (int i = 0; i < 100; i++) {
            System.out.println(WeightRoundRobin.getServer());
        }
    }
}

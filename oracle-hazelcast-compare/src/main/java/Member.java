import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

import java.util.Random;

public class Member {
    public static void main(String[] args) {
        HazelcastInstance HzInstance = Hazelcast.newHazelcastInstance();
        IMap<Object,Object> map = HzInstance.getMap("mapTest");

        Random randomNumber = new Random();
        long startTime = System.nanoTime();
        for (int i =0; i < 100000; i++){
            map.put(i,randomNumber.nextInt(100000));
        }
        long workingTime = System.nanoTime() - startTime;
        System.out.println((double) workingTime/1_000_000_000);

    }
}
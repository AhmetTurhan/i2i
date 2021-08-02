import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        HazelcastInstance hzClient = HazelcastClient.newHazelcastClient();
        IMap<Object,Object> map = hzClient.getMap("mapTest");

        long startTime = System.nanoTime();
        Object randomNumber = 0;
        int i=0;

        while (randomNumber != null){
            randomNumber = map.get(i);
            i++;

        }

        long workingTime = System.nanoTime() - startTime;
        System.out.println((double) workingTime/1_000_000_000);


    }

}

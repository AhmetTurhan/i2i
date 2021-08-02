import akka.actor.AbstractActor;

public class SecondActor extends AbstractActor {
    @Override
    public Receive createReceive() {
        return receiveBuilder().match(String.class, message->{
            System.out.println(message+ sender());
        }).build();
    }
}

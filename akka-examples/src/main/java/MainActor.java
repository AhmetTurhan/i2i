import akka.actor.AbstractActor;

public class MainActor extends AbstractActor {


    @Override
    public Receive createReceive() {
        return receiveBuilder().match(String.class, message->{
            System.out.println(message);
        }).build();
    }
}

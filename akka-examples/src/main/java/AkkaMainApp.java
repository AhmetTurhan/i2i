import akka.actor.Actor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class AkkaMainApp {
    public static void main(String[] args) {
        ActorSystem actorSystem = ActorSystem.create("newActorSystem");
        ActorRef mainActor = actorSystem.actorOf(Props.create(MainActor.class));
        ActorRef secondActor = actorSystem.actorOf(Props.create(SecondActor.class));
        mainActor.tell(("Hello this is first massage"), Actor.noSender());
        secondActor.tell("Hi! This is second message", mainActor);
        secondActor.tell("Hello this is third message",Actor.noSender());
    }
}

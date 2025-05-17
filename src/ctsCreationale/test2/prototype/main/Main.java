package ctsCreationale.test2.prototype.main;

import ctsCreationale.test2.prototype.classes.Live;
import ctsCreationale.test2.prototype.classes.PrototypeCollection;
import ctsCreationale.test2.prototype.classes.StreamingPlatform;

public class Main {
    public static void main(String[] args) {
        PrototypeCollection collection=new PrototypeCollection("Football",new byte[]{10,20,30});
        Live live1=collection.getTransmision(StreamingPlatform.NETFLIX);
        System.out.println(live1.toString());

        Live live2=collection.getTransmision(StreamingPlatform.HBO);
        System.out.println(live2.toString());

        live1.addComment("Hei");
        live2.addComment("Wow");

        System.out.println(live1.toString());
        System.out.println(live2.toString());


    }
}

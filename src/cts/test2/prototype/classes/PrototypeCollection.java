package cts.test2.prototype.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class PrototypeCollection {
    private Map<StreamingPlatform,Live> collection=new HashMap<>();

    public PrototypeCollection(String title, byte[] stream) {
        collection.put(StreamingPlatform.NETFLIX,new LiveTransmision(title,stream));
        collection.put(StreamingPlatform.HBO,new LiveTransmision(title,stream));
        collection.put(StreamingPlatform.VOYO,new LiveTransmision(title,stream)) ;
    }

    public Live getTransmision(StreamingPlatform streamingPlatform)
    {
        Live live=collection.get(streamingPlatform);
        if(live==null)
        {
            throw new IllegalArgumentException("Platform doesn t exist");
        }else {
            try {
                return live.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package cts.test4.classes;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollectionWebinar {
    private Map<SocialMediaPlatform,Webinar> collection=new HashMap<>();

    public PrototypeCollectionWebinar() {
        this.collection.put(SocialMediaPlatform.INSTAGRAM,new LiveTransmision());
        this.collection.put(SocialMediaPlatform.FACEBOOK,new LiveTransmision());
        this.collection.put(SocialMediaPlatform.LINKEDIN,new LiveTransmision());
    }

    public Webinar getWebinar(SocialMediaPlatform socialMediaPlatform)
    {
        if(collection.containsKey(socialMediaPlatform))
        {
            try {
                return collection.get(socialMediaPlatform).clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}

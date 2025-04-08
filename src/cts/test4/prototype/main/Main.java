package cts.test4.prototype.main;

import cts.test4.prototype.classes.PrototypeCollectionWebinar;
import cts.test4.prototype.classes.SocialMediaPlatform;
import cts.test4.prototype.classes.Webinar;

public class Main {
    public static void main(String[] args) {
        PrototypeCollectionWebinar collection=new PrototypeCollectionWebinar();
        Webinar webinar1=collection.getWebinar(SocialMediaPlatform.INSTAGRAM);
        webinar1.addComment("Wow");
        webinar1.setTitle("Webinar1");
        webinar1.setDescription("Programming");
        System.out.println(webinar1.toString());

        Webinar webinar2=collection.getWebinar(SocialMediaPlatform.FACEBOOK);
        webinar2.addComment("Hei");
        webinar2.setTitle("Webinar2");
        webinar2.setDescription("Programming");
        System.out.println(webinar2.toString());
    }
}

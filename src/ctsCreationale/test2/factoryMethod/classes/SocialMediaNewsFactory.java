package ctsCreationale.test2.factoryMethod.classes;

public class SocialMediaNewsFactory extends AbstractFactory {
    private String link;

    public SocialMediaNewsFactory(String link) {
        this.link = link;
    }

    @Override
    public NewsArticle getTransmision(String newsType,String title, String text) {
        if(SPORT.equals(newsType))
        {
            return new SocialMediaSportNews(title,text,link);
        }else if(POLICY.equals(newsType))
        {
            return new SocialMediaPolicyNews(title,text,link);
        }else if(ECONOMY.equals(newsType))
        {
            return new SocialMediaEconomyNews(title,text,link);
        }
        return null;
    }
}

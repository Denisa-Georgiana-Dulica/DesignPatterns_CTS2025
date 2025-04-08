package cts.test2.factoryMethod.classes;

public class SiteNewsFactory extends AbstractFactory {

    @Override
    public NewsArticle getTransmision(String newsType,String title, String text) {
       if(SPORT.equals(newsType))
       {
           return new SiteSportNews(title,text);
       }else if(POLICY.equals(newsType))
       {
           return new SitePolicyNews(title,text);
       }else if(ECONOMY.equals(newsType))
        {
            return new SiteEconomyNews(title,text);
        }
       return null;
    }
}

package cts.test2.factoryMethod.classes;

public abstract class AbstractFactory {
   String SPORT="SPORT";
   String POLICY="POLICY";
   String ECONOMY="ECONOMY";

    public abstract NewsArticle getTransmision(String newsType,String title,String text);
}

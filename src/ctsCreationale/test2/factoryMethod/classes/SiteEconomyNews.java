package ctsCreationale.test2.factoryMethod.classes;

public class SiteEconomyNews implements NewsArticle{
    private String title;
    private String text;

    SiteEconomyNews(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public String getLink() {
        return null;
    }
}

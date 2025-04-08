package cts.test2.factoryMethod.classes;

public class SocialMediaSportNews implements NewsArticle {
    private String title;
    private String text;
    private String link;

    SocialMediaSportNews(String title, String text, String link) {
        this.title = title;
        this.text = text;
        this.link = link;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getText() {
        if(this.text.length()>100)
        {
            return this.text.substring(0,100);
        }
        else {
            return this.text;
        }
    }

    @Override
    public String getLink() {
        return this.link;
    }
}

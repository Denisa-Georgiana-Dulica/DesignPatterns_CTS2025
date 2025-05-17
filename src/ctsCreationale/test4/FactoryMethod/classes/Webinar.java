package ctsCreationale.test4.FactoryMethod.classes;

public class Webinar implements Event{
    private String title;
    private String category;

    Webinar(String title) {
        this.title = title;
        this.category = "Webinar";
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public String toString() {
        return "Webinar{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

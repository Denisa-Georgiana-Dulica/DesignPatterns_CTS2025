package cts.test4.FactoryMethod.classes;

public class Conference implements Event{
    private String title;
    private String category;

    Conference(String title) {
        this.title = title;
        this.category = "Conference";
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
        return "Conference{" +
                "title='" + title + '\'' +
                ", category='" + category +
                '}';
    }
}

package ctsCreationale.test4.FactoryMethod.classes;

public class Workshop implements Event{
    private String title;
    private String category;

    Workshop(String title) {
        this.title = title;
        this.category = "Workshop";
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
        return "Workshop{" +
                "title='" + title + '\'' +
                ", category='" + category +
                '}';
    }
}

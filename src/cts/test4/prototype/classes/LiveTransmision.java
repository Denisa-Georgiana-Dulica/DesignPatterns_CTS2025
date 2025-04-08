package cts.test4.prototype.classes;

import java.util.ArrayList;
import java.util.List;

public class LiveTransmision implements Webinar{
    private String title;
    private String description;
    private List<String> comments=new ArrayList<>();

    public LiveTransmision() {

    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title=title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description=description;
    }

    @Override
    public List<String> getComments() {
        return this.comments;
    }

    @Override
    public void addComment(String comment) {
        this.comments.add(comment);
    }

    @Override
    public Webinar clone() throws CloneNotSupportedException {
        LiveTransmision liveTransmision= (LiveTransmision) super.clone();
        liveTransmision.title=title;
        liveTransmision.description=description;
        liveTransmision.comments=new ArrayList<>(comments);
        return liveTransmision;
    }

    @Override
    public String toString() {
        return "LiveTransmision{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", comments=" + comments +
                '}';
    }
}

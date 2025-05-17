package ctsCreationale.test4.prototype.classes;

import java.util.List;

public interface Webinar extends Cloneable{
    String getTitle();
    void setTitle(String titlu);
    String getDescription();
    void setDescription(String description);
    List<String> getComments();
    void addComment(String comment);

    Webinar clone() throws CloneNotSupportedException;
}

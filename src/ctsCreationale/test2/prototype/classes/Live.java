package ctsCreationale.test2.prototype.classes;

import java.util.List;

public interface Live extends Cloneable {
    String getTitle();
    void setTitle(String titlu);
    byte[] getStream();
    List<String> getComments();
    void addComment(String comment);

    Live clone() throws CloneNotSupportedException;
}

package cts.test2.prototype.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LiveTransmision implements Live{
    private String titlu;
    private byte[] stream;
    private List<String> comments=new ArrayList<>();

    public LiveTransmision(String titlu, byte[] stream) {
        this.titlu = titlu;
        this.stream = stream;
    }

    @Override
    public String getTitle() {
        return this.titlu;
    }

    @Override
    public void setTitle(String titlu) {
        this.titlu=titlu;
    }

    @Override
    public byte[] getStream() {
        return this.stream.clone();
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
    public Live clone() throws CloneNotSupportedException {
        LiveTransmision liveTransmision= (LiveTransmision) super.clone();
        liveTransmision.titlu=titlu;
        liveTransmision.comments=new ArrayList<>(comments);
        liveTransmision.stream=this.stream.clone();
        return liveTransmision;
    }

    @Override
    public String toString() {
        return "LiveTransmision{" +
                "titlu='" + titlu + '\'' +
                ", stream=" + Arrays.toString(stream) +
                ", comments=" + comments +
                '}';
    }
}

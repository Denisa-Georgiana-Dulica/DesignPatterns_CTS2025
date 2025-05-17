package ctsCreationale.test1.builder.classes;

import java.util.Arrays;

public class ExtraActivities {
    private String[] extraActivities;

    ExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities.clone();
    }

    public String[] getExtraActivities() {
        return extraActivities.clone();
    }

    @Override
    public String toString() {
        return "ExtraActivities{" +
                "extraActivities=" + Arrays.toString(extraActivities) +
                '}';
    }
}

package com.quest.exams;

import java.util.Comparator;

public class TrackRatingComparator implements Comparator<Track> {
    //overriding the compare method
    @Override
    public int compare(Track o1, Track o2) {
        if (o1.getRating() > o2.getRating()) {
            return 1;
        } else if (o1.getRating() < o2.getRating()) {
            return -1;
        } else {
            return 0;
        }
    }
}

package com.quest.exams;

import java.util.Comparator;

public class TrackDurationComparator implements Comparator<Track> {
    //overriding the compare method
    @Override
    public int compare(Track o1, Track o2) {
        if (o1.getDuration() > o2.getDuration()) {
            return 1;
        } else if (o1.getDuration() < o2.getDuration()) {
            return -1;
        } else {
            return 0;
        }
    }
}

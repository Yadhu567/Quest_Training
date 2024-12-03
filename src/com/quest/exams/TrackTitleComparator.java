package com.quest.exams;

import java.util.Comparator;

public class TrackTitleComparator implements Comparator<Track> {
    //overriding the compare method
    @Override
    public int compare(Track o1, Track o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

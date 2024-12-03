package com.quest.exams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class PlayList implements PlayListOperations {
    private final String name; //playlist name
    private final ArrayList<Track> tracks;

    public PlayList(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    @Override
    public void addTrack(Track track) throws DuplicateTrackException {
        if (tracks.contains(track)) {
            throw new DuplicateTrackException("This track already exists");
        }
        tracks.add(track);
    }

    @Override
    public void removeTrack(Track track) {
        if (!tracks.contains(track)) {
            throw new NoSuchElementException("Playlist not found.");
        }
        tracks.remove(track);

    }

    @Override
    public void findDuplicate() {
        boolean duplicateFound = false; // flag to check duplicate found or not
        for (int i = 0; i < tracks.size(); i++) {
            for (int j = i + 1; j < tracks.size(); j++) {
                if (tracks.get(i).equals(tracks.get(j))) {
                    System.out.println("duplicate track found: " + tracks.get(i));
                    duplicateFound = true;
                }
            }
        }
        if (!duplicateFound) {
            System.out.println("no duplicate tracks found.");
        }
    }

    @Override
    public void searchTracks(String title) {
        if (!tracks.isEmpty()) {
            boolean found = false; // flag to check track found or not
            for (Track t : tracks) {
                if (t.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("Track found: " + t);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Track not found.");
            }
        } else {
            System.out.println("Track list is empty.");
        }
    }
    public List<Track> getTracks() {
        return new ArrayList<>(tracks); // to get tracks in the playlist
    }

    @Override
    public void displayTracks() {
        if (!tracks.isEmpty()) {
            System.out.println("Tracks in playlist " + name + " are:");
            for (Track t : tracks) {
                System.out.println(t);
            }
        } else {
            System.out.println("The playlist "+name+" is empty.");
        }
    }

    @Override
    public void sortTracksByTitle() {
        tracks.sort(new TrackTitleComparator()); // for sorting by title
        System.out.println("After sorting by title:");
        displayTracks();
    }

    @Override
    public void sortTracksByDuration() {
        tracks.sort(new TrackDurationComparator()); // for sorting by duration
        System.out.println("After sorting by duration:");
        displayTracks();
    }

    @Override
    public void sortTracksByRating() {
        tracks.sort(new TrackTitleComparator()); // for sorting by rating
        System.out.println("After sorting by rating:");
        displayTracks();
    }

    @Override
    public void shuffleTracks() {
        Collections.shuffle(tracks);  // to shuffle tracks
        System.out.println("After shuffling tracks:");
        displayTracks();
    }
}

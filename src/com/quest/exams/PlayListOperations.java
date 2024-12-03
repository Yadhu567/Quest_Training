package com.quest.exams;

 interface PlayListOperations {
     // operations in playlist class
     void addTrack(Track track) throws DuplicateTrackException;
     void removeTrack(Track track);
     void findDuplicate();
     void searchTracks(String title);
     void displayTracks();
     void sortTracksByTitle();
     void sortTracksByDuration();
     void sortTracksByRating();
     void shuffleTracks();
}

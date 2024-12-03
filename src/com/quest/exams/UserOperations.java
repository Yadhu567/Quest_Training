package com.quest.exams;

public interface UserOperations {
    // operations in user class
    void createPlayList(String name);
    void deletePlayList(String name);
    PlayList getPlaylistByName(String name);
    void displayPlayList();
    void mergePlayList(String newName,String p1,String p2);
    void markAsFavorite(Track track);
    void unmarkAsFavorite(Track track);
    void displayFavorites();
}

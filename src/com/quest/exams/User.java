package com.quest.exams;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class User implements UserOperations {
    private final String userName;
    private final Map<String, PlayList> playLists;
    private final Set<Track> favorites; // to keep track of favorite track

    public User(String userName) {
        this.userName = userName;
        this.playLists = new HashMap<>();
        this.favorites = new HashSet<>();
    }
    
    @Override
    public void createPlayList(String name) {
        if (playLists.containsKey(name)) {
            System.out.println("Playlist with this name already exists");
        } else {
            playLists.put(name, new PlayList(name));
        }
    }

    @Override
    public void deletePlayList(String name) {
        if (!playLists.containsKey(name)) { //containsValue also
            System.out.println("No such playlist found");
        } else {
            playLists.remove(name);
            System.out.println("Playlist "+name +" deleted successfully");
        }
    }


    @Override
    public PlayList getPlaylistByName(String name) {
        PlayList playlist = playLists.get(name);
        if (playlist == null) { //checks it is null or not
            System.out.println("Playlist not found");
        } else {
            System.out.println("Displaying playlist: " + name);
            playlist.displayTracks();
        }
        return playlist;
    }

    @Override
    public void displayPlayList() {
        if (!playLists.isEmpty()) {
            System.out.println(userName + "'s playlists:");
            for (Map.Entry<String, PlayList> entry : playLists.entrySet()) {
                System.out.println(" " + entry.getKey());
            }
        } else {
            System.out.println(userName+ " has no playlists available.");
        }
    }

    @Override
    public void mergePlayList(String newName, String p1Name, String p2Name) {
        PlayList playlist1 = playLists.get(p1Name);
        PlayList playlist2 = playLists.get(p2Name);

        if (playlist1 == null || playlist2 == null) { //checks playlist null or not
            System.out.println("cannot merge!");
            return;
        }

        PlayList newPlaylist = new PlayList(newName);

        Set<Track> mergedTracks = new HashSet<>(playlist1.getTracks()); // store merged tracks
        mergedTracks.addAll(playlist2.getTracks());
        for (Track track : mergedTracks) {
            try {
                newPlaylist.addTrack(track);
            } catch (DuplicateTrackException e) { // handles duplicates tracks
                System.out.println("duplicate track found: " + track.getTitle());
            }
        }

        playLists.put(newName, newPlaylist);
        System.out.println("playlists are merged to: " + newName);
    }

    @Override
    public void markAsFavorite(Track track) {
        favorites.add(track);
        System.out.println("Track marked as favorite: " + track);
    }

    @Override
    public void unmarkAsFavorite(Track track) {
        if (favorites.remove(track)) {
            System.out.println("Track removed from favorites: " + track);
        } else {
            System.out.println("Track not in favorites.");
        }
    }

    @Override
    public void displayFavorites() {
        if (favorites.isEmpty()) {
            System.out.println("No favorite tracks.");
        } else {
            System.out.println("Favorite tracks:");
            favorites.forEach(System.out::println);
        }
    }
}

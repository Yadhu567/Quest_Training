package com.quest.exams;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        User user = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--Streaming Platform Playlist Manager---");
            System.out.println("1.Create User");
            System.out.println("2.Create Playlist");
            System.out.println("3.Add Track to Playlist");
            System.out.println("4.Remove Track from Playlist");
            System.out.println("5.Display Tracks in Playlist");
            System.out.println("6.Search Track in Playlist");
            System.out.println("7.Sort Tracks by Title");
            System.out.println("8.Sort Tracks by Duration");
            System.out.println("9.Sort Tracks by Rating");
            System.out.println("10.Shuffle Tracks");
            System.out.println("11.Mark as Favorite");
            System.out.println("12.Unmark as Favorite");
            System.out.println("13.Display Favorite Tracks");
            System.out.println("14.Merge Playlists");
            System.out.println("15.Delete Playlist");
            System.out.println("16.Display Playlists");
            System.out.println("17.Find Duplicates in Playlist");
            System.out.println("18.Exit");
            System.out.print("Enter your choice: ");

            int choice = integerValidation(sc); // integer validation
            sc.nextLine(); // Clear input

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    user = new User(username);
                    System.out.println("User created: " + username);
                    break;
                case 2:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name: ");
                    String playlistName = sc.nextLine();
                    user.createPlayList(playlistName);
                    System.out.println("Playlist created: " + playlistName);
                    break;
                case 3:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name: ");
                    String plName = sc.nextLine();
                    PlayList playlist = user.getPlaylistByName(plName);
                    if (playlist == null) {
                        System.out.println("Playlist not found.");
                        break;
                    }

                    while (true) {
                        System.out.print("Enter track ID: ");
                        int id = integerValidation(sc); // integer validation
                        sc.nextLine(); // Clear input
                        System.out.print("Enter track title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter artist name: ");
                        String artist = sc.nextLine();
                        System.out.print("Enter track duration in minutes: ");
                        double duration = doubleValidation(sc); // double validation
                        System.out.print("Enter rating in 1-5: ");
                        int rating = integerValidation(sc); // integer validation
                        sc.nextLine(); // Clear input

                        Track newTrack = new Track(id, title, artist, duration, rating);
                        try {
                            playlist.addTrack(newTrack);
                            System.out.println("Track added!");
                            break;
                        } catch (DuplicateTrackException e) {
                            System.out.println("Error in adding track: " + e.getMessage());
                        }
                    }
                    break;
                case 4:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name: ");
                    String removePlName = sc.nextLine();
                    PlayList removePlaylist = user.getPlaylistByName(removePlName);
                    if (removePlaylist == null) {
                        break;
                    }
                    System.out.print("Enter track ID to remove: ");
                    int removeId = integerValidation(sc); // integer validation
                    sc.nextLine(); // Clear input
                    Track removeTrack = new Track(removeId, "", "", 0, 0);
                    removePlaylist.removeTrack(removeTrack);
                    System.out.println("Track removed !");
                    break;
                case 5:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name: ");
                    String displayPlName = sc.nextLine();
                    PlayList displayPlaylist = user.getPlaylistByName(displayPlName);
                    if (displayPlaylist != null) {
                        displayPlaylist.displayTracks();
                    }
                    break;
                case 6:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name: ");
                    String searchPlName = sc.nextLine();
                    PlayList searchPlaylist = user.getPlaylistByName(searchPlName);
                    if (searchPlaylist == null) break;

                    System.out.print("Enter track title to search: ");
                    String searchTitle = sc.nextLine();
                    searchPlaylist.searchTracks(searchTitle);
                    break;
                case 7:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name: ");
                    String sortTitlePlName = sc.nextLine();
                    PlayList sortTitlePlaylist = user.getPlaylistByName(sortTitlePlName);
                    if (sortTitlePlaylist != null) {
                        sortTitlePlaylist.sortTracksByTitle();
                    }
                    break;
                case 8:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name: ");
                    String sortDurationPlName = sc.nextLine();
                    PlayList sortDurationPlaylist = user.getPlaylistByName(sortDurationPlName);
                    if (sortDurationPlaylist != null) {
                        sortDurationPlaylist.sortTracksByDuration();
                    }
                    break;
                case 9:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name: ");
                    String sortRatingPlName = sc.nextLine();
                    PlayList sortRatingPlaylist = user.getPlaylistByName(sortRatingPlName);
                    if (sortRatingPlaylist != null) {
                        sortRatingPlaylist.sortTracksByRating();
                    }
                    break;
                case 10:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name: ");
                    String shufflePlName = sc.nextLine();
                    PlayList shufflePlaylist = user.getPlaylistByName(shufflePlName);
                    if (shufflePlaylist != null) {
                        shufflePlaylist.shuffleTracks();
                    }
                    break;
                case 11:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter track ID to mark as favorite: ");
                    int favId = integerValidation(sc); // integer validation
                    sc.nextLine(); // Clear input
                    user.markAsFavorite(new Track(favId, "", "", 0, 0));
                    System.out.println("Track marked as favorite");
                    break;
                case 12:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter track ID to unmark as favorite: ");
                    int unmarkFavId = integerValidation(sc); // integer validation
                    sc.nextLine(); // Clear input
                    user.unmarkAsFavorite(new Track(unmarkFavId, "", "", 0, 0));
                    System.out.println("Track unmarked from favorite");
                    break;
                case 13:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    user.displayFavorites();
                    break;
                case 14:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter new playlist name for the merged playlist: ");
                    String newMergedName = sc.nextLine();
                    System.out.print("Enter first playlist name to merge: ");
                    String firstPlName = sc.nextLine();
                    System.out.print("Enter second playlist name to merge: ");
                    String secondPlName = sc.nextLine();
                    user.mergePlayList(newMergedName, firstPlName, secondPlName);
                    break;
                case 15:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name to delete: ");
                    String delPlName = sc.nextLine();
                    user.deletePlayList(delPlName);
                    break;
                case 16:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    user.displayPlayList();
                    break;
                case 17:
                    if (user == null) {
                        System.out.println("No user found");
                        break;
                    }
                    System.out.print("Enter playlist name to find duplicates: ");
                    String duplicatePlName = sc.nextLine();
                    PlayList duplicatePlaylist = user.getPlaylistByName(duplicatePlName);
                    if (duplicatePlaylist != null) {
                        duplicatePlaylist.findDuplicate();
                    }
                    break;
                case 18:
                    System.out.println("---Exiting---");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    // Integer validation
    private static int integerValidation(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            sc.next();
        }
        return sc.nextInt();
    }

    // double validation
    private static Double doubleValidation(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            sc.next();
        }
        return sc.nextDouble();
    }
}


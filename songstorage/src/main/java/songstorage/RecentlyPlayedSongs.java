package songstorage;

import java.util.HashMap;
import java.util.LinkedList;

class RecentlyPlayedSongs {
    private int capacity;
    private HashMap<String, LinkedList<String>> userSongsMap;

    public RecentlyPlayedSongs(int capacity) {
        this.capacity = capacity;
        this.userSongsMap = new HashMap<>();
    }

    public void addSong(String user, String song) {
        if (!userSongsMap.containsKey(user)) {
            userSongsMap.put(user, new LinkedList<String>());
        }

        LinkedList<String> playlist = userSongsMap.get(user);
        if (playlist.contains(song)) {
            playlist.remove(song);
        } else if (playlist.size() >= capacity) {
            playlist.removeLast();
        }

        playlist.addFirst(song);
    }
    

public LinkedList<String> printPlaylist(String user) {
    LinkedList<String> playlist = userSongsMap.get(user);
    if (playlist != null) {
        System.out.println("User: " + user + ", Recently Played Songs: " + String.join(",", playlist));
        return playlist;
    } else {
        System.out.println("User: " + user + " has not played any songs yet.");
    }
	return playlist;
}
}


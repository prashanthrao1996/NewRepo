package songstorage;

import java.util.LinkedList;

public class Main {
	
	
	public static void main(String[] args) {
        int initialCapacity = 3;
        RecentlyPlayedSongs store = new RecentlyPlayedSongs(initialCapacity);

        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");

        store.printPlaylist("user1");

        store.addSong("user1", "S4");
        store.printPlaylist("user1");

        store.addSong("user1", "S2");
        store.printPlaylist("user1");

        store.addSong("user1", "S1");
        store.printPlaylist("user1");
    }
	
}

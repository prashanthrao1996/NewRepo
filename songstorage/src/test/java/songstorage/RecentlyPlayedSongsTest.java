package songstorage;

	public class RecentlyPlayedSongsTest {
	    public static void main(String[] args) {
	        RecentlyPlayedSongs store = new RecentlyPlayedSongs(3);

	        // Test Case 1: Add songs for user1
	        store.addSong("user1", "S1");
	        store.addSong("user1", "S2");
	        store.addSong("user1", "S3");
	        store.printPlaylist("user1"); // Expected Output: User: user1, Recently Played Songs: S3,S2,S1

	        // Test Case 2: Add a new song for user1, playlist should maintain the capacity
	        store.addSong("user1", "S4");
	        store.printPlaylist("user1"); // Expected Output: User: user1, Recently Played Songs: S4,S3,S2

	        // Test Case 3: Add an already played song for user1, it should be moved to the top
	        store.addSong("user1", "S2");
	        store.printPlaylist("user1"); // Expected Output: User: user1, Recently Played Songs: S2,S4,S3

	        // Test Case 4: Add an already played song for user1, it should be moved to the top
	        store.addSong("user1", "S1");
	        store.printPlaylist("user1"); // Expected Output: User: user1, Recently Played Songs: S1,S2,S4

	        // Test Case 5: Add songs for user2
	        store.addSong("user2", "SongA");
	        store.addSong("user2", "SongB");
	        store.printPlaylist("user2"); // Expected Output: User: user2, Recently Played Songs: SongB,SongA

	        // Test Case 6: Add songs for user3
	        store.addSong("user3", "SongX");
	        store.printPlaylist("user3"); // Expected Output: User: user3, Recently Played Songs: SongX

	        // Test Case 7: Add more songs for user3, the playlist should maintain the capacity
	        store.addSong("user3", "SongY");
	        store.addSong("user3", "SongZ");
	        store.addSong("user3", "SongA");
	        store.printPlaylist("user3"); // Expected Output: User: user3, Recently Played Songs: SongA,SongZ,SongY
	    }
	}


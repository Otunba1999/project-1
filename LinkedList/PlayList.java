package LinkedList;

import java.util.LinkedList;

public class PlayList {
    private String name;
    private LinkedList<Song> myPlaylist;

    public PlayList(String name) {
        this.name = name;
        this.myPlaylist = new LinkedList<>();
    }
    public boolean addSong(String songTitle, Album albumName) {
        if (findSong(songTitle, albumName) == null) {
            myPlaylist.add(albumName.getSong(songTitle));
            return true;
        }
        return false;
    }
    public void songList(){
        for (Song song : myPlaylist) {
            System.out.println(song);
        }
    }

    public Song findSong(String songName, Album album) {
        for (int i = 0; i < myPlaylist.size(); i++) {
            if (album.getTrack().get(i).getTitle().equalsIgnoreCase(songName));
            return this.myPlaylist.get(i);
        }
        return  null;
    }
}

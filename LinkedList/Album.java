package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private SongList songs;

    public Album(String name) {
        this.name = name;
        this.songs = new SongList();

    }
    public Song getSong(String songName){
        if (findSong(songName) == null) {
            for (int i = 0; i < this.track.size(); i++) {
                this.track.get(i);

            }
        }
        return null;
    }

    public boolean addSong(String songTitle, double duration) {
        return this.songs.add(new Song(songTitle, duration));
    }

    public String getName() {

        return name;
    }

    public ArrayList<Song> getTrack() {

        return track;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("Song was " + title + " is not in this album");
        return false;
    }

    public Song findSong(String songTitle) {
        for (int i = 0; i < this.track.size(); i++) {
            if (this.track.get(i).getTitle().equalsIgnoreCase(songTitle)) {
                return this.track.get(i);
            }
        }
        return null;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public songList() {
            this.songs = new ArrayList<>();
        }
        public boolean addSong(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }
        private Song findSong (String title) {
            for (Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equalsIgnoreCase(title));
                return checkedSong;
            }
            return null;
        }
        public Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if(index > 0 && index < songs.size()){
                return songs.get(index);
            }
            return null;
        }

    }






















}

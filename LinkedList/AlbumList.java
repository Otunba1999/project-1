package LinkedList;

import java.util.LinkedList;

public class AlbumList {
    private String name;
    private LinkedList<Album> myAlbum;

    public AlbumList(String name) {
        this.name = name;
        this.myAlbum = new LinkedList<>();
    }

    public boolean addAlbum(String albumName) {
        if (findAlbum(albumName) == null) {
            System.out.println("Adding new album " + albumName + " to playlist");
             myAlbum.add(new Album(albumName));
             return true;
        }
        return false;
    }
    private Album findAlbum(String albumName) {
        for (int i = 0; i < myAlbum.size(); i++) {
            if (myAlbum.get(i).getName().equalsIgnoreCase(albumName)) {
                return myAlbum.get(i);
            }
        }
        return null;
    }


}

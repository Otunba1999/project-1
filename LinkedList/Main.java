package LinkedList;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album1 = new Album("NAHAMciaga");
        album1.addSong("Different pattern", 2.34);
        album1.addSong("Cana", 2.24);
        album1.addSong("Apala-interlude", 2.24);
        album1.addSong("Today", 2.54);
        album1.addSong("Shazam", 3.34);

        Album album2 = new Album("Thy Kingdom Come");
        album2.addSong("Man of the year", 3.56);
        album2.addSong("Professor", 2.45);
        album2.addSong("Hushpoppi", 2.45);
        album2.addSong("Karma", 4.00);
        album2.addSong("Migos", 3.12);

        Album album3 = new Album("Presido La Pluto");
        album3.addSong("Never Ever", 2.34);
        album3.addSong("Evil recieve", 3.12);
        album3.addSong("Cast", 2.34);
        album3.addSong("Eazy", 2.56);

        albums.add(album1);
        albums.add(album3);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Cana", playList);
        albums.get(0).addToPlayList("Different pattern", playList);
        albums.get(0).addToPlayList("Shazam", playList);
        albums.get(1).addToPlayList("Eazy", playList);
        albums.get(1).addToPlayList("Cast", playList);
        albums.get(1).addToPlayList("Evil recieve", playList);

        for (Song song : playList) {
            System.out.println(song.toString());
        }

        play(playList);

//        PlayList playList = new PlayList("Apala");
//        playList.addSong("cana", album1);
//        playList.addSong("Karma", album2);
//        playList.addSong("Migos", album1);
//        playList.addSong("eazy", album3);
//        playList.addSong("Cast", album3);


    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.size() == 0) {
            System.out.println("No Song in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(forward){
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = true;

                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                        forward = true;
                    }
                    break;
                case 3:
                    break;
                case 4:
//                    printList(playlist);
                    break;
                case 5:
//                    printMenu();
                    break;
            }
        }
    }
}

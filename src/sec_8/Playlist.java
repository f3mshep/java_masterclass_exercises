import java.util.*;

public class Playlist {
    private LinkedList<Song> playlist = new LinkedList<Song>();

    public void addAlbum(Album album){
        this.playlist.addAll(album.getSongs());
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void playMusic(){
        Iterator<Song> currentlyPlaying = this.playlist.listIterator();
        while (currentlyPlaying.hasNext()){
            Song temp = currentlyPlaying.next();
            System.out.println("Currently playing " + temp.getTitle() + " for " + temp.getDuration() + " minutes");
            while (true){
                String input = getInput();
                if (input.equals("Previous")){
                    ((ListIterator<Song>) currentlyPlaying).previous();
                    ((ListIterator<Song>) currentlyPlaying).previous();
                    break;
                } else if (input.equals("Next")){
                    currentlyPlaying.next();
                    break;
                } else if (input.equals("List")){
                    System.out.println(this.playlist.toString());
                    break;
                } else if (input.equals("Replay")){
                    ((ListIterator<Song>) currentlyPlaying).previous();
                    break;
                }
            }


        }
    }

    private String getInput(){
        Scanner reader = new Scanner(System.in);
        System.out.println("MENU ");
        System.out.println("====================");
        System.out.println("Type one of the following:");
        System.out.println("Previous");
        System.out.println("Next");
        System.out.println("Replay");
        System.out.println("List");
        return reader.nextLine();
    }
}

class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

}

class Album {
    private ArrayList<Song> songs = new ArrayList<Song>();

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }
}


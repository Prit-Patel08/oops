import java.util.NoSuchElementException;

interface SongIterator {
    boolean hasNext();
    String next();
}

class Playlist {
    private String[] songs = new String[20];
    private int count = 0;

    public void addSong(String song) {
        if (count == songs.length) throw new IllegalStateException("Playlist is full");
        songs[count++] = song;
    }

    public SongIterator createIterator() {
        return new PlaylistIterator();
    }

    private class PlaylistIterator implements SongIterator {
        private int position = 0;

        public boolean hasNext() { return position < count; }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException("No more songs");
            return songs[position++];
        }
    }
}

public class lab10_5 {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Song 1 - Kesariya");
        playlist.addSong("Song 2 - Vande Mataram");
        playlist.addSong("Song 3 - Jai Ho");

        SongIterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            System.out.println("Playing: " + iterator.next());
        }
    }
}

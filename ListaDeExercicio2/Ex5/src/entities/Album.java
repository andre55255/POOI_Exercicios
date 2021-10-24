package entities;

public class Album {
    private String title;
    private String artist;
    private int tracks;
    
    public Album() {
    }

    public Album(String title, String artist, int tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nTítulo: ")
                .append(this.title)
                .append(", Artista: ")
                .append(this.artist)
                .append(", N° faixas: ")
                .append(this.tracks);
        
        return sb.toString();
    }
}
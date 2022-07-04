package playlistChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;

    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName,String artist) {
        this.albumName = albumName;
        this.artist=artist;
        songs=new ArrayList<>();
    }

    public boolean addToAlbum(String title,double duration){
        if(findSong(title)==null){
            songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title){

        for(Song tmp:songs){
            if(title.equals(tmp.getTitle())) return tmp;
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index=trackNumber-1;
        if((index>=0)&&(index<this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("The album does not have the track "+trackNumber);
        return false;
    }
    public boolean addToPlayList(String title,LinkedList<Song> playList){
        Song checkedSong=findSong(title);
        if(checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song "+title+" is not in the album");
        return false;
    }
}

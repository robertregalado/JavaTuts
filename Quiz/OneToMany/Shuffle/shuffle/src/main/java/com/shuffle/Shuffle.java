package com.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    private List<Artist> artists;
     
    Shuffle(){
        artists = new ArrayList<Artist>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);

    }

    public List<Music> getMusics() {
        ArrayList<Music> musicLists = new ArrayList<>();
        for (int i = 0; i < artists.size(); i++){
            musicLists.addAll(i, artists.get(i).musics);
        }
        Collections.sort(musicLists);  
        return musicLists;

    }

    public List<Music> searchMusic(String key) {
       ArrayList<Music> searchMusicList = new ArrayList<>();
 
       for (int i = 0; i < artists.size(); i++){
           if (artists.get(i).getName().toLowerCase().contains(key.toLowerCase())){
               searchMusicList.addAll(i, artists.get(i).musics);
           }
    }
       Collections.sort(searchMusicList);  
       return searchMusicList; 
    }

}

class Music implements Comparable{
    private String musicTitle;
    private int duration;

    Music(String musicTitle, int duration) {

        this.musicTitle = musicTitle;
        this.duration = duration;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return musicTitle + " " + duration;
    }

    @Override
    public int compareTo(Object o) {
         return this.getMusicTitle().compareTo(((Music) o).getMusicTitle());
    }

}

class Artist {
    private String name;
    List<Music> musics = new ArrayList<>();

    Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void addMusic(Music music) {
        musics.add(music);
    }
}
class Main{

    public static void main(String[] args) {
       Shuffle shuffle = new Shuffle();

       System.out.println(shuffle.getMusics());


    }
}

<<<<<<< HEAD
package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by piush on 17/04/2016.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title,double duration){
        //called from the songlist class the addssong
        return this.songs.addSong(new Song(title,duration));
    }

    public boolean addToPlayList(int trackNumber , LinkedList<Song> playList){
//        int index = trackNumber -1;
//        if((index >0) && (index <=this.songs.size())){
//            playList.add(this.songs.get(index));
//            return true;
//        }
        // using inner class
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("this album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title,LinkedList<Song> playList){
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;

    }

    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }
        public boolean addSong(Song song){
            if(songs.contains(song)){
                return false;
            } else {
                return true;
            }


        }
        private Song findSong(String title){
            for(Song checkedSong: this.songs){
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }

            }
            return null;
        }
        public Song findSong(int trackNumber){
            int index = trackNumber -1;
            if(index > 0 && index < songs.size()){
                return songs.get(index);
            }
            return null;
        }
    }
}
||||||| merged common ancestors
=======
package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by piush on 17/04/2016.
 */
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title,double duration){
        if(findSong(title) == null ){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }
    private Song findSong(String title){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }

        }
        return null;
    }
    public boolean addToPlayList(int trackNumber , LinkedList<Song> playList){
        int index = trackNumber -1;
        if((index >0) && (index <=this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title,LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;

    }
}
>>>>>>> 4d4154c35fab4530da95812295ba1e75983fd62e

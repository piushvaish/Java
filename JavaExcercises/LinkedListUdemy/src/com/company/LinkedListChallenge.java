package com.company;

import java.util.*;

/**
 * Created by piush on 17/04/2016.
 */
public class LinkedListChallenge {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

        Album album = new Album("Stormbringer","Deep Purple");
        album.addSong("Love do not mean a thinf",4.22);
        album.addSong("Holyman",4.3);
        album.addSong("Hold On",5.6);
        album.addSong("Lady Double Dealer",3.21);
        album.addSong("You can't do it right",6.23);
        album.addSong("The ball shooter",4.27);
        album.addSong("The gypsy",4.2);
        album.addSong("Soldiers of fortune",3.13);
        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",5.22);
        album.addSong("I put the finger on you",1.3);
        album.addSong("Lets go",8.6);
        album.addSong("Inject the venom",4.21);
        album.addSong("Snowballed",6.23);
        album.addSong("HHhooter",1.27);
        album.addSong("Breaking the rules",2.2);
        album.addSong("Sorry",6.13);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right",playList);
        albums.get(0).addToPlayList("Holyman",playList);
        albums.get(0).addToPlayList("Speak king",playList);//doesnot exist
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(5,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(24,playList);
        play(playList);


    }
    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("There are no songs in the list");
        }else {
            System.out.println("Now Playing " + listIterator.next().toString());
          printMenu();
        }
        while ((!quit)){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of playlist");
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                            }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("We are at the start of the playlist");
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("now replaying " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are the start of the list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() >0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play the next song\n" +
                "2- to play the previous song\n" +
                "3- to replay the current song\n" +
                "4- list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - delete current song from the playlist"
        );
    }
    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("============================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("============================");
    }

}

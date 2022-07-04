package playlistChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums=new ArrayList<>();
    public static void main(String[] args) {

        Album album=new Album("StormBringer","Deep Purple");
        album.addToAlbum("StormBringer",4.6);
        album.addToAlbum("Love don't mean a thing", 4.22);
        album.addToAlbum("Holy man", 4.3);
        album.addToAlbum("Hold on", 5.6);
        album.addToAlbum("Lady double dealer", 3.21);
        album.addToAlbum("You can't do it right", 6.23);
        album.addToAlbum("High ball shooter", 4.27);
        album.addToAlbum("The gypsy", 4.2);
        album.addToAlbum("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addToAlbum("For those about to rock", 5.44);
        album.addToAlbum("I put the finger on you", 3.25);
        album.addToAlbum("Lets go", 3.45);
        album.addToAlbum("Inject the venom", 3.33);
        album.addToAlbum("Snowballed", 4.51);
        album.addToAlbum("Evil walks", 3.45);
        album.addToAlbum("C.O.D.", 5.25);
        album.addToAlbum("Breaking the rules", 5.32);
        album.addToAlbum("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList=new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right",playList);
        albums.get(0).addToPlayList("Holy man",playList);
        albums.get(0).addToPlayList("Speaking king",playList);
        play(playList);

    }
    private static void printList(LinkedList<Song> playList){
        System.out.println("Displaying the play list: ");
        int count=1;

        for(Song song:playList){
            System.out.println(count+". "+song.toString());
            count++;
        }
    }

    public static void printMenu() {
        System.out.println("please choose an action from the following list");
        System.out.println("0 - To quit\n"+
                "1 - To play the next song in the play list\n"+
                "2 - To play the previous song\n"+
                "3 - To replay the current song\n"+
                "4 - display all songs in the play list\n"+
                "5 - display the menu of options\n"+
                "6 - delete current song from playlist");
    }
    private static void play(LinkedList<Song> playList){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean forward=true;
        ListIterator<Song> listIterator=playList.listIterator();
       if(playList.size()==0){
           System.out.println("No song in the playlist");
       }else{
           System.out.println("Now Playing "+listIterator.next().toString());
       }
       while (!quit){
           int action=scanner.nextInt();
           scanner.nextLine();
           switch (action){
               case 0:
                   System.out.println("playlist complete.");
                   quit=true;
                   break;
               case 1:
                   if(!forward){
                       if(listIterator.hasNext()){
                           listIterator.next();
                           forward=true;
                       }
                   }
                   if(listIterator.hasNext()){
                       System.out.println("Now Playing "+listIterator.next().toString());
                   }else System.out.println("We reach the end of the play list");

                   break;
               case 2:
                   if(forward){
                       listIterator.previous();
                       forward=false;
                   }
                   if(listIterator.hasPrevious()){
                       System.out.println("Now Playing "+listIterator.previous().toString());
                   }else System.out.println("We are at the start of the list");

                   break;
               case 3:
                   if(forward){
                       if(listIterator.hasPrevious()) {
                           System.out.println("Now playing "+listIterator.previous().toString());
                           forward=false;
                       }else {
                           System.out.println("We are at the start of the list");
                       }
                   }else if(!forward) {
                       if(listIterator.hasNext()){
                           System.out.println("Now playing "+listIterator.next().toString());
                           forward=true;
                       }else{
                           System.out.println("We are at the end of the list");
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
                   if(playList.size()>0){
                       listIterator.remove();
                       if(listIterator.hasNext()){
                           System.out.println("Now playing "+listIterator.next());
                       }else if(listIterator.hasPrevious()){
                           System.out.println("Now playing "+listIterator.previous());
                       }
                   }
           }
       }
    }
}

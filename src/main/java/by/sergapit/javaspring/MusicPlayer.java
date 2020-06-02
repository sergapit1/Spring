package by.sergapit.javaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music){
        this.music = music;
    }

   // private String name;
   // private int volume;

   // public String getName() {
   //     return name;
   // }

   // public void setName(String name) {
   //     this.name = name;
   // }

   // public int getVolume() {
   //     return volume;
   // }

   // public void setVolume(int volume) {
   //     this.volume = volume;
   // }



   // public MusicPlayer() {

   // }
@Autowired
    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}


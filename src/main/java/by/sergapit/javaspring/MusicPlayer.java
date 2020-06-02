package by.sergapit.javaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    //  public MusicPlayer(Music music){
  //      this.music = music;
  //  }

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



//    @Autowired
//        public void setMusic(Music music) {
//            this.music = music;
//        }

    public String playMusic() {
    return "Playing: " + classicalMusic.getSong();
       // System.out.println("Playing: " + classicalMusic.getSong());
        // System.out.println("Playing: " + rockMusic.getSong());
    }
}


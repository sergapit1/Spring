package by.sergapit.javaspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public TestSpring() {
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //  Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);
        //ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

       // System.out.println(classicalMusic.getSong());


        // MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // boolean comporarison = firstMusicPlayer == secondMusicPlayer;

        // //musicPlayer.playMusic();
        // System.out.println(comporarison);
        // System.out.println(firstMusicPlayer);
        // System.out.println(secondMusicPlayer);

        // firstMusicPlayer.setVolume(50);
        // System.out.println(firstMusicPlayer.getVolume());
        // System.out.println(secondMusicPlayer.getVolume());

      //  MusicPlayer musicPlayer= context.getBean("musicPlayer",MusicPlayer.class);
       // musicPlayer.playMusic();

Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();
    }
}

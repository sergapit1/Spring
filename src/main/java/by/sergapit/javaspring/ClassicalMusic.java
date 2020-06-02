package by.sergapit.javaspring;

public class ClassicalMusic  implements Music{


    private ClassicalMusic(){

    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public  void doMyInit(){
        System.out.println("do my initiolization");
    }
    public void doMyDestroy(){
        System.out.println("do my destraction");
    }


    @Override
    public String getSong() {
        return "Rhapsody";
    }

}

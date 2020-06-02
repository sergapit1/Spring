package by.sergapit.javaspring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Mother!!!";
    }
}

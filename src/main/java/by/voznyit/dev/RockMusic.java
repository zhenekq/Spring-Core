package by.voznyit.dev;

import by.voznyit.dev.Music;
import org.springframework.stereotype.Component;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}

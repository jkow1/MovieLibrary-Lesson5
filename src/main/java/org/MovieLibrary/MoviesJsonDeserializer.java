package org.MovieLibrary;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MoviesJsonDeserializer {

    public static MovieLibrary deserializeJson(String src){
        try {
            return new ObjectMapper().readValue((new File(src)), MovieLibrary.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

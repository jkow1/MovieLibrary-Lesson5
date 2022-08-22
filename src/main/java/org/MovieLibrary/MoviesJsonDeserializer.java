package org.MovieLibrary;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MoviesJsonDeserializer {

    public MovieLibrary deserializeJson(String src) throws IOException {
        return new ObjectMapper().readValue((new File(src)), MovieLibrary.class);
    }
}

package chapter7.chapter7_11;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonFileData {
    public HeroData hero;
}

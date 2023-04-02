package lesson_10.tests;

import java.util.List;

public class Desktop {

    public String name;
    public List<String> specifics;
    public String operatingSystem;
    public String storageMemory;
    public String ramMemory;
    public String CPUModel;
    public int screenSize;
    public Screen screen;

    public static class Screen{
        public String name;
        public String ScreenSize;
        public String Brand;
    }
}

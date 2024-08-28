package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GameConfiguration {
    public static int maxHealth;
    public static int maxMagic;
    public static Map<String, String> resources = new HashMap<>();

    static {
        maxHealth = 1000;
        maxMagic = 1000;

        // Load essential resources. Examples:
        resources.put("backgroundMusic", "path/to/background_music.mp3");
        resources.put("menuBackground", "path/to/menu_background.png");

        System.out.println("Game configurations loaded.");
    }

    public void loadGameConfig(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Config: " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the game configuration: " + e.getMessage());
        }
    }

    public static String getResourcePath(String key) {
        return resources.get(key);
    }
}

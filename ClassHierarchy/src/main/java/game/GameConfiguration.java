package game;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GameConfiguration {
    public static int maxHealth;
    public static int maxMagic;
    public static Map<String, String> resources = new HashMap<>();

    private static final Logger logger = LogManager.getLogger(GameConfiguration.class);

    static {
        maxHealth = 1000;
        maxMagic = 1000;

        // Load essential resources. Examples:
        resources.put("backgroundMusic", "path/to/background_music.mp3");
        resources.put("menuBackground", "path/to/menu_background.png");

        logger.info("Game configurations loaded.");
    }

    public void loadGameConfig(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logger.info("Config: " + line);
            }
        } catch (IOException e) {
            logger.error("An error occurred while reading the game configuration: " + e.getMessage());
        }
    }

    public static String getResourcePath(String key) {
        return resources.get(key);
    }
}

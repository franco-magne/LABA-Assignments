package combos;

import java.util.ArrayList;
import java.util.List;

public abstract class Combo {
    private String name;
    private List<String> buttonsCombo;
    private int level;

    public Combo(String name, int level) {
        this.name = name;
        this.buttonsCombo = new ArrayList<>();
        this.level = level;
    }

    public void addButtonCombo(String combo) {
        this.buttonsCombo.add(combo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getButtonsCombo() {
        return buttonsCombo;
    }

    public void setButtonsCombo(List<String> buttonsCombo) {
        this.buttonsCombo = buttonsCombo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

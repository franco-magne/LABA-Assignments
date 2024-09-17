package combos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class Combo {
    private String name;
    private List<ControllerButtons> buttonsCombo;
    private int level;

    public Combo(String name, int level) {
        this.name = name;
        this.buttonsCombo = new ArrayList<>();
        this.level = level;
    }

    public boolean comboHasThisButton(ControllerButtons passedButton) {
        return this.buttonsCombo.stream()
                .anyMatch(button -> button == passedButton);
    }

    public List<String> stringListOfComboButtonsCombination() {
        return buttonsCombo.stream()
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

    public boolean comboIsLargerThan(int sizeOfButtons) {
        Predicate<Integer> comboCombinationLength = a -> buttonsCombo.size() > a;

        return  comboCombinationLength.test(sizeOfButtons);
    }

    public String levelThisComboIsUnblocked(int currentLevel) {
        ComboLevelInformer<Integer, String> combo = (Integer a) -> "The " + name + " is a level " + level + " combo";

        return combo.inform(currentLevel);
    }

    public void addButtonCombo(ControllerButtons combo) {
        this.buttonsCombo.add(combo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ControllerButtons> getButtonsCombo() {
        return buttonsCombo;
    }

    public void setButtonsCombo(List<ControllerButtons> buttonsCombo) {
        this.buttonsCombo = buttonsCombo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

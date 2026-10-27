interface Button {
    void show();
}

interface TextBox {
    void show();
}

class LightButton implements Button {
    public void show() { System.out.println("Light Button shown"); }
}

class LightTextBox implements TextBox {
    public void show() { System.out.println("Light TextBox shown"); }
}

class DarkButton implements Button {
    public void show() { System.out.println("Dark Button shown"); }
}

class DarkTextBox implements TextBox {
    public void show() { System.out.println("Dark TextBox shown"); }
}

interface ThemeFactory {
    Button createButton();
    TextBox createTextBox();
}

class LightThemeFactory implements ThemeFactory {
    public Button createButton() { return new LightButton(); }
    public TextBox createTextBox() { return new LightTextBox(); }
}

class DarkThemeFactory implements ThemeFactory {
    public Button createButton() { return new DarkButton(); }
    public TextBox createTextBox() { return new DarkTextBox(); }
}

public class lab8_3 {
    public static void main(String[] args) {
        String theme = "Dark";
        ThemeFactory factory;

        if (theme.equalsIgnoreCase("Light")) {
            factory = new LightThemeFactory();
        } else {
            factory = new DarkThemeFactory();
        }

        System.out.println("Selected theme: " + theme);
        TextBox textBox = factory.createTextBox();
        Button button = factory.createButton();
        textBox.show();
        button.show();
    }
}

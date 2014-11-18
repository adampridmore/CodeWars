import java.util.Random;

public class Ghost {
    private final String color;

    public Ghost() {
        color = generateRandomColor();
    }

    private static String generateRandomColor() {
        String[] colors = {"white", "yellow", "red", "purple"};

        return colors[new Random().nextInt(colors.length)];
    }

    public String getColor() {
        return color;
    }
}
package Controller;

import java.awt.Color;

/**
 * A class to get the Color value from a string color name
 */
public class MyColor {
    private Color color;

    public MyColor(){
        color = Color.WHITE;
    }
    /**
     * Get the color from a string name
     *
     * @param col name of the color
     * @return White if no color is given, otherwise the Color object
     */
    public Color getColor(String col) {
        switch (col.toLowerCase()) {
            case "black" -> color = Color.BLACK;
            case "blue" -> color = Color.BLUE;
            case "cyan" -> color = Color.CYAN;
            case "darkgray" -> color = Color.DARK_GRAY;
            case "gray" -> color = Color.GRAY;
            case "green" -> color = Color.GREEN;
            case "yellow" -> color = Color.YELLOW;
            case "aqua" -> color = new Color(51,204,255);
            case "magenta" -> color = Color.MAGENTA;
            case "orange" -> color = Color.ORANGE;
            case "purple" -> color = new Color(102,0,153);
            case "red" -> color = Color.RED;
            case "white" -> color = Color.WHITE;
        }
        return color;
    }
}
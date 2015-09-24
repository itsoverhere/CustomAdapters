package edu.mobidev.customadapters;

/**
 * Created by ngoc on 9/24/2015.
 */
public class Superhero {
    private String name;
    private int icon;
    private String description;

    public Superhero(){}

    public Superhero(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public Superhero(String name, int icon, String description) {
        this.name = name;
        this.icon = icon;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdomsandglory.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author reeve
 */
public class GridScene implements Serializable{
    

    /*    Visum("Visum", "A bright and Beatiful town. Once the original City of the king.", new Point(1, 2)),
    Genus("Genus", "A bright and Beatiful town. Once the original City of the king.", new Point(1, 4)),
    Pacem("Pacem", "A bright and Beatiful town. Once the original City of the king.", new Point(3, 1)),
    Felicitatem("Felicitatem", "A bright and Beatiful town. Once the original City of the king.", new Point(3, 3)),
    Pulchram("Pulchram", "A bright and Beatiful town. Once the original City of the king.", new Point(3, 5)),
    Zenobia("Zenobia", "The Capital of the Kingdom and Starting point.", new Point(5, 3)),
    ForestA("Forest", "A thick wooded area with possiblity of wood but may contain misfortunes", new Point(1, 1)),
    ForestB("Forest", "A thick wooded area with possiblity of wood but may contain misfortunes", new Point(5, 1)),
    ForestC("Forest", "A thick wooded area with possiblity of wood but may contain misfortunes", new Point(2, 3)),
    ForestD("Forest", "A thick wooded area with possiblity of wood but may contain misfortunes", new Point(4, 4)),
    ForestF("Forest", "A thick wooded area with possiblity of wood but may contain misfortunes", new Point(4, 5)),
    ForestE("Forest", "A thick wooded area with possiblity of wood but may contain misfortunes", new Point(4, 3)),
    MillA("Mill", "You've stumbled across a cotton mill, you have the chance of getting cotton", new Point(2, 1)),
    MillB("Mill", "You've stumbled across a cotton mill, you have the chance of getting cotton", new Point(4, 2)),
    MillC("Mill", "You've stumbled across a cotton mill, you have the chance of getting cotton", new Point(3, 4)),
    MillD("Mill", "You've stumbled across a cotton mill, you have the chance of getting cotton", new Point(5, 5)),
    MillE("Mill", "You've stumbled across a cotton mill, you have the chance of getting cotton", new Point(1, 5)),
    MountainA("Mountain", "You're hiking a Mountain Range! There may be some Stone around you.", new Point(5, 1)),
    MountainB("Mountain", "You're hiking a Mountain Range! There may be some Stone around you.", new Point(3, 2)),
    MountainC("Mountain", "You're hiking a Mountain Range! There may be some Stone around you.", new Point(1, 3)),
    MountainD("Mountain", "You're hiking a Mountain Range! There may be some Stone around you.", new Point(2, 4)),
    MineA("Mine", "You've fallen into a Mine! Oh No! But, while you are down here look for Metal.", new Point(4, 1)),
    MineB("Mine", "You've fallen into a Mine! Oh No! But, while you are down here look for Metal.", new Point(2, 2)),
    MineC("Mine", "You've fallen into a Mine! Oh No! But, while you are down here look for Metal.", new Point(5, 4)),
    MineD("Mine", "You've fallen into a Mine! Oh No! But, while you are down here look for Metal.", new Point(2, 5));*/
    

    
    public String name;
    public String description;
    public Point coordinates;
    
    public GridScene() {
        this.name = "";
        this.description = "";
        this.coordinates = null;
    }

    GridScene(String name, String description, Point coordinates){
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
    }   

    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "GridScene{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.coordinates);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GridScene other = (GridScene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }
    
    
}


import java.util.*;
/**
 *This class contains information about subdivision
 */
public class Subdivision {

    private int ID;
    private String name;

    /**
     * Constructor
     */
    public Subdivision(int id, String n) {
        ID = id;
        name = n;
    }

    /**
     * Get-method for ID
     * @return ID
     */
    public int getID() {
        return ID;
    }
    /**
     * Get-method for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Function for printing structure
     * @return string storing all the elements of the structure
     */
    @Override
    public String toString() {
        return this.getID() + " " + this.getName() ;
    }
    /**
     * A method for comparing two objects. Is overridden.
     *
     * @param o The object to be compared with the current object.
     * @return True if they are equal, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Subdivision division = (Subdivision)o;
            return this.ID == division.ID && Objects.equals(this.name, division.name);
        } else {
            return false;
        }
    }
    /**
     * ListTest the hash code of this object.
     * @return Hash code in integer.
     */
    @Override
    public int hashCode() {
        return this.name.length();
    }
}
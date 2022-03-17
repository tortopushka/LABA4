import java.util.*;

/**
 * this class contains information obout person
 *
 */

public class Person {
    private String name;
    private String gender;
    private Subdivision subdivision;
    private String ID;
    private String birthDate;
    private String salary;

    /**
     * Constructor with parameters
     */
    public Person(String id, String n, String g, String ns, int ids, String bd, String s) {
        ID = id;
        name = n;
        gender = g;
        subdivision = new Subdivision(ids, ns);
        birthDate = bd;
        salary = s;
    }

    /**
     * Getter for ID
     * @return ID
     */
    public String getID() {
        return ID;
    }
    /**
     * Getter for name
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Getter for gender
     * @return gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * Getter for Subdivision ID
     * @return Subdivision ID
     */
    public int getSubdivisionID() {
        return subdivision.getID();
    }
    /**
     * Getter for Subdivision name
     * @return Subdivision name
     */
    public String getSubdivisionName() {
        return subdivision.getName();
    }
    /**
     * Getter for birthDate
     * @return birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }
    /**
     * Getter for salary
     * @return salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * Function for printing structure
     * @return string storing all the elements of the structure
     */
    @Override
    public String toString() {
        return this.getID() + " " + this.getName() + " " + this.getGender() + " " + this.getBirthDate() + " " +
                this.getSubdivisionID() + " " + this.getSubdivisionName() + " " + this.getSalary();
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
            Person human = (Person) o;
            return this.ID == human.ID && this.salary == human.salary && Objects.equals(this.name, human.name) && Objects.equals(this.gender, human.gender) && Objects.equals(this.birthDate, human.birthDate);
        } else {
            return false;
        }
    }
    /**
     * The hash code of this object.
     *
     * @return Hash code in integer.
     */
    @Override
    public int hashCode() {
        return this.ID.length() + this.name.length() + this.gender.length();
    }

}
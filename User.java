import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    // Encapsulation
    public String getName() {
        return name;
    }

    // Added setName (Good practice)
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // Birthday Logic
    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == this.dob.getMonth() &&
                today.getDayOfMonth() == this.dob.getDayOfMonth();
    }

    public void displayHappyBirthday() {
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        }
    }


    // Base displayInfo (No arguments)
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + dob);
    }
}
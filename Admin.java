import java.time.LocalDate;

public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin.");
    }
    @Override
    public void displayHappyBirthday() {
        super.displayHappyBirthday();
        System.out.println("User type: admin.");
    }

    public void displayHappyBirthday(boolean full) {
        if (full) {
            LocalDate today = LocalDate.now();
            int age = LocalDate.now().getYear() - this.dob.getYear();
            if (isBirthday()) {
                System.out.println("\ndisplayHappyBirthday(true):");
                System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
            }
        }
        else {
            if(isBirthday()) {
                System.out.println("\ndisplayHappyBirthday(false):");
                System.out.println("Happy birthday " + this.name + "!");
            }
        }
    }

    public void displayInfo(boolean full) {
        if (full) {
            System.out.println("\ndisplayInfo(true):");
            this.displayInfo();
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println("\ndisplayInfo(false):");
            System.out.println("Name: " + this.getName());
        }
    }

}
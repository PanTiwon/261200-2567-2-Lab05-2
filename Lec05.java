public class Lec05 {
    public static void main(String[] args) {
//        User user1 = new User();
//        user1.displayInfo();
//
//        User user2 = new User("Sylvester", 1946, 7, 6);
//        user2.displayInfo();
//
//        User John = new User("John", 1954, 2, 18);
//        John.displayInfo();

        Admin nicolas = new Admin("Nicolas", 1964, 1, 9);
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
        nicolas.displayHappyBirthday(true);
        nicolas.displayHappyBirthday(false);
    }
}

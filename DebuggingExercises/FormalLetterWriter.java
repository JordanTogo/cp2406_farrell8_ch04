public class FormalLetterWriter {
    public static void main(String[] args) {

        displaySalutation("James");
        displayMessage();
        displaySalutation("Jesse", "James ");
        displayMessage();
    }
    public static void displaySalutation(String lName){
        System.out.println("Dear Mr or Mrs " + lName);
    }
    public static void displaySalutation(String fName, String lName){
        System.out.printf("Dear %s %s\n", fName, lName);
    }
    public static void displayMessage(){
        System.out.println("Thank you for your recent order");
    }
}

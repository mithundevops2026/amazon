public class AboutMe {
    public static void main(String[] args) {
        
        String name = "Rakesh";
        String city = "Bhubaneswar";
        String skill = "Learning Java and Shell Scripting";

        // Loop to print details 5 times
        for (int i = 1; i <= 5; i++) {
            System.out.println("---- About Me (" + i + ") ----");
            System.out.println("My name is: " + name);
            System.out.println("I live in: " + city);
            System.out.println("I am: " + skill);
            System.out.println();
        }
    }
}

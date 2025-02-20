public class Main {
    public static void main(String[] args) {
        Methods.getRequirements();
        int seconds = Methods.validateInput();
        Methods.convertSeconds(seconds);
    }
}

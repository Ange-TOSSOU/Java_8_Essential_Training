package throw_catch_exception;

public class DealWithException {

    public static final String ERROR_MESSAGE = "The value of barks must be greater than 0.";

    static String getDogSound(int barks) {
        Dog dog = new Dog();

        StringBuilder soundBuilder = new StringBuilder();
        try {

            if (barks < 1) {
                throw (new Exception(ERROR_MESSAGE));
            }

            for (int i = 0; i < barks; i++) {
                soundBuilder.append(dog.bark()).append(" ");
            }

        } catch (Exception e) {
            soundBuilder.append(e.getMessage());
        }

        return soundBuilder.toString().trim();
    }

}

class Dog {
    String bark() {
        return "Woof!";
    }
}

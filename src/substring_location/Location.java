package substring_location;

public class Location {

    static int getLocation(String message, String substring) {

        return message.indexOf(substring) + 1;

    }

}

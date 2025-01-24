import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("matthew", "matt");
        names.put("micheal", "mix");
        names.put("arthur", "artie");

        System.out.println("matthew's nickname is " + names.get("matthew"));


    }

}

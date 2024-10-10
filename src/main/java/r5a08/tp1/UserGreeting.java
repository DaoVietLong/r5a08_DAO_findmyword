package r5a08.tp1;

public class UserGreeting {

    public String formatGreeting(String nom) throws UserGreetingFailureException{
        if (nom.isEmpty()){
            throw new UserGreetingFailureException("name cannot be empty");
        }
        if (nom.length() > 10) {
            throw new UserGreetingFailureException("name too long");
        }
        if (!nom.matches("[a-zA-Z]+")) {
            throw new UserGreetingFailureException("name contains illegal characters");
        }
        return ("Bonjour, " + nom);
    }
}

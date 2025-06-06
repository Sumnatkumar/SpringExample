package coupling;

// A - MySQL, PostgresSQL
// B - Web Service, MongoDB


public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        // Directly access database her
        return "User Details From Database";
    }
}

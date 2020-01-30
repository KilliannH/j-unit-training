package example;

public class FirstName {

    protected String firstName;
    protected Boolean isFirstName;

    public FirstName(String firstName) {
        if(!firstName.equals("")) {
            isFirstName = true;
        } else {
            isFirstName = false;
        }
        this.firstName = firstName;
    }

    public String get() {
        if(firstName.equals("")) {
            return null;
        } else {
            return firstName;
        }
    }

    public void set(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getIsFirstName() {
        return this.isFirstName;
    }
}

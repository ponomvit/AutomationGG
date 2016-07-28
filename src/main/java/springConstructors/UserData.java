package springConstructors;

/**
 * Created by vitaliypo on 7/20/2016.
 */
public class UserData {

    private String title;
    private String gender;
    private String firstName;
    private int postCode;

    public String getTitle(){
        return title;
    }

    public String getGender(){
        return gender;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getPostCode(){
        return postCode;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }
}

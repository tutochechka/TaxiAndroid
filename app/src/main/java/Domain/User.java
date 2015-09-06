package Domain;





import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Sveta on 8/28/2015.
 */
@DatabaseTable(tableName = "users")
public class User {
    @DatabaseField(generatedId=true)
    private Long UserId;
    @DatabaseField
    private String userName;
    @DatabaseField
    private String email;
    @DatabaseField
    private String password;
    @DatabaseField
    private Integer pfoneNum;
    @DatabaseField
    private Boolean isValid;
    @DatabaseField
    private String role;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, String password, Integer pfoneNum, Boolean isValid, String role) {


        this.userName = name;
        this.email = email;
        this.password = password;
        this.pfoneNum = pfoneNum;
        this.isValid = isValid;
        this.role = role;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPfoneNum() {
        return pfoneNum;
    }

    public void setPfoneNum(Integer pfoneNum) {
        this.pfoneNum = pfoneNum;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

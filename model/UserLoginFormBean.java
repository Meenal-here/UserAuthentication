package model;

public class UserLoginFormBean {
    
    private String userName;
    private String email;
    private long contactName;    
    private String gender;
    private String securityKey;
    private String securityAnswer;
    private String password;
    private String roletype;
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
    public long getContactName() {
        return contactName;
    }
    public void setContactName(long contactName) {
        this.contactName = contactName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getSecurityKey() {
        return securityKey;
    }
    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }
    public String getSecurityAnswer() {
        return securityAnswer;
    }
    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRoletype() {
        return roletype;
    }
    public void setRoletype(String roletype) {
        this.roletype = roletype;
    } 
}

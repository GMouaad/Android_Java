package mgsair.myplanner;

public class GroupMember {

    private String mName;
    private int id;
    private String email;

    public GroupMember(String Name)
    {
        this.mName = Name;
    }

    public String getmName() {
        return mName;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

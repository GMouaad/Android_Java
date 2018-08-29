package mgsair.myplanner;

import java.util.ArrayList;

public class Group {

    private String mName;
    private ArrayList<GroupMember> mGroupMembers;

    public Group(String Name)
    {
        this.mName = Name;
        this.mGroupMembers = new ArrayList<GroupMember>();
    }

    public String getmName() {
        return mName;
    }

    public ArrayList<GroupMember> getmGroupMembers() {
        return mGroupMembers;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmGroupMembers(ArrayList<GroupMember> mGroupMembers) {
        this.mGroupMembers = mGroupMembers;
    }
    public void addmGroupMember(GroupMember Member)
    {
        this.mGroupMembers.add(Member);
    }
}

package mgsair.myplanner;

import java.util.Date;

public class Event
{
    private Date mAlarm;
    private String mName;
    private Priority mPrio;
    private String mStatus;
    private String mNote;
    private boolean mDailyRepeat;
    private boolean mWeeklyRepeat;
    private boolean mMonthlyRepeat;
    private boolean mYearlyRepeat;

    public Event(String name)
    {
        this.mName = name;
        this.mDailyRepeat = false;
        this.mWeeklyRepeat = false;
        this.mMonthlyRepeat = false;
        this.mYearlyRepeat = false;
    }

    public Date getmAlarm() {
        return mAlarm;
    }

    public String getmName() {
        return mName;
    }

    public String getmNote() {
        return mNote;
    }

    public Priority getmPrio() {
        return mPrio;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmAlarm(Date mAlarm) {
        this.mAlarm = mAlarm;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmPriority(String mPriority) {
        this.mPrio = Priority.valueOf(mPriority);
    }

    public void setmNote(String mNote) {
        this.mNote = mNote;
    }

    public void setmDailyRepeat(boolean mDailyRepeat) {
        this.mDailyRepeat = mDailyRepeat;
    }

    public void setmWeeklyRepeat(boolean mWeeklyRepeat) {
        this.mWeeklyRepeat = mWeeklyRepeat;
    }

    public void setmMonthlyRepeat(boolean mMonthlyRepeat) {
        this.mMonthlyRepeat = mMonthlyRepeat;
    }

    public void setmYearlyRepeat(boolean mYearlyRepeat) {
        this.mYearlyRepeat = mYearlyRepeat;
    }
}



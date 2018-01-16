package com.tj.wordgames;

/**
 * Created by tjdav on 1/15/2018.
 * Creates object to store TTS speech text and other data
 */

public class TtsItem {

    private String mTitle;
    private String mDescription;
    private int mSex;
    private int mLocale;

    // Empty Constructor
    public TtsItem(){}

    public TtsItem (String title, String description, int sex, int locale){
        mTitle = title;
        mDescription = description;
        mSex = sex;
        mLocale = locale;
    }

    // Getters and Setters
    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getmSex() {
        return mSex;
    }

    public void setmSex(int mSex) {
        this.mSex = mSex;
    }

    public int getmLocale() {
        return mLocale;
    }

    public void setmLocale(int mLocale) {
        this.mLocale = mLocale;
    }
}

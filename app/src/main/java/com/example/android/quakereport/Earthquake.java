package com.example.android.quakereport;

public class Earthquake {

    private String mLocationOffset;

    private String mPrimaryLocation;

    private String mMagnitude;

    private String mTime;

    /*
    Create  a new word object.
    @parem defaultTranslation is the word in a language that the user is already familiar with
     */
    public Earthquake(String magnitude, String locationOffset, String primaryLocation, String time) {
        mMagnitude = magnitude;
        mLocationOffset = locationOffset;
        mPrimaryLocation = primaryLocation;
        mTime = time;
    }

    public String getLocationOffset() {
        return mLocationOffset;
    }

    public String getPrimaryLocation() {
        return mPrimaryLocation;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getDate() {
        return mTime;
    }
}

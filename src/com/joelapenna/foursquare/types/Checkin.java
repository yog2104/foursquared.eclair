/**
 * Copyright 2009 Joe LaPenna
 */

package com.joelapenna.foursquare.types;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Joe LaPenna (joe@joelapenna.com)
 */
public class Checkin implements FoursquareType, Parcelable {

    private String mAddress;
    private String mAlert;
    private String mAliasid;
    private String mCheckinid;
    private String mCityName;
    private String mCityid;
    private String mCrossstreet;
    private boolean mDballDefault;
    private String mEmail;
    private String mFirstname;
    private String mGender;
    private String mGeolat;
    private String mGeolong;
    private String mLastname;
    private String mMessage;
    private String mPhone;
    private String mPhoto;
    private String mRelativeTime;
    private String mShout;
    private boolean mShowDball;
    private boolean mShowTwitter;
    private String mStats;
    private boolean mStatus;
    private boolean mTwitterDefault;
    private String mUrl;
    private String mUserid;
    private String mVenueid;
    private String mVenuename;
    private String mXdatetime;

    public Checkin() {
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getAlert() {
        return mAlert;
    }

    public void setAlert(String alert) {
        mAlert = alert;
    }

    public String getAliasid() {
        return mAliasid;
    }

    public void setAliasid(String aliasid) {
        mAliasid = aliasid;
    }

    public String getCheckinid() {
        return mCheckinid;
    }

    public void setCheckinid(String checkinid) {
        mCheckinid = checkinid;
    }

    public String getCityName() {
        return mCityName;
    }

    public void setCityName(String cityName) {
        mCityName = cityName;
    }

    public String getCityid() {
        return mCityid;
    }

    public void setCityid(String cityid) {
        mCityid = cityid;
    }

    public String getCrossstreet() {
        return mCrossstreet;
    }

    public void setCrossstreet(String crossstreet) {
        mCrossstreet = crossstreet;
    }

    public boolean dballDefault() {
        return mDballDefault;
    }

    public void setDballDefault(boolean dballDefault) {
        mDballDefault = dballDefault;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getFirstname() {
        return mFirstname;
    }

    public void setFirstname(String firstname) {
        mFirstname = firstname;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public String getGeolat() {
        return mGeolat;
    }

    public void setGeolat(String geolat) {
        mGeolat = geolat;
    }

    public String getGeolong() {
        return mGeolong;
    }

    public void setGeolong(String geolong) {
        mGeolong = geolong;
    }

    public String getLastname() {
        return mLastname;
    }

    public void setLastname(String lastname) {
        mLastname = lastname;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getPhoto() {
        return mPhoto;
    }

    public void setPhoto(String photo) {
        mPhoto = photo;
    }

    public String getRelativeTime() {
        return mRelativeTime;
    }

    public void setRelativeTime(String relativeTime) {
        mRelativeTime = relativeTime;
    }

    public String getShout() {
        return mShout;
    }

    public void setShout(String shout) {
        mShout = shout;
    }

    public boolean showDball() {
        return mShowDball;
    }

    public void setShowDball(boolean showDball) {
        mShowDball = showDball;
    }

    public boolean showTwitter() {
        return mShowTwitter;
    }

    public void setShowTwitter(boolean showTwitter) {
        mShowTwitter = showTwitter;
    }

    public String getStats() {
        return mStats;
    }

    public void setStats(String stats) {
        mStats = stats;
    }

    public boolean status() {
        return mStatus;
    }

    public void setStatus(boolean status) {
        mStatus = status;
    }

    public boolean twitterDefault() {
        return mTwitterDefault;
    }

    public void setTwitterDefault(boolean twitterDefault) {
        mTwitterDefault = twitterDefault;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getUserid() {
        return mUserid;
    }

    public void setUserid(String userid) {
        mUserid = userid;
    }

    public String getVenueid() {
        return mVenueid;
    }

    public void setVenueid(String venueid) {
        mVenueid = venueid;
    }

    public String getVenuename() {
        return mVenuename;
    }

    public void setVenuename(String venuename) {
        mVenuename = venuename;
    }

    public String getXdatetime() {
        return mXdatetime;
    }

    public void setXdatetime(String xdatetime) {
        mXdatetime = xdatetime;
    }

    /* For Parcelable */

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        boolean[] booleanArray = {
                mDballDefault, mShowDball, mShowTwitter, mStatus, mTwitterDefault,
        };
        dest.writeBooleanArray(booleanArray);
        dest.writeString(this.mAddress);
        dest.writeString(this.mAlert);
        dest.writeString(this.mAliasid);
        dest.writeString(this.mCheckinid);
        dest.writeString(this.mCityName);
        dest.writeString(this.mCityid);
        dest.writeString(this.mCrossstreet);
        dest.writeString(this.mEmail);
        dest.writeString(this.mFirstname);
        dest.writeString(this.mGender);
        dest.writeString(this.mGeolat);
        dest.writeString(this.mGeolong);
        dest.writeString(this.mLastname);
        dest.writeString(this.mMessage);
        dest.writeString(this.mPhone);
        dest.writeString(this.mPhoto);
        dest.writeString(this.mRelativeTime);
        dest.writeString(this.mShout);
        dest.writeString(this.mStats);
        dest.writeString(this.mUrl);
        dest.writeString(this.mUserid);
        dest.writeString(this.mVenueid);
        dest.writeString(this.mVenuename);
        dest.writeString(this.mXdatetime);
    }

    private void readFromParcel(Parcel source) {
        boolean[] booleanArray = new boolean[5];
        source.readBooleanArray(booleanArray);
        this.mDballDefault = booleanArray[0];
        this.mShowDball = booleanArray[1];
        this.mShowTwitter = booleanArray[2];
        this.mStatus = booleanArray[3];
        this.mTwitterDefault = booleanArray[4];
        this.mAddress = source.readString();
        this.mAlert = source.readString();
        this.mAliasid = source.readString();
        this.mCheckinid = source.readString();
        this.mCityName = source.readString();
        this.mCityid = source.readString();
        this.mCrossstreet = source.readString();
        this.mEmail = source.readString();
        this.mFirstname = source.readString();
        this.mGender = source.readString();
        this.mGeolat = source.readString();
        this.mGeolong = source.readString();
        this.mLastname = source.readString();
        this.mMessage = source.readString();
        this.mPhone = source.readString();
        this.mPhoto = source.readString();
        this.mRelativeTime = source.readString();
        this.mShout = source.readString();
        this.mStats = source.readString();
        this.mUrl = source.readString();
        this.mUserid = source.readString();
        this.mVenueid = source.readString();
        this.mVenuename = source.readString();
        this.mXdatetime = source.readString();
    }

    public static final Parcelable.Creator<Checkin> CREATOR = new Parcelable.Creator<Checkin>() {

        @Override
        public Checkin createFromParcel(Parcel source) {
            Checkin instance = new Checkin();
            instance.readFromParcel(source);
            return instance;
        }

        @Override
        public Checkin[] newArray(int size) {
            return new Checkin[size];
        }

    };

}
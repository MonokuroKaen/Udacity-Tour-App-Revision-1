package com.example.android.tourappv5;

public  class Site {

    private final String placeName;

    private final String placeAddress;

    private final String placePhoneNumber;

    private final String placeHours;

    private final int imageResourceId;


    Site(String placeName, String placeAddress, String placePhoneNumber,String placeHours, int imageResourceId){
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.placePhoneNumber = placePhoneNumber;
        this.placeHours = placeHours;
        this.imageResourceId = imageResourceId;

    }


    String getPlaceName(){
        return placeName;
    }

    String getPlaceAddress(){
        return placeAddress;
    }

    String getPlacePhoneNumber(){
        return placePhoneNumber;
    }

    String  getPlaceHours(){
        return placeHours;
    }

    int getImageResourceId(){
        return imageResourceId;
    }
}
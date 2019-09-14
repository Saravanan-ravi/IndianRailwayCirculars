package com.example.indianrailwaycirculars;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



@Retention(RetentionPolicy.SOURCE)
@StringDef({
        PreferenceKey.FAVOURITE_CONTENT_LIST,
})



public @interface PreferenceKey {
    String FAVOURITE_CONTENT_LIST = "FAVOURITE_CONTENT_LIST";
}
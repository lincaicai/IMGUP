package com.prongbang.convert;

import android.util.Base64;

/**
 * Created by prongbang on 9/9/2015.
 */
public class ImageManipulation {

    public static String encodeImage(byte[] imageByteArray) {
        return Base64.encodeToString(imageByteArray, Base64.DEFAULT);
    }

    public static byte[] decodeImage(String imageDataString) {
        return Base64.decode(imageDataString, Base64.DEFAULT);
    }
}

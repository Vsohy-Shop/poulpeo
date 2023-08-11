package com.appboy.enums;

import p057d0.C7213c;

public enum SdkFlavor implements C7213c<String> {
    UNITY("unity"),
    REACT("react"),
    CORDOVA("cordova"),
    XAMARIN("xamarin"),
    FLUTTER("flutter"),
    SEGMENT("segment"),
    TEALIUM("tealium"),
    MPARTICLE("mparticle");
    
    private final String jsonKey;

    private SdkFlavor(String str) {
        this.jsonKey = str;
    }

    public String forJsonPut() {
        return this.jsonKey;
    }
}

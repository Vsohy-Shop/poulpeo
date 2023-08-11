package com.rmn.api.p322v2.poulpeo.model;

/* renamed from: com.rmn.api.v2.poulpeo.model.UserSuggestSource */
public enum UserSuggestSource {
    COMMENT("comment"),
    REVIEW("review");
    
    private final String label;

    private UserSuggestSource(String str) {
        this.label = str;
    }

    public String toString() {
        return this.label;
    }
}

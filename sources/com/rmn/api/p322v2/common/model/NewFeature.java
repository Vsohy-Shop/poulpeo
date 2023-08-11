package com.rmn.api.p322v2.common.model;

/* renamed from: com.rmn.api.v2.common.model.NewFeature */
public class NewFeature {
    private String description;
    private String imageName;
    private String title;

    public NewFeature(String str, String str2, String str3) {
        this.title = str;
        this.description = str2;
        this.imageName = str3;
    }

    public String getDescription() {
        return this.description;
    }

    public String getImageName() {
        return this.imageName;
    }

    public String getTitle() {
        return this.title;
    }
}

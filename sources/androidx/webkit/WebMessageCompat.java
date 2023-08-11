package androidx.webkit;

import androidx.annotation.Nullable;

public class WebMessageCompat {
    private String mData;
    private WebMessagePortCompat[] mPorts;

    public WebMessageCompat(@Nullable String str) {
        this.mData = str;
    }

    @Nullable
    public String getData() {
        return this.mData;
    }

    @Nullable
    public WebMessagePortCompat[] getPorts() {
        return this.mPorts;
    }

    public WebMessageCompat(@Nullable String str, @Nullable WebMessagePortCompat[] webMessagePortCompatArr) {
        this.mData = str;
        this.mPorts = webMessagePortCompatArr;
    }
}

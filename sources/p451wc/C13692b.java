package p451wc;

import android.text.TextUtils;

/* renamed from: wc.b */
/* compiled from: OpenDataKey */
public enum C13692b {
    VERSION("version"),
    CLIENT_ID("client_id"),
    USER_AGENT("user_agent"),
    CLICK_PAGE("clickPage"),
    USER_ID("uid"),
    DEVICE_ID("fp"),
    OFFER_NAME("offer_name"),
    VIEWPORT("viewport"),
    IDENTIFIER_FOR_VENDOR("idfv"),
    CAMPAIGN_INTERNAL_ID("campaign.internal.id"),
    CAMPAIGN_INTERNAL_MEDIUM("campaign.internal.medium"),
    CAMPAIGN_INTERNAL_SOURCE("campaign.internal.source"),
    CAMPAIGN_INTERNAL_NAME("campaign.internal.name"),
    CAMPAIGN_INTERNAL_LOCATION("campaign.internal.location"),
    CAMPAIGN_INTERNAL_LOCATION_ID("campaign.internal.location_id"),
    APPLICATION_VERSION("application.version"),
    APPLICATION_ADVERTISER_ID("application.advertiser_id"),
    GOOGLE_UTM_SOURCE("google.utmcsr"),
    GOOGLE_UTM_MEDIUM("google.utmcmd"),
    GOOGLE_UTM_CAMPAIGN("google.utmccn");
    

    /* renamed from: b */
    private String f22057b;

    /* renamed from: c */
    private String[] f22058c;

    /* renamed from: d */
    private String f22059d;

    private C13692b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f22057b = str;
            String[] split = str.split("\\.");
            String[] strArr = new String[(split.length - 1)];
            this.f22058c = strArr;
            System.arraycopy(split, 0, strArr, 0, strArr.length);
            this.f22059d = split[split.length - 1];
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public String mo53355a() {
        return this.f22059d;
    }

    /* renamed from: b */
    public String[] mo53356b() {
        String[] strArr = this.f22058c;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        return strArr2;
    }

    public String toString() {
        return super.toString() + " [" + this.f22057b + "]";
    }
}

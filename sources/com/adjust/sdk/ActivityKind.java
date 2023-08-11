package com.adjust.sdk;

import androidx.core.app.NotificationCompat;
import androidx.core.p004os.EnvironmentCompat;

public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT;

    /* renamed from: com.adjust.sdk.ActivityKind$1 */
    static /* synthetic */ class C40931 {
        static final /* synthetic */ int[] $SwitchMap$com$adjust$sdk$ActivityKind = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.adjust.sdk.ActivityKind[] r0 = com.adjust.sdk.ActivityKind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$adjust$sdk$ActivityKind = r0
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.SESSION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x001d }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.EVENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.CLICK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.ATTRIBUTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x003e }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.INFO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.GDPR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.DISABLE_THIRD_PARTY_SHARING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.AD_REVENUE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x006c }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.SUBSCRIPTION     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.THIRD_PARTY_SHARING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$adjust$sdk$ActivityKind     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.MEASUREMENT_CONSENT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.ActivityKind.C40931.<clinit>():void");
        }
    }

    public static ActivityKind fromString(String str) {
        if ("session".equals(str)) {
            return SESSION;
        }
        if (NotificationCompat.CATEGORY_EVENT.equals(str)) {
            return EVENT;
        }
        if ("click".equals(str)) {
            return CLICK;
        }
        if ("attribution".equals(str)) {
            return ATTRIBUTION;
        }
        if ("info".equals(str)) {
            return INFO;
        }
        if ("gdpr".equals(str)) {
            return GDPR;
        }
        if ("disable_third_party_sharing".equals(str)) {
            return DISABLE_THIRD_PARTY_SHARING;
        }
        if ("ad_revenue".equals(str)) {
            return AD_REVENUE;
        }
        if ("subscription".equals(str)) {
            return SUBSCRIPTION;
        }
        if ("third_party_sharing".equals(str)) {
            return THIRD_PARTY_SHARING;
        }
        if ("measurement_consent".equals(str)) {
            return MEASUREMENT_CONSENT;
        }
        return UNKNOWN;
    }

    public String toString() {
        switch (C40931.$SwitchMap$com$adjust$sdk$ActivityKind[ordinal()]) {
            case 1:
                return "session";
            case 2:
                return NotificationCompat.CATEGORY_EVENT;
            case 3:
                return "click";
            case 4:
                return "attribution";
            case 5:
                return "info";
            case 6:
                return "gdpr";
            case 7:
                return "disable_third_party_sharing";
            case 8:
                return "ad_revenue";
            case 9:
                return "subscription";
            case 10:
                return "third_party_sharing";
            case 11:
                return "measurement_consent";
            default:
                return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }
}

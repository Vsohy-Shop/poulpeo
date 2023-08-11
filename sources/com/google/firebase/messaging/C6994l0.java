package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.l0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public class C6994l0 {
    @NonNull

    /* renamed from: a */
    private final Bundle f9327a;

    public C6994l0(@NonNull Bundle bundle) {
        if (bundle != null) {
            this.f9327a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: d */
    private static int m12353d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m12354s(String str) {
        if (str.startsWith("google.c.a.") || str.equals(TypedValues.TransitionType.S_FROM)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m12355t(@NonNull Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m12357v("gcm.n.e")))) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private static boolean m12356u(String str) {
        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private static String m12357v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m12358w(String str) {
        if (!this.f9327a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = m12357v(str);
            if (this.f9327a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m12359z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: a */
    public boolean mo39943a(@NonNull String str) {
        String p = mo39957p(str);
        if ("1".equals(p) || Boolean.parseBoolean(p)) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: b */
    public Integer mo39944b(@NonNull String str) {
        String p = mo39957p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            String z = m12359z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 38 + String.valueOf(p).length());
            sb.append("Couldn't parse value of ");
            sb.append(z);
            sb.append("(");
            sb.append(p);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public JSONArray mo39945c(@NonNull String str) {
        String p = mo39957p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            String z = m12359z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 50 + String.valueOf(p).length());
            sb.append("Malformed JSON for key ");
            sb.append(z);
            sb.append(": ");
            sb.append(p);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: e */
    public int[] mo39946e() {
        JSONArray c = mo39945c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = m12353d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String obj = c.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 58);
            sb.append("LightSettings is invalid: ");
            sb.append(obj);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (IllegalArgumentException e) {
            String obj2 = c.toString();
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(obj2.length() + 60 + String.valueOf(message).length());
            sb2.append("LightSettings is invalid: ");
            sb2.append(obj2);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    public Uri mo39947f() {
        String p = mo39957p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = mo39957p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    @Nullable
    /* renamed from: g */
    public Object[] mo39948g(@NonNull String str) {
        JSONArray c = mo39945c(String.valueOf(str).concat("_loc_args"));
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    @Nullable
    /* renamed from: h */
    public String mo39949h(@NonNull String str) {
        return mo39957p(String.valueOf(str).concat("_loc_key"));
    }

    @Nullable
    /* renamed from: i */
    public String mo39950i(@NonNull Resources resources, @NonNull String str, @NonNull String str2) {
        String h = mo39949h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, TypedValues.Custom.S_STRING, str);
        if (identifier == 0) {
            String z = m12359z(String.valueOf(str2).concat("_loc_key"));
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 49 + String.valueOf(str2).length());
            sb.append(z);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        Object[] g = mo39948g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException e) {
            String z2 = m12359z(str2);
            String arrays = Arrays.toString(g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(z2).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(z2);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e);
            return null;
        }
    }

    @NonNull
    /* renamed from: j */
    public Long mo39951j(@NonNull String str) {
        String p = mo39957p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            String z = m12359z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 38 + String.valueOf(p).length());
            sb.append("Couldn't parse value of ");
            sb.append(z);
            sb.append("(");
            sb.append(p);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    @NonNull
    /* renamed from: k */
    public String mo39952k() {
        return mo39957p("gcm.n.android_channel_id");
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: l */
    public Integer mo39953l() {
        Integer b = mo39944b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        String obj = b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 67);
        sb.append("notificationCount is invalid: ");
        sb.append(obj);
        sb.append(". Skipping setting notificationCount.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: m */
    public Integer mo39954m() {
        Integer b = mo39944b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        String obj = b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 72);
        sb.append("notificationPriority is invalid ");
        sb.append(obj);
        sb.append(". Skipping setting notificationPriority.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }

    @NonNull
    /* renamed from: n */
    public String mo39955n(@NonNull Resources resources, @NonNull String str, @NonNull String str2) {
        String p = mo39957p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return mo39950i(resources, str, str2);
    }

    @Nullable
    /* renamed from: o */
    public String mo39956o() {
        String p = mo39957p("gcm.n.sound2");
        if (TextUtils.isEmpty(p)) {
            return mo39957p("gcm.n.sound");
        }
        return p;
    }

    @NonNull
    /* renamed from: p */
    public String mo39957p(@NonNull String str) {
        return this.f9327a.getString(m12358w(str));
    }

    @Nullable
    /* renamed from: q */
    public long[] mo39958q() {
        JSONArray c = mo39945c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String obj = c.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(obj);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo39959r() {
        Integer b = mo39944b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        String obj = b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 53);
        sb.append("visibility is invalid: ");
        sb.append(obj);
        sb.append(". Skipping setting visibility.");
        Log.w("NotificationParams", sb.toString());
        return null;
    }

    @NonNull
    /* renamed from: x */
    public Bundle mo39960x() {
        Bundle bundle = new Bundle(this.f9327a);
        for (String next : this.f9327a.keySet()) {
            if (!m12354s(next)) {
                bundle.remove(next);
            }
        }
        return bundle;
    }

    @NonNull
    /* renamed from: y */
    public Bundle mo39961y() {
        Bundle bundle = new Bundle(this.f9327a);
        for (String next : this.f9327a.keySet()) {
            if (m12356u(next)) {
                bundle.remove(next);
            }
        }
        return bundle;
    }
}

package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import java.util.regex.Pattern;
import p231t4.C9705n;

/* renamed from: com.google.firebase.messaging.b1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C6962b1 {

    /* renamed from: d */
    private static final Pattern f9247d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f9248a;

    /* renamed from: b */
    private final String f9249b;

    /* renamed from: c */
    private final String f9250c;

    private C6962b1(String str, String str2) {
        this.f9248a = m12226d(str2, str);
        this.f9249b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f9250c = sb.toString();
    }

    @Nullable
    /* renamed from: a */
    static C6962b1 m12225a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C6962b1(split[0], split[1]);
    }

    @NonNull
    /* renamed from: d */
    private static String m12226d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f9247d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    /* renamed from: f */
    public static C6962b1 m12227f(@NonNull String str) {
        return new C6962b1(ExifInterface.LATITUDE_SOUTH, str);
    }

    /* renamed from: g */
    public static C6962b1 m12228g(@NonNull String str) {
        return new C6962b1("U", str);
    }

    /* renamed from: b */
    public String mo39889b() {
        return this.f9249b;
    }

    /* renamed from: c */
    public String mo39890c() {
        return this.f9248a;
    }

    /* renamed from: e */
    public String mo39891e() {
        return this.f9250c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C6962b1)) {
            return false;
        }
        C6962b1 b1Var = (C6962b1) obj;
        if (!this.f9248a.equals(b1Var.f9248a) || !this.f9249b.equals(b1Var.f9249b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f9249b, this.f9248a);
    }
}

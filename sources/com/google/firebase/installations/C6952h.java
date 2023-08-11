package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p144k8.C8591d;
import p164m8.C8833a;
import p164m8.C8834b;

/* renamed from: com.google.firebase.installations.h */
/* compiled from: Utils */
public final class C6952h {

    /* renamed from: b */
    public static final long f9223b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f9224c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C6952h f9225d;

    /* renamed from: a */
    private final C8833a f9226a;

    private C6952h(C8833a aVar) {
        this.f9226a = aVar;
    }

    /* renamed from: c */
    public static C6952h m12169c() {
        return m12170d(C8834b.m17909b());
    }

    /* renamed from: d */
    public static C6952h m12170d(C8833a aVar) {
        if (f9225d == null) {
            f9225d = new C6952h(aVar);
        }
        return f9225d;
    }

    /* renamed from: g */
    static boolean m12171g(@Nullable String str) {
        return f9224c.matcher(str).matches();
    }

    /* renamed from: h */
    static boolean m12172h(@Nullable String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long mo39840a() {
        return this.f9226a.mo42968a();
    }

    /* renamed from: b */
    public long mo39841b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo39840a());
    }

    /* renamed from: e */
    public long mo39842e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo39843f(@NonNull C8591d dVar) {
        if (!TextUtils.isEmpty(dVar.mo42646b()) && dVar.mo42653h() + dVar.mo42647c() >= mo39841b() + f9223b) {
            return false;
        }
        return true;
    }
}

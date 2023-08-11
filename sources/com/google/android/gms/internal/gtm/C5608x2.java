package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.x2 */
final class C5608x2 {

    /* renamed from: a */
    private final long f6716a;

    /* renamed from: b */
    private final long f6717b;

    /* renamed from: c */
    private final long f6718c;

    /* renamed from: d */
    private String f6719d;

    /* renamed from: e */
    private String f6720e;

    /* renamed from: f */
    private Map<String, String> f6721f;

    /* renamed from: g */
    private String f6722g;

    C5608x2(long j, long j2, long j3) {
        this.f6716a = j;
        this.f6717b = j2;
        this.f6718c = j3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33606a(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            this.f6719d = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33607b(String str) {
        this.f6720e = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo33608c(String str) {
        this.f6722g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo33609d(Map<String, String> map) {
        this.f6721f = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo33610e() {
        return this.f6716a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final long mo33611f() {
        return this.f6718c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo33612g() {
        return this.f6719d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo33613h() {
        return this.f6720e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Map<String, String> mo33614i() {
        return this.f6721f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final String mo33615j() {
        return this.f6722g;
    }
}

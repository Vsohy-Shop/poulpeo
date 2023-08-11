package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;

/* renamed from: com.google.android.play.core.assetpacks.h2 */
final class C6723h2 {

    /* renamed from: a */
    private final int f8661a;

    /* renamed from: b */
    private final String f8662b;

    /* renamed from: c */
    private final long f8663c;

    /* renamed from: d */
    private final long f8664d;

    /* renamed from: e */
    private final int f8665e;

    C6723h2() {
    }

    C6723h2(int i, @Nullable String str, long j, long j2, int i2) {
        this();
        this.f8661a = i;
        this.f8662b = str;
        this.f8663c = j;
        this.f8664d = j2;
        this.f8665e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo39288a() {
        return this.f8661a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public String mo39289b() {
        return this.f8662b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo39290c() {
        return this.f8663c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo39291d() {
        return this.f8664d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo39292e() {
        return this.f8665e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6723h2) {
            C6723h2 h2Var = (C6723h2) obj;
            if (this.f8661a == h2Var.mo39288a() && ((str = this.f8662b) != null ? str.equals(h2Var.mo39289b()) : h2Var.mo39289b() == null) && this.f8663c == h2Var.mo39290c() && this.f8664d == h2Var.mo39291d() && this.f8665e == h2Var.mo39292e()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (this.f8661a ^ 1000003) * 1000003;
        String str = this.f8662b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f8663c;
        long j2 = this.f8664d;
        return ((((((i2 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f8665e;
    }

    public String toString() {
        int i = this.f8661a;
        String str = this.f8662b;
        long j = this.f8663c;
        long j2 = this.f8664d;
        int i2 = this.f8665e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}

package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.o2 */
final class C6751o2 {

    /* renamed from: a */
    private final String f8766a;

    /* renamed from: b */
    private final long f8767b;

    /* renamed from: c */
    private final int f8768c;

    /* renamed from: d */
    private final boolean f8769d;

    /* renamed from: e */
    private final boolean f8770e;

    /* renamed from: f */
    private final byte[] f8771f;

    C6751o2() {
    }

    C6751o2(@Nullable String str, long j, int i, boolean z, boolean z2, @Nullable byte[] bArr) {
        this();
        this.f8766a = str;
        this.f8767b = j;
        this.f8768c = i;
        this.f8769d = z;
        this.f8770e = z2;
        this.f8771f = bArr;
    }

    /* renamed from: a */
    static C6751o2 m11490a(@Nullable String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new C6751o2(str, j, i, z, z2, bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo39338b() {
        if (mo39340d() == null) {
            return false;
        }
        return mo39340d().endsWith("/");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo39339c() {
        if (mo39343f() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: d */
    public String mo39340d() {
        return this.f8766a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo39341e() {
        return this.f8767b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6751o2) {
            C6751o2 o2Var = (C6751o2) obj;
            String str = this.f8766a;
            if (str != null ? str.equals(o2Var.mo39340d()) : o2Var.mo39340d() == null) {
                if (this.f8767b == o2Var.mo39341e() && this.f8768c == o2Var.mo39343f() && this.f8769d == o2Var.mo39344g() && this.f8770e == o2Var.mo39345h() && Arrays.equals(this.f8771f, o2Var.f8771f)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo39343f() {
        return this.f8768c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo39344g() {
        return this.f8769d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo39345h() {
        return this.f8770e;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f8766a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f8767b;
        int i3 = (((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f8768c) * 1000003;
        int i4 = 1237;
        if (true != this.f8769d) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = (i3 ^ i2) * 1000003;
        if (true == this.f8770e) {
            i4 = 1231;
        }
        return ((i5 ^ i4) * 1000003) ^ Arrays.hashCode(this.f8771f);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: i */
    public byte[] mo39347i() {
        return this.f8771f;
    }

    public String toString() {
        String str = this.f8766a;
        long j = this.f8767b;
        int i = this.f8768c;
        boolean z = this.f8769d;
        boolean z2 = this.f8770e;
        String arrays = Arrays.toString(this.f8771f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}

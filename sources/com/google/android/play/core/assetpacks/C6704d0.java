package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;

/* renamed from: com.google.android.play.core.assetpacks.d0 */
final class C6704d0 extends C6688a {

    /* renamed from: b */
    private final int f8594b;

    /* renamed from: c */
    private final String f8595c;

    /* renamed from: d */
    private final String f8596d;

    C6704d0(int i, @Nullable String str, @Nullable String str2) {
        this.f8594b = i;
        this.f8595c = str;
        this.f8596d = str2;
    }

    @Nullable
    /* renamed from: b */
    public final String mo39258b() {
        return this.f8596d;
    }

    /* renamed from: c */
    public final int mo39259c() {
        return this.f8594b;
    }

    @Nullable
    /* renamed from: d */
    public final String mo39260d() {
        return this.f8595c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6688a) {
            C6688a aVar = (C6688a) obj;
            if (this.f8594b == aVar.mo39259c() && ((str = this.f8595c) != null ? str.equals(aVar.mo39260d()) : aVar.mo39260d() == null)) {
                String str2 = this.f8596d;
                String b = aVar.mo39258b();
                if (str2 != null ? str2.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f8594b ^ 1000003) * 1000003;
        String str = this.f8595c;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        String str2 = this.f8596d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        int i = this.f8594b;
        String str = this.f8595c;
        String str2 = this.f8596d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

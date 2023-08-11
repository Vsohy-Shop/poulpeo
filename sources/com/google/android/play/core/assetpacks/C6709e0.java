package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.e0 */
final class C6709e0 extends AssetPackState {

    /* renamed from: a */
    private final String f8607a;

    /* renamed from: b */
    private final int f8608b;

    /* renamed from: c */
    private final int f8609c;

    /* renamed from: d */
    private final long f8610d;

    /* renamed from: e */
    private final long f8611e;

    /* renamed from: f */
    private final int f8612f;

    C6709e0(String str, int i, int i2, long j, long j2, int i3) {
        if (str != null) {
            this.f8607a = str;
            this.f8608b = i;
            this.f8609c = i2;
            this.f8610d = j;
            this.f8611e = j2;
            this.f8612f = i3;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: c */
    public final long mo39252c() {
        return this.f8610d;
    }

    /* renamed from: d */
    public final int mo39253d() {
        return this.f8609c;
    }

    /* renamed from: e */
    public final String mo39254e() {
        return this.f8607a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f8607a.equals(assetPackState.mo39254e()) && this.f8608b == assetPackState.mo39255f() && this.f8609c == assetPackState.mo39253d() && this.f8610d == assetPackState.mo39252c() && this.f8611e == assetPackState.mo39256g() && this.f8612f == assetPackState.mo39257h()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo39255f() {
        return this.f8608b;
    }

    /* renamed from: g */
    public final long mo39256g() {
        return this.f8611e;
    }

    /* renamed from: h */
    public final int mo39257h() {
        return this.f8612f;
    }

    public final int hashCode() {
        int hashCode = this.f8607a.hashCode();
        int i = this.f8608b;
        int i2 = this.f8609c;
        long j = this.f8610d;
        long j2 = this.f8611e;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f8612f;
    }

    public final String toString() {
        String str = this.f8607a;
        int i = this.f8608b;
        int i2 = this.f8609c;
        long j = this.f8610d;
        long j2 = this.f8611e;
        int i3 = this.f8612f;
        StringBuilder sb = new StringBuilder(str.length() + 185);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}

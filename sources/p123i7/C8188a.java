package p123i7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p242u4.C9882a;

/* renamed from: i7.a */
/* compiled from: DynamicLinkData */
public class C8188a extends C9882a {
    public static final Parcelable.Creator<C8188a> CREATOR = new C8189b();
    @Nullable

    /* renamed from: b */
    private String f11509b;
    @Nullable

    /* renamed from: c */
    private String f11510c;

    /* renamed from: d */
    private int f11511d;

    /* renamed from: e */
    private long f11512e;
    @Nullable

    /* renamed from: f */
    private Bundle f11513f;
    @Nullable

    /* renamed from: g */
    private Uri f11514g;

    public C8188a(@Nullable String str, @Nullable String str2, int i, long j, @Nullable Bundle bundle, @Nullable Uri uri) {
        this.f11509b = str;
        this.f11510c = str2;
        this.f11511d = i;
        this.f11512e = j;
        this.f11513f = bundle;
        this.f11514g = uri;
    }

    /* renamed from: A */
    public long mo42081A() {
        return this.f11512e;
    }

    @Nullable
    /* renamed from: F */
    public String mo42082F() {
        return this.f11510c;
    }

    @Nullable
    /* renamed from: G */
    public String mo42083G() {
        return this.f11509b;
    }

    /* renamed from: H */
    public Bundle mo42084H() {
        Bundle bundle = this.f11513f;
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }

    /* renamed from: I */
    public int mo42085I() {
        return this.f11511d;
    }

    @Nullable
    /* renamed from: J */
    public Uri mo42086J() {
        return this.f11514g;
    }

    /* renamed from: K */
    public void mo42087K(long j) {
        this.f11512e = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8189b.m16210c(this, parcel, i);
    }
}

package p123i7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p112h7.C8027d;
import p242u4.C9882a;

/* renamed from: i7.j */
/* compiled from: ShortDynamicLinkImpl */
public final class C8206j extends C9882a implements C8027d {
    public static final Parcelable.Creator<C8206j> CREATOR = new C8208k();
    @Nullable

    /* renamed from: b */
    private final Uri f11530b;
    @Nullable

    /* renamed from: c */
    private final Uri f11531c;

    /* renamed from: d */
    private final List<C8207a> f11532d;

    /* renamed from: i7.j$a */
    /* compiled from: ShortDynamicLinkImpl */
    public static class C8207a extends C9882a {
        public static final Parcelable.Creator<C8207a> CREATOR = new C8209l();

        /* renamed from: b */
        private final String f11533b;

        public C8207a(String str) {
            this.f11533b = str;
        }

        /* renamed from: A */
        public String mo42113A() {
            return this.f11533b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C8209l.m16254c(this, parcel, i);
        }
    }

    public C8206j(@Nullable Uri uri, @Nullable Uri uri2, @Nullable List<C8207a> list) {
        this.f11530b = uri;
        this.f11531c = uri2;
        this.f11532d = list == null ? new ArrayList<>() : list;
    }

    @Nullable
    /* renamed from: A */
    public Uri mo42110A() {
        return this.f11531c;
    }

    /* renamed from: F */
    public List<C8207a> mo42111F() {
        return this.f11532d;
    }

    @Nullable
    /* renamed from: v */
    public Uri mo41858v() {
        return this.f11530b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8208k.m16251c(this, parcel, i);
    }
}

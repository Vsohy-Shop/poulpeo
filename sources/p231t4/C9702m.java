package p231t4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t4.m */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C9702m extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C9702m> CREATOR = new C9690i0();

    /* renamed from: b */
    private final int f14486b;

    /* renamed from: c */
    private final int f14487c;

    /* renamed from: d */
    private final int f14488d;

    /* renamed from: e */
    private final long f14489e;

    /* renamed from: f */
    private final long f14490f;
    @Nullable

    /* renamed from: g */
    private final String f14491g;
    @Nullable

    /* renamed from: h */
    private final String f14492h;

    /* renamed from: i */
    private final int f14493i;

    /* renamed from: j */
    private final int f14494j;

    public C9702m(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4, int i5) {
        this.f14486b = i;
        this.f14487c = i2;
        this.f14488d = i3;
        this.f14489e = j;
        this.f14490f = j2;
        this.f14491g = str;
        this.f14492h = str2;
        this.f14493i = i4;
        this.f14494j = i5;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f14486b);
        C9883b.m20532l(parcel, 2, this.f14487c);
        C9883b.m20532l(parcel, 3, this.f14488d);
        C9883b.m20535o(parcel, 4, this.f14489e);
        C9883b.m20535o(parcel, 5, this.f14490f);
        C9883b.m20539s(parcel, 6, this.f14491g, false);
        C9883b.m20539s(parcel, 7, this.f14492h, false);
        C9883b.m20532l(parcel, 8, this.f14493i);
        C9883b.m20532l(parcel, 9, this.f14494j);
        C9883b.m20522b(parcel, a);
    }
}

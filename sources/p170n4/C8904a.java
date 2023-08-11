package p170n4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: n4.a */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C8904a extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C8904a> CREATOR = new C8907d();
    @NonNull

    /* renamed from: b */
    Intent f12918b;

    public C8904a(@NonNull Intent intent) {
        this.f12918b = intent;
    }

    @NonNull
    /* renamed from: A */
    public Intent mo43040A() {
        return this.f12918b;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20538r(parcel, 1, this.f12918b, i, false);
        C9883b.m20522b(parcel, a);
    }
}

package p232t5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import p190p4.C9056e;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t5.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9745b extends C9882a implements C9056e {
    public static final Parcelable.Creator<C9745b> CREATOR = new C9746c();

    /* renamed from: b */
    final int f14556b;

    /* renamed from: c */
    private int f14557c;
    @Nullable

    /* renamed from: d */
    private Intent f14558d;

    public C9745b() {
        this(2, 0, (Intent) null);
    }

    public final Status getStatus() {
        if (this.f14557c == 0) {
            return Status.f4889g;
        }
        return Status.f4893k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f14556b);
        C9883b.m20532l(parcel, 2, this.f14557c);
        C9883b.m20538r(parcel, 3, this.f14558d, i, false);
        C9883b.m20522b(parcel, a);
    }

    C9745b(int i, int i2, @Nullable Intent intent) {
        this.f14556b = i;
        this.f14557c = i2;
        this.f14558d = intent;
    }
}

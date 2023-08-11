package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p036b5.C2890b;
import p150l4.C8675b;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.cast.framework.media.a */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C4633a extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4633a> CREATOR = new C4655i();

    /* renamed from: h */
    private static final C8675b f4650h = new C8675b("CastMediaOptions");

    /* renamed from: b */
    private final String f4651b;

    /* renamed from: c */
    private final String f4652c;
    @Nullable

    /* renamed from: d */
    private final C4654h0 f4653d;
    @Nullable

    /* renamed from: e */
    private final C4646g f4654e;

    /* renamed from: f */
    private final boolean f4655f;

    /* renamed from: g */
    private final boolean f4656g;

    C4633a(String str, String str2, @Nullable IBinder iBinder, @Nullable C4646g gVar, boolean z, boolean z2) {
        C4654h0 h0Var;
        this.f4651b = str;
        this.f4652c = str2;
        if (iBinder == null) {
            h0Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof C4654h0) {
                h0Var = (C4654h0) queryLocalInterface;
            } else {
                h0Var = new C4675s(iBinder);
            }
        }
        this.f4653d = h0Var;
        this.f4654e = gVar;
        this.f4655f = z;
        this.f4656g = z2;
    }

    @NonNull
    /* renamed from: A */
    public String mo32063A() {
        return this.f4652c;
    }

    @Nullable
    /* renamed from: F */
    public C4637c mo32064F() {
        C4654h0 h0Var = this.f4653d;
        if (h0Var == null) {
            return null;
        }
        try {
            return (C4637c) C2890b.m2296J(h0Var.mo32208d());
        } catch (RemoteException e) {
            f4650h.mo42755b(e, "Unable to call %s on %s.", "getWrappedClientObject", C4654h0.class.getSimpleName());
            return null;
        }
    }

    @NonNull
    /* renamed from: G */
    public String mo32065G() {
        return this.f4651b;
    }

    /* renamed from: H */
    public boolean mo32066H() {
        return this.f4656g;
    }

    @Nullable
    /* renamed from: I */
    public C4646g mo32067I() {
        return this.f4654e;
    }

    /* renamed from: J */
    public final boolean mo32068J() {
        return this.f4655f;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        IBinder iBinder;
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, mo32065G(), false);
        C9883b.m20539s(parcel, 3, mo32063A(), false);
        C4654h0 h0Var = this.f4653d;
        if (h0Var == null) {
            iBinder = null;
        } else {
            iBinder = h0Var.asBinder();
        }
        C9883b.m20531k(parcel, 4, iBinder, false);
        C9883b.m20538r(parcel, 5, mo32067I(), i, false);
        C9883b.m20523c(parcel, 6, this.f4655f);
        C9883b.m20523c(parcel, 7, mo32066H());
        C9883b.m20522b(parcel, a);
    }
}

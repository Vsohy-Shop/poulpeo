package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public class C5883o0 implements IInterface {

    /* renamed from: a */
    private final IBinder f7178a;

    /* renamed from: b */
    private final String f7179b;

    protected C5883o0(IBinder iBinder, String str) {
        this.f7178a = iBinder;
        this.f7179b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel mo34235E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7179b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final Parcel mo34236G(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f7178a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo34237J(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7178a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f7178a;
    }
}

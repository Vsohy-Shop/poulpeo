package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.cast.a */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C4810a implements IInterface {

    /* renamed from: a */
    private final IBinder f5107a;

    /* renamed from: b */
    private final String f5108b;

    protected C4810a(IBinder iBinder, String str) {
        this.f5107a = iBinder;
        this.f5108b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel mo32606E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5108b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final Parcel mo32607G(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f5107a.transact(i, parcel, parcel, 0);
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
    public final void mo32608J(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5107a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f5107a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public final void mo32610b3(int i, Parcel parcel) {
        try {
            this.f5107a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

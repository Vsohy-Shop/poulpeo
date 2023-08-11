package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.gtm.qa */
public class C5511qa implements IInterface {

    /* renamed from: a */
    private final IBinder f6259a;

    /* renamed from: b */
    private final String f6260b;

    protected C5511qa(IBinder iBinder, String str) {
        this.f6259a = iBinder;
        this.f6260b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel mo33480E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6260b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final Parcel mo33481G(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6259a.transact(i, parcel, parcel, 0);
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
    public final void mo33482J(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6259a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6259a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public final void mo33484b3(int i, Parcel parcel) {
        try {
            this.f6259a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

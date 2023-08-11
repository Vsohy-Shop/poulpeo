package com.google.android.gms.internal.gtm;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.gtm.f3 */
public abstract class C5335f3 extends C5512qb implements C5320e3 {
    public C5335f3() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo33210E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo33185Y(C5513qc.m8437e(parcel), parcel.readString());
        return true;
    }
}

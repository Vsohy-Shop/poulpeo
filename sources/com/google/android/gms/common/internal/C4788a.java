package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p231t4.C9685g1;

/* renamed from: com.google.android.gms.common.internal.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C4788a implements Parcelable.Creator<BinderWrapper> {
    C4788a() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, (C9685g1) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import p231t4.C9685g1;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class BinderWrapper implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C4788a();

    /* renamed from: b */
    private IBinder f5070b;

    public BinderWrapper(@NonNull IBinder iBinder) {
        this.f5070b = iBinder;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f5070b);
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C9685g1 g1Var) {
        this.f5070b = parcel.readStrongBinder();
    }
}

package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C12775o;

/* compiled from: Lazy.android.kt */
public final class DefaultLazyKey$Companion$CREATOR$1 implements Parcelable.Creator<DefaultLazyKey> {
    DefaultLazyKey$Companion$CREATOR$1() {
    }

    public DefaultLazyKey createFromParcel(Parcel parcel) {
        C12775o.m28639i(parcel, "parcel");
        return new DefaultLazyKey(parcel.readInt());
    }

    public DefaultLazyKey[] newArray(int i) {
        return new DefaultLazyKey[i];
    }
}

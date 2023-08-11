package androidx.activity.result;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C12775o;

/* compiled from: IntentSenderRequest.kt */
public final class IntentSenderRequest$Companion$CREATOR$1 implements Parcelable.Creator<IntentSenderRequest> {
    IntentSenderRequest$Companion$CREATOR$1() {
    }

    public IntentSenderRequest createFromParcel(Parcel parcel) {
        C12775o.m28639i(parcel, "inParcel");
        return new IntentSenderRequest(parcel);
    }

    public IntentSenderRequest[] newArray(int i) {
        return new IntentSenderRequest[i];
    }
}

package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ParcelableSnapshotMutableState.kt */
public final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new ParcelableSnapshotMutableState$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int PolicyNeverEquals = 0;
    private static final int PolicyReferentialEquality = 2;
    private static final int PolicyStructuralEquality = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        super(t, snapshotMutationPolicy);
        C12775o.m28639i(snapshotMutationPolicy, "policy");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C12775o.m28639i(parcel, "parcel");
        parcel.writeValue(getValue());
        SnapshotMutationPolicy policy = getPolicy();
        if (C12775o.m28634d(policy, SnapshotStateKt.neverEqualPolicy())) {
            i2 = 0;
        } else if (C12775o.m28634d(policy, SnapshotStateKt.structuralEqualityPolicy())) {
            i2 = 1;
        } else if (C12775o.m28634d(policy, SnapshotStateKt.referentialEqualityPolicy())) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }

    /* compiled from: ParcelableSnapshotMutableState.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }
}

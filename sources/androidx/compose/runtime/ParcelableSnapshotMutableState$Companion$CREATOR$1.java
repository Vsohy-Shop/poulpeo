package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C12775o;

/* compiled from: ParcelableSnapshotMutableState.kt */
public final class ParcelableSnapshotMutableState$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
    ParcelableSnapshotMutableState$Companion$CREATOR$1() {
    }

    public ParcelableSnapshotMutableState<Object>[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        SnapshotMutationPolicy snapshotMutationPolicy;
        C12775o.m28639i(parcel, "parcel");
        if (classLoader == null) {
            classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            snapshotMutationPolicy = SnapshotStateKt.neverEqualPolicy();
        } else if (readInt == 1) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        } else if (readInt == 2) {
            snapshotMutationPolicy = SnapshotStateKt.referentialEqualityPolicy();
        } else {
            throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
        }
        return new ParcelableSnapshotMutableState<>(readValue, snapshotMutationPolicy);
    }

    public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
        C12775o.m28639i(parcel, "parcel");
        return createFromParcel(parcel, (ClassLoader) null);
    }
}

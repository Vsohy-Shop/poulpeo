package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Lazy.android.kt */
final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new DefaultLazyKey$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int index;

    public DefaultLazyKey(int i) {
        this.index = i;
    }

    private final int component1() {
        return this.index;
    }

    public static /* synthetic */ DefaultLazyKey copy$default(DefaultLazyKey defaultLazyKey, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = defaultLazyKey.index;
        }
        return defaultLazyKey.copy(i);
    }

    public final DefaultLazyKey copy(int i) {
        return new DefaultLazyKey(i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DefaultLazyKey) && this.index == ((DefaultLazyKey) obj).index) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.index);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.index + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12775o.m28639i(parcel, "parcel");
        parcel.writeInt(this.index);
    }

    /* compiled from: Lazy.android.kt */
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

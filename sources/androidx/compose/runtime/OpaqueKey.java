package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;

/* compiled from: OpaqueKey.kt */
public final class OpaqueKey {
    private final String key;

    public OpaqueKey(String str) {
        C12775o.m28639i(str, "key");
        this.key = str;
    }

    public static /* synthetic */ OpaqueKey copy$default(OpaqueKey opaqueKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = opaqueKey.key;
        }
        return opaqueKey.copy(str);
    }

    public final String component1() {
        return this.key;
    }

    public final OpaqueKey copy(String str) {
        C12775o.m28639i(str, "key");
        return new OpaqueKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OpaqueKey) && C12775o.m28634d(this.key, ((OpaqueKey) obj).key)) {
            return true;
        }
        return false;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.key + ')';
    }
}

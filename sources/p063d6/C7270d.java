package p063d6;

import android.app.PendingIntent;

/* renamed from: d6.d */
final class C7270d extends C7267a {

    /* renamed from: b */
    private final PendingIntent f9997b;

    C7270d(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.f9997b = pendingIntent;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo40832a() {
        return this.f9997b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7267a) {
            return this.f9997b.equals(((C7267a) obj).mo40832a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f9997b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9997b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 26);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package p031b0;

import com.appboy.models.push.BrazeNotificationPayload;
import kotlin.jvm.internal.C12775o;
import p292z.C10731b;

/* renamed from: b0.b */
public final class C2805b {

    /* renamed from: a */
    private final C10731b f1107a;

    /* renamed from: b */
    private final BrazeNotificationPayload f1108b;

    public C2805b(C10731b bVar, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(bVar, "eventType");
        C12775o.m28639i(brazeNotificationPayload, "notificationPayload");
        this.f1107a = bVar;
        this.f1108b = brazeNotificationPayload;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2805b)) {
            return false;
        }
        C2805b bVar = (C2805b) obj;
        if (this.f1107a == bVar.f1107a && C12775o.m28634d(this.f1108b, bVar.f1108b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f1107a.hashCode() * 31) + this.f1108b.hashCode();
    }

    public String toString() {
        return "BrazePushEvent(eventType=" + this.f1107a + ", notificationPayload=" + this.f1108b + ')';
    }
}

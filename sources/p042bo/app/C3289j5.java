package p042bo.app;

import java.util.UUID;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p057d0.C7213c;

/* renamed from: bo.app.j5 */
public final class C3289j5 implements C7213c<String> {

    /* renamed from: d */
    public static final C3290a f1947d = new C3290a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final UUID f1948b;

    /* renamed from: c */
    private final String f1949c;

    /* renamed from: bo.app.j5$a */
    public static final class C3290a {
        public /* synthetic */ C3290a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3289j5 mo29164a() {
            UUID randomUUID = UUID.randomUUID();
            C12775o.m28638h(randomUUID, "randomUUID()");
            return new C3289j5(randomUUID);
        }

        private C3290a() {
        }

        /* renamed from: a */
        public final C3289j5 mo29165a(String str) {
            C12775o.m28639i(str, "sessionId");
            UUID fromString = UUID.fromString(str);
            C12775o.m28638h(fromString, "fromString(sessionId)");
            return new C3289j5(fromString);
        }
    }

    public C3289j5(UUID uuid) {
        C12775o.m28639i(uuid, "sessionIdUuid");
        this.f1948b = uuid;
        String uuid2 = uuid.toString();
        C12775o.m28638h(uuid2, "sessionIdUuid.toString()");
        this.f1949c = uuid2;
    }

    /* renamed from: e */
    public String forJsonPut() {
        return this.f1949c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3289j5) && C12775o.m28634d(this.f1948b, ((C3289j5) obj).f1948b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1948b.hashCode();
    }

    public String toString() {
        return this.f1949c;
    }
}

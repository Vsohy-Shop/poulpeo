package p021a3;

import com.facebook.FacebookSdk;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a3.s */
/* compiled from: LoginTargetApp.kt */
public enum C2190s {
    FACEBOOK("facebook"),
    INSTAGRAM(FacebookSdk.INSTAGRAM);
    

    /* renamed from: f */
    public static final C2191a f964f = null;

    /* renamed from: b */
    private final String f965b;

    /* renamed from: a3.s$a */
    /* compiled from: LoginTargetApp.kt */
    public static final class C2191a {
        private C2191a() {
        }

        public /* synthetic */ C2191a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2190s mo23471a(String str) {
            for (C2190s sVar : C2190s.values()) {
                if (C12775o.m28634d(sVar.toString(), str)) {
                    return sVar;
                }
            }
            return C2190s.FACEBOOK;
        }
    }

    static {
        f964f = new C2191a((DefaultConstructorMarker) null);
    }

    private C2190s(String str) {
        this.f965b = str;
    }

    /* renamed from: a */
    public static final C2190s m1727a(String str) {
        return f964f.mo23471a(str);
    }

    public String toString() {
        return this.f965b;
    }
}

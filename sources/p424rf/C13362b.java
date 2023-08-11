package p424rf;

import java.util.Random;
import kotlin.jvm.internal.C12775o;

/* renamed from: rf.b */
/* compiled from: PlatformRandom.kt */
public final class C13362b extends C13361a {

    /* renamed from: d */
    private final C13363a f21411d = new C13363a();

    /* renamed from: rf.b$a */
    /* compiled from: PlatformRandom.kt */
    public static final class C13363a extends ThreadLocal<Random> {
        C13363a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: c */
    public Random mo52983c() {
        Object obj = this.f21411d.get();
        C12775o.m28638h(obj, "implStorage.get()");
        return (Random) obj;
    }
}

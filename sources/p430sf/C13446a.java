package p430sf;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.C12775o;
import p424rf.C13361a;

/* renamed from: sf.a */
/* compiled from: PlatformThreadLocalRandom.kt */
public final class C13446a extends C13361a {
    /* renamed from: c */
    public Random mo52983c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C12775o.m28638h(current, "current()");
        return current;
    }
}

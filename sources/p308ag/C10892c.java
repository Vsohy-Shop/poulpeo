package p308ag;

import androidx.core.location.LocationRequestCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12771l;
import p331dg.C11828g0;
import p336ef.C11921v;
import p404of.C13088o;
import p442uf.C13593e;
import p466yf.C14002n;

/* renamed from: ag.c */
/* compiled from: BufferedChannel.kt */
public final class C10892c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C10904j<Object> f16794a = new C10904j(-1, (C10904j) null, (C10887b) null, 0);

    /* renamed from: b */
    public static final int f16795b = C11834j0.m25489e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int f16796c = C11834j0.m25489e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);

    /* renamed from: d */
    public static final C11828g0 f16797d = new C11828g0("BUFFERED");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C11828g0 f16798e = new C11828g0("SHOULD_BUFFER");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C11828g0 f16799f = new C11828g0("S_RESUMING_BY_RCV");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C11828g0 f16800g = new C11828g0("RESUMING_BY_EB");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C11828g0 f16801h = new C11828g0("POISONED");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C11828g0 f16802i = new C11828g0("DONE_RCV");
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C11828g0 f16803j = new C11828g0("INTERRUPTED_SEND");
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C11828g0 f16804k = new C11828g0("INTERRUPTED_RCV");

    /* renamed from: l */
    private static final C11828g0 f16805l = new C11828g0("CHANNEL_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C11828g0 f16806m = new C11828g0("SUSPEND");
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C11828g0 f16807n = new C11828g0("SUSPEND_NO_WAITER");
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C11828g0 f16808o = new C11828g0("FAILED");
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C11828g0 f16809p = new C11828g0("NO_RECEIVE_RESULT");
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final C11828g0 f16810q = new C11828g0("CLOSE_HANDLER_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C11828g0 f16811r = new C11828g0("CLOSE_HANDLER_INVOKED");
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final C11828g0 f16812s = new C11828g0("NO_CLOSE_CAUSE");

    /* renamed from: ag.c$a */
    /* compiled from: BufferedChannel.kt */
    /* synthetic */ class C10893a extends C12771l implements C13088o<Long, C10904j<E>, C10904j<E>> {

        /* renamed from: b */
        public static final C10893a f16813b = new C10893a();

        C10893a() {
            super(2, C10892c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        /* renamed from: b */
        public final C10904j<E> mo45907b(long j, C10904j<E> jVar) {
            return C10892c.m23403x(j, jVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo45907b(((Number) obj).longValue(), (C10904j) obj2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final long m23377A(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != Integer.MAX_VALUE) {
            return (long) i;
        }
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final <T> boolean m23378B(C14002n<? super T> nVar, T t, Function1<? super Throwable, C11921v> function1) {
        Object h = nVar.mo49528h(t, (Object) null, function1);
        if (h == null) {
            return false;
        }
        nVar.mo49531o(h);
        return true;
    }

    /* renamed from: C */
    static /* synthetic */ boolean m23379C(C14002n nVar, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return m23378B(nVar, obj, function1);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final long m23401v(long j, boolean z) {
        long j2;
        if (z) {
            j2 = 4611686018427387904L;
        } else {
            j2 = 0;
        }
        return j2 + j;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final long m23402w(long j, int i) {
        return (((long) i) << 60) + j;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final <E> C10904j<E> m23403x(long j, C10904j<E> jVar) {
        return new C10904j(j, jVar, jVar.mo45928u(), 0);
    }

    /* renamed from: y */
    public static final <E> C13593e<C10904j<E>> m23404y() {
        return C10893a.f16813b;
    }

    /* renamed from: z */
    public static final C11828g0 m23405z() {
        return f16805l;
    }
}

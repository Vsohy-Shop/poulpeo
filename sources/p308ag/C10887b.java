package p308ag;

import androidx.concurrent.futures.C1248a;
import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p331dg.C11821d;
import p331dg.C11822d0;
import p331dg.C11823e;
import p331dg.C11824e0;
import p331dg.C11826f0;
import p331dg.C11828g0;
import p331dg.C11842m;
import p331dg.C11862y;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p349gg.C12025a;
import p349gg.C12027b;
import p349gg.C12030d;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13945d3;
import p466yf.C14002n;
import p466yf.C14010o;
import p466yf.C14018q;

@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3055:1\n273#1,6:3058\n280#1,68:3065\n374#1,18:3156\n244#1:3174\n269#1,10:3175\n280#1,48:3186\n395#1:3234\n334#1,14:3235\n399#1,3:3250\n244#1:3263\n269#1,10:3264\n280#1,68:3275\n244#1:3353\n269#1,10:3354\n280#1,68:3365\n244#1:3437\n269#1,10:3438\n280#1,68:3449\n886#1,52:3519\n964#1,8:3575\n858#1:3583\n882#1,33:3584\n974#1:3617\n916#1,14:3618\n935#1,3:3633\n979#1,6:3636\n886#1,52:3650\n964#1,8:3706\n858#1:3714\n882#1,33:3715\n974#1:3748\n916#1,14:3749\n935#1,3:3764\n979#1,6:3767\n858#1:3782\n882#1,48:3783\n935#1,3:3832\n858#1:3835\n882#1,48:3836\n935#1,3:3885\n244#1:3897\n269#1,10:3898\n280#1,68:3909\n858#1:3978\n882#1,48:3979\n935#1,3:4028\n1#2:3056\n3038#3:3057\n3038#3:3064\n3038#3:3185\n3038#3:3274\n3038#3:3364\n3038#3:3436\n3038#3:3448\n3038#3:3518\n3038#3:3781\n3038#3:3888\n3038#3:3889\n3052#3:3890\n3052#3:3891\n3051#3:3892\n3051#3:3893\n3051#3:3894\n3052#3:3895\n3051#3:3896\n3038#3:3908\n3039#3:4031\n3038#3:4032\n3038#3:4033\n3038#3:4034\n3039#3:4035\n3038#3:4036\n3039#3:4059\n3038#3:4060\n3038#3:4061\n3039#3:4062\n3038#3:4112\n3039#3:4113\n3039#3:4114\n3039#3:4132\n3039#3:4133\n314#4,9:3133\n323#4,2:3150\n332#4,4:3152\n336#4,8:3253\n314#4,9:3344\n323#4,2:3434\n332#4,4:3571\n336#4,8:3642\n332#4,4:3702\n336#4,8:3773\n218#5:3142\n219#5:3145\n218#5:3146\n219#5:3149\n61#6,2:3143\n61#6,2:3147\n61#6,2:3261\n269#7:3249\n269#7:3343\n269#7:3433\n269#7:3517\n269#7:3977\n882#8:3632\n882#8:3763\n882#8:3831\n882#8:3884\n882#8:4027\n37#9,11:4037\n37#9,11:4048\n72#10,3:4063\n46#10,8:4066\n72#10,3:4074\n46#10,8:4077\n46#10,8:4085\n72#10,3:4093\n46#10,8:4096\n46#10,8:4104\n766#11:4115\n857#11,2:4116\n2310#11,14:4118\n766#11:4134\n857#11,2:4135\n2310#11,14:4137\n766#11:4151\n857#11,2:4152\n2310#11,14:4154\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n113#1:3058,6\n113#1:3065,68\n154#1:3156,18\n154#1:3174\n154#1:3175,10\n154#1:3186,48\n154#1:3234\n154#1:3235,14\n154#1:3250,3\n194#1:3263\n194#1:3264,10\n194#1:3275,68\n225#1:3353\n225#1:3354,10\n225#1:3365,68\n391#1:3437\n391#1:3438,10\n391#1:3449,68\n667#1:3519,52\n696#1:3575,8\n696#1:3583\n696#1:3584,33\n696#1:3617\n696#1:3618,14\n696#1:3633,3\n696#1:3636,6\n732#1:3650,52\n748#1:3706,8\n748#1:3714\n748#1:3715,33\n748#1:3748\n748#1:3749,14\n748#1:3764,3\n748#1:3767,6\n781#1:3782\n781#1:3783,48\n781#1:3832,3\n971#1:3835\n971#1:3836,48\n971#1:3885,3\n1464#1:3897\n1464#1:3898,10\n1464#1:3909,68\n1512#1:3978\n1512#1:3979,48\n1512#1:4028,3\n70#1:3057\n113#1:3064\n154#1:3185\n194#1:3274\n225#1:3364\n278#1:3436\n391#1:3448\n606#1:3518\n771#1:3781\n1007#1:3888\n1056#1:3889\n1374#1:3890\n1376#1:3891\n1406#1:3892\n1416#1:3893\n1425#1:3894\n1426#1:3895\n1433#1:3896\n1464#1:3908\n1865#1:4031\n1867#1:4032\n1869#1:4033\n1882#1:4034\n1893#1:4035\n1894#1:4036\n2196#1:4059\n2209#1:4060\n2219#1:4061\n2222#1:4062\n2539#1:4112\n2541#1:4113\n2566#1:4114\n2628#1:4132\n2629#1:4133\n134#1:3133,9\n134#1:3150,2\n153#1:3152,4\n153#1:3253,8\n221#1:3344,9\n221#1:3434,2\n695#1:3571,4\n695#1:3642,8\n746#1:3702,4\n746#1:3773,8\n138#1:3142\n138#1:3145\n141#1:3146\n141#1:3149\n138#1:3143,2\n141#1:3147,2\n183#1:3261,2\n154#1:3249\n194#1:3343\n225#1:3433\n391#1:3517\n1464#1:3977\n696#1:3632\n748#1:3763\n781#1:3831\n971#1:3884\n1512#1:4027\n2098#1:4037,11\n2153#1:4048,11\n2361#1:4063,3\n2361#1:4066,8\n2416#1:4074,3\n2416#1:4077,8\n2435#1:4085,8\n2465#1:4093,3\n2465#1:4096,8\n2526#1:4104,8\n2575#1:4115\n2575#1:4116,2\n2576#1:4118,14\n2640#1:4134\n2640#1:4135,2\n2641#1:4137,14\n2681#1:4151\n2681#1:4152,2\n2682#1:4154,14\n*E\n"})
/* renamed from: ag.b */
/* compiled from: BufferedChannel.kt */
public class C10887b<E> implements C10894d<E> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final AtomicLongFieldUpdater f16773e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f16774f;

    /* renamed from: g */
    private static final AtomicLongFieldUpdater f16775g;

    /* renamed from: h */
    private static final AtomicLongFieldUpdater f16776h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f16777i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final AtomicReferenceFieldUpdater f16778j;

    /* renamed from: k */
    private static final AtomicReferenceFieldUpdater f16779k;

    /* renamed from: l */
    private static final AtomicReferenceFieldUpdater f16780l;

    /* renamed from: m */
    private static final AtomicReferenceFieldUpdater f16781m;
    private volatile Object _closeCause;

    /* renamed from: b */
    private final int f16782b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c */
    public final Function1<E, C11921v> f16783c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: d */
    private final C13089p<C12027b<?>, Object, Object, Function1<Throwable, C11921v>> f16784d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    @SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n886#2,52:3056\n964#2,8:3112\n858#2:3120\n882#2,33:3121\n974#2:3154\n916#2,14:3155\n935#2,3:3170\n979#2,6:3173\n332#3,4:3108\n336#3,8:3179\n882#4:3169\n61#5,2:3187\n61#5,2:3190\n1#6:3189\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1590#1:3056,52\n1627#1:3112,8\n1627#1:3120\n1627#1:3121,33\n1627#1:3154\n1627#1:3155,14\n1627#1:3170,3\n1627#1:3173,6\n1625#1:3108,4\n1625#1:3179,8\n1627#1:3169\n1663#1:3187,2\n1708#1:3190,2\n*E\n"})
    /* renamed from: ag.b$a */
    /* compiled from: BufferedChannel.kt */
    private final class C10888a implements C10897f<E>, C13945d3 {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Object f16785b = C10892c.f16809p;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C14010o<? super Boolean> f16786c;

        public C10888a() {
        }

        /* renamed from: f */
        private final Object m23367f(C10904j<E> jVar, int i, long j, C12074d<? super Boolean> dVar) {
            Boolean a;
            C10887b<E> bVar = C10887b.this;
            C14010o b = C14018q.m32525b(C12147c.m26491b(dVar));
            try {
                this.f16786c = b;
                Object t = bVar.m23342z0(jVar, i, j, this);
                if (t == C10892c.f16806m) {
                    bVar.m23317k0(this, jVar, i);
                } else {
                    Function1<Throwable, C11921v> function1 = null;
                    if (t == C10892c.f16808o) {
                        if (j < bVar.mo45879N()) {
                            jVar.mo48987b();
                        }
                        C10904j jVar2 = (C10904j) C10887b.f16778j.get(bVar);
                        while (true) {
                            if (bVar.mo45881U()) {
                                m23369h();
                                break;
                            }
                            long andIncrement = C10887b.f16774f.getAndIncrement(bVar);
                            int i2 = C10892c.f16795b;
                            long j2 = andIncrement / ((long) i2);
                            int i3 = (int) (andIncrement % ((long) i2));
                            if (jVar2.f18467d != j2) {
                                C10904j a2 = bVar.m23290G(j2, jVar2);
                                if (a2 != null) {
                                    jVar2 = a2;
                                }
                            }
                            Object t2 = bVar.m23342z0(jVar2, i3, andIncrement, this);
                            if (t2 == C10892c.f16806m) {
                                bVar.m23317k0(this, jVar2, i3);
                                break;
                            } else if (t2 == C10892c.f16808o) {
                                if (andIncrement < bVar.mo45879N()) {
                                    jVar2.mo48987b();
                                }
                            } else if (t2 != C10892c.f16807n) {
                                jVar2.mo48987b();
                                this.f16785b = t2;
                                this.f16786c = null;
                                a = C12735b.m28558a(true);
                                Function1<E, C11921v> function12 = bVar.f16783c;
                                if (function12 != null) {
                                    function1 = C11862y.m25585a(function12, t2, b.getContext());
                                }
                            } else {
                                throw new IllegalStateException("unexpected".toString());
                            }
                        }
                    } else {
                        jVar.mo48987b();
                        this.f16785b = t;
                        this.f16786c = null;
                        a = C12735b.m28558a(true);
                        Function1<E, C11921v> function13 = bVar.f16783c;
                        if (function13 != null) {
                            function1 = C11862y.m25585a(function13, t, b.getContext());
                        }
                    }
                    b.mo49529i(a, function1);
                }
                Object y = b.mo53797y();
                if (y == C12150d.m26492c()) {
                    C12741h.m28573c(dVar);
                }
                return y;
            } catch (Throwable th) {
                b.mo53789K();
                throw th;
            }
        }

        /* renamed from: g */
        private final boolean m23368g() {
            this.f16785b = C10892c.m23405z();
            Throwable J = C10887b.this.mo45876J();
            if (J == null) {
                return false;
            }
            throw C11826f0.m25456a(J);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final void m23369h() {
            C14010o<? super Boolean> oVar = this.f16786c;
            C12775o.m28636f(oVar);
            this.f16786c = null;
            this.f16785b = C10892c.m23405z();
            Throwable J = C10887b.this.mo45876J();
            if (J == null) {
                C11907m.C11908a aVar = C11907m.f18600b;
                oVar.resumeWith(C11907m.m25696a(Boolean.FALSE));
                return;
            }
            C11907m.C11908a aVar2 = C11907m.f18600b;
            oVar.resumeWith(C11907m.m25696a(C11910n.m25700a(J)));
        }

        /* renamed from: a */
        public Object mo45899a(C12074d<? super Boolean> dVar) {
            C10904j jVar;
            C10887b<E> bVar = C10887b.this;
            C10904j jVar2 = (C10904j) C10887b.f16778j.get(bVar);
            while (!bVar.mo45881U()) {
                long andIncrement = C10887b.f16774f.getAndIncrement(bVar);
                int i = C10892c.f16795b;
                long j = andIncrement / ((long) i);
                int i2 = (int) (andIncrement % ((long) i));
                if (jVar2.f18467d != j) {
                    C10904j a = bVar.m23290G(j, jVar2);
                    if (a == null) {
                        continue;
                    } else {
                        jVar = a;
                    }
                } else {
                    jVar = jVar2;
                }
                Object t = bVar.m23342z0(jVar, i2, andIncrement, (Object) null);
                if (t == C10892c.f16806m) {
                    throw new IllegalStateException("unreachable".toString());
                } else if (t == C10892c.f16808o) {
                    if (andIncrement < bVar.mo45879N()) {
                        jVar.mo48987b();
                    }
                    jVar2 = jVar;
                } else if (t == C10892c.f16807n) {
                    return m23367f(jVar, i2, andIncrement, dVar);
                } else {
                    jVar.mo48987b();
                    this.f16785b = t;
                    return C12735b.m28558a(true);
                }
            }
            return C12735b.m28558a(m23368g());
        }

        /* renamed from: b */
        public void mo45900b(C11822d0<?> d0Var, int i) {
            C14010o<? super Boolean> oVar = this.f16786c;
            if (oVar != null) {
                oVar.mo45900b(d0Var, i);
            }
        }

        /* renamed from: i */
        public final boolean mo45901i(E e) {
            C14010o<? super Boolean> oVar = this.f16786c;
            C12775o.m28636f(oVar);
            Function1<Throwable, C11921v> function1 = null;
            this.f16786c = null;
            this.f16785b = e;
            Boolean bool = Boolean.TRUE;
            Function1<E, C11921v> function12 = C10887b.this.f16783c;
            if (function12 != null) {
                function1 = C11862y.m25585a(function12, e, oVar.getContext());
            }
            return C10892c.m23378B(oVar, bool, function1);
        }

        /* renamed from: j */
        public final void mo45902j() {
            C14010o<? super Boolean> oVar = this.f16786c;
            C12775o.m28636f(oVar);
            this.f16786c = null;
            this.f16785b = C10892c.m23405z();
            Throwable J = C10887b.this.mo45876J();
            if (J == null) {
                C11907m.C11908a aVar = C11907m.f18600b;
                oVar.resumeWith(C11907m.m25696a(Boolean.FALSE));
                return;
            }
            C11907m.C11908a aVar2 = C11907m.f18600b;
            oVar.resumeWith(C11907m.m25696a(C11910n.m25700a(J)));
        }

        public E next() {
            boolean z;
            E e = this.f16785b;
            if (e != C10892c.f16809p) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f16785b = C10892c.f16809p;
                if (e != C10892c.m23405z()) {
                    return e;
                }
                throw C11826f0.m25456a(C10887b.this.m23293K());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* renamed from: ag.b$b */
    /* compiled from: BufferedChannel.kt */
    private static final class C10889b implements C13945d3 {

        /* renamed from: b */
        private final C14002n<Boolean> f16788b;

        /* renamed from: c */
        private final /* synthetic */ C14010o<Boolean> f16789c;

        /* renamed from: a */
        public final C14002n<Boolean> mo45904a() {
            return this.f16788b;
        }

        /* renamed from: b */
        public void mo45900b(C11822d0<?> d0Var, int i) {
            this.f16789c.mo45900b(d0Var, i);
        }
    }

    /* renamed from: ag.b$c */
    /* compiled from: BufferedChannel.kt */
    static final class C10890c extends C12777p implements C13089p<C12027b<?>, Object, Object, Function1<? super Throwable, ? extends C11921v>> {

        /* renamed from: g */
        final /* synthetic */ C10887b<E> f16790g;

        /* renamed from: ag.b$c$a */
        /* compiled from: BufferedChannel.kt */
        static final class C10891a extends C12777p implements Function1<Throwable, C11921v> {

            /* renamed from: g */
            final /* synthetic */ Object f16791g;

            /* renamed from: h */
            final /* synthetic */ C10887b<E> f16792h;

            /* renamed from: i */
            final /* synthetic */ C12027b<?> f16793i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10891a(Object obj, C10887b<E> bVar, C12027b<?> bVar2) {
                super(1);
                this.f16791g = obj;
                this.f16792h = bVar;
                this.f16793i = bVar2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C11921v.f18618a;
            }

            public final void invoke(Throwable th) {
                if (this.f16791g != C10892c.m23405z()) {
                    C11862y.m25586b(this.f16792h.f16783c, this.f16791g, this.f16793i.getContext());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10890c(C10887b<E> bVar) {
            super(3);
            this.f16790g = bVar;
        }

        /* renamed from: a */
        public final Function1<Throwable, C11921v> invoke(C12027b<?> bVar, Object obj, Object obj2) {
            return new C10891a(obj2, this.f16790g, bVar);
        }
    }

    static {
        Class<C10887b> cls = C10887b.class;
        f16773e = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus");
        f16774f = AtomicLongFieldUpdater.newUpdater(cls, "receivers");
        f16775g = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd");
        f16776h = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag");
        Class<Object> cls2 = Object.class;
        f16777i = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment");
        f16778j = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment");
        f16779k = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment");
        f16780l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause");
        f16781m = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler");
    }

    public C10887b(int i, Function1<? super E, C11921v> function1) {
        boolean z;
        C10890c cVar;
        this.f16782b = i;
        this.f16783c = function1;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.bufferEnd = C10892c.m23377A(i);
            this.completedExpandBuffersAndPauseFlag = m23292I();
            C10904j jVar = new C10904j(0, (C10904j) null, this, 3);
            this.sendSegment = jVar;
            this.receiveSegment = jVar;
            if (m23301Y()) {
                jVar = C10892c.f16794a;
                C12775o.m28637g(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar;
            if (function1 != null) {
                cVar = new C10890c(this);
            } else {
                cVar = null;
            }
            this.f16784d = cVar;
            this._closeCause = C10892c.f16812s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
    }

    /* renamed from: A */
    private final void m23280A(long j) {
        m23322o0(m23282B(j));
    }

    /* renamed from: A0 */
    private final Object m23281A0(C10904j<E> jVar, int i, long j, Object obj) {
        while (true) {
            Object w = jVar.mo45930w(i);
            if (w == null || w == C10892c.f16798e) {
                if (j < (f16773e.get(this) & 1152921504606846975L)) {
                    if (jVar.mo45925r(i, w, C10892c.f16801h)) {
                        m23287E();
                        return C10892c.f16808o;
                    }
                } else if (obj == null) {
                    return C10892c.f16807n;
                } else {
                    if (jVar.mo45925r(i, w, obj)) {
                        m23287E();
                        return C10892c.f16806m;
                    }
                }
            } else if (w == C10892c.f16797d) {
                if (jVar.mo45925r(i, w, C10892c.f16802i)) {
                    m23287E();
                    return jVar.mo45932y(i);
                }
            } else if (w == C10892c.f16803j) {
                return C10892c.f16808o;
            } else {
                if (w == C10892c.f16801h) {
                    return C10892c.f16808o;
                }
                if (w == C10892c.m23405z()) {
                    m23287E();
                    return C10892c.f16808o;
                } else if (w != C10892c.f16800g && jVar.mo45925r(i, w, C10892c.f16799f)) {
                    boolean z = w instanceof C10917t;
                    if (z) {
                        w = ((C10917t) w).f16832a;
                    }
                    if (m23337w0(w, jVar, i)) {
                        jVar.mo45921A(i, C10892c.f16802i);
                        m23287E();
                        return jVar.mo45932y(i);
                    }
                    jVar.mo45921A(i, C10892c.f16803j);
                    jVar.mo45931x(i, false);
                    if (z) {
                        m23287E();
                    }
                    return C10892c.f16808o;
                }
            }
        }
    }

    /* renamed from: B */
    private final C10904j<E> m23282B(long j) {
        C10904j<E> y = m23340y();
        if (mo45882X()) {
            long Z = m23302Z(y);
            if (Z != -1) {
                mo45874D(Z);
            }
        }
        m23338x(y, j);
        return y;
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public final int m23283B0(C10904j<E> jVar, int i, E e, long j, Object obj, boolean z) {
        jVar.mo45922B(i, e);
        if (z) {
            return m23285C0(jVar, i, e, j, obj, z);
        }
        Object w = jVar.mo45930w(i);
        if (w == null) {
            if (m23335v(j)) {
                if (jVar.mo45925r(i, (Object) null, C10892c.f16797d)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (jVar.mo45925r(i, (Object) null, obj)) {
                    return 2;
                }
            }
        } else if (w instanceof C13945d3) {
            jVar.mo45926s(i);
            if (m23336v0(w, e)) {
                jVar.mo45921A(i, C10892c.f16802i);
                mo45889i0();
                return 0;
            }
            if (jVar.mo45927t(i, C10892c.f16804k) != C10892c.f16804k) {
                jVar.mo45931x(i, true);
            }
            return 5;
        }
        return m23285C0(jVar, i, e, j, obj, z);
    }

    /* renamed from: C */
    private final void m23284C() {
        mo45895n();
    }

    /* renamed from: C0 */
    private final int m23285C0(C10904j<E> jVar, int i, E e, long j, Object obj, boolean z) {
        while (true) {
            Object w = jVar.mo45930w(i);
            if (w == null) {
                if (!m23335v(j) || z) {
                    if (z) {
                        if (jVar.mo45925r(i, (Object) null, C10892c.f16803j)) {
                            jVar.mo45931x(i, false);
                            return 4;
                        }
                    } else if (obj == null) {
                        return 3;
                    } else {
                        if (jVar.mo45925r(i, (Object) null, obj)) {
                            return 2;
                        }
                    }
                } else if (jVar.mo45925r(i, (Object) null, C10892c.f16797d)) {
                    return 1;
                }
            } else if (w == C10892c.f16798e) {
                if (jVar.mo45925r(i, w, C10892c.f16797d)) {
                    return 1;
                }
            } else if (w == C10892c.f16804k) {
                jVar.mo45926s(i);
                return 5;
            } else if (w == C10892c.f16801h) {
                jVar.mo45926s(i);
                return 5;
            } else if (w == C10892c.m23405z()) {
                jVar.mo45926s(i);
                m23284C();
                return 4;
            } else {
                jVar.mo45926s(i);
                if (w instanceof C10917t) {
                    w = ((C10917t) w).f16832a;
                }
                if (m23336v0(w, e)) {
                    jVar.mo45921A(i, C10892c.f16802i);
                    mo45889i0();
                    return 0;
                }
                if (jVar.mo45927t(i, C10892c.f16804k) != C10892c.f16804k) {
                    jVar.mo45931x(i, true);
                }
                return 5;
            }
        }
    }

    /* renamed from: D0 */
    private final void m23286D0(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16774f;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j || f16774f.compareAndSet(this, j2, j)) {
            }
            j2 = atomicLongFieldUpdater.get(this);
            return;
        } while (f16774f.compareAndSet(this, j2, j));
    }

    /* renamed from: E */
    private final void m23287E() {
        if (!m23301Y()) {
            C10904j jVar = (C10904j) f16779k.get(this);
            while (true) {
                long andIncrement = f16775g.getAndIncrement(this);
                int i = C10892c.f16795b;
                long j = andIncrement / ((long) i);
                if (mo45879N() <= andIncrement) {
                    if (jVar.f18467d < j && jVar.mo48988e() != null) {
                        m23308d0(j, jVar);
                    }
                    m23295Q(this, 0, 1, (Object) null);
                    return;
                }
                if (jVar.f18467d != j) {
                    C10904j F = m23289F(j, jVar, andIncrement);
                    if (F == null) {
                        continue;
                    } else {
                        jVar = F;
                    }
                }
                if (m23339x0(jVar, (int) (andIncrement % ((long) i)), andIncrement)) {
                    m23295Q(this, 0, 1, (Object) null);
                    return;
                }
                m23295Q(this, 0, 1, (Object) null);
            }
        }
    }

    /* renamed from: E0 */
    private final void m23288E0(long j) {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16773e;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            j3 = 1152921504606846975L & j2;
            if (j3 < j) {
            } else {
                return;
            }
        } while (!f16773e.compareAndSet(this, j2, C10892c.m23402w(j3, (int) (j2 >> 60))));
    }

    /* renamed from: F */
    private final C10904j<E> m23289F(long j, C10904j<E> jVar, long j2) {
        Object c;
        boolean z;
        long j3 = j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16779k;
        C13088o oVar = (C13088o) C10892c.m23404y();
        C10904j<E> jVar2 = jVar;
        do {
            c = C11821d.m25434c(jVar2, j3, oVar);
            if (C11824e0.m25455c(c)) {
                break;
            }
            C11822d0 b = C11824e0.m25454b(c);
            while (true) {
                C11822d0 d0Var = (C11822d0) atomicReferenceFieldUpdater.get(this);
                if (d0Var.f18467d >= b.f18467d) {
                    break;
                } else if (!b.mo48986q()) {
                    z = false;
                    continue;
                    break;
                } else if (C1248a.m719a(atomicReferenceFieldUpdater, this, d0Var, b)) {
                    if (d0Var.mo48984m()) {
                        d0Var.mo48992k();
                    }
                } else if (b.mo48984m()) {
                    b.mo48992k();
                }
            }
            z = true;
            continue;
        } while (!z);
        if (C11824e0.m25455c(c)) {
            m23284C();
            m23308d0(j, jVar);
            m23295Q(this, 0, 1, (Object) null);
            return null;
        }
        C10904j<E> jVar3 = (C10904j) C11824e0.m25454b(c);
        long j4 = jVar3.f18467d;
        if (j4 <= j3) {
            return jVar3;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16775g;
        int i = C10892c.f16795b;
        if (atomicLongFieldUpdater.compareAndSet(this, j2 + 1, ((long) i) * j4)) {
            m23294P((jVar3.f18467d * ((long) i)) - j2);
            return null;
        }
        m23295Q(this, 0, 1, (Object) null);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final C10904j<E> m23290G(long j, C10904j<E> jVar) {
        Object c;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16778j;
        C13088o oVar = (C13088o) C10892c.m23404y();
        do {
            c = C11821d.m25434c(jVar, j, oVar);
            if (C11824e0.m25455c(c)) {
                break;
            }
            C11822d0 b = C11824e0.m25454b(c);
            while (true) {
                C11822d0 d0Var = (C11822d0) atomicReferenceFieldUpdater.get(this);
                z = true;
                if (d0Var.f18467d >= b.f18467d) {
                    break;
                } else if (!b.mo48986q()) {
                    z = false;
                    continue;
                    break;
                } else if (C1248a.m719a(atomicReferenceFieldUpdater, this, d0Var, b)) {
                    if (d0Var.mo48984m()) {
                        d0Var.mo48992k();
                        continue;
                    } else {
                        continue;
                    }
                } else if (b.mo48984m()) {
                    b.mo48992k();
                }
            }
        } while (!z);
        if (C11824e0.m25455c(c)) {
            m23284C();
            if (jVar.f18467d * ((long) C10892c.f16795b) >= mo45879N()) {
                return null;
            }
            jVar.mo48987b();
            return null;
        }
        C10904j<E> jVar2 = (C10904j) C11824e0.m25454b(c);
        if (!m23301Y() && j <= m23292I() / ((long) C10892c.f16795b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16779k;
            while (true) {
                C11822d0 d0Var2 = (C11822d0) atomicReferenceFieldUpdater2.get(this);
                if (d0Var2.f18467d >= jVar2.f18467d || !jVar2.mo48986q()) {
                    break;
                } else if (C1248a.m719a(atomicReferenceFieldUpdater2, this, d0Var2, jVar2)) {
                    if (d0Var2.mo48984m()) {
                        d0Var2.mo48992k();
                    }
                } else if (jVar2.mo48984m()) {
                    jVar2.mo48992k();
                }
            }
        }
        long j2 = jVar2.f18467d;
        if (j2 <= j) {
            return jVar2;
        }
        int i = C10892c.f16795b;
        m23286D0(j2 * ((long) i));
        if (jVar2.f18467d * ((long) i) >= mo45879N()) {
            return null;
        }
        jVar2.mo48987b();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final C10904j<E> m23291H(long j, C10904j<E> jVar) {
        Object c;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16777i;
        C13088o oVar = (C13088o) C10892c.m23404y();
        do {
            c = C11821d.m25434c(jVar, j, oVar);
            if (C11824e0.m25455c(c)) {
                break;
            }
            C11822d0 b = C11824e0.m25454b(c);
            while (true) {
                C11822d0 d0Var = (C11822d0) atomicReferenceFieldUpdater.get(this);
                z = true;
                if (d0Var.f18467d >= b.f18467d) {
                    break;
                } else if (!b.mo48986q()) {
                    z = false;
                    continue;
                    break;
                } else if (C1248a.m719a(atomicReferenceFieldUpdater, this, d0Var, b)) {
                    if (d0Var.mo48984m()) {
                        d0Var.mo48992k();
                        continue;
                    } else {
                        continue;
                    }
                } else if (b.mo48984m()) {
                    b.mo48992k();
                }
            }
        } while (!z);
        if (C11824e0.m25455c(c)) {
            m23284C();
            if (jVar.f18467d * ((long) C10892c.f16795b) >= mo45877L()) {
                return null;
            }
            jVar.mo48987b();
            return null;
        }
        C10904j<E> jVar2 = (C10904j) C11824e0.m25454b(c);
        long j2 = jVar2.f18467d;
        if (j2 <= j) {
            return jVar2;
        }
        int i = C10892c.f16795b;
        m23288E0(j2 * ((long) i));
        if (jVar2.f18467d * ((long) i) >= mo45877L()) {
            return null;
        }
        jVar2.mo48987b();
        return null;
    }

    /* renamed from: I */
    private final long m23292I() {
        return f16775g.get(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final Throwable m23293K() {
        Throwable J = mo45876J();
        if (J == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return J;
    }

    /* renamed from: P */
    private final void m23294P(long j) {
        boolean z;
        boolean z2;
        if ((f16776h.addAndGet(this, j) & 4611686018427387904L) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            do {
                if ((f16776h.get(this) & 4611686018427387904L) != 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
            } while (z2);
        }
    }

    /* renamed from: Q */
    static /* synthetic */ void m23295Q(C10887b bVar, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 1;
            }
            bVar.m23294P(j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    /* renamed from: R */
    private final void m23296R() {
        Object obj;
        C11828g0 g0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16781m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                g0Var = C10892c.f16810q;
            } else {
                g0Var = C10892c.f16811r;
            }
        } while (!C1248a.m719a(atomicReferenceFieldUpdater, this, obj, g0Var));
        if (obj != null) {
            Function1 function1 = (Function1) C12772l0.m28614f(obj, 1);
            ((Function1) obj).invoke(mo45876J());
        }
    }

    /* renamed from: S */
    private final boolean m23297S(C10904j<E> jVar, int i, long j) {
        Object w;
        do {
            w = jVar.mo45930w(i);
            if (w != null && w != C10892c.f16798e) {
                if (w == C10892c.f16797d) {
                    return true;
                }
                if (w == C10892c.f16803j || w == C10892c.m23405z() || w == C10892c.f16802i || w == C10892c.f16801h) {
                    return false;
                }
                if (w == C10892c.f16800g) {
                    return true;
                }
                if (w != C10892c.f16799f && j == mo45877L()) {
                    return true;
                }
                return false;
            }
        } while (!jVar.mo45925r(i, w, C10892c.f16801h));
        m23287E();
        return false;
    }

    /* renamed from: T */
    private final boolean m23298T(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            m23282B(j & 1152921504606846975L);
            if (z && mo45880O()) {
                return false;
            }
        } else if (i == 3) {
            m23280A(j & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i).toString());
        }
        return true;
    }

    /* renamed from: V */
    private final boolean m23299V(long j) {
        return m23298T(j, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public final boolean m23300W(long j) {
        return m23298T(j, false);
    }

    /* renamed from: Y */
    private final boolean m23301Y() {
        long I = m23292I();
        if (I == 0 || I == LocationRequestCompat.PASSIVE_INTERVAL) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private final long m23302Z(C10904j<E> jVar) {
        do {
            int i = C10892c.f16795b;
            while (true) {
                i--;
                if (-1 < i) {
                    long j = (jVar.f18467d * ((long) C10892c.f16795b)) + ((long) i);
                    if (j < mo45877L()) {
                        return -1;
                    }
                    while (true) {
                        Object w = jVar.mo45930w(i);
                        if (w == null || w == C10892c.f16798e) {
                            if (jVar.mo45925r(i, w, C10892c.m23405z())) {
                                jVar.mo48985p();
                                break;
                            }
                        } else if (w == C10892c.f16797d) {
                            return j;
                        }
                    }
                } else {
                    jVar = (C10904j) jVar.mo48989g();
                }
            }
        } while (jVar != null);
        return -1;
    }

    /* renamed from: a0 */
    private final void m23304a0() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16773e;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) == 0) {
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, C10892c.m23402w(1152921504606846975L & j, 1)));
    }

    /* renamed from: b0 */
    private final void m23305b0() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16773e;
        do {
            j = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, C10892c.m23402w(1152921504606846975L & j, 3)));
    }

    /* renamed from: c0 */
    private final void m23307c0() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16773e;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                j2 = C10892c.m23402w(j & 1152921504606846975L, 2);
            } else if (i == 1) {
                j2 = C10892c.m23402w(j & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
    }

    /* renamed from: d0 */
    private final void m23308d0(long j, C10904j<E> jVar) {
        boolean z;
        C10904j<E> jVar2;
        C10904j<E> jVar3;
        while (jVar.f18467d < j && (jVar3 = (C10904j) jVar.mo48988e()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.mo48983h() || (jVar2 = (C10904j) jVar.mo48988e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16779k;
                while (true) {
                    C11822d0 d0Var = (C11822d0) atomicReferenceFieldUpdater.get(this);
                    z = true;
                    if (d0Var.f18467d >= jVar.f18467d) {
                        break;
                    } else if (!jVar.mo48986q()) {
                        z = false;
                        break;
                    } else if (C1248a.m719a(atomicReferenceFieldUpdater, this, d0Var, jVar)) {
                        if (d0Var.mo48984m()) {
                            d0Var.mo48992k();
                        }
                    } else if (jVar.mo48984m()) {
                        jVar.mo48992k();
                    }
                }
                if (z) {
                    return;
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m23310f0(C14002n<? super E> nVar) {
        C11907m.C11908a aVar = C11907m.f18600b;
        nVar.resumeWith(C11907m.m25696a(C11910n.m25700a(m23293K())));
    }

    /* renamed from: g0 */
    private final Object m23311g0(E e, C12074d<? super C11921v> dVar) {
        UndeliveredElementException d;
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        Function1<E, C11921v> function1 = this.f16783c;
        if (function1 == null || (d = C11862y.m25588d(function1, e, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            Throwable M = mo45878M();
            C11907m.C11908a aVar = C11907m.f18600b;
            oVar.resumeWith(C11907m.m25696a(C11910n.m25700a(M)));
        } else {
            C11894b.m25683a(d, mo45878M());
            C11907m.C11908a aVar2 = C11907m.f18600b;
            oVar.resumeWith(C11907m.m25696a(C11910n.m25700a(d)));
        }
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (y == C12150d.m26492c()) {
            return y;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m23313h0(E e, C14002n<? super C11921v> nVar) {
        Function1<E, C11921v> function1 = this.f16783c;
        if (function1 != null) {
            C11862y.m25586b(function1, e, nVar.getContext());
        }
        Throwable M = mo45878M();
        C11907m.C11908a aVar = C11907m.f18600b;
        nVar.resumeWith(C11907m.m25696a(C11910n.m25700a(M)));
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m23317k0(C13945d3 d3Var, C10904j<E> jVar, int i) {
        mo45892j0();
        d3Var.mo45900b(jVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public final void m23318l0(C13945d3 d3Var, C10904j<E> jVar, int i) {
        d3Var.mo45900b(jVar, i + C10892c.f16795b);
    }

    /* renamed from: m0 */
    static /* synthetic */ <E> Object m23319m0(C10887b<E> bVar, C12074d<? super E> dVar) {
        C10904j jVar;
        C10904j jVar2 = (C10904j) f16778j.get(bVar);
        while (!bVar.mo45881U()) {
            long andIncrement = f16774f.getAndIncrement(bVar);
            int i = C10892c.f16795b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (jVar2.f18467d != j) {
                C10904j a = bVar.m23290G(j, jVar2);
                if (a == null) {
                    continue;
                } else {
                    jVar = a;
                }
            } else {
                jVar = jVar2;
            }
            Object t = bVar.m23342z0(jVar, i2, andIncrement, (Object) null);
            if (t == C10892c.f16806m) {
                throw new IllegalStateException("unexpected".toString());
            } else if (t == C10892c.f16808o) {
                if (andIncrement < bVar.mo45879N()) {
                    jVar.mo48987b();
                }
                jVar2 = jVar;
            } else if (t == C10892c.f16807n) {
                return bVar.m23320n0(jVar, i2, andIncrement, dVar);
            } else {
                jVar.mo48987b();
                return t;
            }
        }
        throw C11826f0.m25456a(bVar.m23293K());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: yf.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: gg.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kotlin.jvm.functions.Function1<E, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlin.jvm.functions.Function1<java.lang.Throwable, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: gg.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: gg.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: kotlin.jvm.functions.Function1<E, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.Function1<java.lang.Throwable, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: gg.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: gg.a} */
    /* JADX WARNING: type inference failed for: r7v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m23320n0(p308ag.C10904j<E> r9, int r10, long r11, p355hf.C12074d<? super E> r13) {
        /*
            r8 = this;
            hf.d r0 = p362if.C12147c.m26491b(r13)
            yf.o r0 = p466yf.C14018q.m32525b(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r0
            java.lang.Object r1 = r1.m23342z0(r2, r3, r4, r6)     // Catch:{ all -> 0x00d1 }
            dg.g0 r2 = p308ag.C10892c.f16806m     // Catch:{ all -> 0x00d1 }
            if (r1 != r2) goto L_0x001c
            r8.m23317k0(r0, r9, r10)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x001c:
            dg.g0 r10 = p308ag.C10892c.f16808o     // Catch:{ all -> 0x00d1 }
            r7 = 0
            if (r1 != r10) goto L_0x00b3
            long r1 = r8.mo45879N()     // Catch:{ all -> 0x00d1 }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x002e
            r9.mo48987b()     // Catch:{ all -> 0x00d1 }
        L_0x002e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f16778j     // Catch:{ all -> 0x00d1 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x00d1 }
            ag.j r9 = (p308ag.C10904j) r9     // Catch:{ all -> 0x00d1 }
        L_0x0038:
            boolean r10 = r8.mo45881U()     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x0043
            r8.m23310f0(r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x0043:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = f16774f     // Catch:{ all -> 0x00d1 }
            long r10 = r10.getAndIncrement(r8)     // Catch:{ all -> 0x00d1 }
            int r12 = p308ag.C10892c.f16795b     // Catch:{ all -> 0x00d1 }
            long r1 = (long) r12     // Catch:{ all -> 0x00d1 }
            long r1 = r10 / r1
            long r3 = (long) r12     // Catch:{ all -> 0x00d1 }
            long r3 = r10 % r3
            int r12 = (int) r3     // Catch:{ all -> 0x00d1 }
            long r3 = r9.f18467d     // Catch:{ all -> 0x00d1 }
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0062
            ag.j r1 = r8.m23290G(r1, r9)     // Catch:{ all -> 0x00d1 }
            if (r1 != 0) goto L_0x0061
            goto L_0x0038
        L_0x0061:
            r9 = r1
        L_0x0062:
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r0
            java.lang.Object r1 = r1.m23342z0(r2, r3, r4, r6)     // Catch:{ all -> 0x00d1 }
            dg.g0 r2 = p308ag.C10892c.f16806m     // Catch:{ all -> 0x00d1 }
            if (r1 != r2) goto L_0x007c
            boolean r10 = r0 instanceof p466yf.C13945d3     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x0076
            r7 = r0
        L_0x0076:
            if (r7 == 0) goto L_0x00c3
            r8.m23317k0(r7, r9, r12)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x007c:
            dg.g0 r12 = p308ag.C10892c.f16808o     // Catch:{ all -> 0x00d1 }
            if (r1 != r12) goto L_0x008e
            long r1 = r8.mo45879N()     // Catch:{ all -> 0x00d1 }
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0038
            r9.mo48987b()     // Catch:{ all -> 0x00d1 }
            goto L_0x0038
        L_0x008e:
            dg.g0 r10 = p308ag.C10892c.f16807n     // Catch:{ all -> 0x00d1 }
            if (r1 == r10) goto L_0x00a7
            r9.mo48987b()     // Catch:{ all -> 0x00d1 }
            kotlin.jvm.functions.Function1<E, ef.v> r9 = r8.f16783c     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a3
            hf.g r10 = r0.getContext()     // Catch:{ all -> 0x00d1 }
            kotlin.jvm.functions.Function1 r7 = p331dg.C11862y.m25585a(r9, r1, r10)     // Catch:{ all -> 0x00d1 }
        L_0x00a3:
            r0.mo49529i(r1, r7)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x00a7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d1 }
            java.lang.String r10 = "unexpected"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00d1 }
            r9.<init>(r10)     // Catch:{ all -> 0x00d1 }
            throw r9     // Catch:{ all -> 0x00d1 }
        L_0x00b3:
            r9.mo48987b()     // Catch:{ all -> 0x00d1 }
            kotlin.jvm.functions.Function1<E, ef.v> r9 = r8.f16783c     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a3
            hf.g r10 = r0.getContext()     // Catch:{ all -> 0x00d1 }
            kotlin.jvm.functions.Function1 r7 = p331dg.C11862y.m25585a(r9, r1, r10)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a3
        L_0x00c3:
            java.lang.Object r9 = r0.mo53797y()
            java.lang.Object r10 = p362if.C12150d.m26492c()
            if (r9 != r10) goto L_0x00d0
            kotlin.coroutines.jvm.internal.C12741h.m28573c(r13)
        L_0x00d0:
            return r9
        L_0x00d1:
            r9 = move-exception
            r0.mo53789K()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p308ag.C10887b.m23320n0(ag.j, int, long, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r12 = (p308ag.C10904j) r12.mo48989g();
     */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23322o0(p308ag.C10904j<E> r12) {
        /*
            r11 = this;
            kotlin.jvm.functions.Function1<E, ef.v> r0 = r11.f16783c
            r1 = 0
            r2 = 1
            java.lang.Object r3 = p331dg.C11842m.m25506b(r1, r2, r1)
        L_0x0008:
            int r4 = p308ag.C10892c.f16795b
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00b3
            long r6 = r12.f18467d
            int r8 = p308ag.C10892c.f16795b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0016:
            java.lang.Object r8 = r12.mo45930w(r4)
            dg.g0 r9 = p308ag.C10892c.f16802i
            if (r8 == r9) goto L_0x00bb
            dg.g0 r9 = p308ag.C10892c.f16797d
            if (r8 != r9) goto L_0x0048
            long r9 = r11.mo45877L()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            dg.g0 r9 = p308ag.C10892c.m23405z()
            boolean r8 = r12.mo45925r(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0040
            java.lang.Object r5 = r12.mo45929v(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = p331dg.C11862y.m25587c(r0, r5, r1)
        L_0x0040:
            r12.mo45926s(r4)
            r12.mo48985p()
            goto L_0x00af
        L_0x0048:
            dg.g0 r9 = p308ag.C10892c.f16798e
            if (r8 == r9) goto L_0x00a2
            if (r8 != 0) goto L_0x0051
            goto L_0x00a2
        L_0x0051:
            boolean r9 = r8 instanceof p466yf.C13945d3
            if (r9 != 0) goto L_0x006e
            boolean r9 = r8 instanceof p308ag.C10917t
            if (r9 == 0) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            dg.g0 r9 = p308ag.C10892c.f16800g
            if (r8 == r9) goto L_0x00bb
            dg.g0 r9 = p308ag.C10892c.f16799f
            if (r8 != r9) goto L_0x0067
            goto L_0x00bb
        L_0x0067:
            dg.g0 r9 = p308ag.C10892c.f16800g
            if (r8 == r9) goto L_0x0016
            goto L_0x00af
        L_0x006e:
            long r9 = r11.mo45877L()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            boolean r9 = r8 instanceof p308ag.C10917t
            if (r9 == 0) goto L_0x0080
            r9 = r8
            ag.t r9 = (p308ag.C10917t) r9
            yf.d3 r9 = r9.f16832a
            goto L_0x0083
        L_0x0080:
            r9 = r8
            yf.d3 r9 = (p466yf.C13945d3) r9
        L_0x0083:
            dg.g0 r10 = p308ag.C10892c.m23405z()
            boolean r8 = r12.mo45925r(r4, r8, r10)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0097
            java.lang.Object r5 = r12.mo45929v(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = p331dg.C11862y.m25587c(r0, r5, r1)
        L_0x0097:
            java.lang.Object r3 = p331dg.C11842m.m25507c(r3, r9)
            r12.mo45926s(r4)
            r12.mo48985p()
            goto L_0x00af
        L_0x00a2:
            dg.g0 r9 = p308ag.C10892c.m23405z()
            boolean r8 = r12.mo45925r(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            r12.mo48985p()
        L_0x00af:
            int r4 = r4 + -1
            goto L_0x000b
        L_0x00b3:
            dg.e r12 = r12.mo48989g()
            ag.j r12 = (p308ag.C10904j) r12
            if (r12 != 0) goto L_0x0008
        L_0x00bb:
            if (r3 == 0) goto L_0x00e1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto L_0x00c7
            yf.d3 r3 = (p466yf.C13945d3) r3
            r11.m23326q0(r3)
            goto L_0x00e1
        L_0x00c7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.C12775o.m28637g(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        L_0x00d3:
            if (r5 >= r12) goto L_0x00e1
            java.lang.Object r0 = r3.get(r12)
            yf.d3 r0 = (p466yf.C13945d3) r0
            r11.m23326q0(r0)
            int r12 = r12 + -1
            goto L_0x00d3
        L_0x00e1:
            if (r1 != 0) goto L_0x00e4
            return
        L_0x00e4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p308ag.C10887b.m23322o0(ag.j):void");
    }

    /* renamed from: p0 */
    private final void m23324p0(C13945d3 d3Var) {
        m23328r0(d3Var, true);
    }

    /* renamed from: q0 */
    private final void m23326q0(C13945d3 d3Var) {
        m23328r0(d3Var, false);
    }

    /* renamed from: r0 */
    private final void m23328r0(C13945d3 d3Var, boolean z) {
        Throwable th;
        if (d3Var instanceof C10889b) {
            C14002n<Boolean> a = ((C10889b) d3Var).mo45904a();
            C11907m.C11908a aVar = C11907m.f18600b;
            a.resumeWith(C11907m.m25696a(Boolean.FALSE));
        } else if (d3Var instanceof C14002n) {
            C12074d dVar = (C12074d) d3Var;
            C11907m.C11908a aVar2 = C11907m.f18600b;
            if (z) {
                th = m23293K();
            } else {
                th = mo45878M();
            }
            dVar.resumeWith(C11907m.m25696a(C11910n.m25700a(th)));
        } else if (d3Var instanceof C10913q) {
            C14010o<C10899h<? extends E>> oVar = ((C10913q) d3Var).f16831b;
            C11907m.C11908a aVar3 = C11907m.f18600b;
            oVar.resumeWith(C11907m.m25696a(C10899h.m23421b(C10899h.f16818b.mo45918a(mo45876J()))));
        } else if (d3Var instanceof C10888a) {
            ((C10888a) d3Var).mo45902j();
        } else if (d3Var instanceof C12027b) {
            ((C12027b) d3Var).mo49453a(this, C10892c.m23405z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + d3Var).toString());
        }
    }

    /* renamed from: s0 */
    static /* synthetic */ <E> Object m23330s0(C10887b<E> bVar, E e, C12074d<? super C11921v> dVar) {
        C10904j jVar;
        C10887b<E> bVar2 = bVar;
        C10904j jVar2 = (C10904j) f16777i.get(bVar);
        while (true) {
            long andIncrement = f16773e.getAndIncrement(bVar);
            long j = andIncrement & 1152921504606846975L;
            boolean o = bVar.m23300W(andIncrement);
            int i = C10892c.f16795b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (jVar2.f18467d != j2) {
                C10904j c = bVar.m23291H(j2, jVar2);
                if (c != null) {
                    jVar = c;
                } else if (o) {
                    Object g0 = bVar.m23311g0(e, dVar);
                    if (g0 == C12150d.m26492c()) {
                        return g0;
                    }
                }
            } else {
                jVar = jVar2;
            }
            int u = bVar.m23283B0(jVar, i2, e, j, (Object) null, o);
            if (u == 0) {
                jVar.mo48987b();
                break;
            } else if (u == 1) {
                break;
            } else if (u != 2) {
                if (u == 3) {
                    Object t0 = bVar.m23332t0(jVar, i2, e, j, dVar);
                    if (t0 == C12150d.m26492c()) {
                        return t0;
                    }
                } else if (u != 4) {
                    if (u == 5) {
                        jVar.mo48987b();
                    }
                    jVar2 = jVar;
                } else {
                    if (j < bVar.mo45877L()) {
                        jVar.mo48987b();
                    }
                    Object g02 = bVar.m23311g0(e, dVar);
                    if (g02 == C12150d.m26492c()) {
                        return g02;
                    }
                }
            } else if (o) {
                jVar.mo48985p();
                Object g03 = bVar.m23311g0(e, dVar);
                if (g03 == C12150d.m26492c()) {
                    return g03;
                }
            }
        }
        return C11921v.f18618a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0123  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m23332t0(p308ag.C10904j<E> r21, int r22, E r23, long r24, p355hf.C12074d<? super p336ef.C11921v> r26) {
        /*
            r20 = this;
            r9 = r20
            r0 = r23
            hf.d r1 = p362if.C12147c.m26491b(r26)
            yf.o r10 = p466yf.C14018q.m32525b(r1)
            r8 = 0
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r10
            int r1 = r1.m23283B0(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x0101
            r11 = 1
            if (r1 == r11) goto L_0x00f8
            r12 = 2
            if (r1 == r12) goto L_0x00f0
            r13 = 4
            if (r1 == r13) goto L_0x00e3
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x00d9
            r21.mo48987b()     // Catch:{ all -> 0x0126 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f16777i     // Catch:{ all -> 0x0126 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0126 }
            ag.j r1 = (p308ag.C10904j) r1     // Catch:{ all -> 0x0126 }
        L_0x0039:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f16773e     // Catch:{ all -> 0x0126 }
            long r2 = r2.getAndIncrement(r9)     // Catch:{ all -> 0x0126 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r16 = r2 & r4
            boolean r18 = r9.m23300W(r2)     // Catch:{ all -> 0x0126 }
            int r2 = p308ag.C10892c.f16795b     // Catch:{ all -> 0x0126 }
            long r3 = (long) r2     // Catch:{ all -> 0x0126 }
            long r3 = r16 / r3
            long r5 = (long) r2     // Catch:{ all -> 0x0126 }
            long r5 = r16 % r5
            int r8 = (int) r5     // Catch:{ all -> 0x0126 }
            long r5 = r1.f18467d     // Catch:{ all -> 0x0126 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006a
            ag.j r2 = r9.m23291H(r3, r1)     // Catch:{ all -> 0x0126 }
            if (r2 != 0) goto L_0x0068
            if (r18 == 0) goto L_0x0039
        L_0x0063:
            r9.m23313h0(r0, r10)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x0068:
            r7 = r2
            goto L_0x006b
        L_0x006a:
            r7 = r1
        L_0x006b:
            r1 = r20
            r2 = r7
            r3 = r8
            r4 = r23
            r5 = r16
            r21 = r7
            r7 = r10
            r19 = r8
            r8 = r18
            int r1 = r1.m23283B0(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x00cb
            if (r1 == r11) goto L_0x00bf
            if (r1 == r12) goto L_0x00a8
            r2 = 3
            if (r1 == r2) goto L_0x009e
            if (r1 == r13) goto L_0x0092
            if (r1 == r15) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r21.mo48987b()     // Catch:{ all -> 0x0126 }
        L_0x008f:
            r1 = r21
            goto L_0x0039
        L_0x0092:
            long r1 = r20.mo45877L()     // Catch:{ all -> 0x0126 }
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.mo48987b()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x009e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0126 }
            r0.<init>(r1)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x00a8:
            if (r18 == 0) goto L_0x00ae
            r21.mo48985p()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x00ae:
            boolean r0 = r10 instanceof p466yf.C13945d3     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x00b4
            r0 = r10
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            if (r0 == 0) goto L_0x010f
            r2 = r21
            r1 = r19
            r9.m23318l0(r0, r2, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00bf:
            ef.m$a r0 = p336ef.C11907m.f18600b     // Catch:{ all -> 0x0126 }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = p336ef.C11907m.m25696a(r0)     // Catch:{ all -> 0x0126 }
        L_0x00c7:
            r10.resumeWith(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00cb:
            r2 = r21
            r2.mo48987b()     // Catch:{ all -> 0x0126 }
            ef.m$a r0 = p336ef.C11907m.f18600b     // Catch:{ all -> 0x0126 }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = p336ef.C11907m.m25696a(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x00d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0126 }
            r0.<init>(r1)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x00e3:
            long r1 = r20.mo45877L()     // Catch:{ all -> 0x0126 }
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.mo48987b()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x00f0:
            r0 = r21
            r1 = r22
            r9.m23318l0(r10, r0, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00f8:
            ef.m$a r0 = p336ef.C11907m.f18600b     // Catch:{ all -> 0x0126 }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = p336ef.C11907m.m25696a(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x0101:
            r0 = r21
            r21.mo48987b()     // Catch:{ all -> 0x0126 }
            ef.m$a r0 = p336ef.C11907m.f18600b     // Catch:{ all -> 0x0126 }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = p336ef.C11907m.m25696a(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x010f:
            java.lang.Object r0 = r10.mo53797y()
            java.lang.Object r1 = p362if.C12150d.m26492c()
            if (r0 != r1) goto L_0x011c
            kotlin.coroutines.jvm.internal.C12741h.m28573c(r26)
        L_0x011c:
            java.lang.Object r1 = p362if.C12150d.m26492c()
            if (r0 != r1) goto L_0x0123
            return r0
        L_0x0123:
            ef.v r0 = p336ef.C11921v.f18618a
            return r0
        L_0x0126:
            r0 = move-exception
            r10.mo53789K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p308ag.C10887b.m23332t0(ag.j, int, java.lang.Object, long, hf.d):java.lang.Object");
    }

    /* renamed from: u0 */
    private final boolean m23334u0(long j) {
        if (m23300W(j)) {
            return false;
        }
        return !m23335v(j & 1152921504606846975L);
    }

    /* renamed from: v */
    private final boolean m23335v(long j) {
        if (j < m23292I() || j < mo45877L() + ((long) this.f16782b)) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    private final boolean m23336v0(Object obj, E e) {
        if (obj instanceof C12027b) {
            return ((C12027b) obj).mo49453a(this, e);
        }
        Function1<Throwable, C11921v> function1 = null;
        if (obj instanceof C10913q) {
            C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C10913q qVar = (C10913q) obj;
            C14010o<C10899h<? extends E>> oVar = qVar.f16831b;
            C10899h b = C10899h.m23421b(C10899h.f16818b.mo45920c(e));
            Function1<E, C11921v> function12 = this.f16783c;
            if (function12 != null) {
                function1 = C11862y.m25585a(function12, e, qVar.f16831b.getContext());
            }
            return C10892c.m23378B(oVar, b, function1);
        } else if (obj instanceof C10888a) {
            C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((C10888a) obj).mo45901i(e);
        } else if (obj instanceof C14002n) {
            C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            C14002n nVar = (C14002n) obj;
            Function1<E, C11921v> function13 = this.f16783c;
            if (function13 != null) {
                function1 = C11862y.m25585a(function13, e, nVar.getContext());
            }
            return C10892c.m23378B(nVar, e, function1);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    /* renamed from: w0 */
    private final boolean m23337w0(Object obj, C10904j<E> jVar, int i) {
        if (obj instanceof C14002n) {
            C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return C10892c.m23379C((C14002n) obj, C11921v.f18618a, (Function1) null, 2, (Object) null);
        } else if (obj instanceof C12027b) {
            C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C12030d f = ((C12025a) obj).mo49456f(this, C11921v.f18618a);
            if (f == C12030d.REREGISTER) {
                jVar.mo45926s(i);
            }
            if (f == C12030d.SUCCESSFUL) {
                return true;
            }
            return false;
        } else if (obj instanceof C10889b) {
            return C10892c.m23379C(((C10889b) obj).mo45904a(), Boolean.TRUE, (Function1) null, 2, (Object) null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    /* renamed from: x */
    private final void m23338x(C10904j<E> jVar, long j) {
        Object b = C11842m.m25506b((Object) null, 1, (DefaultConstructorMarker) null);
        loop0:
        while (jVar != null) {
            for (int i = C10892c.f16795b - 1; -1 < i; i--) {
                if ((jVar.f18467d * ((long) C10892c.f16795b)) + ((long) i) < j) {
                    break loop0;
                }
                while (true) {
                    Object w = jVar.mo45930w(i);
                    if (w == null || w == C10892c.f16798e) {
                        if (jVar.mo45925r(i, w, C10892c.m23405z())) {
                            jVar.mo48985p();
                            break;
                        }
                    } else if (w instanceof C10917t) {
                        if (jVar.mo45925r(i, w, C10892c.m23405z())) {
                            b = C11842m.m25507c(b, ((C10917t) w).f16832a);
                            jVar.mo45931x(i, true);
                            break;
                        }
                    } else if (!(w instanceof C13945d3)) {
                        break;
                    } else if (jVar.mo45925r(i, w, C10892c.m23405z())) {
                        b = C11842m.m25507c(b, w);
                        jVar.mo45931x(i, true);
                        break;
                    }
                }
            }
            jVar = (C10904j) jVar.mo48989g();
        }
        if (b == null) {
            return;
        }
        if (!(b instanceof ArrayList)) {
            m23324p0((C13945d3) b);
            return;
        }
        C12775o.m28637g(b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) b;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            m23324p0((C13945d3) arrayList.get(size));
        }
    }

    /* renamed from: x0 */
    private final boolean m23339x0(C10904j<E> jVar, int i, long j) {
        Object w = jVar.mo45930w(i);
        if (!(w instanceof C13945d3) || j < f16774f.get(this) || !jVar.mo45925r(i, w, C10892c.f16800g)) {
            return m23341y0(jVar, i, j);
        }
        if (m23337w0(w, jVar, i)) {
            jVar.mo45921A(i, C10892c.f16797d);
            return true;
        }
        jVar.mo45921A(i, C10892c.f16803j);
        jVar.mo45931x(i, false);
        return false;
    }

    /* renamed from: y */
    private final C10904j<E> m23340y() {
        C10904j jVar = f16779k.get(this);
        C10904j jVar2 = (C10904j) f16777i.get(this);
        if (jVar2.f18467d > ((C10904j) jVar).f18467d) {
            jVar = jVar2;
        }
        C10904j jVar3 = (C10904j) f16778j.get(this);
        if (jVar3.f18467d > ((C10904j) jVar).f18467d) {
            jVar = jVar3;
        }
        return (C10904j) C11821d.m25433b((C11823e) jVar);
    }

    /* renamed from: y0 */
    private final boolean m23341y0(C10904j<E> jVar, int i, long j) {
        while (true) {
            Object w = jVar.mo45930w(i);
            if (w instanceof C13945d3) {
                if (j < f16774f.get(this)) {
                    if (jVar.mo45925r(i, w, new C10917t((C13945d3) w))) {
                        return true;
                    }
                } else if (jVar.mo45925r(i, w, C10892c.f16800g)) {
                    if (m23337w0(w, jVar, i)) {
                        jVar.mo45921A(i, C10892c.f16797d);
                        return true;
                    }
                    jVar.mo45921A(i, C10892c.f16803j);
                    jVar.mo45931x(i, false);
                    return false;
                }
            } else if (w == C10892c.f16803j) {
                return false;
            } else {
                if (w == null) {
                    if (jVar.mo45925r(i, w, C10892c.f16798e)) {
                        return true;
                    }
                } else if (w == C10892c.f16797d || w == C10892c.f16801h || w == C10892c.f16802i || w == C10892c.f16804k || w == C10892c.m23405z()) {
                    return true;
                } else {
                    if (w != C10892c.f16799f) {
                        throw new IllegalStateException(("Unexpected cell state: " + w).toString());
                    }
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public final Object m23342z0(C10904j<E> jVar, int i, long j, Object obj) {
        Object w = jVar.mo45930w(i);
        if (w == null) {
            if (j >= (f16773e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return C10892c.f16807n;
                }
                if (jVar.mo45925r(i, w, obj)) {
                    m23287E();
                    return C10892c.f16806m;
                }
            }
        } else if (w == C10892c.f16797d && jVar.mo45925r(i, w, C10892c.f16802i)) {
            m23287E();
            return jVar.mo45932y(i);
        }
        return m23281A0(jVar, i, j, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo45874D(long j) {
        UndeliveredElementException d;
        C10904j jVar = (C10904j) f16778j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16774f;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j >= Math.max(((long) this.f16782b) + j2, m23292I())) {
                if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                    int i = C10892c.f16795b;
                    long j3 = j2 / ((long) i);
                    int i2 = (int) (j2 % ((long) i));
                    if (jVar.f18467d != j3) {
                        C10904j G = m23290G(j3, jVar);
                        if (G == null) {
                            continue;
                        } else {
                            jVar = G;
                        }
                    }
                    Object z0 = m23342z0(jVar, i2, j2, (Object) null);
                    if (z0 != C10892c.f16808o) {
                        jVar.mo48987b();
                        Function1<E, C11921v> function1 = this.f16783c;
                        if (!(function1 == null || (d = C11862y.m25588d(function1, z0, (UndeliveredElementException) null, 2, (Object) null)) == null)) {
                            throw d;
                        }
                    } else if (j2 < mo45879N()) {
                        jVar.mo48987b();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: F0 */
    public final void mo45875F0(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z;
        long j3;
        if (!m23301Y()) {
            do {
            } while (m23292I() <= j);
            int g = C10892c.f16796c;
            int i = 0;
            while (i < g) {
                long I = m23292I();
                if (I != (4611686018427387903L & f16776h.get(this)) || I != m23292I()) {
                    i++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16776h;
            do {
                j2 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, C10892c.m23401v(j2 & 4611686018427387903L, true)));
            while (true) {
                long I2 = m23292I();
                atomicLongFieldUpdater = f16776h;
                long j4 = atomicLongFieldUpdater.get(this);
                long j5 = j4 & 4611686018427387903L;
                if ((4611686018427387904L & j4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (I2 == j5 && I2 == m23292I()) {
                    break;
                } else if (!z) {
                    atomicLongFieldUpdater.compareAndSet(this, j4, C10892c.m23401v(j5, true));
                }
            }
            do {
                j3 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, C10892c.m23401v(j3 & 4611686018427387903L, false)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final Throwable mo45876J() {
        return (Throwable) f16780l.get(this);
    }

    /* renamed from: L */
    public final long mo45877L() {
        return f16774f.get(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final Throwable mo45878M() {
        Throwable J = mo45876J();
        if (J == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return J;
    }

    /* renamed from: N */
    public final long mo45879N() {
        return f16773e.get(this) & 1152921504606846975L;
    }

    /* renamed from: O */
    public final boolean mo45880O() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16778j;
            C10904j jVar = (C10904j) atomicReferenceFieldUpdater.get(this);
            long L = mo45877L();
            if (mo45879N() <= L) {
                return false;
            }
            int i = C10892c.f16795b;
            long j = L / ((long) i);
            if (jVar.f18467d == j || (jVar = m23290G(j, jVar)) != null) {
                jVar.mo48987b();
                if (m23297S(jVar, (int) (L % ((long) i)), L)) {
                    return true;
                }
                f16774f.compareAndSet(this, L, L + 1);
            } else if (((C10904j) atomicReferenceFieldUpdater.get(this)).f18467d < j) {
                return false;
            }
        }
    }

    /* renamed from: U */
    public boolean mo45881U() {
        return m23299V(f16773e.get(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public boolean mo45882X() {
        return false;
    }

    /* renamed from: b */
    public Object mo45883b(C12074d<? super E> dVar) {
        return m23319m0(this, dVar);
    }

    public final void cancel(CancellationException cancellationException) {
        mo45897w(cancellationException);
    }

    /* renamed from: d */
    public Object mo45885d() {
        C10904j jVar;
        C13945d3 d3Var;
        long j = f16774f.get(this);
        long j2 = f16773e.get(this);
        if (m23299V(j2)) {
            return C10899h.f16818b.mo45918a(mo45876J());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return C10899h.f16818b.mo45919b();
        }
        C11828g0 i = C10892c.f16804k;
        C10904j jVar2 = (C10904j) f16778j.get(this);
        while (!mo45881U()) {
            long andIncrement = f16774f.getAndIncrement(this);
            int i2 = C10892c.f16795b;
            long j3 = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (jVar2.f18467d != j3) {
                C10904j a = m23290G(j3, jVar2);
                if (a == null) {
                    continue;
                } else {
                    jVar = a;
                }
            } else {
                jVar = jVar2;
            }
            Object t = m23342z0(jVar, i3, andIncrement, i);
            if (t == C10892c.f16806m) {
                if (i instanceof C13945d3) {
                    d3Var = (C13945d3) i;
                } else {
                    d3Var = null;
                }
                if (d3Var != null) {
                    m23317k0(d3Var, jVar, i3);
                }
                mo45875F0(andIncrement);
                jVar.mo48985p();
                return C10899h.f16818b.mo45919b();
            } else if (t == C10892c.f16808o) {
                if (andIncrement < mo45879N()) {
                    jVar.mo48987b();
                }
                jVar2 = jVar;
            } else if (t != C10892c.f16807n) {
                jVar.mo48987b();
                return C10899h.f16818b.mo45920c(t);
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return C10899h.f16818b.mo45918a(mo45876J());
    }

    /* renamed from: e */
    public boolean mo45886e(Throwable th) {
        return mo45898z(th, false);
    }

    /* renamed from: g */
    public void mo45888g(Function1<? super Throwable, C11921v> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16781m;
        if (!C1248a.m719a(atomicReferenceFieldUpdater, this, (Object) null, function1)) {
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != C10892c.f16810q) {
                    if (obj == C10892c.f16811r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!C1248a.m719a(f16781m, this, C10892c.f16810q, C10892c.f16811r));
            function1.invoke(mo45876J());
        }
    }

    public boolean isEmpty() {
        if (!mo45881U() && !mo45880O()) {
            return !mo45881U();
        }
        return false;
    }

    public C10897f<E> iterator() {
        return new C10888a();
    }

    /* renamed from: l */
    public Object mo45893l(E e, C12074d<? super C11921v> dVar) {
        return m23330s0(this, e, dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return p308ag.C10899h.f16818b.mo45918a(mo45878M());
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo45894m(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f16773e
            long r0 = r0.get(r14)
            boolean r0 = r14.m23334u0(r0)
            if (r0 == 0) goto L_0x0013
            ag.h$b r15 = p308ag.C10899h.f16818b
            java.lang.Object r15 = r15.mo45919b()
            return r15
        L_0x0013:
            dg.g0 r8 = p308ag.C10892c.f16803j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f16777i
            java.lang.Object r0 = r0.get(r14)
            ag.j r0 = (p308ag.C10904j) r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f16773e
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r14.m23300W(r1)
            int r1 = p308ag.C10892c.f16795b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f18467d
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x004e
            ag.j r1 = r14.m23291H(r2, r0)
            if (r1 != 0) goto L_0x004c
            if (r11 == 0) goto L_0x0021
            goto L_0x008e
        L_0x004c:
            r13 = r1
            goto L_0x004f
        L_0x004e:
            r13 = r0
        L_0x004f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.m23283B0(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b0
            r1 = 1
            if (r0 == r1) goto L_0x00b3
            r1 = 2
            if (r0 == r1) goto L_0x0089
            r1 = 3
            if (r0 == r1) goto L_0x007d
            r1 = 4
            if (r0 == r1) goto L_0x0071
            r1 = 5
            if (r0 == r1) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r13.mo48987b()
        L_0x006f:
            r0 = r13
            goto L_0x0021
        L_0x0071:
            long r0 = r14.mo45877L()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x008e
            r13.mo48987b()
            goto L_0x008e
        L_0x007d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0089:
            if (r11 == 0) goto L_0x0099
            r13.mo48985p()
        L_0x008e:
            ag.h$b r15 = p308ag.C10899h.f16818b
            java.lang.Throwable r0 = r14.mo45878M()
            java.lang.Object r15 = r15.mo45918a(r0)
            goto L_0x00bb
        L_0x0099:
            boolean r15 = r8 instanceof p466yf.C13945d3
            if (r15 == 0) goto L_0x00a0
            yf.d3 r8 = (p466yf.C13945d3) r8
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r8 == 0) goto L_0x00a6
            r14.m23318l0(r8, r13, r12)
        L_0x00a6:
            r13.mo48985p()
            ag.h$b r15 = p308ag.C10899h.f16818b
            java.lang.Object r15 = r15.mo45919b()
            goto L_0x00bb
        L_0x00b0:
            r13.mo48987b()
        L_0x00b3:
            ag.h$b r15 = p308ag.C10899h.f16818b
            ef.v r0 = p336ef.C11921v.f18618a
            java.lang.Object r15 = r15.mo45920c(r0)
        L_0x00bb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p308ag.C10887b.mo45894m(java.lang.Object):java.lang.Object");
    }

    /* renamed from: n */
    public boolean mo45895n() {
        return m23300W(f16773e.get(this));
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [dg.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e1, code lost:
        r3 = r3.mo48988e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e8, code lost:
        if (r3 != null) goto L_0x0209;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f16773e
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L_0x001e
            if (r2 == r3) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L_0x0023
        L_0x001e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L_0x0023:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "capacity="
            r2.append(r5)
            int r5 = r0.f16782b
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            ag.j[] r2 = new p308ag.C10904j[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f16778j
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f16777i
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f16779k
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = kotlin.collections.C12726w.m28527n(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x006e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r2.next()
            r8 = r4
            ag.j r8 = (p308ag.C10904j) r8
            ag.j r9 = p308ag.C10892c.f16794a
            if (r8 == r9) goto L_0x0083
            r8 = r7
            goto L_0x0084
        L_0x0083:
            r8 = r6
        L_0x0084:
            if (r8 == 0) goto L_0x006e
            r3.add(r4)
            goto L_0x006e
        L_0x008a:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x020d
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009f
            goto L_0x00b9
        L_0x009f:
            r4 = r3
            ag.j r4 = (p308ag.C10904j) r4
            long r8 = r4.f18467d
        L_0x00a4:
            java.lang.Object r4 = r2.next()
            r10 = r4
            ag.j r10 = (p308ag.C10904j) r10
            long r10 = r10.f18467d
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00b3
            r3 = r4
            r8 = r10
        L_0x00b3:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x00a4
        L_0x00b9:
            ag.j r3 = (p308ag.C10904j) r3
            long r10 = r16.mo45877L()
            long r12 = r16.mo45879N()
        L_0x00c3:
            int r2 = p308ag.C10892c.f16795b
            r4 = r6
        L_0x00c6:
            if (r4 >= r2) goto L_0x01e1
            long r8 = r3.f18467d
            int r14 = p308ag.C10892c.f16795b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00d8
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01ea
        L_0x00d8:
            java.lang.Object r15 = r3.mo45930w(r4)
            java.lang.Object r6 = r3.mo45929v(r4)
            boolean r7 = r15 instanceof p466yf.C14002n
            if (r7 == 0) goto L_0x00fa
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ee
            if (r14 < 0) goto L_0x00ee
            java.lang.String r7 = "receive"
            goto L_0x01a7
        L_0x00ee:
            if (r14 >= 0) goto L_0x00f6
            if (r7 < 0) goto L_0x00f6
            java.lang.String r7 = "send"
            goto L_0x01a7
        L_0x00f6:
            java.lang.String r7 = "cont"
            goto L_0x01a7
        L_0x00fa:
            boolean r7 = r15 instanceof p349gg.C12027b
            if (r7 == 0) goto L_0x0114
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0108
            if (r14 < 0) goto L_0x0108
            java.lang.String r7 = "onReceive"
            goto L_0x01a7
        L_0x0108:
            if (r14 >= 0) goto L_0x0110
            if (r7 < 0) goto L_0x0110
            java.lang.String r7 = "onSend"
            goto L_0x01a7
        L_0x0110:
            java.lang.String r7 = "select"
            goto L_0x01a7
        L_0x0114:
            boolean r7 = r15 instanceof p308ag.C10913q
            if (r7 == 0) goto L_0x011c
            java.lang.String r7 = "receiveCatching"
            goto L_0x01a7
        L_0x011c:
            boolean r7 = r15 instanceof p308ag.C10887b.C10889b
            if (r7 == 0) goto L_0x0124
            java.lang.String r7 = "sendBroadcast"
            goto L_0x01a7
        L_0x0124:
            boolean r7 = r15 instanceof p308ag.C10917t
            if (r7 == 0) goto L_0x0140
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x01a7
        L_0x0140:
            dg.g0 r7 = p308ag.C10892c.f16799f
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r15, r7)
            if (r7 == 0) goto L_0x014c
            r7 = 1
            goto L_0x0154
        L_0x014c:
            dg.g0 r7 = p308ag.C10892c.f16800g
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r15, r7)
        L_0x0154:
            if (r7 == 0) goto L_0x0159
            java.lang.String r7 = "resuming_sender"
            goto L_0x01a7
        L_0x0159:
            if (r15 != 0) goto L_0x015d
            r7 = 1
            goto L_0x0165
        L_0x015d:
            dg.g0 r7 = p308ag.C10892c.f16798e
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r15, r7)
        L_0x0165:
            if (r7 == 0) goto L_0x0169
            r7 = 1
            goto L_0x0171
        L_0x0169:
            dg.g0 r7 = p308ag.C10892c.f16802i
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r15, r7)
        L_0x0171:
            if (r7 == 0) goto L_0x0175
            r7 = 1
            goto L_0x017d
        L_0x0175:
            dg.g0 r7 = p308ag.C10892c.f16801h
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r15, r7)
        L_0x017d:
            if (r7 == 0) goto L_0x0181
            r7 = 1
            goto L_0x0189
        L_0x0181:
            dg.g0 r7 = p308ag.C10892c.f16804k
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r15, r7)
        L_0x0189:
            if (r7 == 0) goto L_0x018d
            r7 = 1
            goto L_0x0195
        L_0x018d:
            dg.g0 r7 = p308ag.C10892c.f16803j
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r15, r7)
        L_0x0195:
            if (r7 == 0) goto L_0x0199
            r7 = 1
            goto L_0x01a1
        L_0x0199:
            dg.g0 r7 = p308ag.C10892c.m23405z()
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r15, r7)
        L_0x01a1:
            if (r7 != 0) goto L_0x01db
            java.lang.String r7 = r15.toString()
        L_0x01a7:
            if (r6 == 0) goto L_0x01c9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L_0x01db
        L_0x01c9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L_0x01db:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00c6
        L_0x01e1:
            dg.e r2 = r3.mo48988e()
            r3 = r2
            ag.j r3 = (p308ag.C10904j) r3
            if (r3 != 0) goto L_0x0209
        L_0x01ea:
            char r2 = p454wf.C13760y.m31606R0(r1)
            if (r2 != r5) goto L_0x01ff
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)
        L_0x01ff:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x0209:
            r6 = 0
            r7 = 1
            goto L_0x00c3
        L_0x020d:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p308ag.C10887b.toString():java.lang.String");
    }

    /* renamed from: w */
    public boolean mo45897w(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return mo45898z(th, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo45898z(Throwable th, boolean z) {
        if (z) {
            m23304a0();
        }
        boolean a = C1248a.m719a(f16780l, this, C10892c.f16812s, th);
        if (z) {
            m23305b0();
        } else {
            m23307c0();
        }
        m23284C();
        mo45887e0();
        if (a) {
            m23296R();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo45887e0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo45889i0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo45892j0() {
    }
}

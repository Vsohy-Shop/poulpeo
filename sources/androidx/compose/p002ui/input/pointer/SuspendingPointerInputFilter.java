package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DensityKt;
import androidx.compose.p002ui.unit.DpRect;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12078f;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14002n;
import p466yf.C14010o;
import p466yf.C14020q1;

@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,643:1\n432#1:674\n433#1:676\n435#1,4:678\n440#1:693\n443#1,3:705\n1182#2:644\n1161#2,2:645\n1182#2:647\n1161#2,2:648\n34#3:650\n34#3:675\n34#3:747\n146#4:651\n460#4,11:652\n492#4,11:663\n146#4:677\n460#4,11:682\n492#4,11:694\n728#4,2:748\n86#5,2:708\n33#5,6:710\n88#5:716\n86#5,2:717\n33#5,6:719\n88#5:725\n33#5,4:729\n38#5:736\n135#6,3:726\n138#6:733\n139#6:735\n140#6:737\n1#7:734\n314#8,9:738\n323#8,2:750\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter\n*L\n455#1:674\n455#1:676\n455#1:678,4\n455#1:693\n455#1:705,3\n376#1:644\n376#1:645,2\n384#1:647\n384#1:648,2\n432#1:650\n455#1:675\n515#1:747\n433#1:651\n438#1:652,11\n440#1:663,11\n455#1:677\n455#1:682,11\n455#1:694,11\n516#1:748,2\n472#1:708,2\n472#1:710,6\n472#1:716\n483#1:717,2\n483#1:719,6\n483#1:725\n486#1:729,4\n486#1:736\n486#1:726,3\n486#1:733\n486#1:735\n486#1:737\n486#1:734\n513#1:738,9\n513#1:750,2\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter */
/* compiled from: SuspendingPointerInputFilter.kt */
public final class SuspendingPointerInputFilter extends PointerInputFilter implements PointerInputModifier, PointerInputScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    /* access modifiers changed from: private */
    public long boundsSize;
    private C13995l0 coroutineScope;
    /* access modifiers changed from: private */
    public PointerEvent currentEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    private PointerEvent lastPointerEvent;
    /* access modifiers changed from: private */
    public final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;
    private final ViewConfiguration viewConfiguration;

    @SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,643:1\n34#2:644\n735#3,2:645\n314#4,11:647\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine\n*L\n582#1:644\n583#1:645,2\n590#1:647,11\n*E\n"})
    /* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine */
    /* compiled from: SuspendingPointerInputFilter.kt */
    private final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, C12074d<R> {
        private final /* synthetic */ SuspendingPointerInputFilter $$delegate_0;
        /* access modifiers changed from: private */
        public PointerEventPass awaitPass = PointerEventPass.Main;
        private final C12074d<R> completion;
        private final C12079g context = C12085h.f18916b;
        /* access modifiers changed from: private */
        public C14002n<? super PointerEvent> pointerAwaiter;
        final /* synthetic */ SuspendingPointerInputFilter this$0;

        public PointerEventHandlerCoroutine(SuspendingPointerInputFilter suspendingPointerInputFilter, C12074d<? super R> dVar) {
            C12775o.m28639i(dVar, "completion");
            this.this$0 = suspendingPointerInputFilter;
            this.completion = dVar;
            this.$$delegate_0 = suspendingPointerInputFilter;
        }

        public Object awaitPointerEvent(PointerEventPass pointerEventPass, C12074d<? super PointerEvent> dVar) {
            C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
            oVar.mo53786B();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = oVar;
            Object y = oVar.mo53797y();
            if (y == C12150d.m26492c()) {
                C12741h.m28573c(dVar);
            }
            return y;
        }

        public final void cancel(Throwable th) {
            C14002n<? super PointerEvent> nVar = this.pointerAwaiter;
            if (nVar != null) {
                nVar.mo49530j(th);
            }
            this.pointerAwaiter = null;
        }

        public C12079g getContext() {
            return this.context;
        }

        public PointerEvent getCurrentEvent() {
            return this.this$0.currentEvent;
        }

        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
        public long m37275getExtendedTouchPaddingNHjbRc() {
            return this.this$0.m37261getExtendedTouchPaddingNHjbRc();
        }

        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        /* renamed from: getSize-YbymL2g  reason: not valid java name */
        public long m37276getSizeYbymL2g() {
            return this.this$0.boundsSize;
        }

        public ViewConfiguration getViewConfiguration() {
            return this.this$0.getViewConfiguration();
        }

        public final void offerPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
            C14002n<? super PointerEvent> nVar;
            C12775o.m28639i(pointerEvent, NotificationCompat.CATEGORY_EVENT);
            C12775o.m28639i(pointerEventPass, "pass");
            if (pointerEventPass == this.awaitPass && (nVar = this.pointerAwaiter) != null) {
                this.pointerAwaiter = null;
                nVar.resumeWith(C11907m.m25696a(pointerEvent));
            }
        }

        public void resumeWith(Object obj) {
            MutableVector access$getPointerHandlers$p = this.this$0.pointerHandlers;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.this$0;
            synchronized (access$getPointerHandlers$p) {
                suspendingPointerInputFilter.pointerHandlers.remove(this);
                C11921v vVar = C11921v.f18618a;
            }
            this.completion.resumeWith(obj);
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public int m37277roundToPxR2X_6o(long j) {
            return this.$$delegate_0.m37263roundToPxR2X_6o(j);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public int m37278roundToPx0680j_4(float f) {
            return this.$$delegate_0.m37264roundToPx0680j_4(f);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public float m37279toDpGaN1DYA(long j) {
            return this.$$delegate_0.m37265toDpGaN1DYA(j);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public float m37280toDpu2uoSUM(float f) {
            return this.$$delegate_0.m37266toDpu2uoSUM(f);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public long m37282toDpSizekrfVVM(long j) {
            return this.$$delegate_0.m37268toDpSizekrfVVM(j);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public float m37283toPxR2X_6o(long j) {
            return this.$$delegate_0.m37269toPxR2X_6o(j);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public float m37284toPx0680j_4(float f) {
            return this.$$delegate_0.m37270toPx0680j_4(f);
        }

        @Stable
        public Rect toRect(DpRect dpRect) {
            C12775o.m28639i(dpRect, "<this>");
            return this.$$delegate_0.toRect(dpRect);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public long m37285toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.m37271toSizeXkaWNTQ(j);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public long m37286toSp0xMU5do(float f) {
            return this.$$delegate_0.m37272toSp0xMU5do(f);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public long m37287toSpkPz2Gy4(float f) {
            return this.$$delegate_0.m37273toSpkPz2Gy4(f);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object withTimeout(long r12, p404of.C13088o<? super androidx.compose.p002ui.input.pointer.AwaitPointerEventScope, ? super p355hf.C12074d<? super T>, ? extends java.lang.Object> r14, p355hf.C12074d<? super T> r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof androidx.compose.p002ui.input.pointer.C1039xffebe5e8
                if (r0 == 0) goto L_0x0013
                r0 = r15
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.p002ui.input.pointer.C1039xffebe5e8) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r11, r15)
            L_0x0018:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r12 = r0.L$0
                yf.y1 r12 = (p466yf.C14054y1) r12
                p336ef.C11910n.m25701b(r15)     // Catch:{ all -> 0x002e }
                goto L_0x0075
            L_0x002e:
                r13 = move-exception
                goto L_0x0079
            L_0x0030:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0038:
                p336ef.C11910n.m25701b(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L_0x0057
                yf.n<? super androidx.compose.ui.input.pointer.PointerEvent> r15 = r11.pointerAwaiter
                if (r15 == 0) goto L_0x0057
                ef.m$a r2 = p336ef.C11907m.f18600b
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r12)
                java.lang.Object r2 = p336ef.C11910n.m25700a(r2)
                java.lang.Object r2 = p336ef.C11907m.m25696a(r2)
                r15.resumeWith(r2)
            L_0x0057:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r15 = r11.this$0
                yf.l0 r5 = r15.getCoroutineScope()
                r6 = 0
                r7 = 0
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 r8 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1
                r8.<init>(r12, r11, r4)
                r9 = 3
                r10 = 0
                yf.y1 r12 = p466yf.C13985j.m32422d(r5, r6, r7, r8, r9, r10)
                r0.L$0 = r12     // Catch:{ all -> 0x002e }
                r0.label = r3     // Catch:{ all -> 0x002e }
                java.lang.Object r15 = r14.invoke(r11, r0)     // Catch:{ all -> 0x002e }
                if (r15 != r1) goto L_0x0075
                return r1
            L_0x0075:
                p466yf.C14054y1.C14055a.m32600a(r12, r4, r3, r4)
                return r15
            L_0x0079:
                p466yf.C14054y1.C14055a.m32600a(r12, r4, r3, r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeout(long, of.o, hf.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object withTimeoutOrNull(long r5, p404of.C13088o<? super androidx.compose.p002ui.input.pointer.AwaitPointerEventScope, ? super p355hf.C12074d<? super T>, ? extends java.lang.Object> r7, p355hf.C12074d<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.p002ui.input.pointer.C1041x7456dd52
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.p002ui.input.pointer.C1041x7456dd52) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                p336ef.C11910n.m25701b(r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                goto L_0x003e
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                p336ef.C11910n.m25701b(r8)
                r0.label = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                java.lang.Object r8 = r4.withTimeout(r5, r7, r0)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                if (r8 != r1) goto L_0x003e
                return r1
            L_0x003d:
                r8 = 0
            L_0x003e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeoutOrNull(long, of.o, hf.d):java.lang.Object");
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public float m37281toDpu2uoSUM(int i) {
            return this.$$delegate_0.m37267toDpu2uoSUM(i);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public long m37288toSpkPz2Gy4(int i) {
            return this.$$delegate_0.m37274toSpkPz2Gy4(i);
        }
    }

    /* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$WhenMappings */
    /* compiled from: SuspendingPointerInputFilter.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.input.pointer.PointerEventPass[] r0 = androidx.compose.p002ui.input.pointer.PointerEventPass.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p002ui.input.pointer.PointerEventPass.Initial     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p002ui.input.pointer.PointerEventPass.Main     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilter.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SuspendingPointerInputFilter(ViewConfiguration viewConfiguration2, Density density, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewConfiguration2, (i & 2) != 0 ? DensityKt.Density$default(1.0f, 0.0f, 2, (Object) null) : density);
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        synchronized (this.pointerHandlers) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
            mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                int size = mutableVector2.getSize();
                if (size > 0) {
                    Object[] content = mutableVector2.getContent();
                    int i2 = 0;
                    do {
                        ((PointerEventHandlerCoroutine) content[i2]).offerPointerEvent(pointerEvent, pointerEventPass);
                        i2++;
                    } while (i2 < size);
                }
            } else if (i == 3) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    int i3 = size2 - 1;
                    Object[] content2 = mutableVector3.getContent();
                    do {
                        ((PointerEventHandlerCoroutine) content2[i3]).offerPointerEvent(pointerEvent, pointerEventPass);
                        i3--;
                    } while (i3 >= 0);
                }
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass, Function1<? super PointerEventHandlerCoroutine<?>, C11921v> function1) {
        synchronized (this.pointerHandlers) {
            try {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
                mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                int size = mutableVector2.getSize();
                if (size > 0) {
                    Object[] content = mutableVector2.getContent();
                    int i2 = 0;
                    do {
                        function1.invoke(content[i2]);
                        i2++;
                    } while (i2 < size);
                }
            } else if (i == 3) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    int i3 = size2 - 1;
                    Object[] content2 = mutableVector3.getContent();
                    do {
                        function1.invoke(content2[i3]);
                        i3--;
                    } while (i3 >= 0);
                }
            }
        } finally {
            C12773m.m28629b(1);
            this.dispatchingPointerHandlers.clear();
            C12773m.m28628a(1);
        }
    }

    public <R> Object awaitPointerEventScope(C13088o<? super AwaitPointerEventScope, ? super C12074d<? super R>, ? extends Object> oVar, C12074d<? super R> dVar) {
        C14010o oVar2 = new C14010o(C12147c.m26491b(dVar), 1);
        oVar2.mo53786B();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(this, oVar2);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            C12074d<C11921v> a = C12078f.m26258a(oVar, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            C11907m.C11908a aVar = C11907m.f18600b;
            a.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
        oVar2.mo49526f(new SuspendingPointerInputFilter$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        Object y = oVar2.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        return y;
    }

    public final C13995l0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    public long m37261getExtendedTouchPaddingNHjbRc() {
        long r0 = m37271toSizeXkaWNTQ(getViewConfiguration().m37783getMinimumTouchTargetSizeMYxV2XQ());
        long r2 = m37189getSizeYbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.m35491getWidthimpl(r0) - ((float) IntSize.m38628getWidthimpl(r2))) / 2.0f, Math.max(0.0f, Size.m35488getHeightimpl(r0) - ((float) IntSize.m38627getHeightimpl(r2))) / 2.0f);
    }

    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public void onCancel() {
        boolean z;
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent != null) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            while (true) {
                z = true;
                if (i >= size) {
                    break;
                } else if (!(true ^ changes.get(i).getPressed())) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PointerInputChange pointerInputChange = changes2.get(i2);
                    arrayList.add(new PointerInputChange(pointerInputChange.m37168getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m37169getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m37169getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0, 1536, (DefaultConstructorMarker) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
            }
        }
    }

    /* renamed from: onPointerEvent-H0pRuoY  reason: not valid java name */
    public void m37262onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        C12775o.m28639i(pointerEvent, "pointerEvent");
        C12775o.m28639i(pointerEventPass, "pass");
        this.boundsSize = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (!(!z)) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Stable
    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    public int m37263roundToPxR2X_6o(long j) {
        return this.$$delegate_0.m38442roundToPxR2X_6o(j);
    }

    @Stable
    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    public int m37264roundToPx0680j_4(float f) {
        return this.$$delegate_0.m38443roundToPx0680j_4(f);
    }

    public final void setCoroutineScope(C13995l0 l0Var) {
        C12775o.m28639i(l0Var, "<set-?>");
        this.coroutineScope = l0Var;
    }

    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.interceptOutOfBoundsChildEvents = z;
    }

    @Stable
    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    public float m37265toDpGaN1DYA(long j) {
        return this.$$delegate_0.m38444toDpGaN1DYA(j);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m37266toDpu2uoSUM(float f) {
        return this.$$delegate_0.m38445toDpu2uoSUM(f);
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    public long m37268toDpSizekrfVVM(long j) {
        return this.$$delegate_0.m38447toDpSizekrfVVM(j);
    }

    @Stable
    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    public float m37269toPxR2X_6o(long j) {
        return this.$$delegate_0.m38448toPxR2X_6o(j);
    }

    @Stable
    /* renamed from: toPx-0680j_4  reason: not valid java name */
    public float m37270toPx0680j_4(float f) {
        return this.$$delegate_0.m38449toPx0680j_4(f);
    }

    @Stable
    public Rect toRect(DpRect dpRect) {
        C12775o.m28639i(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    public long m37271toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.m38450toSizeXkaWNTQ(j);
    }

    @Stable
    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    public long m37272toSp0xMU5do(float f) {
        return this.$$delegate_0.m38451toSp0xMU5do(f);
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m37273toSpkPz2Gy4(float f) {
        return this.$$delegate_0.m38452toSpkPz2Gy4(f);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m37267toDpu2uoSUM(int i) {
        return this.$$delegate_0.m38446toDpu2uoSUM(i);
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m37274toSpkPz2Gy4(int i) {
        return this.$$delegate_0.m38453toSpkPz2Gy4(i);
    }

    public SuspendingPointerInputFilter(ViewConfiguration viewConfiguration2, Density density) {
        C12775o.m28639i(viewConfiguration2, "viewConfiguration");
        C12775o.m28639i(density, "density");
        this.viewConfiguration = viewConfiguration2;
        this.$$delegate_0 = density;
        this.currentEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.pointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m38633getZeroYbymL2g();
        this.coroutineScope = C14020q1.f22944b;
    }

    public static /* synthetic */ void getCoroutineScope$annotations() {
    }

    public PointerInputFilter getPointerInputFilter() {
        return this;
    }
}

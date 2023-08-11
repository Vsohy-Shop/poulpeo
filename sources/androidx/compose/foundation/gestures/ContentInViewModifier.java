package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.OnPlacedModifier;
import androidx.compose.p002ui.layout.OnRemeasuredModifier;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p466yf.C13995l0;
import p466yf.C14002n;
import p466yf.C14004n0;
import p466yf.C14010o;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n314#2,11:428\n1#3:439\n106#4,2:440\n108#4:453\n492#5,11:442\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n*L\n129#1:428,11\n326#1:440,2\n326#1:453\n326#1:442,11\n*E\n"})
/* compiled from: ContentInViewModifier.kt */
public final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {
    /* access modifiers changed from: private */
    public final UpdatableAnimationState animationState = new UpdatableAnimationState();
    /* access modifiers changed from: private */
    public final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private LayoutCoordinates coordinates;
    /* access modifiers changed from: private */
    public LayoutCoordinates focusedChild;
    private Rect focusedChildBoundsFromPreviousRemeasure;
    /* access modifiers changed from: private */
    public boolean isAnimationRunning;
    private final Modifier modifier = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBoundsKt.onFocusedBoundsChanged(this, new ContentInViewModifier$modifier$1(this)), this);
    private final Orientation orientation;
    /* access modifiers changed from: private */
    public final boolean reverseDirection;
    private final C13995l0 scope;
    /* access modifiers changed from: private */
    public final ScrollableState scrollState;
    /* access modifiers changed from: private */
    public boolean trackingFocusedChild;
    private long viewportSize = IntSize.Companion.m38633getZeroYbymL2g();

    @SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1#2:428\n*E\n"})
    /* compiled from: ContentInViewModifier.kt */
    public static final class Request {
        private final C14002n<C11921v> continuation;
        private final C13074a<Rect> currentBounds;

        public Request(C13074a<Rect> aVar, C14002n<? super C11921v> nVar) {
            C12775o.m28639i(aVar, "currentBounds");
            C12775o.m28639i(nVar, "continuation");
            this.currentBounds = aVar;
            this.continuation = nVar;
        }

        public final C14002n<C11921v> getContinuation() {
            return this.continuation;
        }

        public final C13074a<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
            if (r0 == null) goto L_0x0050;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                yf.n<ef.v> r0 = r4.continuation
                hf.g r0 = r0.getContext()
                yf.k0$a r1 = p466yf.C13990k0.f22920c
                hf.g$b r0 = r0.get(r1)
                yf.k0 r0 = (p466yf.C13990k0) r0
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = r0.mo53777t0()
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = p454wf.C13724b.m31415a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.C12775o.m28638h(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L_0x0050
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L_0x0052
            L_0x0050:
                java.lang.String r0 = "("
            L_0x0052:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                of.a<androidx.compose.ui.geometry.Rect> r0 = r4.currentBounds
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                yf.n<ef.v> r0 = r4.continuation
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewModifier.Request.toString():java.lang.String");
        }
    }

    /* compiled from: ContentInViewModifier.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.gestures.Orientation[] r0 = androidx.compose.foundation.gestures.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewModifier.WhenMappings.<clinit>():void");
        }
    }

    public ContentInViewModifier(C13995l0 l0Var, Orientation orientation2, ScrollableState scrollableState, boolean z) {
        C12775o.m28639i(l0Var, "scope");
        C12775o.m28639i(orientation2, "orientation");
        C12775o.m28639i(scrollableState, "scrollState");
        this.scope = l0Var;
        this.orientation = orientation2;
        this.scrollState = scrollableState;
        this.reverseDirection = z;
    }

    /* access modifiers changed from: private */
    public final float calculateScrollDelta() {
        if (IntSize.m38626equalsimpl0(this.viewportSize, IntSize.Companion.m38633getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect findBringIntoViewRequest = findBringIntoViewRequest();
        if (findBringIntoViewRequest == null) {
            if (this.trackingFocusedChild) {
                findBringIntoViewRequest = getFocusedChildBounds();
            } else {
                findBringIntoViewRequest = null;
            }
            if (findBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long r1 = IntSizeKt.m38638toSizeozmzZPI(this.viewportSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return relocationDistance(findBringIntoViewRequest.getTop(), findBringIntoViewRequest.getBottom(), Size.m35488getHeightimpl(r1));
        }
        if (i == 2) {
            return relocationDistance(findBringIntoViewRequest.getLeft(), findBringIntoViewRequest.getRight(), Size.m35491getWidthimpl(r1));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-TemP2vQ  reason: not valid java name */
    private final int m33035compareToTemP2vQ(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return C12775o.m28641k(IntSize.m38627getHeightimpl(j), IntSize.m38627getHeightimpl(j2));
        }
        if (i == 2) {
            return C12775o.m28641k(IntSize.m38628getWidthimpl(j), IntSize.m38628getWidthimpl(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-iLBOSCw  reason: not valid java name */
    private final int m33036compareToiLBOSCw(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Float.compare(Size.m35488getHeightimpl(j), Size.m35488getHeightimpl(j2));
        }
        if (i == 2) {
            return Float.compare(Size.m35491getWidthimpl(j), Size.m35491getWidthimpl(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: computeDestination-O0kMr_c  reason: not valid java name */
    private final Rect m33037computeDestinationO0kMr_c(Rect rect, long j) {
        return rect.m35459translatek4lQ0M(Offset.m35431unaryMinusF1C5BW0(m33040relocationOffsetBMxPBkI(rect, j)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector access$getRequests$p = this.bringIntoViewRequests.requests;
        int size = access$getRequests$p.getSize();
        Rect rect = null;
        if (size > 0) {
            int i = size - 1;
            Object[] content = access$getRequests$p.getContent();
            do {
                Rect invoke = ((Request) content[i]).getCurrentBounds().invoke();
                if (invoke != null) {
                    if (m33036compareToiLBOSCw(invoke.m35455getSizeNHjbRc(), IntSizeKt.m38638toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect;
                    }
                    rect = invoke;
                }
                i--;
            } while (i >= 0);
        }
        return rect;
    }

    /* access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (!(layoutCoordinates2 == null || (layoutCoordinates = this.focusedChild) == null)) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    /* renamed from: isMaxVisible-O0kMr_c  reason: not valid java name */
    private final boolean m33038isMaxVisibleO0kMr_c(Rect rect, long j) {
        return Offset.m35419equalsimpl0(m33040relocationOffsetBMxPBkI(rect, j), Offset.Companion.m35438getZeroF1C5BW0());
    }

    /* renamed from: isMaxVisible-O0kMr_c$default  reason: not valid java name */
    static /* synthetic */ boolean m33039isMaxVisibleO0kMr_c$default(ContentInViewModifier contentInViewModifier, Rect rect, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewModifier.viewportSize;
        }
        return contentInViewModifier.m33038isMaxVisibleO0kMr_c(rect, j);
    }

    /* access modifiers changed from: private */
    public final void launchAnimation() {
        if (!this.isAnimationRunning) {
            C14054y1 unused = C13985j.m32422d(this.scope, (C12079g) null, C14004n0.UNDISPATCHED, new ContentInViewModifier$launchAnimation$1(this, (C12074d<? super ContentInViewModifier$launchAnimation$1>) null), 1, (Object) null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final float relocationDistance(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        if (Math.abs(f) < Math.abs(f4)) {
            return f;
        }
        return f4;
    }

    /* renamed from: relocationOffset-BMxPBkI  reason: not valid java name */
    private final long m33040relocationOffsetBMxPBkI(Rect rect, long j) {
        long r5 = IntSizeKt.m38638toSizeozmzZPI(j);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return OffsetKt.Offset(0.0f, relocationDistance(rect.getTop(), rect.getBottom(), Size.m35488getHeightimpl(r5)));
        }
        if (i == 2) {
            return OffsetKt.Offset(relocationDistance(rect.getLeft(), rect.getRight(), Size.m35491getWidthimpl(r5)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public Object bringChildIntoView(C13074a<Rect> aVar, C12074d<? super C11921v> dVar) {
        Rect invoke = aVar.invoke();
        boolean z = false;
        if (invoke != null && !m33039isMaxVisibleO0kMr_c$default(this, invoke, 0, 1, (Object) null)) {
            z = true;
        }
        if (!z) {
            return C11921v.f18618a;
        }
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        if (this.bringIntoViewRequests.enqueue(new Request(aVar, oVar)) && !this.isAnimationRunning) {
            launchAnimation();
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

    public Rect calculateRectForParent(Rect rect) {
        C12775o.m28639i(rect, "localRect");
        if (!IntSize.m38626equalsimpl0(this.viewportSize, IntSize.Companion.m38633getZeroYbymL2g())) {
            return m33037computeDestinationO0kMr_c(rect, this.viewportSize);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "coordinates");
        this.coordinates = layoutCoordinates;
    }

    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public void m33041onRemeasuredozmzZPI(long j) {
        Rect focusedChildBounds;
        long j2 = this.viewportSize;
        this.viewportSize = j;
        if (m33035compareToTemP2vQ(j, j2) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
            if (rect == null) {
                rect = focusedChildBounds;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && m33038isMaxVisibleO0kMr_c(rect, j2) && !m33038isMaxVisibleO0kMr_c(focusedChildBounds, j)) {
                this.trackingFocusedChild = true;
                launchAnimation();
            }
            this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
        }
    }
}

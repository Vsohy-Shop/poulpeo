package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.p002ui.layout.SubcomposeLayoutState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,311:1\n1182#2:312\n1161#2,2:313\n523#3:315\n26#4,5:316\n26#4,5:321\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:312\n122#1:313,2\n159#1:315\n164#1:316,5\n182#1:321,5\n*E\n"})
@ExperimentalFoundationApi
/* compiled from: LazyLayoutPrefetcher.android.kt */
public final class LazyLayoutPrefetcher implements RememberObserver, LazyLayoutPrefetchState.Prefetcher, Runnable, Choreographer.FrameCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static long frameIntervalNs;
    private long averagePrecomposeTimeNs;
    private long averagePremeasureTimeNs;
    private final Choreographer choreographer = Choreographer.getInstance();
    private boolean isActive;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final MutableVector<PrefetchRequest> prefetchRequests = new MutableVector<>(new PrefetchRequest[16], 0);
    private boolean prefetchScheduled;
    private final LazyLayoutPrefetchState prefetchState;
    private final SubcomposeLayoutState subcomposeLayoutState;
    private final View view;

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
            if (r5 >= 30.0f) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void calculateFrameIntervalIfNeeded(android.view.View r5) {
            /*
                r4 = this;
                long r0 = androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.frameIntervalNs
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x002c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L_0x0021
                if (r0 == 0) goto L_0x0021
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r5 = 1114636288(0x42700000, float:60.0)
            L_0x0023:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.frameIntervalNs = r0
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.Companion.calculateFrameIntervalIfNeeded(android.view.View):void");
        }
    }

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    private static final class PrefetchRequest implements LazyLayoutPrefetchState.PrefetchHandle {
        private boolean canceled;
        private final long constraints;
        private final int index;
        private boolean measured;
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;

        public /* synthetic */ PrefetchRequest(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j);
        }

        public void cancel() {
            if (!this.canceled) {
                this.canceled = true;
                SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
                if (precomposedSlotHandle != null) {
                    precomposedSlotHandle.dispose();
                }
                this.precomposeHandle = null;
            }
        }

        public final boolean getCanceled() {
            return this.canceled;
        }

        /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
        public final long m33542getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final int getIndex() {
            return this.index;
        }

        public final boolean getMeasured() {
            return this.measured;
        }

        public final SubcomposeLayoutState.PrecomposedSlotHandle getPrecomposeHandle() {
            return this.precomposeHandle;
        }

        public final void setCanceled(boolean z) {
            this.canceled = z;
        }

        public final void setMeasured(boolean z) {
            this.measured = z;
        }

        public final void setPrecomposeHandle(SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle) {
            this.precomposeHandle = precomposedSlotHandle;
        }

        private PrefetchRequest(int i, long j) {
            this.index = i;
            this.constraints = j;
        }
    }

    public LazyLayoutPrefetcher(LazyLayoutPrefetchState lazyLayoutPrefetchState, SubcomposeLayoutState subcomposeLayoutState2, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, View view2) {
        C12775o.m28639i(lazyLayoutPrefetchState, "prefetchState");
        C12775o.m28639i(subcomposeLayoutState2, "subcomposeLayoutState");
        C12775o.m28639i(lazyLayoutItemContentFactory, "itemContentFactory");
        C12775o.m28639i(view2, "view");
        this.prefetchState = lazyLayoutPrefetchState;
        this.subcomposeLayoutState = subcomposeLayoutState2;
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.view = view2;
        Companion.calculateFrameIntervalIfNeeded(view2);
    }

    private final long calculateAverageTime(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        long j3 = (long) 4;
        return (j / j3) + ((j2 / j3) * ((long) 3));
    }

    private final boolean enoughTimeLeft(long j, long j2, long j3) {
        if (j > j2 || j + j3 < j2) {
            return true;
        }
        return false;
    }

    public void doFrame(long j) {
        if (this.isActive) {
            this.view.post(this);
        }
    }

    public void onForgotten() {
        this.isActive = false;
        this.prefetchState.setPrefetcher$foundation_release((LazyLayoutPrefetchState.Prefetcher) null);
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    public void onRemembered() {
        this.prefetchState.setPrefetcher$foundation_release(this);
        this.isActive = true;
    }

    public void run() {
        boolean z;
        if (this.prefetchRequests.isEmpty() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + frameIntervalNs;
        boolean z2 = false;
        while (this.prefetchRequests.isNotEmpty() && !z2) {
            PrefetchRequest prefetchRequest = (PrefetchRequest) this.prefetchRequests.getContent()[0];
            LazyLayoutItemProvider invoke = this.itemContentFactory.getItemProvider().invoke();
            if (!prefetchRequest.getCanceled()) {
                int itemCount = invoke.getItemCount();
                int index = prefetchRequest.getIndex();
                if (index < 0 || index >= itemCount) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (prefetchRequest.getPrecomposeHandle() == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long nanoTime = System.nanoTime();
                            if (enoughTimeLeft(nanoTime, nanos, this.averagePrecomposeTimeNs)) {
                                Object key = invoke.getKey(prefetchRequest.getIndex());
                                prefetchRequest.setPrecomposeHandle(this.subcomposeLayoutState.precompose(key, this.itemContentFactory.getContent(prefetchRequest.getIndex(), key)));
                                this.averagePrecomposeTimeNs = calculateAverageTime(System.nanoTime() - nanoTime, this.averagePrecomposeTimeNs);
                            } else {
                                z2 = true;
                            }
                            C11921v vVar = C11921v.f18618a;
                        } finally {
                            Trace.endSection();
                        }
                    } else if (!prefetchRequest.getMeasured()) {
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long nanoTime2 = System.nanoTime();
                            if (enoughTimeLeft(nanoTime2, nanos, this.averagePremeasureTimeNs)) {
                                SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle = prefetchRequest.getPrecomposeHandle();
                                C12775o.m28636f(precomposeHandle);
                                int placeablesCount = precomposeHandle.getPlaceablesCount();
                                for (int i = 0; i < placeablesCount; i++) {
                                    precomposeHandle.m37442premeasure0kLqBqw(i, prefetchRequest.m33542getConstraintsmsEJaDk());
                                }
                                this.averagePremeasureTimeNs = calculateAverageTime(System.nanoTime() - nanoTime2, this.averagePremeasureTimeNs);
                                this.prefetchRequests.removeAt(0);
                            } else {
                                C11921v vVar2 = C11921v.f18618a;
                                z2 = true;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.prefetchRequests.removeAt(0);
        }
        if (z2) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
    }

    /* renamed from: schedulePrefetch-0kLqBqw  reason: not valid java name */
    public LazyLayoutPrefetchState.PrefetchHandle m33541schedulePrefetch0kLqBqw(int i, long j) {
        PrefetchRequest prefetchRequest = new PrefetchRequest(i, j, (DefaultConstructorMarker) null);
        this.prefetchRequests.add(prefetchRequest);
        if (!this.prefetchScheduled) {
            this.prefetchScheduled = true;
            this.view.post(this);
        }
        return prefetchRequest;
    }

    public void onAbandoned() {
    }
}

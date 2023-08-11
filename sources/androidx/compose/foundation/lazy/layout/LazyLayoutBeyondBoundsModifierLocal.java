package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo;
import androidx.compose.p002ui.layout.BeyondBoundsLayout;
import androidx.compose.p002ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p002ui.modifier.ModifierLocalProvider;
import androidx.compose.p002ui.modifier.ProvidableModifierLocal;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final C0548x8f1df05a emptyBeyondBoundsScope = new C0548x8f1df05a();
    private final LazyListBeyondBoundsInfo beyondBoundsInfo;
    private final LayoutDirection layoutDirection;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final BeyondBoundsState state;

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.p002ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p002ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p002ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.WhenMappings.<clinit>():void");
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(BeyondBoundsState beyondBoundsState, LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, boolean z, LayoutDirection layoutDirection2, Orientation orientation2) {
        C12775o.m28639i(beyondBoundsState, "state");
        C12775o.m28639i(lazyListBeyondBoundsInfo, "beyondBoundsInfo");
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        C12775o.m28639i(orientation2, "orientation");
        this.state = beyondBoundsState;
        this.beyondBoundsInfo = lazyListBeyondBoundsInfo;
        this.reverseLayout = z;
        this.layoutDirection = layoutDirection2;
        this.orientation = orientation2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r5.reverseLayout != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r5.reverseLayout != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r5.reverseLayout != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r5.reverseLayout != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (r5.reverseLayout != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r5.reverseLayout != false) goto L_0x0022;
     */
    /* renamed from: addNextInterval-FR3nfPY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo.Interval m33512addNextIntervalFR3nfPY(androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo.Interval r6, int r7) {
        /*
            r5 = this;
            int r0 = r6.getStart()
            int r6 = r6.getEnd()
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r1 = androidx.compose.p002ui.layout.BeyondBoundsLayout.LayoutDirection.Companion
            int r2 = r1.m37303getBeforehoxUOeE()
            boolean r2 = androidx.compose.p002ui.layout.BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(r7, r2)
            if (r2 == 0) goto L_0x0018
        L_0x0014:
            int r0 = r0 + -1
            goto L_0x008c
        L_0x0018:
            int r2 = r1.m37302getAfterhoxUOeE()
            boolean r2 = androidx.compose.p002ui.layout.BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(r7, r2)
            if (r2 == 0) goto L_0x0026
        L_0x0022:
            int r6 = r6 + 1
            goto L_0x008c
        L_0x0026:
            int r2 = r1.m37301getAbovehoxUOeE()
            boolean r2 = androidx.compose.p002ui.layout.BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(r7, r2)
            if (r2 == 0) goto L_0x0035
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L_0x0014
            goto L_0x0022
        L_0x0035:
            int r2 = r1.m37304getBelowhoxUOeE()
            boolean r2 = androidx.compose.p002ui.layout.BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(r7, r2)
            if (r2 == 0) goto L_0x0044
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L_0x0022
            goto L_0x0014
        L_0x0044:
            int r2 = r1.m37305getLefthoxUOeE()
            boolean r2 = androidx.compose.p002ui.layout.BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(r7, r2)
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0069
            androidx.compose.ui.unit.LayoutDirection r7 = r5.layoutDirection
            int[] r1 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.WhenMappings.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L_0x0064
            if (r7 == r3) goto L_0x005f
            goto L_0x008c
        L_0x005f:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L_0x0022
            goto L_0x0014
        L_0x0064:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L_0x0014
            goto L_0x0022
        L_0x0069:
            int r1 = r1.m37306getRighthoxUOeE()
            boolean r7 = androidx.compose.p002ui.layout.BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(r7, r1)
            if (r7 == 0) goto L_0x0093
            androidx.compose.ui.unit.LayoutDirection r7 = r5.layoutDirection
            int[] r1 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.WhenMappings.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L_0x0087
            if (r7 == r3) goto L_0x0082
            goto L_0x008c
        L_0x0082:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L_0x0014
            goto L_0x0022
        L_0x0087:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L_0x0022
            goto L_0x0014
        L_0x008c:
            androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r7 = r5.beyondBoundsInfo
            androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval r6 = r7.addInterval(r0, r6)
            return r6
        L_0x0093:
            java.lang.Void unused = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection()
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.m33512addNextIntervalFR3nfPY(androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval, int):androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval");
    }

    /* access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY  reason: not valid java name */
    public final boolean m33513hasMoreContentFR3nfPY(LazyListBeyondBoundsInfo.Interval interval, int i) {
        if (m33514isOppositeToOrientation4vf7U8o(i)) {
            return false;
        }
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37303getBeforehoxUOeE())) {
            return hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        }
        if (BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37302getAfterhoxUOeE())) {
            return hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        }
        if (BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37301getAbovehoxUOeE())) {
            if (this.reverseLayout) {
                return hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
            }
            return hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        } else if (BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37304getBelowhoxUOeE())) {
            if (this.reverseLayout) {
                return hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
            }
            return hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        } else if (BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37305getLefthoxUOeE())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else if (this.reverseLayout) {
                    return hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
                } else {
                    return hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
                }
            } else if (this.reverseLayout) {
                return hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
            } else {
                return hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
            }
        } else if (BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37306getRighthoxUOeE())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else if (this.reverseLayout) {
                    return hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
                } else {
                    return hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
                }
            } else if (this.reverseLayout) {
                return hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
            } else {
                return hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
            }
        } else {
            Void unused = LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
            throw new KotlinNothingValueException();
        }
    }

    private static final boolean hasMoreContent_FR3nfPY$hasMoreItemsAfter(LazyListBeyondBoundsInfo.Interval interval, LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal) {
        if (interval.getEnd() < lazyLayoutBeyondBoundsModifierLocal.state.getItemCount() - 1) {
            return true;
        }
        return false;
    }

    private static final boolean hasMoreContent_FR3nfPY$hasMoreItemsBefore(LazyListBeyondBoundsInfo.Interval interval) {
        if (interval.getStart() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o  reason: not valid java name */
    private final boolean m33514isOppositeToOrientation4vf7U8o(int i) {
        boolean z;
        boolean z2;
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        boolean z3 = true;
        if (BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37301getAbovehoxUOeE())) {
            z = true;
        } else {
            z = BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37304getBelowhoxUOeE());
        }
        if (!z) {
            if (BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37305getLefthoxUOeE())) {
                z2 = true;
            } else {
                z2 = BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37306getRighthoxUOeE());
            }
            if (!z2) {
                if (!BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37303getBeforehoxUOeE())) {
                    z3 = BeyondBoundsLayout.LayoutDirection.m37297equalsimpl0(i, companion.m37302getAfterhoxUOeE());
                }
                if (!z3) {
                    Void unused = LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new KotlinNothingValueException();
                }
            } else if (this.orientation == Orientation.Vertical) {
                return true;
            }
        } else if (this.orientation == Orientation.Horizontal) {
            return true;
        }
        return false;
    }

    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    public BeyondBoundsLayout getValue() {
        return this;
    }

    /* renamed from: layout-o7g1Pn8  reason: not valid java name */
    public <T> T m33515layouto7g1Pn8(int i, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> function1) {
        C12775o.m28639i(function1, "block");
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems()) {
            return function1.invoke(emptyBeyondBoundsScope);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f20403b = this.beyondBoundsInfo.addInterval(this.state.getFirstVisibleIndex(), this.state.getLastVisibleIndex());
        T t = null;
        while (t == null && m33513hasMoreContentFR3nfPY((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.f20403b, i)) {
            T r1 = m33512addNextIntervalFR3nfPY((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.f20403b, i);
            this.beyondBoundsInfo.removeInterval((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.f20403b);
            ref$ObjectRef.f20403b = r1;
            this.state.remeasure();
            t = function1.invoke(new LazyLayoutBeyondBoundsModifierLocal$layout$2(this, ref$ObjectRef, i));
        }
        this.beyondBoundsInfo.removeInterval((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.f20403b);
        this.state.remeasure();
        return t;
    }
}

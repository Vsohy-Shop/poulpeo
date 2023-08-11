package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,410:1\n76#2:411\n102#2,2:412\n76#2:414\n102#2,2:415\n76#2:417\n76#2:418\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n96#1:411\n96#1:412,2\n114#1:414\n114#1:415,2\n157#1:417\n159#1:418\n*E\n"})
@Stable
/* compiled from: Scroll.kt */
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Saver<ScrollState, ?> Saver = SaverKt.Saver(ScrollState$Companion$Saver$1.INSTANCE, ScrollState$Companion$Saver$2.INSTANCE);
    private MutableState<Integer> _maxValueState = SnapshotStateKt.mutableStateOf(Integer.MAX_VALUE, SnapshotStateKt.structuralEqualityPolicy());
    /* access modifiers changed from: private */
    public float accumulator;
    private final State canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new ScrollState$canScrollBackward$2(this));
    private final State canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new ScrollState$canScrollForward$2(this));
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new ScrollState$scrollableState$1(this));
    private final MutableState value$delegate;
    private final MutableState viewportSize$delegate = SnapshotStateKt.mutableStateOf(0, SnapshotStateKt.structuralEqualityPolicy());

    /* compiled from: Scroll.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }
    }

    public ScrollState(int i) {
        this.value$delegate = SnapshotStateKt.mutableStateOf(Integer.valueOf(i), SnapshotStateKt.structuralEqualityPolicy());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.compose.animation.core.SpringSpec} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object animateScrollTo$default(androidx.compose.foundation.ScrollState r6, int r7, androidx.compose.animation.core.AnimationSpec r8, p355hf.C12074d r9, int r10, java.lang.Object r11) {
        /*
            r10 = r10 & 2
            if (r10 == 0) goto L_0x000f
            androidx.compose.animation.core.SpringSpec r8 = new androidx.compose.animation.core.SpringSpec
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x000f:
            java.lang.Object r6 = r6.animateScrollTo(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollState.animateScrollTo$default(androidx.compose.foundation.ScrollState, int, androidx.compose.animation.core.AnimationSpec, hf.d, int, java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void setValue(int i) {
        this.value$delegate.setValue(Integer.valueOf(i));
    }

    public final Object animateScrollTo(int i, AnimationSpec<Float> animationSpec, C12074d<? super C11921v> dVar) {
        Object animateScrollBy = ScrollExtensionsKt.animateScrollBy(this, (float) (i - getValue()), animationSpec, dVar);
        if (animateScrollBy == C12150d.m26492c()) {
            return animateScrollBy;
        }
        return C11921v.f18618a;
    }

    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final int getMaxValue() {
        return this._maxValueState.getValue().intValue();
    }

    public final int getValue() {
        return ((Number) this.value$delegate.getValue()).intValue();
    }

    public final int getViewportSize$foundation_release() {
        return ((Number) this.viewportSize$delegate.getValue()).intValue();
    }

    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public Object scroll(MutatePriority mutatePriority, C13088o<? super ScrollScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object scroll = this.scrollableState.scroll(mutatePriority, oVar, dVar);
        if (scroll == C12150d.m26492c()) {
            return scroll;
        }
        return C11921v.f18618a;
    }

    public final Object scrollTo(int i, C12074d<? super Float> dVar) {
        return ScrollExtensionsKt.scrollBy(this, (float) (i - getValue()), dVar);
    }

    public final void setMaxValue$foundation_release(int i) {
        this._maxValueState.setValue(Integer.valueOf(i));
        if (getValue() > i) {
            setValue(i);
        }
    }

    public final void setViewportSize$foundation_release(int i) {
        this.viewportSize$delegate.setValue(Integer.valueOf(i));
    }
}

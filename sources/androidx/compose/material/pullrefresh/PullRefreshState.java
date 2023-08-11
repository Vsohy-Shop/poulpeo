package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,233:1\n76#2:234\n76#2:235\n102#2,2:236\n76#2:238\n102#2,2:239\n76#2:241\n102#2,2:242\n76#2:244\n102#2,2:245\n76#2:247\n102#2,2:248\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n121#1:234\n123#1:235\n123#1:236,2\n124#1:238\n124#1:239,2\n125#1:241\n125#1:242,2\n126#1:244\n126#1:245,2\n127#1:247\n127#1:248,2\n*E\n"})
/* compiled from: PullRefreshState.kt */
public final class PullRefreshState {
    public static final int $stable = 8;
    private final MutableState _position$delegate;
    private final MutableState _refreshing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final MutableState _refreshingOffset$delegate;
    private final MutableState _threshold$delegate;
    private final State adjustedDistancePulled$delegate = SnapshotStateKt.derivedStateOf(new PullRefreshState$adjustedDistancePulled$2(this));
    private final C13995l0 animationScope;
    private final MutableState distancePulled$delegate;
    /* access modifiers changed from: private */
    public final MutatorMutex mutatorMutex;
    private final State<C13074a<C11921v>> onRefreshState;

    public PullRefreshState(C13995l0 l0Var, State<? extends C13074a<C11921v>> state, float f, float f2) {
        C12775o.m28639i(l0Var, "animationScope");
        C12775o.m28639i(state, "onRefreshState");
        this.animationScope = l0Var;
        this.onRefreshState = state;
        Float valueOf = Float.valueOf(0.0f);
        this._position$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.distancePulled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, (SnapshotMutationPolicy) null, 2, (Object) null);
        this._threshold$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f2), (SnapshotMutationPolicy) null, 2, (Object) null);
        this._refreshingOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.mutatorMutex = new MutatorMutex();
    }

    private final C14054y1 animateIndicatorTo(float f) {
        return C13985j.m32422d(this.animationScope, (C12079g) null, (C14004n0) null, new PullRefreshState$animateIndicatorTo$1(this, f, (C12074d<? super PullRefreshState$animateIndicatorTo$1>) null), 3, (Object) null);
    }

    private final float calculateIndicatorPosition() {
        if (getAdjustedDistancePulled() <= getThreshold$material_release()) {
            return getAdjustedDistancePulled();
        }
        float l = C13537l.m30885l(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThreshold$material_release() + (getThreshold$material_release() * (l - (((float) Math.pow((double) l, (double) 2)) / ((float) 4))));
    }

    private final float getAdjustedDistancePulled() {
        return ((Number) this.adjustedDistancePulled$delegate.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public final float getDistancePulled() {
        return ((Number) this.distancePulled$delegate.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public final float get_position() {
        return ((Number) this._position$delegate.getValue()).floatValue();
    }

    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing$delegate.getValue()).booleanValue();
    }

    private final float get_refreshingOffset() {
        return ((Number) this._refreshingOffset$delegate.getValue()).floatValue();
    }

    private final float get_threshold() {
        return ((Number) this._threshold$delegate.getValue()).floatValue();
    }

    private final void setDistancePulled(float f) {
        this.distancePulled$delegate.setValue(Float.valueOf(f));
    }

    /* access modifiers changed from: private */
    public final void set_position(float f) {
        this._position$delegate.setValue(Float.valueOf(f));
    }

    private final void set_refreshing(boolean z) {
        this._refreshing$delegate.setValue(Boolean.valueOf(z));
    }

    private final void set_refreshingOffset(float f) {
        this._refreshingOffset$delegate.setValue(Float.valueOf(f));
    }

    private final void set_threshold(float f) {
        this._threshold$delegate.setValue(Float.valueOf(f));
    }

    public final float getPosition$material_release() {
        return get_position();
    }

    public final float getProgress() {
        return getAdjustedDistancePulled() / getThreshold$material_release();
    }

    public final boolean getRefreshing$material_release() {
        return get_refreshing();
    }

    public final float getThreshold$material_release() {
        return get_threshold();
    }

    public final float onPull$material_release(float f) {
        if (get_refreshing()) {
            return 0.0f;
        }
        float c = C13537l.m30876c(getDistancePulled() + f, 0.0f);
        float distancePulled = c - getDistancePulled();
        setDistancePulled(c);
        set_position(calculateIndicatorPosition());
        return distancePulled;
    }

    public final float onRelease$material_release(float f) {
        boolean z;
        if (getRefreshing$material_release()) {
            return 0.0f;
        }
        if (getAdjustedDistancePulled() > getThreshold$material_release()) {
            this.onRefreshState.getValue().invoke();
        }
        animateIndicatorTo(0.0f);
        if (getDistancePulled() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z || f < 0.0f) {
            f = 0.0f;
        }
        setDistancePulled(0.0f);
        return f;
    }

    public final void setRefreshing$material_release(boolean z) {
        if (get_refreshing() != z) {
            set_refreshing(z);
            float f = 0.0f;
            setDistancePulled(0.0f);
            if (z) {
                f = get_refreshingOffset();
            }
            animateIndicatorTo(f);
        }
    }

    public final void setRefreshingOffset$material_release(float f) {
        boolean z;
        if (get_refreshingOffset() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            set_refreshingOffset(f);
            if (getRefreshing$material_release()) {
                animateIndicatorTo(f);
            }
        }
    }

    public final void setThreshold$material_release(float f) {
        set_threshold(f);
    }
}

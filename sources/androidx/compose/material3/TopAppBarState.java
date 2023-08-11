package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ExperimentalMaterial3Api
@Stable
/* compiled from: AppBar.kt */
public final class TopAppBarState {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Saver<TopAppBarState, ?> Saver = ListSaverKt.listSaver(TopAppBarState$Companion$Saver$1.INSTANCE, TopAppBarState$Companion$Saver$2.INSTANCE);
    private MutableState<Float> _heightOffset;
    private final MutableState contentOffset$delegate;
    private final MutableState heightOffsetLimit$delegate;

    /* compiled from: AppBar.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<TopAppBarState, ?> getSaver() {
            return TopAppBarState.Saver;
        }
    }

    public TopAppBarState(float f, float f2, float f3) {
        this.heightOffsetLimit$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.contentOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f3), (SnapshotMutationPolicy) null, 2, (Object) null);
        this._heightOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f2), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public final float getCollapsedFraction() {
        boolean z;
        if (getHeightOffsetLimit() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return getHeightOffset() / getHeightOffsetLimit();
        }
        return 0.0f;
    }

    public final float getContentOffset() {
        return ((Number) this.contentOffset$delegate.getValue()).floatValue();
    }

    public final float getHeightOffset() {
        return this._heightOffset.getValue().floatValue();
    }

    public final float getHeightOffsetLimit() {
        return ((Number) this.heightOffsetLimit$delegate.getValue()).floatValue();
    }

    public final float getOverlappedFraction() {
        boolean z;
        if (getHeightOffsetLimit() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return ((float) 1) - (C13537l.m30885l(getHeightOffsetLimit() - getContentOffset(), getHeightOffsetLimit(), 0.0f) / getHeightOffsetLimit());
        }
        return 0.0f;
    }

    public final void setContentOffset(float f) {
        this.contentOffset$delegate.setValue(Float.valueOf(f));
    }

    public final void setHeightOffset(float f) {
        this._heightOffset.setValue(Float.valueOf(C13537l.m30885l(f, getHeightOffsetLimit(), 0.0f)));
    }

    public final void setHeightOffsetLimit(float f) {
        this.heightOffsetLimit$delegate.setValue(Float.valueOf(f));
    }
}

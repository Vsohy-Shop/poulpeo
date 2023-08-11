package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;

@StabilityInferred(parameters = 0)
@ExperimentalMaterialApi
/* compiled from: SwipeToDismiss.kt */
public final class DismissState extends SwipeableState<DismissValue> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* compiled from: SwipeToDismiss.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<DismissState, DismissValue> Saver(Function1<? super DismissValue, Boolean> function1) {
            C12775o.m28639i(function1, "confirmStateChange");
            return SaverKt.Saver(DismissState$Companion$Saver$1.INSTANCE, new DismissState$Companion$Saver$2(function1));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DismissState(DismissValue dismissValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dismissValue, (i & 2) != 0 ? C07161.INSTANCE : function1);
    }

    public final Object dismiss(DismissDirection dismissDirection, C12074d<? super C11921v> dVar) {
        DismissValue dismissValue;
        if (dismissDirection == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this, dismissValue, (AnimationSpec) null, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    public final DismissDirection getDismissDirection() {
        boolean z;
        if (getOffset().getValue().floatValue() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (getOffset().getValue().floatValue() > 0.0f) {
            return DismissDirection.StartToEnd;
        }
        return DismissDirection.EndToStart;
    }

    public final boolean isDismissed(DismissDirection dismissDirection) {
        DismissValue dismissValue;
        C12775o.m28639i(dismissDirection, "direction");
        Object currentValue = getCurrentValue();
        if (dismissDirection == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        if (currentValue == dismissValue) {
            return true;
        }
        return false;
    }

    public final Object reset(C12074d<? super C11921v> dVar) {
        Object animateTo$default = SwipeableState.animateTo$default(this, DismissValue.Default, (AnimationSpec) null, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DismissState(DismissValue dismissValue, Function1<? super DismissValue, Boolean> function1) {
        super(dismissValue, (AnimationSpec) null, function1, 2, (DefaultConstructorMarker) null);
        C12775o.m28639i(dismissValue, "initialValue");
        C12775o.m28639i(function1, "confirmStateChange");
    }
}

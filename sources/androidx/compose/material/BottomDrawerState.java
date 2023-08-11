package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
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
/* compiled from: Drawer.kt */
public final class BottomDrawerState extends SwipeableState<BottomDrawerValue> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final NestedScrollConnection nestedScrollConnection;

    /* compiled from: Drawer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(Function1<? super BottomDrawerValue, Boolean> function1) {
            C12775o.m28639i(function1, "confirmStateChange");
            return SaverKt.Saver(BottomDrawerState$Companion$Saver$1.INSTANCE, new BottomDrawerState$Companion$Saver$2(function1));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomDrawerValue, (i & 2) != 0 ? C06911.INSTANCE : function1);
    }

    private final boolean isOpenEnabled() {
        return getAnchors$material_release().values().contains(BottomDrawerValue.Open);
    }

    public final Object close(C12074d<? super C11921v> dVar) {
        Object animateTo$default = SwipeableState.animateTo$default(this, BottomDrawerValue.Closed, (AnimationSpec) null, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    public final Object expand(C12074d<? super C11921v> dVar) {
        Object animateTo$default = SwipeableState.animateTo$default(this, BottomDrawerValue.Expanded, (AnimationSpec) null, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    public final boolean isClosed() {
        if (getCurrentValue() == BottomDrawerValue.Closed) {
            return true;
        }
        return false;
    }

    public final boolean isExpanded() {
        if (getCurrentValue() == BottomDrawerValue.Expanded) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        if (getCurrentValue() != BottomDrawerValue.Closed) {
            return true;
        }
        return false;
    }

    public final Object open(C12074d<? super C11921v> dVar) {
        BottomDrawerValue bottomDrawerValue;
        if (isOpenEnabled()) {
            bottomDrawerValue = BottomDrawerValue.Open;
        } else {
            bottomDrawerValue = BottomDrawerValue.Expanded;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this, bottomDrawerValue, (AnimationSpec) null, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomDrawerState(BottomDrawerValue bottomDrawerValue, Function1<? super BottomDrawerValue, Boolean> function1) {
        super(bottomDrawerValue, DrawerKt.access$getAnimationSpec$p(), function1);
        C12775o.m28639i(bottomDrawerValue, "initialValue");
        C12775o.m28639i(function1, "confirmStateChange");
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }
}

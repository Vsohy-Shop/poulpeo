package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.OnGloballyPositionedModifierImpl */
/* compiled from: OnGloballyPositionedModifier.kt */
final class OnGloballyPositionedModifierImpl extends InspectorValueInfo implements OnGloballyPositionedModifier {
    private final Function1<LayoutCoordinates, C11921v> callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnGloballyPositionedModifierImpl(Function1<? super LayoutCoordinates, C11921v> function1, Function1<? super InspectorInfo, C11921v> function12) {
        super(function12);
        C12775o.m28639i(function1, "callback");
        C12775o.m28639i(function12, "inspectorInfo");
        this.callback = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedModifierImpl)) {
            return false;
        }
        return C12775o.m28634d(this.callback, ((OnGloballyPositionedModifierImpl) obj).callback);
    }

    public final Function1<LayoutCoordinates, C11921v> getCallback() {
        return this.callback;
    }

    public int hashCode() {
        return this.callback.hashCode();
    }

    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "coordinates");
        this.callback.invoke(layoutCoordinates);
    }
}

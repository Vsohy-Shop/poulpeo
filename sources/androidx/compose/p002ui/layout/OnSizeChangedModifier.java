package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.OnSizeChangedModifier */
/* compiled from: OnRemeasuredModifier.kt */
final class OnSizeChangedModifier extends InspectorValueInfo implements OnRemeasuredModifier {
    private final Function1<IntSize, C11921v> onSizeChanged;
    private long previousSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnSizeChangedModifier(Function1<? super IntSize, C11921v> function1, Function1<? super InspectorInfo, C11921v> function12) {
        super(function12);
        C12775o.m28639i(function1, "onSizeChanged");
        C12775o.m28639i(function12, "inspectorInfo");
        this.onSizeChanged = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSizeChangedModifier)) {
            return false;
        }
        return C12775o.m28634d(this.onSizeChanged, ((OnSizeChangedModifier) obj).onSizeChanged);
    }

    public final Function1<IntSize, C11921v> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }

    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public void m37396onRemeasuredozmzZPI(long j) {
        if (!IntSize.m38626equalsimpl0(this.previousSize, j)) {
            this.onSizeChanged.invoke(IntSize.m38620boximpl(j));
            this.previousSize = j;
        }
    }
}

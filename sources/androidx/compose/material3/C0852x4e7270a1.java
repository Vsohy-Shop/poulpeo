package androidx.compose.material3;

import androidx.compose.p002ui.graphics.TransformOrigin;
import androidx.compose.p002ui.unit.IntRect;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 */
/* compiled from: ExposedDropdownMenu.kt */
final class C0852x4e7270a1 extends C12777p implements C13088o<IntRect, IntRect, C11921v> {
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0852x4e7270a1(MutableState<TransformOrigin> mutableState) {
        super(2);
        this.$transformOriginState = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((IntRect) obj, (IntRect) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(IntRect intRect, IntRect intRect2) {
        C12775o.m28639i(intRect, "anchorBounds");
        C12775o.m28639i(intRect2, "menuBounds");
        this.$transformOriginState.setValue(TransformOrigin.m36080boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
    }
}

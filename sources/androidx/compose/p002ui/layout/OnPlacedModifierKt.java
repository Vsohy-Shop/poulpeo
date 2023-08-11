package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.OnPlacedModifierKt */
/* compiled from: OnPlacedModifier.kt */
public final class OnPlacedModifierKt {
    @Stable
    public static final Modifier onPlaced(Modifier modifier, Function1<? super LayoutCoordinates, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onPlaced");
        return modifier.then(new OnPlacedElement(function1));
    }
}

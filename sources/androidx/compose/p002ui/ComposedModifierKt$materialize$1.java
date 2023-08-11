package androidx.compose.p002ui;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.ComposedModifierKt$materialize$1 */
/* compiled from: ComposedModifier.kt */
final class ComposedModifierKt$materialize$1 extends C12777p implements Function1<Modifier.Element, Boolean> {
    public static final ComposedModifierKt$materialize$1 INSTANCE = new ComposedModifierKt$materialize$1();

    ComposedModifierKt$materialize$1() {
        super(1);
    }

    public final Boolean invoke(Modifier.Element element) {
        C12775o.m28639i(element, "it");
        return Boolean.valueOf(!(element instanceof ComposedModifier));
    }
}

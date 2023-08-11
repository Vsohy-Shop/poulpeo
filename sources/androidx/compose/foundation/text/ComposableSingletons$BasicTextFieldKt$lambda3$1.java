package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* renamed from: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-3$1  reason: invalid class name */
/* compiled from: BasicTextField.kt */
final class ComposableSingletons$BasicTextFieldKt$lambda3$1 extends C12777p implements C13089p<C13088o<? super Composer, ? super Integer, ? extends C11921v>, Composer, Integer, C11921v> {
    public static final ComposableSingletons$BasicTextFieldKt$lambda3$1 INSTANCE = new ComposableSingletons$BasicTextFieldKt$lambda3$1();

    ComposableSingletons$BasicTextFieldKt$lambda3$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C13088o<? super Composer, ? super Integer, C11921v>) (C13088o) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public final void invoke(C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "innerTextField");
        if ((i & 14) == 0) {
            i |= composer.changedInstance(oVar) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(434140383, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-3.<anonymous> (BasicTextField.kt:329)");
            }
            oVar.invoke(composer, Integer.valueOf(i & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

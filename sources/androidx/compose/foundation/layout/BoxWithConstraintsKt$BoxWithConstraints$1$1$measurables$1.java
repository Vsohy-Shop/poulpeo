package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: BoxWithConstraints.kt */
final class BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<BoxWithConstraintsScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ BoxWithConstraintsScopeImpl $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(C13089p<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, C11921v> pVar, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, int i) {
        super(2);
        this.$content = pVar;
        this.$scope = boxWithConstraintsScopeImpl;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1945019079, i, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
            }
            this.$content.invoke(this.$scope, composer, Integer.valueOf((this.$$dirty >> 6) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

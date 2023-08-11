package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n*L\n1#1,316:1\n4216#2,4:317\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n*L\n192#1:317,4\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutKt$materializerOf$1 */
/* compiled from: Layout.kt */
final class LayoutKt$materializerOf$1 extends C12777p implements C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> {
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutKt$materializerOf$1(Modifier modifier) {
        super(3);
        this.$modifier = modifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m37348invokeDeg8D_g(((SkippableUpdater) obj).m35290unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @Composable
    /* renamed from: invoke-Deg8D_g  reason: not valid java name */
    public final void m37348invokeDeg8D_g(Composer composer, Composer composer2, int i) {
        C12775o.m28639i(composer, "$this$null");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1586257396, i, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:189)");
        }
        Modifier materialize = ComposedModifierKt.materialize(composer2, this.$modifier);
        composer.startReplaceableGroup(509942095);
        Updater.m35299setimpl(Updater.m35292constructorimpl(composer), materialize, ComposeUiNode.Companion.getSetModifier());
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

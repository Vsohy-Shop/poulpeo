package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import java.util.List;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$combineAsVirtualLayouts$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,316:1\n33#2,4:317\n38#2:332\n365#3,11:321\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$combineAsVirtualLayouts$1\n*L\n178#1:317,4\n178#1:332\n179#1:321,11\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1 */
/* compiled from: Layout.kt */
final class LayoutKt$combineAsVirtualLayouts$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ List<C13088o<Composer, Integer, C11921v>> $contents;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutKt$combineAsVirtualLayouts$1(List<? extends C13088o<? super Composer, ? super Integer, C11921v>> list) {
        super(2);
        this.$contents = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1953651383, i, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:176)");
            }
            List<C13088o<Composer, Integer, C11921v>> list = this.$contents;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13088o oVar = list.get(i2);
                C13074a<ComposeUiNode> virtualConstructor = ComposeUiNode.Companion.getVirtualConstructor();
                composer.startReplaceableGroup(-692256719);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(virtualConstructor);
                } else {
                    composer.useNode();
                }
                Updater.m35292constructorimpl(composer);
                oVar.invoke(composer, 0);
                composer.endNode();
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

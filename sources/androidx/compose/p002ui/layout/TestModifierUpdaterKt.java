package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nTestModifierUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,58:1\n251#2,10:59\n*S KotlinDebug\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n*L\n50#1:59,10\n*E\n"})
/* renamed from: androidx.compose.ui.layout.TestModifierUpdaterKt */
/* compiled from: TestModifierUpdater.kt */
public final class TestModifierUpdaterKt {
    @Composable
    public static final void TestModifierUpdaterLayout(Function1<? super TestModifierUpdater, C11921v> function1, Composer composer, int i) {
        int i2;
        int i3;
        C12775o.m28639i(function1, "onAttached");
        Composer startRestartGroup = composer.startRestartGroup(-1673066036);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673066036, i, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:45)");
            }
            TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 = TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1.INSTANCE;
            C13074a<LayoutNode> constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
            startRestartGroup.startReplaceableGroup(1886828752);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new C1051xeabd4719(constructor$ui_release));
            } else {
                startRestartGroup.useNode();
            }
            Composer r1 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r1, testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m35296initimpl(r1, new TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(function1));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TestModifierUpdaterKt$TestModifierUpdaterLayout$2(function1, i));
        }
    }
}

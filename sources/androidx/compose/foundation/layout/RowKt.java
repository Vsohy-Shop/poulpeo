package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,272:1\n75#2:273\n76#2,11:275\n89#2:302\n76#3:274\n460#4,16:286\n50#4:303\n49#4:304\n1057#5,6:305\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n80#1:273\n80#1:275,11\n80#1:302\n80#1:274\n80#1:286,16\n109#1:303\n109#1:304\n109#1:305,6\n*E\n"})
/* compiled from: Row.kt */
public final class RowKt {
    private static final MeasurePolicy DefaultRowMeasurePolicy;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        float r1 = Arrangement.INSTANCE.getStart().m33193getSpacingD9Ej5fM();
        CrossAxisAlignment vertical$foundation_layout_release = CrossAxisAlignment.Companion.vertical$foundation_layout_release(Alignment.Companion.getTop());
        DefaultRowMeasurePolicy = RowColumnImplKt.m33307rowColumnMeasurePolicyTDGSqEk(layoutOrientation, RowKt$DefaultRowMeasurePolicy$1.INSTANCE, r1, SizeMode.Wrap, vertical$foundation_layout_release);
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void Row(Modifier modifier, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, Composer composer, int i, int i2) {
        C12775o.m28639i(pVar, "content");
        composer.startReplaceableGroup(693286680);
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i2 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i2 & 4) != 0) {
            vertical = Alignment.Companion.getTop();
        }
        int i3 = i >> 3;
        MeasurePolicy rowMeasurePolicy = rowMeasurePolicy(horizontal, vertical, composer, (i3 & 112) | (i3 & 14));
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(modifier);
        int i4 = ((((i << 3) & 112) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer r3 = Updater.m35292constructorimpl(composer);
        Updater.m35299setimpl(r3, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m35299setimpl(r3, density, companion.getSetDensity());
        Updater.m35299setimpl(r3, layoutDirection, companion.getSetLayoutDirection());
        Updater.m35299setimpl(r3, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i4 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final MeasurePolicy getDefaultRowMeasurePolicy() {
        return DefaultRowMeasurePolicy;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.ui.layout.MeasurePolicy} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.layout.MeasurePolicy rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.Horizontal r3, androidx.compose.p002ui.Alignment.Vertical r4, androidx.compose.runtime.Composer r5, int r6) {
        /*
            java.lang.String r0 = "horizontalArrangement"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "verticalAlignment"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = -837807694(0xffffffffce1011b2, float:-6.042697E8)
            r5.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x001c
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:102)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r1, r2)
        L_0x001c:
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r6 = r6.getStart()
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r3, r6)
            if (r6 == 0) goto L_0x0037
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r6 = r6.getTop()
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r4, r6)
            if (r6 == 0) goto L_0x0037
            androidx.compose.ui.layout.MeasurePolicy r3 = DefaultRowMeasurePolicy
            goto L_0x0074
        L_0x0037:
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r5.startReplaceableGroup(r6)
            boolean r6 = r5.changed((java.lang.Object) r3)
            boolean r0 = r5.changed((java.lang.Object) r4)
            r6 = r6 | r0
            java.lang.Object r0 = r5.rememberedValue()
            if (r6 != 0) goto L_0x0054
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L_0x006e
        L_0x0054:
            androidx.compose.foundation.layout.LayoutOrientation r6 = androidx.compose.foundation.layout.LayoutOrientation.Horizontal
            float r0 = r3.m33193getSpacingD9Ej5fM()
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r1 = androidx.compose.foundation.layout.CrossAxisAlignment.Companion
            androidx.compose.foundation.layout.CrossAxisAlignment r4 = r1.vertical$foundation_layout_release(r4)
            androidx.compose.foundation.layout.SizeMode r1 = androidx.compose.foundation.layout.SizeMode.Wrap
            androidx.compose.foundation.layout.RowKt$rowMeasurePolicy$1$1 r2 = new androidx.compose.foundation.layout.RowKt$rowMeasurePolicy$1$1
            r2.<init>(r3)
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.RowColumnImplKt.m33307rowColumnMeasurePolicyTDGSqEk(r6, r2, r0, r1, r4)
            r5.updateRememberedValue(r0)
        L_0x006e:
            r5.endReplaceableGroup()
            r3 = r0
            androidx.compose.ui.layout.MeasurePolicy r3 = (androidx.compose.p002ui.layout.MeasurePolicy) r3
        L_0x0074:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x007d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x007d:
            r5.endReplaceableGroup()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    public static /* synthetic */ void getDefaultRowMeasurePolicy$annotations() {
    }
}

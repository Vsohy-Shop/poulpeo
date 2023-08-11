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

@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,250:1\n75#2:251\n76#2,11:253\n89#2:280\n76#3:252\n460#4,16:264\n50#4:281\n49#4:282\n1057#5,6:283\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n79#1:251\n79#1:253,11\n79#1:280\n79#1:252\n79#1:264,16\n105#1:281\n105#1:282\n105#1:283,6\n*E\n"})
/* compiled from: Column.kt */
public final class ColumnKt {
    private static final MeasurePolicy DefaultColumnMeasurePolicy;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        float r1 = Arrangement.INSTANCE.getTop().m33207getSpacingD9Ej5fM();
        CrossAxisAlignment horizontal$foundation_layout_release = CrossAxisAlignment.Companion.horizontal$foundation_layout_release(Alignment.Companion.getStart());
        DefaultColumnMeasurePolicy = RowColumnImplKt.m33307rowColumnMeasurePolicyTDGSqEk(layoutOrientation, ColumnKt$DefaultColumnMeasurePolicy$1.INSTANCE, r1, SizeMode.Wrap, horizontal$foundation_layout_release);
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void Column(Modifier modifier, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, Composer composer, int i, int i2) {
        C12775o.m28639i(pVar, "content");
        composer.startReplaceableGroup(-483455358);
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i2 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i2 & 4) != 0) {
            horizontal = Alignment.Companion.getStart();
        }
        int i3 = i >> 3;
        MeasurePolicy columnMeasurePolicy = columnMeasurePolicy(vertical, horizontal, composer, (i3 & 112) | (i3 & 14));
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
        Updater.m35299setimpl(r3, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m35299setimpl(r3, density, companion.getSetDensity());
        Updater.m35299setimpl(r3, layoutDirection, companion.getSetLayoutDirection());
        Updater.m35299setimpl(r3, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i4 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.ui.layout.MeasurePolicy} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.layout.MeasurePolicy columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.Vertical r3, androidx.compose.p002ui.Alignment.Horizontal r4, androidx.compose.runtime.Composer r5, int r6) {
        /*
            java.lang.String r0 = "verticalArrangement"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "horizontalAlignment"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = 1089876336(0x40f63170, float:7.693535)
            r5.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x001c
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:98)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r1, r2)
        L_0x001c:
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r6 = r6.getTop()
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r3, r6)
            if (r6 == 0) goto L_0x0037
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r6 = r6.getStart()
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r4, r6)
            if (r6 == 0) goto L_0x0037
            androidx.compose.ui.layout.MeasurePolicy r3 = DefaultColumnMeasurePolicy
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
            androidx.compose.foundation.layout.LayoutOrientation r6 = androidx.compose.foundation.layout.LayoutOrientation.Vertical
            float r0 = r3.m33207getSpacingD9Ej5fM()
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r1 = androidx.compose.foundation.layout.CrossAxisAlignment.Companion
            androidx.compose.foundation.layout.CrossAxisAlignment r4 = r1.horizontal$foundation_layout_release(r4)
            androidx.compose.foundation.layout.SizeMode r1 = androidx.compose.foundation.layout.SizeMode.Wrap
            androidx.compose.foundation.layout.ColumnKt$columnMeasurePolicy$1$1 r2 = new androidx.compose.foundation.layout.ColumnKt$columnMeasurePolicy$1$1
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    public static final MeasurePolicy getDefaultColumnMeasurePolicy() {
        return DefaultColumnMeasurePolicy;
    }

    public static /* synthetic */ void getDefaultColumnMeasurePolicy$annotations() {
    }
}

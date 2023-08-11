package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n50#2:332\n49#2:333\n1114#3,6:334\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1\n*L\n74#1:332\n74#1:333\n74#1:334,6\n*E\n"})
/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$SelectionHandle$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$SelectionHandle$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, boolean z, long j, int i, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(2);
        this.$content = oVar;
        this.$modifier = modifier;
        this.$isStartHandle = z;
        this.$position = j;
        this.$$dirty = i;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
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
                ComposerKt.traceEventStart(732099485, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)");
            }
            if (this.$content == null) {
                composer.startReplaceableGroup(386443790);
                Modifier modifier = this.$modifier;
                Boolean valueOf = Boolean.valueOf(this.$isStartHandle);
                Offset r1 = Offset.m35411boximpl(this.$position);
                boolean z = this.$isStartHandle;
                long j = this.$position;
                composer.startReplaceableGroup(511388516);
                boolean changed = composer.changed((Object) valueOf) | composer.changed((Object) r1);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(z, j);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, (Object) null);
                boolean z2 = this.$isStartHandle;
                ResolvedTextDirection resolvedTextDirection = this.$direction;
                boolean z3 = this.$handlesCrossed;
                int i2 = this.$$dirty;
                AndroidSelectionHandles_androidKt.DefaultSelectionHandle(semantics$default, z2, resolvedTextDirection, z3, composer, (i2 & 112) | (i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i2 & 7168));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(386444465);
                this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 15) & 14));
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

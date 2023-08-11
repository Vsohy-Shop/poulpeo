package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nDragInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragInteraction.kt\nandroidx/compose/foundation/interaction/DragInteractionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,95:1\n25#2:96\n50#2:103\n49#2:104\n1114#3,6:97\n1114#3,6:105\n*S KotlinDebug\n*F\n+ 1 DragInteraction.kt\nandroidx/compose/foundation/interaction/DragInteractionKt\n*L\n81#1:96\n82#1:103\n82#1:104\n81#1:97,6\n82#1:105,6\n*E\n"})
/* compiled from: DragInteraction.kt */
public final class DragInteractionKt {
    @Composable
    public static final State<Boolean> collectIsDraggedAsState(InteractionSource interactionSource, Composer composer, int i) {
        C12775o.m28639i(interactionSource, "<this>");
        composer.startReplaceableGroup(101276833);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(101276833, i, -1, "androidx.compose.foundation.interaction.collectIsDraggedAsState (DragInteraction.kt:79)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        int i2 = i & 14;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed((Object) interactionSource) | composer.changed((Object) mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new DragInteractionKt$collectIsDraggedAsState$1$1(interactionSource, mutableState, (C12074d<? super DragInteractionKt$collectIsDraggedAsState$1$1>) null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect((Object) interactionSource, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue2, composer, i2 | 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}

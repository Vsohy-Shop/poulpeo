package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusProperties;
import androidx.compose.p002ui.focus.FocusPropertiesKt;
import androidx.compose.p002ui.input.InputMode;
import androidx.compose.p002ui.input.InputModeManager;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusableInNonTouchMode$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,227:1\n76#2:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusableInNonTouchMode$2\n*L\n218#1:228\n*E\n"})
/* compiled from: Focusable.kt */
final class FocusableKt$focusableInNonTouchMode$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusableKt$focusableInNonTouchMode$2(boolean z, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-618949501);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-618949501, i, -1, "androidx.compose.foundation.focusableInNonTouchMode.<anonymous> (Focusable.kt:216)");
        }
        final InputModeManager inputModeManager = (InputModeManager) composer.consume(CompositionLocalsKt.getLocalInputModeManager());
        Modifier focusable = FocusableKt.focusable(FocusPropertiesKt.focusProperties(Modifier.Companion, new Function1<FocusProperties, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusProperties) obj);
                return C11921v.f18618a;
            }

            public final void invoke(FocusProperties focusProperties) {
                C12775o.m28639i(focusProperties, "$this$focusProperties");
                focusProperties.setCanFocus(!InputMode.m36417equalsimpl0(inputModeManager.m36423getInputModeaOaMEAU(), InputMode.Companion.m36422getTouchaOaMEAU()));
            }
        }), this.$enabled, this.$interactionSource);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return focusable;
    }
}

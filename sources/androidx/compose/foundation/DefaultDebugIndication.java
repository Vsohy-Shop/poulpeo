package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,186:1\n36#2:187\n1114#3,6:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n*L\n171#1:187\n171#1:188,6\n*E\n"})
/* compiled from: Indication.kt */
final class DefaultDebugIndication implements Indication {
    public static final DefaultDebugIndication INSTANCE = new DefaultDebugIndication();

    /* compiled from: Indication.kt */
    private static final class DefaultDebugIndicationInstance implements IndicationInstance {
        private final State<Boolean> isFocused;
        private final State<Boolean> isHovered;
        private final State<Boolean> isPressed;

        public DefaultDebugIndicationInstance(State<Boolean> state, State<Boolean> state2, State<Boolean> state3) {
            C12775o.m28639i(state, "isPressed");
            C12775o.m28639i(state2, "isHovered");
            C12775o.m28639i(state3, "isFocused");
            this.isPressed = state;
            this.isHovered = state2;
            this.isFocused = state3;
        }

        public void drawIndication(ContentDrawScope contentDrawScope) {
            C12775o.m28639i(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
            if (this.isPressed.getValue().booleanValue()) {
                DrawScope.m36250drawRectnJ9OG0$default(contentDrawScope, Color.m35670copywmQWz5c$default(Color.Companion.m35697getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, contentDrawScope.m36274getSizeNHjbRc(), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 122, (Object) null);
            } else if (this.isHovered.getValue().booleanValue() || this.isFocused.getValue().booleanValue()) {
                DrawScope.m36250drawRectnJ9OG0$default(contentDrawScope, Color.m35670copywmQWz5c$default(Color.Companion.m35697getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, contentDrawScope.m36274getSizeNHjbRc(), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 122, (Object) null);
            }
        }
    }

    private DefaultDebugIndication() {
    }

    @Composable
    public IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i) {
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1683566979);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683566979, i, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i2 = i & 14;
        State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, composer, i2);
        State<Boolean> collectIsHoveredAsState = HoverInteractionKt.collectIsHoveredAsState(interactionSource, composer, i2);
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, i2);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) interactionSource);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultDebugIndicationInstance(collectIsPressedAsState, collectIsHoveredAsState, collectIsFocusedAsState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultDebugIndicationInstance defaultDebugIndicationInstance = (DefaultDebugIndicationInstance) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultDebugIndicationInstance;
    }
}

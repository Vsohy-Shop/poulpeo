package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: Indication.kt */
final class NoIndication implements Indication {
    public static final NoIndication INSTANCE = new NoIndication();

    /* compiled from: Indication.kt */
    private static final class NoIndicationInstance implements IndicationInstance {
        public static final NoIndicationInstance INSTANCE = new NoIndicationInstance();

        private NoIndicationInstance() {
        }

        public void drawIndication(ContentDrawScope contentDrawScope) {
            C12775o.m28639i(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
        }
    }

    private NoIndication() {
    }

    @Composable
    public IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i) {
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(285654452);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(285654452, i, -1, "androidx.compose.foundation.NoIndication.rememberUpdatedInstance (Indication.kt:140)");
        }
        NoIndicationInstance noIndicationInstance = NoIndicationInstance.INSTANCE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return noIndicationInstance;
    }
}

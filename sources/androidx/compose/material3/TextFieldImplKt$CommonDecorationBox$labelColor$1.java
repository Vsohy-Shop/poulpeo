package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends C12777p implements C13089p<InputPhase, Composer, Integer, Color> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$CommonDecorationBox$labelColor$1(TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, int i) {
        super(3);
        this.$colors = textFieldColors;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$$dirty1 = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return Color.m35661boximpl(m34671invokeXeAY9LY((InputPhase) obj, (Composer) obj2, ((Number) obj3).intValue()));
    }

    @Composable
    /* renamed from: invoke-XeAY9LY  reason: not valid java name */
    public final long m34671invokeXeAY9LY(InputPhase inputPhase, Composer composer, int i) {
        C12775o.m28639i(inputPhase, "it");
        composer.startReplaceableGroup(-379813807);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-379813807, i, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
        }
        TextFieldColors textFieldColors = this.$colors;
        boolean z = this.$enabled;
        boolean z2 = this.$isError;
        InteractionSource interactionSource = this.$interactionSource;
        int i2 = this.$$dirty1;
        long r0 = textFieldColors.labelColor$material3_release(z, z2, interactionSource, composer, (i2 & 14) | (i2 & 112) | (i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i2 >> 3) & 7168)).getValue().m35681unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }
}

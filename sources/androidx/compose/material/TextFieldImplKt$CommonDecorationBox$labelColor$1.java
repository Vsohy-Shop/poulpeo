package androidx.compose.material;

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
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$CommonDecorationBox$labelColor$1(TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, int i, int i2) {
        super(3);
        this.$colors = textFieldColors;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return Color.m35661boximpl(m34193invokeXeAY9LY((InputPhase) obj, (Composer) obj2, ((Number) obj3).intValue()));
    }

    @Composable
    /* renamed from: invoke-XeAY9LY  reason: not valid java name */
    public final long m34193invokeXeAY9LY(InputPhase inputPhase, Composer composer, int i) {
        boolean z;
        C12775o.m28639i(inputPhase, "it");
        composer.startReplaceableGroup(697243846);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(697243846, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
        }
        TextFieldColors textFieldColors = this.$colors;
        boolean z2 = this.$enabled;
        if (inputPhase == InputPhase.UnfocusedEmpty) {
            z = false;
        } else {
            z = this.$isError;
        }
        InteractionSource interactionSource = this.$interactionSource;
        int i2 = this.$$dirty1;
        long r0 = textFieldColors.labelColor(z2, z, interactionSource, composer, ((this.$$dirty >> 27) & 14) | ((i2 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i2 & 7168)).getValue().m35681unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }
}

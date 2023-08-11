package androidx.compose.material.ripple;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRipple\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,119:1\n50#2:120\n49#2:121\n1057#3,6:122\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRipple\n*L\n54#1:120\n54#1:121\n54#1:122,6\n*E\n"})
@Stable
/* compiled from: CommonRipple.kt */
public final class CommonRipple extends Ripple {
    public /* synthetic */ CommonRipple(boolean z, float f, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: androidx.compose.material.ripple.CommonRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: androidx.compose.material.ripple.CommonRippleIndicationInstance} */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (r13 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x003e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.material.ripple.RippleIndicationInstance m34224rememberUpdatedRippleInstance942rkJo(androidx.compose.foundation.interaction.InteractionSource r7, boolean r8, float r9, androidx.compose.runtime.State<androidx.compose.p002ui.graphics.Color> r10, androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r6 = this;
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "color"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "rippleAlpha"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = -1768051227(0xffffffff969dade5, float:-2.547446E-25)
            r12.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0021
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:46)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r1, r2)
        L_0x0021:
            r13 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.startReplaceableGroup(r13)
            boolean r7 = r12.changed((java.lang.Object) r7)
            boolean r13 = r12.changed((java.lang.Object) r6)
            r7 = r7 | r13
            java.lang.Object r13 = r12.rememberedValue()
            if (r7 != 0) goto L_0x003e
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r13 != r7) goto L_0x004c
        L_0x003e:
            androidx.compose.material.ripple.CommonRippleIndicationInstance r13 = new androidx.compose.material.ripple.CommonRippleIndicationInstance
            r5 = 0
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r12.updateRememberedValue(r13)
        L_0x004c:
            r12.endReplaceableGroup()
            androidx.compose.material.ripple.CommonRippleIndicationInstance r13 = (androidx.compose.material.ripple.CommonRippleIndicationInstance) r13
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x005a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x005a:
            r12.endReplaceableGroup()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.CommonRipple.m34224rememberUpdatedRippleInstance942rkJo(androidx.compose.foundation.interaction.InteractionSource, boolean, float, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):androidx.compose.material.ripple.RippleIndicationInstance");
    }

    private CommonRipple(boolean z, float f, State<Color> state) {
        super(z, f, state, (DefaultConstructorMarker) null);
    }
}

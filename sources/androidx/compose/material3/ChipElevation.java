package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@ExperimentalMaterial3Api
/* compiled from: Chip.kt */
public final class ChipElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    /* access modifiers changed from: private */
    public final float draggedElevation;
    /* access modifiers changed from: private */
    public final float focusedElevation;
    /* access modifiers changed from: private */
    public final float hoveredElevation;
    /* access modifiers changed from: private */
    public final float pressedElevation;

    public /* synthetic */ ChipElevation(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.State<androidx.compose.p002ui.unit.C1232Dp> animateElevation(boolean r18, androidx.compose.foundation.interaction.InteractionSource r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r19
            r7 = r20
            r1 = r21
            r2 = -2071499570(0xffffffff84876cce, float:-3.183827E-36)
            r7.startReplaceableGroup(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x001a
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.ChipElevation.animateElevation (Chip.kt:1498)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r4)
        L_0x001a:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r2)
            java.lang.Object r3 = r20.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r4.getEmpty()
            if (r3 != r5) goto L_0x0033
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            r7.updateRememberedValue(r3)
        L_0x0033:
            r20.endReplaceableGroup()
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            int r1 = r1 >> 3
            r1 = r1 & 14
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.startReplaceableGroup(r5)
            boolean r5 = r7.changed((java.lang.Object) r0)
            boolean r8 = r7.changed((java.lang.Object) r3)
            r5 = r5 | r8
            java.lang.Object r8 = r20.rememberedValue()
            r9 = 0
            if (r5 != 0) goto L_0x0058
            java.lang.Object r5 = r4.getEmpty()
            if (r8 != r5) goto L_0x0060
        L_0x0058:
            androidx.compose.material3.ChipElevation$animateElevation$1$1 r8 = new androidx.compose.material3.ChipElevation$animateElevation$1$1
            r8.<init>(r0, r3, r9)
            r7.updateRememberedValue(r8)
        L_0x0060:
            r20.endReplaceableGroup()
            of.o r8 = (p404of.C13088o) r8
            r10 = 64
            r1 = r1 | r10
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r8, (androidx.compose.runtime.Composer) r7, (int) r1)
            java.lang.Object r0 = kotlin.collections.C12686e0.m28232k0(r3)
            r5 = r0
            androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
            if (r18 != 0) goto L_0x0078
            float r0 = r6.disabledElevation
        L_0x0076:
            r3 = r0
            goto L_0x0097
        L_0x0078:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r0 == 0) goto L_0x007f
            float r0 = r6.pressedElevation
            goto L_0x0076
        L_0x007f:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r0 == 0) goto L_0x0086
            float r0 = r6.hoveredElevation
            goto L_0x0076
        L_0x0086:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r0 == 0) goto L_0x008d
            float r0 = r6.focusedElevation
            goto L_0x0076
        L_0x008d:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r0 == 0) goto L_0x0094
            float r0 = r6.draggedElevation
            goto L_0x0076
        L_0x0094:
            float r0 = r6.defaultElevation
            goto L_0x0076
        L_0x0097:
            r7.startReplaceableGroup(r2)
            java.lang.Object r0 = r20.rememberedValue()
            java.lang.Object r1 = r4.getEmpty()
            if (r0 != r1) goto L_0x00bb
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.Dp r12 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r3)
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.p002ui.unit.C1232Dp.Companion
            androidx.compose.animation.core.TwoWayConverter r13 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((androidx.compose.p002ui.unit.C1232Dp.Companion) r1)
            r14 = 0
            r15 = 4
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            r7.updateRememberedValue(r0)
        L_0x00bb:
            r20.endReplaceableGroup()
            r8 = r0
            androidx.compose.animation.core.Animatable r8 = (androidx.compose.animation.core.Animatable) r8
            if (r18 != 0) goto L_0x00d9
            r0 = -1373769429(0xffffffffae1df12b, float:-3.5911867E-11)
            r7.startReplaceableGroup(r0)
            androidx.compose.ui.unit.Dp r0 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r3)
            androidx.compose.material3.ChipElevation$animateElevation$2 r1 = new androidx.compose.material3.ChipElevation$animateElevation$2
            r1.<init>(r8, r3, r9)
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r1, (androidx.compose.runtime.Composer) r7, (int) r10)
            r20.endReplaceableGroup()
            goto L_0x00f5
        L_0x00d9:
            r0 = -1373769286(0xffffffffae1df1ba, float:-3.5912363E-11)
            r7.startReplaceableGroup(r0)
            androidx.compose.ui.unit.Dp r9 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r3)
            androidx.compose.material3.ChipElevation$animateElevation$3 r11 = new androidx.compose.material3.ChipElevation$animateElevation$3
            r12 = 0
            r0 = r11
            r1 = r8
            r2 = r17
            r4 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r9, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r11, (androidx.compose.runtime.Composer) r7, (int) r10)
            r20.endReplaceableGroup()
        L_0x00f5:
            androidx.compose.runtime.State r0 = r8.asState()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0102
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0102:
            r20.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipElevation.animateElevation(boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipElevation)) {
            return false;
        }
        ChipElevation chipElevation = (ChipElevation) obj;
        if (C1232Dp.m38473equalsimpl0(this.defaultElevation, chipElevation.defaultElevation) && C1232Dp.m38473equalsimpl0(this.pressedElevation, chipElevation.pressedElevation) && C1232Dp.m38473equalsimpl0(this.focusedElevation, chipElevation.focusedElevation) && C1232Dp.m38473equalsimpl0(this.hoveredElevation, chipElevation.hoveredElevation) && C1232Dp.m38473equalsimpl0(this.disabledElevation, chipElevation.disabledElevation)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((C1232Dp.m38474hashCodeimpl(this.defaultElevation) * 31) + C1232Dp.m38474hashCodeimpl(this.pressedElevation)) * 31) + C1232Dp.m38474hashCodeimpl(this.focusedElevation)) * 31) + C1232Dp.m38474hashCodeimpl(this.hoveredElevation)) * 31) + C1232Dp.m38474hashCodeimpl(this.disabledElevation);
    }

    @Composable
    public final State<C1232Dp> shadowElevation$material3_release(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1881877139);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1881877139, i, -1, "androidx.compose.material3.ChipElevation.shadowElevation (Chip.kt:1490)");
        }
        State<C1232Dp> animateElevation = animateElevation(z, interactionSource, composer, (i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i & 14) | (i & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    @Composable
    public final State<C1232Dp> tonalElevation$material3_release(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1108183825);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1108183825, i, -1, "androidx.compose.material3.ChipElevation.tonalElevation (Chip.kt:1471)");
        }
        State<C1232Dp> animateElevation = animateElevation(z, interactionSource, composer, (i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i & 14) | (i & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    private ChipElevation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
        this.draggedElevation = f5;
        this.disabledElevation = f6;
    }
}

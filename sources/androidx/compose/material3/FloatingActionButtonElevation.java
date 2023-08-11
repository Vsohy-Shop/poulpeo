package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Stable
/* compiled from: FloatingActionButton.kt */
public class FloatingActionButtonElevation {
    private final float defaultElevation;
    /* access modifiers changed from: private */
    public final float focusedElevation;
    /* access modifiers changed from: private */
    public final float hoveredElevation;
    /* access modifiers changed from: private */
    public final float pressedElevation;

    public /* synthetic */ FloatingActionButtonElevation(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.State<androidx.compose.p002ui.unit.C1232Dp> animateElevation(androidx.compose.foundation.interaction.InteractionSource r17, androidx.compose.runtime.Composer r18, int r19) {
        /*
            r16 = this;
            r6 = r16
            r0 = r17
            r7 = r18
            r1 = r19
            r2 = -1845106002(0xffffffff9205eaae, float:-4.2256665E-28)
            r7.startReplaceableGroup(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x001a
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:503)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r4)
        L_0x001a:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r2)
            java.lang.Object r3 = r18.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r4.getEmpty()
            if (r3 != r5) goto L_0x0033
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            r7.updateRememberedValue(r3)
        L_0x0033:
            r18.endReplaceableGroup()
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            r1 = r1 & 14
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.startReplaceableGroup(r5)
            boolean r5 = r7.changed((java.lang.Object) r0)
            boolean r8 = r7.changed((java.lang.Object) r3)
            r5 = r5 | r8
            java.lang.Object r8 = r18.rememberedValue()
            if (r5 != 0) goto L_0x0055
            java.lang.Object r5 = r4.getEmpty()
            if (r8 != r5) goto L_0x005e
        L_0x0055:
            androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1 r8 = new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1
            r5 = 0
            r8.<init>(r0, r3, r5)
            r7.updateRememberedValue(r8)
        L_0x005e:
            r18.endReplaceableGroup()
            of.o r8 = (p404of.C13088o) r8
            r9 = 64
            r1 = r1 | r9
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r8, (androidx.compose.runtime.Composer) r7, (int) r1)
            java.lang.Object r0 = kotlin.collections.C12686e0.m28232k0(r3)
            r5 = r0
            androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r0 == 0) goto L_0x0078
            float r0 = r6.pressedElevation
        L_0x0076:
            r3 = r0
            goto L_0x0089
        L_0x0078:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r0 == 0) goto L_0x007f
            float r0 = r6.hoveredElevation
            goto L_0x0076
        L_0x007f:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r0 == 0) goto L_0x0086
            float r0 = r6.focusedElevation
            goto L_0x0076
        L_0x0086:
            float r0 = r6.defaultElevation
            goto L_0x0076
        L_0x0089:
            r7.startReplaceableGroup(r2)
            java.lang.Object r0 = r18.rememberedValue()
            java.lang.Object r1 = r4.getEmpty()
            if (r0 != r1) goto L_0x00ac
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.Dp r11 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r3)
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.p002ui.unit.C1232Dp.Companion
            androidx.compose.animation.core.TwoWayConverter r12 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((androidx.compose.p002ui.unit.C1232Dp.Companion) r1)
            r13 = 0
            r14 = 4
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r7.updateRememberedValue(r0)
        L_0x00ac:
            r18.endReplaceableGroup()
            r8 = r0
            androidx.compose.animation.core.Animatable r8 = (androidx.compose.animation.core.Animatable) r8
            androidx.compose.ui.unit.Dp r10 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r3)
            androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2 r11 = new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2
            r12 = 0
            r0 = r11
            r1 = r8
            r2 = r16
            r4 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r10, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r11, (androidx.compose.runtime.Composer) r7, (int) r9)
            androidx.compose.runtime.State r0 = r8.asState()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00d2
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00d2:
            r18.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevation.animateElevation(androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        if (C1232Dp.m38473equalsimpl0(this.defaultElevation, floatingActionButtonElevation.defaultElevation) && C1232Dp.m38473equalsimpl0(this.pressedElevation, floatingActionButtonElevation.pressedElevation) && C1232Dp.m38473equalsimpl0(this.focusedElevation, floatingActionButtonElevation.focusedElevation) && C1232Dp.m38473equalsimpl0(this.hoveredElevation, floatingActionButtonElevation.hoveredElevation)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((C1232Dp.m38474hashCodeimpl(this.defaultElevation) * 31) + C1232Dp.m38474hashCodeimpl(this.pressedElevation)) * 31) + C1232Dp.m38474hashCodeimpl(this.focusedElevation)) * 31) + C1232Dp.m38474hashCodeimpl(this.hoveredElevation);
    }

    @Composable
    public final State<C1232Dp> shadowElevation$material3_release(InteractionSource interactionSource, Composer composer, int i) {
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-424810125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-424810125, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:493)");
        }
        State<C1232Dp> animateElevation = animateElevation(interactionSource, composer, (i & 112) | (i & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    @Composable
    public final State<C1232Dp> tonalElevation$material3_release(InteractionSource interactionSource, Composer composer, int i) {
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-550096911);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-550096911, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.tonalElevation (FloatingActionButton.kt:498)");
        }
        State<C1232Dp> animateElevation = animateElevation(interactionSource, composer, (i & 112) | (i & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    private FloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
    }
}

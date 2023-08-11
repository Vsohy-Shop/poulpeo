package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: Card.kt */
public final class CardElevation {
    /* access modifiers changed from: private */
    public final float defaultElevation;
    private final float disabledElevation;
    /* access modifiers changed from: private */
    public final float draggedElevation;
    /* access modifiers changed from: private */
    public final float focusedElevation;
    /* access modifiers changed from: private */
    public final float hoveredElevation;
    /* access modifiers changed from: private */
    public final float pressedElevation;

    public /* synthetic */ CardElevation(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.State<androidx.compose.p002ui.unit.C1232Dp> animateElevation(boolean r17, androidx.compose.foundation.interaction.InteractionSource r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            r16 = this;
            r7 = r16
            r0 = r18
            r8 = r19
            r1 = r20
            r2 = -1421890746(0xffffffffab3fab46, float:-6.809452E-13)
            r8.startReplaceableGroup(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x001a
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.CardElevation.animateElevation (Card.kt:612)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r4)
        L_0x001a:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r2)
            java.lang.Object r3 = r19.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r4.getEmpty()
            if (r3 != r5) goto L_0x0033
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            r8.updateRememberedValue(r3)
        L_0x0033:
            r19.endReplaceableGroup()
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            int r1 = r1 >> 3
            r1 = r1 & 14
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r8.startReplaceableGroup(r5)
            boolean r5 = r8.changed((java.lang.Object) r0)
            boolean r6 = r8.changed((java.lang.Object) r3)
            r5 = r5 | r6
            java.lang.Object r6 = r19.rememberedValue()
            if (r5 != 0) goto L_0x0057
            java.lang.Object r5 = r4.getEmpty()
            if (r6 != r5) goto L_0x0060
        L_0x0057:
            androidx.compose.material3.CardElevation$animateElevation$1$1 r6 = new androidx.compose.material3.CardElevation$animateElevation$1$1
            r5 = 0
            r6.<init>(r0, r3, r5)
            r8.updateRememberedValue(r6)
        L_0x0060:
            r19.endReplaceableGroup()
            of.o r6 = (p404of.C13088o) r6
            r9 = 64
            r1 = r1 | r9
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r6, (androidx.compose.runtime.Composer) r8, (int) r1)
            java.lang.Object r0 = kotlin.collections.C12686e0.m28232k0(r3)
            r5 = r0
            androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
            if (r17 != 0) goto L_0x0078
            float r0 = r7.disabledElevation
        L_0x0076:
            r6 = r0
            goto L_0x0097
        L_0x0078:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r0 == 0) goto L_0x007f
            float r0 = r7.pressedElevation
            goto L_0x0076
        L_0x007f:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r0 == 0) goto L_0x0086
            float r0 = r7.hoveredElevation
            goto L_0x0076
        L_0x0086:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r0 == 0) goto L_0x008d
            float r0 = r7.focusedElevation
            goto L_0x0076
        L_0x008d:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r0 == 0) goto L_0x0094
            float r0 = r7.draggedElevation
            goto L_0x0076
        L_0x0094:
            float r0 = r7.defaultElevation
            goto L_0x0076
        L_0x0097:
            r8.startReplaceableGroup(r2)
            java.lang.Object r0 = r19.rememberedValue()
            java.lang.Object r1 = r4.getEmpty()
            if (r0 != r1) goto L_0x00ba
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.Dp r11 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r6)
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.p002ui.unit.C1232Dp.Companion
            androidx.compose.animation.core.TwoWayConverter r12 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((androidx.compose.p002ui.unit.C1232Dp.Companion) r1)
            r13 = 0
            r14 = 4
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r8.updateRememberedValue(r0)
        L_0x00ba:
            r19.endReplaceableGroup()
            r10 = r0
            androidx.compose.animation.core.Animatable r10 = (androidx.compose.animation.core.Animatable) r10
            androidx.compose.ui.unit.Dp r11 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r6)
            androidx.compose.material3.CardElevation$animateElevation$2 r12 = new androidx.compose.material3.CardElevation$animateElevation$2
            r13 = 0
            r0 = r12
            r1 = r17
            r2 = r10
            r3 = r16
            r4 = r6
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r11, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r12, (androidx.compose.runtime.Composer) r8, (int) r9)
            androidx.compose.runtime.State r0 = r10.asState()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00e2
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00e2:
            r19.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardElevation.animateElevation(boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) obj;
        if (C1232Dp.m38473equalsimpl0(this.defaultElevation, cardElevation.defaultElevation) && C1232Dp.m38473equalsimpl0(this.pressedElevation, cardElevation.pressedElevation) && C1232Dp.m38473equalsimpl0(this.focusedElevation, cardElevation.focusedElevation) && C1232Dp.m38473equalsimpl0(this.hoveredElevation, cardElevation.hoveredElevation) && C1232Dp.m38473equalsimpl0(this.disabledElevation, cardElevation.disabledElevation)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((C1232Dp.m38474hashCodeimpl(this.defaultElevation) * 31) + C1232Dp.m38474hashCodeimpl(this.pressedElevation)) * 31) + C1232Dp.m38474hashCodeimpl(this.focusedElevation)) * 31) + C1232Dp.m38474hashCodeimpl(this.hoveredElevation)) * 31) + C1232Dp.m38474hashCodeimpl(this.disabledElevation);
    }

    @Composable
    public final State<C1232Dp> shadowElevation$material3_release(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(-1763481333);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763481333, i, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:601)");
        }
        composer.startReplaceableGroup(-1409180589);
        if (interactionSource == null) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C1232Dp.m38466boximpl(this.defaultElevation), (SnapshotMutationPolicy) null, 2, (Object) null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return mutableState;
        }
        composer.endReplaceableGroup();
        State<C1232Dp> animateElevation = animateElevation(z, interactionSource, composer, (i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i & 14) | (i & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    @Composable
    public final State<C1232Dp> tonalElevation$material3_release(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(1757792649);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1757792649, i, -1, "androidx.compose.material3.CardElevation.tonalElevation (Card.kt:579)");
        }
        composer.startReplaceableGroup(603878391);
        if (interactionSource == null) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C1232Dp.m38466boximpl(this.defaultElevation), (SnapshotMutationPolicy) null, 2, (Object) null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return mutableState;
        }
        composer.endReplaceableGroup();
        State<C1232Dp> animateElevation = animateElevation(z, interactionSource, composer, (i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i & 14) | (i & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    private CardElevation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
        this.draggedElevation = f5;
        this.disabledElevation = f6;
    }
}

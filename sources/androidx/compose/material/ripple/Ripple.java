package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,355:1\n76#2:356\n654#3:357\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n*L\n117#1:356\n119#1:357\n*E\n"})
@Stable
/* compiled from: Ripple.kt */
public abstract class Ripple implements Indication {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    public /* synthetic */ Ripple(boolean z, float f, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        if (this.bounded == ripple.bounded && C1232Dp.m38473equalsimpl0(this.radius, ripple.radius) && C12775o.m28634d(this.color, ripple.color)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.bounded) * 31) + C1232Dp.m38474hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }

    @Composable
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i) {
        boolean z;
        long j;
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(988743187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, i, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:113)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        composer.startReplaceableGroup(-1524341038);
        if (this.color.getValue().m35681unboximpl() != Color.Companion.m35707getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j = this.color.getValue().m35681unboximpl();
        } else {
            j = rippleTheme.m34236defaultColorWaAFU9c(composer, 0);
        }
        composer.endReplaceableGroup();
        RippleIndicationInstance r0 = m34228rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0), SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0), composer, (i & 14) | ((i << 12) & 458752));
        EffectsKt.LaunchedEffect(r0, interactionSource, new Ripple$rememberUpdatedInstance$1(interactionSource, r0, (C12074d<? super Ripple$rememberUpdatedInstance$1>) null), composer, ((i << 3) & 112) | 520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo  reason: not valid java name */
    public abstract RippleIndicationInstance m34228rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z, float f, State<Color> state, State<RippleAlpha> state2, Composer composer, int i);

    private Ripple(boolean z, float f, State<Color> state) {
        this.bounded = z;
        this.radius = f;
        this.color = state;
    }
}

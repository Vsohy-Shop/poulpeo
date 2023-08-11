package androidx.compose.material;

import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

/* compiled from: BackdropScaffold.kt */
final class BackdropScaffoldKt$BackdropStack$1$1$placeables$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ float $backLayerHeight;
    final /* synthetic */ long $constraints;
    final /* synthetic */ C13090q<Constraints, Float, Composer, Integer, C11921v> $frontLayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackdropScaffoldKt$BackdropStack$1$1$placeables$1(C13090q<? super Constraints, ? super Float, ? super Composer, ? super Integer, C11921v> qVar, long j, float f, int i) {
        super(2);
        this.$frontLayer = qVar;
        this.$constraints = j;
        this.$backLayerHeight = f;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1222642649, i, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:465)");
            }
            this.$frontLayer.invoke(Constraints.m38400boximpl(this.$constraints), Float.valueOf(this.$backLayerHeight), composer, Integer.valueOf((this.$$dirty >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

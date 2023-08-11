package androidx.compose.material3;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13089p;

/* compiled from: TouchTarget.kt */
final class TouchTargetKt$minimumTouchTargetSize$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    public static final TouchTargetKt$minimumTouchTargetSize$2 INSTANCE = new TouchTargetKt$minimumTouchTargetSize$2();

    TouchTargetKt$minimumTouchTargetSize$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-1937671640);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1937671640, i, -1, "androidx.compose.material3.minimumTouchTargetSize.<anonymous> (TouchTarget.kt:42)");
        }
        if (((Boolean) composer.consume(TouchTargetKt.getLocalMinimumTouchTargetEnforcement())).booleanValue()) {
            modifier2 = new MinimumTouchTargetModifier(((ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration())).m37783getMinimumTouchTargetSizeMYxV2XQ(), (DefaultConstructorMarker) null);
        } else {
            modifier2 = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier2;
    }
}

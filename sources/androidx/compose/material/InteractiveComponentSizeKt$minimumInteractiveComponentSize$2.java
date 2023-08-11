package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt$minimumInteractiveComponentSize$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,129:1\n76#2:130\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt$minimumInteractiveComponentSize$2\n*L\n57#1:130\n*E\n"})
/* compiled from: InteractiveComponentSize.kt */
final class InteractiveComponentSizeKt$minimumInteractiveComponentSize$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    public static final InteractiveComponentSizeKt$minimumInteractiveComponentSize$2 INSTANCE = new InteractiveComponentSizeKt$minimumInteractiveComponentSize$2();

    InteractiveComponentSizeKt$minimumInteractiveComponentSize$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(1964721376);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1964721376, i, -1, "androidx.compose.material.minimumInteractiveComponentSize.<anonymous> (InteractiveComponentSize.kt:55)");
        }
        if (((Boolean) composer.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentEnforcement())).booleanValue()) {
            modifier2 = new MinimumInteractiveComponentSizeModifier(InteractiveComponentSizeKt.minimumInteractiveComponentSize, (DefaultConstructorMarker) null);
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

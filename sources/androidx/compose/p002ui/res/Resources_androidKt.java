package androidx.compose.p002ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,34:1\n76#2:35\n76#2:36\n*S KotlinDebug\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n*L\n32#1:35\n33#1:36\n*E\n"})
/* renamed from: androidx.compose.ui.res.Resources_androidKt */
/* compiled from: Resources.android.kt */
public final class Resources_androidKt {
    @ReadOnlyComposable
    @Composable
    public static final Resources resources(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1554054999, i, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        C12775o.m28638h(resources, "LocalContext.current.resources");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return resources;
    }
}

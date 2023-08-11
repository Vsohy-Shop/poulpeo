package androidx.compose.p002ui.res;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.LoadedFontFamily;
import androidx.compose.p002ui.text.font.SystemFontFamily;
import androidx.compose.p002ui.text.font.Typeface;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n76#2:78\n361#3,7:79\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n55#1:78\n69#1:79,7\n*E\n"})
/* renamed from: androidx.compose.ui.res.FontResources_androidKt */
/* compiled from: FontResources.android.kt */
public final class FontResources_androidKt {
    private static final Object cacheLock = new Object();
    @GuardedBy("cacheLock")
    private static final Map<FontFamily, Typeface> syncLoadedTypefaces = new LinkedHashMap();

    @ReadOnlyComposable
    @Composable
    public static final Typeface fontResource(FontFamily fontFamily, Composer composer, int i) {
        C12775o.m28639i(fontFamily, "fontFamily");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        Typeface fontResourceFromContext = fontResourceFromContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fontResourceFromContext;
    }

    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if (!(fontFamily instanceof SystemFontFamily) && !(fontFamily instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, (List) null, 4, (Object) null);
        }
        synchronized (cacheLock) {
            Map<FontFamily, Typeface> map = syncLoadedTypefaces;
            Typeface typeface2 = map.get(fontFamily);
            if (typeface2 == null) {
                typeface2 = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, (List) null, 4, (Object) null);
                map.put(fontFamily, typeface2);
            }
            typeface = typeface2;
        }
        return typeface;
    }
}

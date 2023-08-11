package p104h;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function1;
import p104h.C7847b;
import p336ef.C11921v;

/* renamed from: h.i */
/* compiled from: SingletonAsyncImage.kt */
public final class C7878i {
    @Composable
    /* renamed from: a */
    public static final void m15411a(Object obj, String str, Modifier modifier, Function1<? super C7847b.C7850c, ? extends C7847b.C7850c> function1, Function1<? super C7847b.C7850c, C11921v> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, int i2, int i3) {
        Composer composer2 = composer;
        int i4 = i2;
        int i5 = i3;
        composer2.startReplaceableGroup(-941517612);
        Modifier modifier2 = (i5 & 4) != 0 ? Modifier.Companion : modifier;
        Function1 a = (i5 & 8) != 0 ? C7847b.f10942q.mo41561a() : function1;
        Function1<? super C7847b.C7850c, C11921v> function13 = (i5 & 16) != 0 ? null : function12;
        Alignment center = (i5 & 32) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i5 & 64) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i5 & 128) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i5 & 256) != 0 ? null : colorFilter;
        int r11 = (i5 & 512) != 0 ? DrawScope.Companion.m36276getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-941517612, i4, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:102)");
        }
        int i6 = i4 << 3;
        C7840a.m15331a(obj, str, C7875g.m15408c(C7877h.m15410a(), composer2, 6), modifier2, a, function13, center, fit, f2, colorFilter2, r11, composer, (i4 & 112) | 520 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192), (i4 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}

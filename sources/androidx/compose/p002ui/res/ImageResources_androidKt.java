package androidx.compose.p002ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.p002ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nImageResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n76#2:61\n25#3:62\n36#3:69\n1114#4,6:63\n1114#4,6:70\n*S KotlinDebug\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n*L\n54#1:61\n55#1:62\n58#1:69\n55#1:63,6\n58#1:70,6\n*E\n"})
/* renamed from: androidx.compose.ui.res.ImageResources_androidKt */
/* compiled from: ImageResources.android.kt */
public final class ImageResources_androidKt {
    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, Resources resources, @DrawableRes int i) {
        C12775o.m28639i(companion, "<this>");
        C12775o.m28639i(resources, "res");
        Drawable drawable = resources.getDrawable(i, (Resources.Theme) null);
        C12775o.m28637g(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        C12775o.m28638h(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
    }

    @Composable
    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, @DrawableRes int i, Composer composer, int i2) {
        C12775o.m28639i(companion, "<this>");
        composer.startReplaceableGroup(-304919470);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304919470, i2, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new TypedValue();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TypedValue typedValue = (TypedValue) rememberedValue;
        context.getResources().getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        C12775o.m28636f(charSequence);
        String obj = charSequence.toString();
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) obj);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion2.getEmpty()) {
            Resources resources = context.getResources();
            C12775o.m28638h(resources, "context.resources");
            rememberedValue2 = imageResource(companion, resources, i);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ImageBitmap imageBitmap = (ImageBitmap) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageBitmap;
    }
}

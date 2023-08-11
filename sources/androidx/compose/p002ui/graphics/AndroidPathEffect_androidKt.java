package androidx.compose.p002ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import androidx.compose.p002ui.graphics.StampedPathEffectStyle;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidPathEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,66:1\n35#2,5:67\n*S KotlinDebug\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n*L\n53#1:67,5\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidPathEffect_androidKt */
/* compiled from: AndroidPathEffect.android.kt */
public final class AndroidPathEffect_androidKt {
    public static final PathEffect actualChainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
        C12775o.m28639i(pathEffect, "outer");
        C12775o.m28639i(pathEffect2, "inner");
        return new AndroidPathEffect(new ComposePathEffect(((AndroidPathEffect) pathEffect).getNativePathEffect(), ((AndroidPathEffect) pathEffect2).getNativePathEffect()));
    }

    public static final PathEffect actualCornerPathEffect(float f) {
        return new AndroidPathEffect(new CornerPathEffect(f));
    }

    public static final PathEffect actualDashPathEffect(float[] fArr, float f) {
        C12775o.m28639i(fArr, "intervals");
        return new AndroidPathEffect(new DashPathEffect(fArr, f));
    }

    /* renamed from: actualStampedPathEffect-7aD1DOk  reason: not valid java name */
    public static final PathEffect m35558actualStampedPathEffect7aD1DOk(Path path, float f, float f2, int i) {
        C12775o.m28639i(path, "shape");
        if (path instanceof AndroidPath) {
            return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath) path).getInternalPath(), f, f2, m35559toAndroidPathDashPathEffectStyleoQv6xUo(i)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final PathEffect asAndroidPathEffect(PathEffect pathEffect) {
        C12775o.m28639i(pathEffect, "<this>");
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo  reason: not valid java name */
    public static final PathDashPathEffect.Style m35559toAndroidPathDashPathEffectStyleoQv6xUo(int i) {
        StampedPathEffectStyle.Companion companion = StampedPathEffectStyle.Companion;
        if (StampedPathEffectStyle.m36040equalsimpl0(i, companion.m36044getMorphYpspkwk())) {
            return PathDashPathEffect.Style.MORPH;
        }
        if (StampedPathEffectStyle.m36040equalsimpl0(i, companion.m36045getRotateYpspkwk())) {
            return PathDashPathEffect.Style.ROTATE;
        }
        if (StampedPathEffectStyle.m36040equalsimpl0(i, companion.m36046getTranslateYpspkwk())) {
            return PathDashPathEffect.Style.TRANSLATE;
        }
        return PathDashPathEffect.Style.TRANSLATE;
    }

    public static final PathEffect toComposePathEffect(PathEffect pathEffect) {
        C12775o.m28639i(pathEffect, "<this>");
        return new AndroidPathEffect(pathEffect);
    }
}

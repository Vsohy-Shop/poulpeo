package androidx.compose.p002ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.ShaderKt */
/* compiled from: Shader.kt */
public final class ShaderKt {
    /* renamed from: ImageShader-F49vj9s  reason: not valid java name */
    public static final Shader m36011ImageShaderF49vj9s(ImageBitmap imageBitmap, int i, int i2) {
        C12775o.m28639i(imageBitmap, "image");
        return AndroidShader_androidKt.m35562ActualImageShaderF49vj9s(imageBitmap, i, i2);
    }

    /* renamed from: ImageShader-F49vj9s$default  reason: not valid java name */
    public static /* synthetic */ Shader m36012ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = TileMode.Companion.m36075getClamp3opZhB0();
        }
        if ((i3 & 4) != 0) {
            i2 = TileMode.Companion.m36075getClamp3opZhB0();
        }
        return m36011ImageShaderF49vj9s(imageBitmap, i, i2);
    }

    /* renamed from: LinearGradientShader-VjE6UOU  reason: not valid java name */
    public static final Shader m36013LinearGradientShaderVjE6UOU(long j, long j2, List<Color> list, List<Float> list2, int i) {
        C12775o.m28639i(list, "colors");
        return AndroidShader_androidKt.m35563ActualLinearGradientShaderVjE6UOU(j, j2, list, list2, i);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default  reason: not valid java name */
    public static /* synthetic */ Shader m36014LinearGradientShaderVjE6UOU$default(long j, long j2, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = TileMode.Companion.m36075getClamp3opZhB0();
        }
        return m36013LinearGradientShaderVjE6UOU(j, j2, list, list3, i);
    }

    /* renamed from: RadialGradientShader-8uybcMk  reason: not valid java name */
    public static final Shader m36015RadialGradientShader8uybcMk(long j, float f, List<Color> list, List<Float> list2, int i) {
        C12775o.m28639i(list, "colors");
        return AndroidShader_androidKt.m35564ActualRadialGradientShader8uybcMk(j, f, list, list2, i);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default  reason: not valid java name */
    public static /* synthetic */ Shader m36016RadialGradientShader8uybcMk$default(long j, float f, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = TileMode.Companion.m36075getClamp3opZhB0();
        }
        return m36015RadialGradientShader8uybcMk(j, f, list, list3, i);
    }

    /* renamed from: SweepGradientShader-9KIMszo  reason: not valid java name */
    public static final Shader m36017SweepGradientShader9KIMszo(long j, List<Color> list, List<Float> list2) {
        C12775o.m28639i(list, "colors");
        return AndroidShader_androidKt.m35565ActualSweepGradientShader9KIMszo(j, list, list2);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default  reason: not valid java name */
    public static /* synthetic */ Shader m36018SweepGradientShader9KIMszo$default(long j, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = null;
        }
        return m36017SweepGradientShader9KIMszo(j, list, list2);
    }
}

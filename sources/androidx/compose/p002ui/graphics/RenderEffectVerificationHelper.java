package androidx.compose.p002ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.geometry.Offset;
import kotlin.jvm.internal.C12775o;

@RequiresApi(31)
/* renamed from: androidx.compose.ui.graphics.RenderEffectVerificationHelper */
/* compiled from: AndroidRenderEffect.android.kt */
final class RenderEffectVerificationHelper {
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    @DoNotInline
    /* renamed from: createBlurEffect-8A-3gB4  reason: not valid java name */
    public final RenderEffect m35997createBlurEffect8A3gB4(RenderEffect renderEffect, float f, float f2, int i) {
        if (renderEffect == null) {
            RenderEffect a = RenderEffect.createBlurEffect(f, f2, AndroidTileMode_androidKt.m35567toAndroidTileMode0vamqd0(i));
            C12775o.m28638h(a, "{\n            android.gr…)\n            )\n        }");
            return a;
        }
        RenderEffect a2 = RenderEffect.createBlurEffect(f, f2, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m35567toAndroidTileMode0vamqd0(i));
        C12775o.m28638h(a2, "{\n            android.gr…)\n            )\n        }");
        return a2;
    }

    @DoNotInline
    /* renamed from: createOffsetEffect-Uv8p0NA  reason: not valid java name */
    public final RenderEffect m35998createOffsetEffectUv8p0NA(RenderEffect renderEffect, long j) {
        if (renderEffect == null) {
            RenderEffect a = RenderEffect.createOffsetEffect(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
            C12775o.m28638h(a, "{\n            android.gr…et.x, offset.y)\n        }");
            return a;
        }
        RenderEffect a2 = RenderEffect.createOffsetEffect(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), renderEffect.asAndroidRenderEffect());
        C12775o.m28638h(a2, "{\n            android.gr…)\n            )\n        }");
        return a2;
    }
}

package androidx.compose.p002ui.graphics;

import android.graphics.PathEffect;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.AndroidPathEffect */
/* compiled from: AndroidPathEffect.android.kt */
public final class AndroidPathEffect implements PathEffect {
    private final PathEffect nativePathEffect;

    public AndroidPathEffect(PathEffect pathEffect) {
        C12775o.m28639i(pathEffect, "nativePathEffect");
        this.nativePathEffect = pathEffect;
    }

    public final PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }
}

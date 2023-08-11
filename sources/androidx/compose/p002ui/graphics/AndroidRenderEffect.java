package androidx.compose.p002ui.graphics;

import android.graphics.RenderEffect;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.AndroidRenderEffect */
/* compiled from: AndroidRenderEffect.android.kt */
public final class AndroidRenderEffect extends RenderEffect {
    private final RenderEffect androidRenderEffect;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidRenderEffect(RenderEffect renderEffect) {
        super((DefaultConstructorMarker) null);
        C12775o.m28639i(renderEffect, "androidRenderEffect");
        this.androidRenderEffect = renderEffect;
    }

    /* access modifiers changed from: protected */
    public RenderEffect createRenderEffect() {
        return this.androidRenderEffect;
    }

    public final RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}

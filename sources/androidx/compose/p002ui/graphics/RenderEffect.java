package androidx.compose.p002ui.graphics;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.RenderEffect */
/* compiled from: AndroidRenderEffect.android.kt */
public abstract class RenderEffect {
    private android.graphics.RenderEffect internalRenderEffect;

    public /* synthetic */ RenderEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @RequiresApi(31)
    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect createRenderEffect = createRenderEffect();
        this.internalRenderEffect = createRenderEffect;
        return createRenderEffect;
    }

    /* access modifiers changed from: protected */
    @RequiresApi(31)
    public abstract android.graphics.RenderEffect createRenderEffect();

    public boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    private RenderEffect() {
    }
}

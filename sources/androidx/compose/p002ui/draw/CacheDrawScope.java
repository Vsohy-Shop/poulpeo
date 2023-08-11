package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
/* renamed from: androidx.compose.ui.draw.CacheDrawScope */
/* compiled from: DrawModifier.kt */
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    private DrawResult drawResult;

    public final BuildDrawCacheParams getCacheParams$ui_release() {
        return this.cacheParams;
    }

    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    public final DrawResult getDrawResult$ui_release() {
        return this.drawResult;
    }

    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m35329getSizeNHjbRc() {
        return this.cacheParams.m35328getSizeNHjbRc();
    }

    public final DrawResult onDrawBehind(Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        return onDrawWithContent(new CacheDrawScope$onDrawBehind$1(function1));
    }

    public final DrawResult onDrawWithContent(Function1<? super ContentDrawScope, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        DrawResult drawResult2 = new DrawResult(function1);
        this.drawResult = drawResult2;
        return drawResult2;
    }

    public final void setCacheParams$ui_release(BuildDrawCacheParams buildDrawCacheParams) {
        C12775o.m28639i(buildDrawCacheParams, "<set-?>");
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setDrawResult$ui_release(DrawResult drawResult2) {
        this.drawResult = drawResult2;
    }
}

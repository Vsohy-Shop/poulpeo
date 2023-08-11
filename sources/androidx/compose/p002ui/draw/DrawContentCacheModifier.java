package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.draw.DrawContentCacheModifier */
/* compiled from: DrawModifier.kt */
final class DrawContentCacheModifier implements DrawCacheModifier {
    private final CacheDrawScope cacheDrawScope;
    private final Function1<CacheDrawScope, DrawResult> onBuildDrawCache;

    public DrawContentCacheModifier(CacheDrawScope cacheDrawScope2, Function1<? super CacheDrawScope, DrawResult> function1) {
        C12775o.m28639i(cacheDrawScope2, "cacheDrawScope");
        C12775o.m28639i(function1, "onBuildDrawCache");
        this.cacheDrawScope = cacheDrawScope2;
        this.onBuildDrawCache = function1;
    }

    public static /* synthetic */ DrawContentCacheModifier copy$default(DrawContentCacheModifier drawContentCacheModifier, CacheDrawScope cacheDrawScope2, Function1<CacheDrawScope, DrawResult> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            cacheDrawScope2 = drawContentCacheModifier.cacheDrawScope;
        }
        if ((i & 2) != 0) {
            function1 = drawContentCacheModifier.onBuildDrawCache;
        }
        return drawContentCacheModifier.copy(cacheDrawScope2, function1);
    }

    public final CacheDrawScope component1() {
        return this.cacheDrawScope;
    }

    public final Function1<CacheDrawScope, DrawResult> component2() {
        return this.onBuildDrawCache;
    }

    public final DrawContentCacheModifier copy(CacheDrawScope cacheDrawScope2, Function1<? super CacheDrawScope, DrawResult> function1) {
        C12775o.m28639i(cacheDrawScope2, "cacheDrawScope");
        C12775o.m28639i(function1, "onBuildDrawCache");
        return new DrawContentCacheModifier(cacheDrawScope2, function1);
    }

    public void draw(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "<this>");
        DrawResult drawResult$ui_release = this.cacheDrawScope.getDrawResult$ui_release();
        C12775o.m28636f(drawResult$ui_release);
        drawResult$ui_release.getBlock$ui_release().invoke(contentDrawScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawContentCacheModifier)) {
            return false;
        }
        DrawContentCacheModifier drawContentCacheModifier = (DrawContentCacheModifier) obj;
        if (C12775o.m28634d(this.cacheDrawScope, drawContentCacheModifier.cacheDrawScope) && C12775o.m28634d(this.onBuildDrawCache, drawContentCacheModifier.onBuildDrawCache)) {
            return true;
        }
        return false;
    }

    public final CacheDrawScope getCacheDrawScope() {
        return this.cacheDrawScope;
    }

    public final Function1<CacheDrawScope, DrawResult> getOnBuildDrawCache() {
        return this.onBuildDrawCache;
    }

    public int hashCode() {
        return (this.cacheDrawScope.hashCode() * 31) + this.onBuildDrawCache.hashCode();
    }

    public void onBuildCache(BuildDrawCacheParams buildDrawCacheParams) {
        C12775o.m28639i(buildDrawCacheParams, "params");
        CacheDrawScope cacheDrawScope2 = this.cacheDrawScope;
        cacheDrawScope2.setCacheParams$ui_release(buildDrawCacheParams);
        cacheDrawScope2.setDrawResult$ui_release((DrawResult) null);
        this.onBuildDrawCache.invoke(cacheDrawScope2);
        if (cacheDrawScope2.getDrawResult$ui_release() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.cacheDrawScope + ", onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }
}

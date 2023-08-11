package androidx.compose.p002ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.compose.p002ui.res.ImageVectorCache;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 */
/* compiled from: AndroidCompositionLocals.android.kt */
public final class C1091x477bcb35 implements ComponentCallbacks2 {
    final /* synthetic */ Configuration $currentConfiguration;
    final /* synthetic */ ImageVectorCache $imageVectorCache;

    C1091x477bcb35(Configuration configuration, ImageVectorCache imageVectorCache) {
        this.$currentConfiguration = configuration;
        this.$imageVectorCache = imageVectorCache;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C12775o.m28639i(configuration, "configuration");
        this.$imageVectorCache.prune(this.$currentConfiguration.updateFrom(configuration));
        this.$currentConfiguration.setTo(configuration);
    }

    public void onLowMemory() {
        this.$imageVectorCache.clear();
    }

    public void onTrimMemory(int i) {
        this.$imageVectorCache.clear();
    }
}

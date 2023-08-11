package androidx.compose.p002ui.graphics.vector;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.vector.VectorConfig */
/* compiled from: VectorPainter.kt */
public interface VectorConfig {

    /* renamed from: androidx.compose.ui.graphics.vector.VectorConfig$DefaultImpls */
    /* compiled from: VectorPainter.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getOrDefault(VectorConfig vectorConfig, VectorProperty<T> vectorProperty, T t) {
            C12775o.m28639i(vectorProperty, "property");
            return VectorConfig.super.getOrDefault(vectorProperty, t);
        }
    }

    <T> T getOrDefault(VectorProperty<T> vectorProperty, T t) {
        C12775o.m28639i(vectorProperty, "property");
        return t;
    }
}

package androidx.compose.p002ui.semantics;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.semantics.SemanticsConfigurationKt */
/* compiled from: SemanticsConfiguration.kt */
public final class SemanticsConfigurationKt {
    public static final <T> T getOrNull(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey<T> semanticsPropertyKey) {
        C12775o.m28639i(semanticsConfiguration, "<this>");
        C12775o.m28639i(semanticsPropertyKey, "key");
        return semanticsConfiguration.getOrElseNullable(semanticsPropertyKey, SemanticsConfigurationKt$getOrNull$1.INSTANCE);
    }
}

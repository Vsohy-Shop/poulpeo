package androidx.compose.p002ui.tooling.preview;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: androidx.compose.ui.tooling.preview.PreviewParameter */
/* compiled from: PreviewParameter.kt */
public @interface PreviewParameter {
    int limit() default Integer.MAX_VALUE;

    Class<? extends PreviewParameterProvider<?>> provider();
}

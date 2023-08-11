package androidx.compose.p002ui.graphics.vector;

import androidx.compose.runtime.ComposableTargetMarker;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ComposableTargetMarker(description = "Vector Composable")
@Target({ElementType.METHOD, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposable */
/* compiled from: VectorComposable.kt */
public @interface VectorComposable {
}

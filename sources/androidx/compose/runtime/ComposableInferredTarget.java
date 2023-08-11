package androidx.compose.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@InternalComposeApi
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* compiled from: ComposableInferredTarget.kt */
public @interface ComposableInferredTarget {
    String scheme();
}

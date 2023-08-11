package androidx.compose.runtime;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@StableMarker
@Retention(RetentionPolicy.CLASS)
/* compiled from: Stable.kt */
public @interface Stable {
}

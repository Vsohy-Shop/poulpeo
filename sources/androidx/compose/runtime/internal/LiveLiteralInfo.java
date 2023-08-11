package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@ComposeCompilerApi
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: LiveLiteral.kt */
public @interface LiveLiteralInfo {
    String key();

    int offset();
}

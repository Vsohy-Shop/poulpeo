package androidx.compose.p002ui.tooling.preview;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Repeatable(Container.class)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.compose.ui.tooling.preview.Preview */
/* compiled from: Preview.kt */
public @interface Preview {

    @Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: androidx.compose.ui.tooling.preview.Preview$Container */
    /* compiled from: Preview.kt */
    public @interface Container {
        Preview[] value();
    }

    int apiLevel() default -1;

    long backgroundColor() default 0;

    String device() default "";

    float fontScale() default 1.0f;

    String group() default "";

    int heightDp() default -1;

    String locale() default "";

    String name() default "";

    boolean showBackground() default false;

    boolean showSystemUi() default false;

    int uiMode() default 0;

    int wallpaper() default -1;

    int widthDp() default -1;
}

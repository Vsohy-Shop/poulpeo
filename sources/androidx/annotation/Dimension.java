package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* compiled from: Dimension.kt */
public @interface Dimension {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: DP */
    public static final int f175DP = 0;

    /* renamed from: PX */
    public static final int f176PX = 1;

    /* renamed from: SP */
    public static final int f177SP = 2;

    /* compiled from: Dimension.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: DP */
        public static final int f178DP = 0;

        /* renamed from: PX */
        public static final int f179PX = 1;

        /* renamed from: SP */
        public static final int f180SP = 2;

        private Companion() {
        }
    }

    int unit() default 1;
}

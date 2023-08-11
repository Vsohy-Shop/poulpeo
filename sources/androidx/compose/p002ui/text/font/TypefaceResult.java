package androidx.compose.p002ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.TypefaceResult */
/* compiled from: FontFamilyResolver.kt */
public interface TypefaceResult extends State<Object> {

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.text.font.TypefaceResult$Async */
    /* compiled from: FontFamilyResolver.kt */
    public static final class Async implements TypefaceResult, State<Object> {
        public static final int $stable = 0;
        private final AsyncFontListLoader current;

        public Async(AsyncFontListLoader asyncFontListLoader) {
            C12775o.m28639i(asyncFontListLoader, "current");
            this.current = asyncFontListLoader;
        }

        public boolean getCacheable() {
            return this.current.getCacheable$ui_text_release();
        }

        public final AsyncFontListLoader getCurrent$ui_text_release() {
            return this.current;
        }

        public Object getValue() {
            return this.current.getValue();
        }
    }

    boolean getCacheable();

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.text.font.TypefaceResult$Immutable */
    /* compiled from: FontFamilyResolver.kt */
    public static final class Immutable implements TypefaceResult {
        public static final int $stable = 0;
        private final boolean cacheable;
        private final Object value;

        public Immutable(Object obj, boolean z) {
            C12775o.m28639i(obj, "value");
            this.value = obj;
            this.cacheable = z;
        }

        public boolean getCacheable() {
            return this.cacheable;
        }

        public Object getValue() {
            return this.value;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Immutable(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }
}

package androidx.compose.p002ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;

@Immutable
/* renamed from: androidx.compose.ui.text.font.FontFamily */
/* compiled from: FontFamily.kt */
public abstract class FontFamily {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");
    /* access modifiers changed from: private */
    public static final SystemFontFamily Default = new DefaultFontFamily();
    /* access modifiers changed from: private */
    public static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");
    /* access modifiers changed from: private */
    public static final GenericFontFamily SansSerif = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
    /* access modifiers changed from: private */
    public static final GenericFontFamily Serif = new GenericFontFamily("serif", "FontFamily.Serif");
    private final boolean canLoadSynchronously;

    /* renamed from: androidx.compose.ui.text.font.FontFamily$Companion */
    /* compiled from: FontFamily.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }

        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }
    }

    /* renamed from: androidx.compose.ui.text.font.FontFamily$Resolver */
    /* compiled from: FontFamily.kt */
    public interface Resolver {
        /* renamed from: resolve-DPcqOEQ$default  reason: not valid java name */
        static /* synthetic */ State m38036resolveDPcqOEQ$default(Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    fontFamily = null;
                }
                if ((i3 & 2) != 0) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                if ((i3 & 4) != 0) {
                    i = FontStyle.Companion.m38068getNormal_LCdwA();
                }
                if ((i3 & 8) != 0) {
                    i2 = FontSynthesis.Companion.m38078getAllGVVA2EU();
                }
                return resolver.m38037resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }

        Object preload(FontFamily fontFamily, C12074d<? super C11921v> dVar);

        /* renamed from: resolve-DPcqOEQ  reason: not valid java name */
        State<Object> m38037resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2);
    }

    public /* synthetic */ FontFamily(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    private FontFamily(boolean z) {
        this.canLoadSynchronously = z;
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }
}

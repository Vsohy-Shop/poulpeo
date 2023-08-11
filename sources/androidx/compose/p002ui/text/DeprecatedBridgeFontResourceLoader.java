package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontKt;
import androidx.compose.p002ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p002ui.text.platform.SynchronizedObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* renamed from: androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader */
/* compiled from: TextLayoutResult.kt */
final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static Map<FontFamily.Resolver, Font.ResourceLoader> cache = new LinkedHashMap();
    /* access modifiers changed from: private */
    public static final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();
    private final FontFamily.Resolver fontFamilyResolver;

    @SourceDebugExtension({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n24#2:604\n1#3:605\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n*L\n290#1:604\n*E\n"})
    /* renamed from: androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader$Companion */
    /* compiled from: TextLayoutResult.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Font.ResourceLoader from(FontFamily.Resolver resolver) {
            C12775o.m28639i(resolver, "fontFamilyResolver");
            synchronized (getLock()) {
                Companion companion = DeprecatedBridgeFontResourceLoader.Companion;
                Font.ResourceLoader resourceLoader = companion.getCache().get(resolver);
                if (resourceLoader != null) {
                    return resourceLoader;
                }
                DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader = new DeprecatedBridgeFontResourceLoader(resolver, (DefaultConstructorMarker) null);
                companion.getCache().put(resolver, deprecatedBridgeFontResourceLoader);
                return deprecatedBridgeFontResourceLoader;
            }
        }

        public final Map<FontFamily.Resolver, Font.ResourceLoader> getCache() {
            return DeprecatedBridgeFontResourceLoader.cache;
        }

        public final SynchronizedObject getLock() {
            return DeprecatedBridgeFontResourceLoader.lock;
        }

        public final void setCache(Map<FontFamily.Resolver, Font.ResourceLoader> map) {
            C12775o.m28639i(map, "<set-?>");
            DeprecatedBridgeFontResourceLoader.cache = map;
        }
    }

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver);
    }

    public Object load(Font font) {
        C12775o.m28639i(font, "font");
        return FontFamily.Resolver.m38036resolveDPcqOEQ$default(this.fontFamilyResolver, FontKt.toFontFamily(font), font.getWeight(), font.m38035getStyle_LCdwA(), 0, 8, (Object) null).getValue();
    }

    private DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }
}

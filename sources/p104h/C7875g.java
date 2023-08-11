package p104h;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p080f.C7539e;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nLocalImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalImageLoader.kt\ncoil/compose/ImageLoaderProvidableCompositionLocal\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,55:1\n76#2:56\n24#3:57\n*S KotlinDebug\n*F\n+ 1 LocalImageLoader.kt\ncoil/compose/ImageLoaderProvidableCompositionLocal\n*L\n50#1:56\n50#1:57\n*E\n"})
/* renamed from: h.g */
/* compiled from: LocalImageLoader.kt */
public final class C7875g {

    /* renamed from: h.g$a */
    /* compiled from: LocalImageLoader.kt */
    static final class C7876a extends C12777p implements C13074a<C7539e> {

        /* renamed from: g */
        public static final C7876a f11010g = new C7876a();

        C7876a() {
            super(0);
        }

        /* renamed from: b */
        public final C7539e invoke() {
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ ProvidableCompositionLocal m15407b(ProvidableCompositionLocal providableCompositionLocal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            providableCompositionLocal = CompositionLocalKt.staticCompositionLocalOf(C7876a.f11010g);
        }
        return m15406a(providableCompositionLocal);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.compose.runtime.ProvidableCompositionLocal<f.e>, androidx.compose.runtime.CompositionLocal] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.ReadOnlyComposable
    @androidx.compose.runtime.Composable
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p080f.C7539e m15408c(androidx.compose.runtime.ProvidableCompositionLocal<p080f.C7539e> r3, androidx.compose.runtime.Composer r4, int r5) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)"
            r2 = -617597678(0xffffffffdb303512, float:-4.9597947E16)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r0, r1)
        L_0x000f:
            java.lang.Object r3 = r4.consume(r3)
            f.e r3 = (p080f.C7539e) r3
            if (r3 != 0) goto L_0x0025
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            java.lang.Object r3 = r4.consume(r3)
            android.content.Context r3 = (android.content.Context) r3
            f.e r3 = p080f.C7530a.m14789a(r3)
        L_0x0025:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x002e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p104h.C7875g.m15408c(androidx.compose.runtime.ProvidableCompositionLocal, androidx.compose.runtime.Composer, int):f.e");
    }

    /* renamed from: a */
    public static ProvidableCompositionLocal<C7539e> m15406a(ProvidableCompositionLocal<C7539e> providableCompositionLocal) {
        return providableCompositionLocal;
    }
}

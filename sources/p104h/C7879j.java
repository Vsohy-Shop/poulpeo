package p104h;

import android.content.Context;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p205r.C9339g;
import p215s.C9413h;

@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/compose/UtilsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,92:1\n76#2:93\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/compose/UtilsKt\n*L\n26#1:93\n*E\n"})
/* renamed from: h.j */
/* compiled from: Utils.kt */
public final class C7879j {

    /* renamed from: a */
    private static final long f11012a = Constraints.Companion.m38420fixedJhjzzOo(0, 0);

    /* renamed from: a */
    public static final float m15412a(long j, float f) {
        return C13537l.m30885l(f, (float) Constraints.m38413getMinHeightimpl(j), (float) Constraints.m38411getMaxHeightimpl(j));
    }

    /* renamed from: b */
    public static final float m15413b(long j, float f) {
        return C13537l.m30885l(f, (float) Constraints.m38414getMinWidthimpl(j), (float) Constraints.m38412getMaxWidthimpl(j));
    }

    /* renamed from: c */
    public static final long m15414c() {
        return f11012a;
    }

    @ReadOnlyComposable
    @Composable
    /* renamed from: d */
    public static final C9339g m15415d(Object obj, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1151830858, i, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        if (obj instanceof C9339g) {
            return (C9339g) obj;
        }
        return new C9339g.C9340a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).mo43729b(obj).mo43728a();
    }

    /* renamed from: e */
    public static final long m15416e(long j) {
        return IntSizeKt.IntSize(C13265c.m30134c(Size.m35491getWidthimpl(j)), C13265c.m30134c(Size.m35488getHeightimpl(j)));
    }

    @Stable
    /* renamed from: f */
    public static final C9413h m15417f(ContentScale contentScale) {
        boolean z;
        ContentScale.Companion companion = ContentScale.Companion;
        if (C12775o.m28634d(contentScale, companion.getFit())) {
            z = true;
        } else {
            z = C12775o.m28634d(contentScale, companion.getInside());
        }
        if (z) {
            return C9413h.FIT;
        }
        return C9413h.FILL;
    }
}

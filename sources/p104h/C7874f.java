package p104h;

import android.os.SystemClock;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.layout.ScaleFactorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,127:1\n76#2:128\n102#2,2:129\n76#2:131\n102#2,2:132\n76#2:134\n102#2,2:135\n152#3:137\n152#3:138\n159#3:139\n159#3:145\n159#3:146\n104#4:140\n66#4,4:141\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n*L\n35#1:128\n35#1:129,2\n39#1:131\n39#1:132,2\n40#1:134\n40#1:135,2\n86#1:137\n87#1:138\n108#1:139\n122#1:145\n123#1:146\n111#1:140\n111#1:141,4\n*E\n"})
@Stable
/* renamed from: h.f */
/* compiled from: CrossfadePainter.kt */
public final class C7874f extends Painter {

    /* renamed from: b */
    private Painter f10999b;

    /* renamed from: c */
    private final Painter f11000c;

    /* renamed from: d */
    private final ContentScale f11001d;

    /* renamed from: e */
    private final int f11002e;

    /* renamed from: f */
    private final boolean f11003f;

    /* renamed from: g */
    private final boolean f11004g;

    /* renamed from: h */
    private final MutableState f11005h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: i */
    private long f11006i = -1;

    /* renamed from: j */
    private boolean f11007j;

    /* renamed from: k */
    private final MutableState f11008k = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: l */
    private final MutableState f11009l = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    public C7874f(Painter painter, Painter painter2, ContentScale contentScale, int i, boolean z, boolean z2) {
        this.f10999b = painter;
        this.f11000c = painter2;
        this.f11001d = contentScale;
        this.f11002e = i;
        this.f11003f = z;
        this.f11004g = z2;
    }

    /* renamed from: a */
    private final long m15397a(long j, long j2) {
        boolean z;
        Size.Companion companion = Size.Companion;
        boolean z2 = true;
        if (j == companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !Size.m35493isEmptyimpl(j)) {
            if (j2 != companion.m35499getUnspecifiedNHjbRc()) {
                z2 = false;
            }
            if (!z2 && !Size.m35493isEmptyimpl(j2)) {
                return ScaleFactorKt.m37440timesUQTWf7w(j, this.f11001d.m37308computeScaleFactorH7hwNQA(j, j2));
            }
        }
        return j2;
    }

    /* renamed from: b */
    private final long m15398b() {
        long j;
        long j2;
        boolean z;
        Painter painter = this.f10999b;
        if (painter != null) {
            j = painter.m36369getIntrinsicSizeNHjbRc();
        } else {
            j = Size.Companion.m35500getZeroNHjbRc();
        }
        Painter painter2 = this.f11000c;
        if (painter2 != null) {
            j2 = painter2.m36369getIntrinsicSizeNHjbRc();
        } else {
            j2 = Size.Companion.m35500getZeroNHjbRc();
        }
        Size.Companion companion = Size.Companion;
        boolean z2 = true;
        if (j != companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (j2 == companion.m35499getUnspecifiedNHjbRc()) {
            z2 = false;
        }
        if (z && z2) {
            return SizeKt.Size(Math.max(Size.m35491getWidthimpl(j), Size.m35491getWidthimpl(j2)), Math.max(Size.m35488getHeightimpl(j), Size.m35488getHeightimpl(j2)));
        }
        if (this.f11004g) {
            if (z) {
                return j;
            }
            if (z2) {
                return j2;
            }
        }
        return companion.m35499getUnspecifiedNHjbRc();
    }

    /* renamed from: c */
    private final void m15399c(DrawScope drawScope, Painter painter, float f) {
        boolean z;
        if (painter != null && f > 0.0f) {
            long r0 = drawScope.m36274getSizeNHjbRc();
            long a = m15397a(painter.m36369getIntrinsicSizeNHjbRc(), r0);
            if (r0 == Size.Companion.m35499getUnspecifiedNHjbRc()) {
                z = true;
            } else {
                z = false;
            }
            if (z || Size.m35493isEmptyimpl(r0)) {
                painter.m36368drawx_KDEd0(drawScope, a, f, m15400d());
                return;
            }
            float f2 = (float) 2;
            float r2 = (Size.m35491getWidthimpl(r0) - Size.m35491getWidthimpl(a)) / f2;
            float r02 = (Size.m35488getHeightimpl(r0) - Size.m35488getHeightimpl(a)) / f2;
            drawScope.getDrawContext().getTransform().inset(r2, r02, r2, r02);
            painter.m36368drawx_KDEd0(drawScope, a, f, m15400d());
            float f3 = -r2;
            float f4 = -r02;
            drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
        }
    }

    /* renamed from: d */
    private final ColorFilter m15400d() {
        return (ColorFilter) this.f11009l.getValue();
    }

    /* renamed from: e */
    private final int m15401e() {
        return ((Number) this.f11005h.getValue()).intValue();
    }

    /* renamed from: f */
    private final float m15402f() {
        return ((Number) this.f11008k.getValue()).floatValue();
    }

    /* renamed from: g */
    private final void m15403g(ColorFilter colorFilter) {
        this.f11009l.setValue(colorFilter);
    }

    /* renamed from: h */
    private final void m15404h(int i) {
        this.f11005h.setValue(Integer.valueOf(i));
    }

    /* renamed from: i */
    private final void m15405i(float f) {
        this.f11008k.setValue(Float.valueOf(f));
    }

    /* access modifiers changed from: protected */
    public boolean applyAlpha(float f) {
        m15405i(f);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean applyColorFilter(ColorFilter colorFilter) {
        m15403g(colorFilter);
        return true;
    }

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long m38740getIntrinsicSizeNHjbRc() {
        return m15398b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(DrawScope drawScope) {
        float f;
        boolean z;
        if (this.f11007j) {
            m15399c(drawScope, this.f11000c, m15402f());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f11006i == -1) {
            this.f11006i = uptimeMillis;
        }
        float f2 = ((float) (uptimeMillis - this.f11006i)) / ((float) this.f11002e);
        float l = C13537l.m30885l(f2, 0.0f, 1.0f) * m15402f();
        if (this.f11003f) {
            f = m15402f() - l;
        } else {
            f = m15402f();
        }
        if (f2 >= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f11007j = z;
        m15399c(drawScope, this.f10999b, f);
        m15399c(drawScope, this.f11000c, l);
        if (this.f11007j) {
            this.f10999b = null;
        } else {
            m15404h(m15401e() + 1);
        }
    }
}

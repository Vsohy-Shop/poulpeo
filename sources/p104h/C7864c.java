package p104h;

import android.graphics.drawable.Drawable;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.graphics.vector.ImageVector;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.platform.InspectionModeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p080f.C7539e;
import p104h.C7847b;
import p205r.C9339g;
import p215s.C9404a;
import p215s.C9406c;
import p215s.C9414i;
import p248v.C9912d;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,410:1\n25#2:411\n1114#3,6:412\n76#4:418\n1#5:419\n159#6:420\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n*L\n140#1:411\n140#1:412,6\n145#1:418\n398#1:420\n*E\n"})
/* renamed from: h.c */
/* compiled from: AsyncImagePainter.kt */
public final class C7864c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C7865a f10980a = new C7865a();

    /* renamed from: h.c$a */
    /* compiled from: AsyncImagePainter.kt */
    public static final class C7865a implements C9912d {
        C7865a() {
        }

        /* renamed from: e */
        public Drawable mo30074e() {
            return null;
        }
    }

    /* renamed from: c */
    private static final boolean m15387c(long j) {
        if (((double) Size.m35491getWidthimpl(j)) < 0.5d || ((double) Size.m35488getHeightimpl(j)) < 0.5d) {
            return false;
        }
        return true;
    }

    @Composable
    /* renamed from: d */
    public static final C7847b m15388d(Object obj, C7539e eVar, Function1<? super C7847b.C7850c, ? extends C7847b.C7850c> function1, Function1<? super C7847b.C7850c, C11921v> function12, ContentScale contentScale, int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2020614074);
        Function1<C7847b.C7850c, C7847b.C7850c> function13 = function1;
        if ((i3 & 4) != 0) {
            function13 = C7847b.f10942q.mo41561a();
        }
        if ((i3 & 8) != 0) {
            function12 = null;
        }
        if ((i3 & 16) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        if ((i3 & 32) != 0) {
            i = DrawScope.Companion.m36276getDefaultFilterQualityfv9h1I();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020614074, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:128)");
        }
        C9339g d = C7879j.m15415d(obj, composer, 8);
        m15392h(d);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C7847b(d, eVar);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C7847b bVar = (C7847b) rememberedValue;
        bVar.mo41559x(function13);
        bVar.mo41556s(function12);
        bVar.mo41553p(contentScale);
        bVar.mo41554q(i);
        bVar.mo41557u(((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue());
        bVar.mo41555r(eVar);
        bVar.mo41558v(d);
        bVar.onRemembered();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C9414i m15389e(long j) {
        boolean z;
        boolean z2;
        C9406c cVar;
        C9406c cVar2;
        boolean z3 = true;
        if (j == Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C9414i.f13995d;
        }
        if (!m15387c(j)) {
            return null;
        }
        float r3 = Size.m35491getWidthimpl(j);
        if (Float.isInfinite(r3) || Float.isNaN(r3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            cVar = C9404a.m19457a(C13265c.m30134c(Size.m35491getWidthimpl(j)));
        } else {
            cVar = C9406c.C9408b.f13982a;
        }
        float r4 = Size.m35488getHeightimpl(j);
        if (Float.isInfinite(r4) || Float.isNaN(r4)) {
            z3 = false;
        }
        if (z3) {
            cVar2 = C9404a.m19457a(C13265c.m30134c(Size.m35488getHeightimpl(j)));
        } else {
            cVar2 = C9406c.C9408b.f13982a;
        }
        return new C9414i(cVar, cVar2);
    }

    /* renamed from: f */
    private static final Void m15390f(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    /* renamed from: g */
    static /* synthetic */ Void m15391g(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return m15390f(str, str2);
    }

    /* renamed from: h */
    private static final void m15392h(C9339g gVar) {
        boolean z;
        Object m = gVar.mo43714m();
        if (m instanceof C9339g.C9340a) {
            m15390f("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        } else if (m instanceof ImageBitmap) {
            m15391g("ImageBitmap", (String) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        } else if (m instanceof ImageVector) {
            m15391g("ImageVector", (String) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        } else if (!(m instanceof Painter)) {
            if (gVar.mo43701M() == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("request.target must be null.".toString());
            }
        } else {
            m15391g("Painter", (String) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }
}

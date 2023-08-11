package p400ob;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ClipKt;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p104h.C7847b;
import p104h.C7878i;
import p336ef.C11921v;
import p367jc.C12612a;
import p404of.C13088o;

/* renamed from: ob.c */
/* compiled from: HtmlImageView.kt */
public final class C13037c {

    /* renamed from: ob.c$a */
    /* compiled from: HtmlImageView.kt */
    static final class C13038a extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12612a f20837g;

        /* renamed from: h */
        final /* synthetic */ int f20838h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13038a(C12612a aVar, int i) {
            super(2);
            this.f20837g = aVar;
            this.f20838h = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13037c.m29436a(this.f20837g, composer, this.f20838h | 1);
        }
    }

    @Composable
    /* renamed from: a */
    public static final void m29436a(C12612a aVar, Composer composer, int i) {
        Object obj;
        C12612a aVar2 = aVar;
        int i2 = i;
        C12775o.m28639i(aVar2, "htmlTag");
        Composer startRestartGroup = composer.startRestartGroup(1284757761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1284757761, i2, -1, "com.poulpeo.ui.views.html.HtmlImageView (HtmlImageView.kt:15)");
        }
        Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.m33626RoundedCornerShape0680j_4(C1232Dp.m38468constructorimpl((float) 10)));
        if (C13754v.m31525E(m29438c(aVar), "https://", false, 2, (Object) null)) {
            obj = m29438c(aVar);
        } else {
            obj = m29437b(m29438c(aVar));
        }
        C7878i.m15411a(obj, (String) null, clip, (Function1<? super C7847b.C7850c, ? extends C7847b.C7850c>) null, (Function1<? super C7847b.C7850c, C11921v>) null, (Alignment) null, ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, 0, startRestartGroup, 1572920, 952);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C13038a(aVar2, i2));
        }
    }

    /* renamed from: b */
    private static final Bitmap m29437b(String str) {
        byte[] decode = Base64.decode(C13755w.m31543E0(str, ",", (String) null, 2, (Object) null), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: c */
    private static final String m29438c(C12612a aVar) {
        String str;
        Object obj;
        Iterator it = aVar.mo50339a().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C12775o.m28634d(((C12612a.C12613a) obj).mo50347a(), "src")) {
                break;
            }
        }
        C12612a.C12613a aVar2 = (C12612a.C12613a) obj;
        if (aVar2 != null) {
            str = aVar2.mo50348b();
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}

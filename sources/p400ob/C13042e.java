package p400ob;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.TextKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.res.ColorResources_androidKt;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.poulpeo.R;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p367jc.C12612a;
import p404of.C13088o;
import p414qb.C13234a;

/* renamed from: ob.e */
/* compiled from: HtmlMixedTextView.kt */
public final class C13042e {

    /* renamed from: ob.e$a */
    /* compiled from: HtmlMixedTextView.kt */
    static final class C13043a extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12612a f20844g;

        /* renamed from: h */
        final /* synthetic */ int f20845h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13043a(C12612a aVar, int i) {
            super(2);
            this.f20844g = aVar;
            this.f20845h = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13042e.m29442a(this.f20844g, composer, this.f20845h | 1);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: a */
    public static final void m29442a(C12612a aVar, Composer composer, int i) {
        C12612a aVar2 = aVar;
        int i2 = i;
        C12775o.m28639i(aVar2, "htmlTag");
        Composer startRestartGroup = composer.startRestartGroup(146628775);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(146628775, i2, -1, "com.poulpeo.ui.views.html.HtmlMixedTextView (HtmlMixedTextView.kt:11)");
        }
        Composer composer2 = startRestartGroup;
        TextKt.m34682Text4IGK_g(C13234a.m30065a(aVar), (Modifier) null, ColorResources_androidKt.colorResource(R.color.text_title_default, startRestartGroup, 0), TextUnitKt.getSp(22), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(28), 0, false, 0, (Map<String, InlineTextContent>) null, (Function1<? super TextLayoutResult, C11921v>) null, (TextStyle) null, composer2, 3072, 6, 130034);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C13043a(aVar2, i2));
        }
    }
}

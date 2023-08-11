package p400ob;

import android.content.Context;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.TextKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.res.ColorResources_androidKt;
import androidx.compose.p002ui.text.AnnotatedString;
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
import com.rmn.apiclient.impl.api.call.APIIncludes;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p367jc.C12612a;
import p367jc.C12614b;
import p404of.C13088o;
import p408pb.C13195a;
import p420rb.C13277a;

/* renamed from: ob.h */
/* compiled from: HtmlTagsView.kt */
public final class C13048h {

    /* renamed from: ob.h$a */
    /* compiled from: HtmlTagsView.kt */
    static final class C13049a extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12612a f20851g;

        /* renamed from: h */
        final /* synthetic */ int f20852h;

        /* renamed from: i */
        final /* synthetic */ int f20853i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13049a(C12612a aVar, int i, int i2) {
            super(2);
            this.f20851g = aVar;
            this.f20852h = i;
            this.f20853i = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13048h.m29445a(this.f20851g, this.f20852h, composer, this.f20853i | 1);
        }
    }

    /* renamed from: ob.h$b */
    /* compiled from: HtmlTagsView.kt */
    static final class C13050b extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ List<C12612a> f20854g;

        /* renamed from: h */
        final /* synthetic */ int f20855h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13050b(List<C12612a> list, int i) {
            super(2);
            this.f20854g = list;
            this.f20855h = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13048h.m29446b(this.f20854g, composer, this.f20855h | 1);
        }
    }

    /* renamed from: ob.h$c */
    /* compiled from: HtmlTagsView.kt */
    public /* synthetic */ class C13051c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20856a;

        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(2:31|32)|33|35) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|35) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                jc.b[] r0 = p367jc.C12614b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                jc.b r1 = p367jc.C12614b.Paragraph     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                jc.b r1 = p367jc.C12614b.H1     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                jc.b r1 = p367jc.C12614b.H2     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                jc.b r1 = p367jc.C12614b.H3     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                jc.b r1 = p367jc.C12614b.H4     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                jc.b r1 = p367jc.C12614b.H5     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                jc.b r1 = p367jc.C12614b.H6     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                jc.b r1 = p367jc.C12614b.Span     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                jc.b r1 = p367jc.C12614b.PlainText     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                jc.b r1 = p367jc.C12614b.EmphasizedText     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                jc.b r1 = p367jc.C12614b.Bold     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                jc.b r1 = p367jc.C12614b.UnorderedList     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                jc.b r1 = p367jc.C12614b.Image     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                jc.b r1 = p367jc.C12614b.Link     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                jc.b r1 = p367jc.C12614b.ListItem     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                jc.b r1 = p367jc.C12614b.OrderedList     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                f20856a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p400ob.C13048h.C13051c.<clinit>():void");
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: a */
    public static final void m29445a(C12612a aVar, int i, Composer composer, int i2) {
        C12775o.m28639i(aVar, "htmlTag");
        Composer startRestartGroup = composer.startRestartGroup(765204817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(765204817, i2, -1, "com.poulpeo.ui.views.html.HtmlTagView (HtmlTagsView.kt:32)");
        }
        switch (C13051c.f20856a[aVar.mo50341c().ordinal()]) {
            case 1:
                startRestartGroup.startReplaceableGroup(1294785416);
                C13046g.m29444a(aVar, startRestartGroup, 8);
                startRestartGroup.endReplaceableGroup();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                startRestartGroup.startReplaceableGroup(1294785600);
                C13035b.m29435a(aVar, startRestartGroup, 8);
                startRestartGroup.endReplaceableGroup();
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                startRestartGroup.startReplaceableGroup(1294785755);
                C13042e.m29442a(aVar, startRestartGroup, 8);
                startRestartGroup.endReplaceableGroup();
                break;
            case 12:
                startRestartGroup.startReplaceableGroup(1294785830);
                C13052i.m29447a(aVar, i, startRestartGroup, (i2 & 112) | 8);
                startRestartGroup.endReplaceableGroup();
                break;
            case 13:
                startRestartGroup.startReplaceableGroup(1294785916);
                C13037c.m29436a(aVar, startRestartGroup, 8);
                startRestartGroup.endReplaceableGroup();
                break;
            case 14:
                startRestartGroup.startReplaceableGroup(1294785978);
                C13039d.m29439a((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), aVar, startRestartGroup, 72);
                startRestartGroup.endReplaceableGroup();
                break;
            case 15:
                startRestartGroup.startReplaceableGroup(1294786065);
                C13032a.m29433b(aVar, i, startRestartGroup, (i2 & 112) | 8);
                startRestartGroup.endReplaceableGroup();
                break;
            case 16:
                startRestartGroup.startReplaceableGroup(1294786159);
                C13044f.m29443a(aVar, i, startRestartGroup, (i2 & 112) | 8);
                startRestartGroup.endReplaceableGroup();
                break;
            default:
                startRestartGroup.startReplaceableGroup(1294786214);
                startRestartGroup.endReplaceableGroup();
                break;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C13049a(aVar, i, i2));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: b */
    public static final void m29446b(List<C12612a> list, Composer composer, int i) {
        Composer composer2;
        C12614b bVar;
        FontStyle fontStyle;
        List<C12612a> list2 = list;
        int i2 = i;
        C12775o.m28639i(list2, APIIncludes.TAGS);
        Composer startRestartGroup = composer.startRestartGroup(-298225488);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-298225488, i2, -1, "com.poulpeo.ui.views.html.HtmlTagsView (HtmlTagsView.kt:15)");
        }
        if (C13277a.m30152a(list)) {
            startRestartGroup.startReplaceableGroup(-1998555020);
            AnnotatedString b = C13195a.m29947b(list);
            C12612a aVar = (C12612a) C12686e0.m28223b0(list);
            if (aVar != null) {
                bVar = aVar.mo50341c();
            } else {
                bVar = null;
            }
            if (bVar == C12614b.EmphasizedText) {
                fontStyle = FontStyle.m38060boximpl(FontStyle.Companion.m38067getItalic_LCdwA());
            } else {
                fontStyle = null;
            }
            AnnotatedString annotatedString = b;
            composer2 = startRestartGroup;
            TextKt.m34682Text4IGK_g(annotatedString, (Modifier) null, ColorResources_androidKt.colorResource(R.color.text_title_default, startRestartGroup, 0), 0, fontStyle, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(24), 0, false, 0, (Map<String, InlineTextContent>) null, (Function1<? super TextLayoutResult, C11921v>) null, (TextStyle) null, composer2, 0, 6, 130026);
            composer2.endReplaceableGroup();
        } else {
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(-1998554727);
            for (C12612a a : list2) {
                m29445a(a, 0, composer2, 56);
            }
            composer2.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C13050b(list2, i2));
        }
    }
}

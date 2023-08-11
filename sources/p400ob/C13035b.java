package p400ob;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p367jc.C12612a;
import p404of.C13088o;
import p408pb.C13195a;
import p420rb.C13277a;

/* renamed from: ob.b */
/* compiled from: HtmlH3TagView.kt */
public final class C13035b {

    /* renamed from: ob.b$a */
    /* compiled from: HtmlH3TagView.kt */
    static final class C13036a extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12612a f20835g;

        /* renamed from: h */
        final /* synthetic */ int f20836h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13036a(C12612a aVar, int i) {
            super(2);
            this.f20835g = aVar;
            this.f20836h = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13035b.m29435a(this.f20835g, composer, this.f20836h | 1);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: a */
    public static final void m29435a(C12612a aVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "htmlTag");
        Composer startRestartGroup = composer.startRestartGroup(-984955879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-984955879, i, -1, "com.poulpeo.ui.views.html.HtmlH3TagView (HtmlH3TagView.kt:8)");
        }
        if (C13277a.m30152a(C13195a.m29946a(aVar))) {
            startRestartGroup.startReplaceableGroup(696438732);
            C13042e.m29442a(aVar, startRestartGroup, 8);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(696438790);
            C13048h.m29446b(aVar.mo50340b(), startRestartGroup, 8);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C13036a(aVar, i));
        }
    }
}

package p400ob;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.UriHandler;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.semantics.Role;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11905k;
import p336ef.C11921v;
import p338fb.C11926a;
import p367jc.C12612a;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* renamed from: ob.d */
/* compiled from: HtmlLinkView.kt */
public final class C13039d {

    /* renamed from: ob.d$a */
    /* compiled from: HtmlLinkView.kt */
    static final class C13040a extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ Context f20839g;

        /* renamed from: h */
        final /* synthetic */ String f20840h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13040a(Context context, String str) {
            super(0);
            this.f20839g = context;
            this.f20840h = str;
        }

        public final void invoke() {
            C13039d.m29441c(this.f20839g, this.f20840h);
        }
    }

    /* renamed from: ob.d$b */
    /* compiled from: HtmlLinkView.kt */
    static final class C13041b extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ Context f20841g;

        /* renamed from: h */
        final /* synthetic */ C12612a f20842h;

        /* renamed from: i */
        final /* synthetic */ int f20843i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13041b(Context context, C12612a aVar, int i) {
            super(2);
            this.f20841g = context;
            this.f20842h = aVar;
            this.f20843i = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13039d.m29439a(this.f20841g, this.f20842h, composer, this.f20843i | 1);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: a */
    public static final void m29439a(Context context, C12612a aVar, Composer composer, int i) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(aVar, "htmlTag");
        Composer startRestartGroup = composer.startRestartGroup(-90215934);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-90215934, i, -1, "com.poulpeo.ui.views.html.HtmlLinkView (HtmlLinkView.kt:12)");
        }
        String b = m29440b(aVar);
        UriHandler uriHandler = (UriHandler) startRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
        if (!aVar.mo50340b().isEmpty()) {
            Modifier r0 = ClickableKt.m32981clickableXHw0xAI$default(Modifier.Companion, false, (String) null, (Role) null, new C13040a(context, b), 7, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r0);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r7 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r7, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r7, density, companion.getSetDensity());
            Updater.m35299setimpl(r7, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r7, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            C13048h.m29446b(aVar.mo50340b(), startRestartGroup, 8);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C13041b(context, aVar, i));
                return;
            }
            return;
        }
        throw new C11905k((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    private static final String m29440b(C12612a aVar) {
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
            if (C12775o.m28634d(((C12612a.C12613a) obj).mo50347a(), "href")) {
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

    /* renamed from: c */
    public static final void m29441c(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "url");
        new C11926a(context, str).mo49148l2(context);
    }
}

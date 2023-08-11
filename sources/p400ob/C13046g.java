package p400ob;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
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
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p367jc.C12612a;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;
import p408pb.C13195a;

/* renamed from: ob.g */
/* compiled from: HtmlParagraphView.kt */
public final class C13046g {

    /* renamed from: ob.g$a */
    /* compiled from: HtmlParagraphView.kt */
    static final class C13047a extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12612a f20849g;

        /* renamed from: h */
        final /* synthetic */ int f20850h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13047a(C12612a aVar, int i) {
            super(2);
            this.f20849g = aVar;
            this.f20850h = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13046g.m29444a(this.f20849g, composer, this.f20850h | 1);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: a */
    public static final void m29444a(C12612a aVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "htmlTag");
        Composer startRestartGroup = composer.startRestartGroup(-915271333);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-915271333, i, -1, "com.poulpeo.ui.views.html.HtmlParagraphView (HtmlParagraphView.kt:12)");
        }
        List<C12612a> a = C13195a.m29946a(aVar);
        startRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion2.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(companion);
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
        Composer r8 = Updater.m35292constructorimpl(startRestartGroup);
        Updater.m35299setimpl(r8, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m35299setimpl(r8, density, companion2.getSetDensity());
        Updater.m35299setimpl(r8, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m35299setimpl(r8, viewConfiguration, companion2.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        float f = (float) 8;
        SpacerKt.Spacer(SizeKt.m33324height3ABfNKs(companion, C1232Dp.m38468constructorimpl(f)), startRestartGroup, 6);
        C13048h.m29446b(a, startRestartGroup, 8);
        SpacerKt.Spacer(SizeKt.m33324height3ABfNKs(companion, C1232Dp.m38468constructorimpl(f)), startRestartGroup, 6);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C13047a(aVar, i));
        }
    }
}

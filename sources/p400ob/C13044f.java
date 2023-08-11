package p400ob;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
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
import java.util.ArrayList;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p367jc.C12612a;
import p367jc.C12614b;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* renamed from: ob.f */
/* compiled from: HtmlOrderedList.kt */
public final class C13044f {

    /* renamed from: ob.f$a */
    /* compiled from: HtmlOrderedList.kt */
    static final class C13045a extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12612a f20846g;

        /* renamed from: h */
        final /* synthetic */ int f20847h;

        /* renamed from: i */
        final /* synthetic */ int f20848i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13045a(C12612a aVar, int i, int i2) {
            super(2);
            this.f20846g = aVar;
            this.f20847h = i;
            this.f20848i = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13044f.m29443a(this.f20846g, this.f20847h, composer, this.f20848i | 1);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: a */
    public static final void m29443a(C12612a aVar, int i, Composer composer, int i2) {
        boolean z;
        C12775o.m28639i(aVar, "htmlTag");
        Composer startRestartGroup = composer.startRestartGroup(-300595480);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-300595480, i2, -1, "com.poulpeo.ui.views.html.HtmlOrderedList (HtmlOrderedList.kt:8)");
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        int i3 = 0;
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
        Composer r7 = Updater.m35292constructorimpl(startRestartGroup);
        Updater.m35299setimpl(r7, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m35299setimpl(r7, density, companion2.getSetDensity());
        Updater.m35299setimpl(r7, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m35299setimpl(r7, viewConfiguration, companion2.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ArrayList arrayList = new ArrayList();
        for (Object next : aVar.mo50340b()) {
            if (((C12612a) next).mo50341c() == C12614b.ListItem) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        for (Object next2 : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C12726w.m28534u();
            }
            C13057k.m29452a(i4, (C12612a) next2, i, startRestartGroup, ((i2 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 64);
            i3 = i4;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C13045a(aVar, i, i2));
        }
    }
}

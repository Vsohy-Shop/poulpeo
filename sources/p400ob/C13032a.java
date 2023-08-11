package p400ob;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.TextKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.res.ColorResources_androidKt;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.poulpeo.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p367jc.C12612a;
import p367jc.C12614b;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;
import p408pb.C13195a;
import p420rb.C13277a;

/* renamed from: ob.a */
/* compiled from: BulletPointListItemView.kt */
public final class C13032a {

    /* renamed from: ob.a$a */
    /* compiled from: BulletPointListItemView.kt */
    static final class C13033a extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ int f20830g;

        /* renamed from: h */
        final /* synthetic */ int f20831h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13033a(int i, int i2) {
            super(2);
            this.f20830g = i;
            this.f20831h = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13032a.m29432a(this.f20830g, composer, this.f20831h | 1);
        }
    }

    /* renamed from: ob.a$b */
    /* compiled from: BulletPointListItemView.kt */
    static final class C13034b extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12612a f20832g;

        /* renamed from: h */
        final /* synthetic */ int f20833h;

        /* renamed from: i */
        final /* synthetic */ int f20834i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13034b(C12612a aVar, int i, int i2) {
            super(2);
            this.f20832g = aVar;
            this.f20833h = i;
            this.f20834i = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13032a.m29433b(this.f20832g, this.f20833h, composer, this.f20834i | 1);
        }
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: a */
    public static final void m29432a(int i, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str;
        int i4;
        int i5 = i;
        int i6 = i2;
        Composer startRestartGroup = composer.startRestartGroup(1554946645);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(i5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i6;
        } else {
            i3 = i6;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1554946645, i6, -1, "com.poulpeo.ui.views.html.BulletIndicatorView (BulletPointListItemView.kt:47)");
            }
            List n = C12726w.m28527n("•", "◦", "▪");
            String str2 = (String) C12686e0.m28224c0(n, i5);
            if (str2 == null) {
                str = (String) C12686e0.m28221Z(n);
            } else {
                str = str2;
            }
            composer2 = startRestartGroup;
            String str3 = str;
            TextKt.m34683TextfLXpl1I(str3, SizeKt.m33343width3ABfNKs(Modifier.Companion, C1232Dp.m38468constructorimpl((float) 20)), ColorResources_androidKt.colorResource(R.color.text_title_default, startRestartGroup, 0), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m38341boximpl(TextAlign.Companion.m38348getCentere0LSkKk()), TextUnitKt.getSp(24), 0, false, 0, (Function1<? super TextLayoutResult, C11921v>) null, (TextStyle) null, composer2, 48, 6, 63992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C13033a(i5, i6));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: b */
    public static final void m29433b(C12612a aVar, int i, Composer composer, int i2) {
        Composer composer2;
        Composer composer3;
        C12612a aVar2 = aVar;
        int i3 = i;
        int i4 = i2;
        C12775o.m28639i(aVar2, "htmlTag");
        Composer startRestartGroup = composer.startRestartGroup(-513014496);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513014496, i4, -1, "com.poulpeo.ui.views.html.BulletPointListItemView (BulletPointListItemView.kt:24)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier r4 = PaddingKt.m33270paddingVpY3zN4$default(companion, 0.0f, C1232Dp.m38468constructorimpl((float) 4), 1, (Object) null);
        startRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion3.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r4);
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
        Composer r9 = Updater.m35292constructorimpl(startRestartGroup);
        Updater.m35299setimpl(r9, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m35299setimpl(r9, density, companion3.getSetDensity());
        Updater.m35299setimpl(r9, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m35299setimpl(r9, viewConfiguration, companion3.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        m29432a(i3, startRestartGroup, (i4 >> 3) & 14);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        C13074a<ComposeUiNode> constructor2 = companion3.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(companion);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        Composer r8 = Updater.m35292constructorimpl(startRestartGroup);
        Updater.m35299setimpl(r8, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m35299setimpl(r8, density2, companion3.getSetDensity());
        Updater.m35299setimpl(r8, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m35299setimpl(r8, viewConfiguration2, companion3.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (C13277a.m30152a(C13195a.m29946a(aVar))) {
            startRestartGroup.startReplaceableGroup(-146246720);
            Composer composer4 = startRestartGroup;
            TextKt.m34682Text4IGK_g(C13195a.m29947b(C13195a.m29946a(aVar)), (Modifier) null, ColorResources_androidKt.colorResource(R.color.text_title_default, startRestartGroup, 0), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Map<String, InlineTextContent>) null, (Function1<? super TextLayoutResult, C11921v>) null, (TextStyle) null, composer4, 0, 0, 131066);
            composer4.endReplaceableGroup();
            composer2 = composer4;
        } else {
            Composer composer5 = startRestartGroup;
            startRestartGroup.startReplaceableGroup(-146246553);
            startRestartGroup.startReplaceableGroup(-146246535);
            if (!C13754v.m31532t(aVar.mo50342d())) {
                composer3 = startRestartGroup;
                TextKt.m34683TextfLXpl1I(aVar.mo50342d(), (Modifier) null, ColorResources_androidKt.colorResource(R.color.text_title_default, startRestartGroup, 0), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1<? super TextLayoutResult, C11921v>) null, (TextStyle) null, composer3, 0, 0, 65530);
            } else {
                composer3 = startRestartGroup;
            }
            composer3.endReplaceableGroup();
            List n = C12726w.m28527n(C12614b.UnorderedList, C12614b.OrderedList);
            if (aVar.mo50340b().size() != 1 || !n.contains(((C12612a) C12686e0.m28221Z(aVar.mo50340b())).mo50341c())) {
                composer2 = composer3;
            } else {
                Modifier r3 = PaddingKt.m33272paddingqDBjuR0$default(companion, C1232Dp.m38468constructorimpl((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                composer2 = composer3;
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor3 = companion3.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(r3);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer r92 = Updater.m35292constructorimpl(composer2);
                Updater.m35299setimpl(r92, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m35299setimpl(r92, density3, companion3.getSetDensity());
                Updater.m35299setimpl(r92, layoutDirection3, companion3.getSetLayoutDirection());
                Updater.m35299setimpl(r92, viewConfiguration3, companion3.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                C13048h.m29445a((C12612a) C12686e0.m28221Z(aVar.mo50340b()), i3 + 1, composer2, 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
        }
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C13034b(aVar2, i3, i4));
        }
    }
}

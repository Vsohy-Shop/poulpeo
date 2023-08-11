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

/* renamed from: ob.k */
/* compiled from: NumberedListItemView.kt */
public final class C13057k {

    /* renamed from: ob.k$a */
    /* compiled from: NumberedListItemView.kt */
    static final class C13058a extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ int f20867g;

        /* renamed from: h */
        final /* synthetic */ C12612a f20868h;

        /* renamed from: i */
        final /* synthetic */ int f20869i;

        /* renamed from: j */
        final /* synthetic */ int f20870j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13058a(int i, C12612a aVar, int i2, int i3) {
            super(2);
            this.f20867g = i;
            this.f20868h = aVar;
            this.f20869i = i2;
            this.f20870j = i3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13057k.m29452a(this.f20867g, this.f20868h, this.f20869i, composer, this.f20870j | 1);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: a */
    public static final void m29452a(int i, C12612a aVar, int i2, Composer composer, int i3) {
        Composer composer2;
        Composer composer3;
        int i4 = i;
        C12612a aVar2 = aVar;
        int i5 = i2;
        int i6 = i3;
        C12775o.m28639i(aVar2, "htmlTag");
        Composer startRestartGroup = composer.startRestartGroup(245813221);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245813221, i6, -1, "com.poulpeo.ui.views.html.NumberedListItemView (NumberedListItemView.kt:21)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier r5 = PaddingKt.m33270paddingVpY3zN4$default(companion, 0.0f, C1232Dp.m38468constructorimpl((float) 4), 1, (Object) null);
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
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r5);
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
        Composer r10 = Updater.m35292constructorimpl(startRestartGroup);
        Updater.m35299setimpl(r10, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m35299setimpl(r10, density, companion3.getSetDensity());
        Updater.m35299setimpl(r10, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m35299setimpl(r10, viewConfiguration, companion3.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Composer composer4 = startRestartGroup;
        TextKt.m34683TextfLXpl1I(i4 + ".", SizeKt.m33343width3ABfNKs(companion, C1232Dp.m38468constructorimpl((float) 20)), ColorResources_androidKt.colorResource(R.color.text_title_default, startRestartGroup, 0), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m38341boximpl(TextAlign.Companion.m38348getCentere0LSkKk()), TextUnitKt.getSp(24), 0, false, 0, (Function1<? super TextLayoutResult, C11921v>) null, (TextStyle) null, composer4, 48, 6, 63992);
        Composer composer5 = composer4;
        composer5.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer5, 0);
        composer5.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
        C13074a<ComposeUiNode> constructor2 = companion3.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(companion);
        if (!(composer5.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer5.startReusableNode();
        if (composer5.getInserting()) {
            composer5.createNode(constructor2);
        } else {
            composer5.useNode();
        }
        composer5.disableReusing();
        Composer r9 = Updater.m35292constructorimpl(composer5);
        Updater.m35299setimpl(r9, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m35299setimpl(r9, density2, companion3.getSetDensity());
        Updater.m35299setimpl(r9, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m35299setimpl(r9, viewConfiguration2, companion3.getSetViewConfiguration());
        composer5.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer5)), composer5, 0);
        composer5.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (C13277a.m30152a(C13195a.m29946a(aVar))) {
            composer5.startReplaceableGroup(-1676970807);
            Composer composer6 = composer5;
            TextKt.m34682Text4IGK_g(C13195a.m29947b(C13195a.m29946a(aVar)), (Modifier) null, ColorResources_androidKt.colorResource(R.color.text_title_default, composer5, 0), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(24), 0, false, 0, (Map<String, InlineTextContent>) null, (Function1<? super TextLayoutResult, C11921v>) null, (TextStyle) null, composer6, 0, 6, 130042);
            composer6.endReplaceableGroup();
            composer2 = composer6;
        } else {
            composer5.startReplaceableGroup(-1676970542);
            composer5.startReplaceableGroup(-1676970524);
            if (!C13754v.m31532t(aVar.mo50342d())) {
                composer3 = composer5;
                TextKt.m34683TextfLXpl1I(aVar.mo50342d(), (Modifier) null, ColorResources_androidKt.colorResource(R.color.text_title_default, composer5, 0), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(24), 0, false, 0, (Function1<? super TextLayoutResult, C11921v>) null, (TextStyle) null, composer3, 0, 6, 64506);
            } else {
                composer3 = composer5;
            }
            composer3.endReplaceableGroup();
            List n = C12726w.m28527n(C12614b.UnorderedList, C12614b.OrderedList);
            if (aVar.mo50340b().size() != 1 || !n.contains(((C12612a) C12686e0.m28221Z(aVar.mo50340b())).mo50341c())) {
                composer2 = composer3;
            } else {
                Modifier r4 = PaddingKt.m33272paddingqDBjuR0$default(companion, C1232Dp.m38468constructorimpl((float) 16), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                composer2 = composer3;
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor3 = companion3.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(r4);
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
                Composer r102 = Updater.m35292constructorimpl(composer2);
                Updater.m35299setimpl(r102, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m35299setimpl(r102, density3, companion3.getSetDensity());
                Updater.m35299setimpl(r102, layoutDirection3, companion3.getSetLayoutDirection());
                Updater.m35299setimpl(r102, viewConfiguration3, companion3.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                C13048h.m29445a((C12612a) C12686e0.m28221Z(aVar.mo50340b()), i5 + 1, composer2, 8);
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
            endRestartGroup.updateScope(new C13058a(i4, aVar2, i5, i6));
        }
    }
}

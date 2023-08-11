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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Updater;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p359ic.C12130a;
import p367jc.C12612a;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

/* renamed from: ob.j */
/* compiled from: HtmlView.kt */
public final class C13054j {

    @C12739f(mo50609c = "com.poulpeo.ui.views.html.HtmlViewKt$HtmlView$1$1", mo50610f = "HtmlView.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: ob.j$a */
    /* compiled from: HtmlView.kt */
    static final class C13055a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f20860h;

        /* renamed from: i */
        final /* synthetic */ String f20861i;

        /* renamed from: j */
        final /* synthetic */ MutableState<List<C12612a>> f20862j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13055a(String str, MutableState<List<C12612a>> mutableState, C12074d<? super C13055a> dVar) {
            super(2, dVar);
            this.f20861i = str;
            this.f20862j = mutableState;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C13055a(this.f20861i, this.f20862j, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f20860h == 0) {
                C11910n.m25701b(obj);
                C13054j.m29450c(this.f20862j, new C12130a().mo49576a(this.f20861i));
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C13055a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: ob.j$b */
    /* compiled from: HtmlView.kt */
    static final class C13056b extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ Modifier f20863g;

        /* renamed from: h */
        final /* synthetic */ String f20864h;

        /* renamed from: i */
        final /* synthetic */ int f20865i;

        /* renamed from: j */
        final /* synthetic */ int f20866j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13056b(Modifier modifier, String str, int i, int i2) {
            super(2);
            this.f20863g = modifier;
            this.f20864h = str;
            this.f20865i = i;
            this.f20866j = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C13054j.m29448a(this.f20863g, this.f20864h, composer, this.f20865i | 1, this.f20866j);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: a */
    public static final void m29448a(Modifier modifier, String str, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int i4;
        int i5;
        String str2 = str;
        int i6 = i;
        int i7 = i2;
        C12775o.m28639i(str2, "htmlText");
        Composer startRestartGroup = composer.startRestartGroup(1236780182);
        int i8 = i7 & 1;
        if (i8 != 0) {
            i3 = i6 | 6;
            modifier2 = modifier;
        } else if ((i6 & 14) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed((Object) modifier2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i6;
        } else {
            modifier2 = modifier;
            i3 = i6;
        }
        if ((i7 & 2) != 0) {
            i3 |= 48;
        } else if ((i6 & 112) == 0) {
            if (startRestartGroup.changed((Object) str2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i8 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1236780182, i3, -1, "com.poulpeo.ui.views.html.HtmlView (HtmlView.kt:21)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C12726w.m28524k(), (SnapshotMutationPolicy) null, 2, (Object) null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed((Object) mutableState) | startRestartGroup.changed((Object) str2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new C13055a(str2, mutableState, (C12074d<? super C13055a>) null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect((Object) str2, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue2, startRestartGroup, ((i3 >> 3) & 14) | 64);
            int i9 = i3 & 14;
            startRestartGroup.startReplaceableGroup(-483455358);
            int i10 = i9 >> 3;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, (i10 & 112) | (i10 & 14));
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(modifier3);
            int i11 = ((((i9 << 3) & 112) << 9) & 7168) | 6;
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
            Updater.m35299setimpl(r10, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r10, density, companion2.getSetDensity());
            Updater.m35299setimpl(r10, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r10, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i11 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (((((i9 >> 6) & 112) | 6) & 81) != 16 || !startRestartGroup.getSkipping()) {
                C13048h.m29446b(m29449b(mutableState), startRestartGroup, 8);
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C13056b(modifier3, str2, i6, i7));
        }
    }

    /* renamed from: b */
    private static final List<C12612a> m29449b(MutableState<List<C12612a>> mutableState) {
        return mutableState.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m29450c(MutableState<List<C12612a>> mutableState, List<C12612a> list) {
        mutableState.setValue(list);
    }
}

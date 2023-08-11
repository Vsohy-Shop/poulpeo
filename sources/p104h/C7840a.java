package p104h;

import android.content.Context;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ClipKt;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.semantics.Role;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p080f.C7539e;
import p104h.C7847b;
import p205r.C9339g;
import p215s.C9404a;
import p215s.C9406c;
import p215s.C9414i;
import p215s.C9416j;
import p215s.C9417k;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImage.kt\ncoil/compose/AsyncImageKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,243:1\n120#2:244\n121#2,5:246\n127#2,6:259\n134#2:267\n76#3:245\n286#4,8:251\n294#4,2:265\n25#4:268\n1114#5,6:269\n*S KotlinDebug\n*F\n+ 1 AsyncImage.kt\ncoil/compose/AsyncImageKt\n*L\n165#1:244\n165#1:246,5\n165#1:259,6\n165#1:267\n165#1:245\n165#1:251,8\n165#1:265,2\n189#1:268\n189#1:269,6\n*E\n"})
/* renamed from: h.a */
/* compiled from: AsyncImage.kt */
public final class C7840a {

    /* renamed from: h.a$a */
    /* compiled from: AsyncImage.kt */
    static final class C7841a extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ Object f10916g;

        /* renamed from: h */
        final /* synthetic */ String f10917h;

        /* renamed from: i */
        final /* synthetic */ C7539e f10918i;

        /* renamed from: j */
        final /* synthetic */ Modifier f10919j;

        /* renamed from: k */
        final /* synthetic */ Function1<C7847b.C7850c, C7847b.C7850c> f10920k;

        /* renamed from: l */
        final /* synthetic */ Function1<C7847b.C7850c, C11921v> f10921l;

        /* renamed from: m */
        final /* synthetic */ Alignment f10922m;

        /* renamed from: n */
        final /* synthetic */ ContentScale f10923n;

        /* renamed from: o */
        final /* synthetic */ float f10924o;

        /* renamed from: p */
        final /* synthetic */ ColorFilter f10925p;

        /* renamed from: q */
        final /* synthetic */ int f10926q;

        /* renamed from: r */
        final /* synthetic */ int f10927r;

        /* renamed from: s */
        final /* synthetic */ int f10928s;

        /* renamed from: t */
        final /* synthetic */ int f10929t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7841a(Object obj, String str, C7539e eVar, Modifier modifier, Function1<? super C7847b.C7850c, ? extends C7847b.C7850c> function1, Function1<? super C7847b.C7850c, C11921v> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, int i2, int i3, int i4) {
            super(2);
            this.f10916g = obj;
            this.f10917h = str;
            this.f10918i = eVar;
            this.f10919j = modifier;
            this.f10920k = function1;
            this.f10921l = function12;
            this.f10922m = alignment;
            this.f10923n = contentScale;
            this.f10924o = f;
            this.f10925p = colorFilter;
            this.f10926q = i;
            this.f10927r = i2;
            this.f10928s = i3;
            this.f10929t = i4;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C7840a.m15331a(this.f10916g, this.f10917h, this.f10918i, this.f10919j, this.f10920k, this.f10921l, this.f10922m, this.f10923n, this.f10924o, this.f10925p, this.f10926q, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10927r | 1), RecomposeScopeImplKt.updateChangedFlags(this.f10928s), this.f10929t);
        }
    }

    @SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    /* renamed from: h.a$b */
    /* compiled from: Composables.kt */
    public static final class C7842b extends C12777p implements C13074a<ComposeUiNode> {

        /* renamed from: g */
        final /* synthetic */ C13074a f10930g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7842b(C13074a aVar) {
            super(0);
            this.f10930g = aVar;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
        public final ComposeUiNode invoke() {
            return this.f10930g.invoke();
        }
    }

    /* renamed from: h.a$c */
    /* compiled from: AsyncImage.kt */
    static final class C7843c implements MeasurePolicy {

        /* renamed from: a */
        public static final C7843c f10931a = new C7843c();

        /* renamed from: h.a$c$a */
        /* compiled from: AsyncImage.kt */
        static final class C7844a extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {

            /* renamed from: g */
            public static final C7844a f10932g = new C7844a();

            C7844a() {
                super(1);
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C11921v.f18618a;
            }
        }

        C7843c() {
        }

        /* renamed from: measure-3p2s80s  reason: not valid java name */
        public final MeasureResult m38736measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
            return MeasureScope.layout$default(measureScope, Constraints.m38414getMinWidthimpl(j), Constraints.m38413getMinHeightimpl(j), (Map) null, C7844a.f10932g, 4, (Object) null);
        }
    }

    /* renamed from: h.a$d */
    /* compiled from: AsyncImage.kt */
    static final class C7845d extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ Modifier f10933g;

        /* renamed from: h */
        final /* synthetic */ Painter f10934h;

        /* renamed from: i */
        final /* synthetic */ String f10935i;

        /* renamed from: j */
        final /* synthetic */ Alignment f10936j;

        /* renamed from: k */
        final /* synthetic */ ContentScale f10937k;

        /* renamed from: l */
        final /* synthetic */ float f10938l;

        /* renamed from: m */
        final /* synthetic */ ColorFilter f10939m;

        /* renamed from: n */
        final /* synthetic */ int f10940n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7845d(Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i) {
            super(2);
            this.f10933g = modifier;
            this.f10934h = painter;
            this.f10935i = str;
            this.f10936j = alignment;
            this.f10937k = contentScale;
            this.f10938l = f;
            this.f10939m = colorFilter;
            this.f10940n = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        public final void invoke(Composer composer, int i) {
            C7840a.m15332b(this.f10933g, this.f10934h, this.f10935i, this.f10936j, this.f10937k, this.f10938l, this.f10939m, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10940n | 1));
        }
    }

    /* renamed from: h.a$e */
    /* compiled from: AsyncImage.kt */
    static final class C7846e extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f10941g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7846e(String str) {
            super(1);
            this.f10941g = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return C11921v.f18618a;
        }

        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, this.f10941g);
            SemanticsPropertiesKt.m37828setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m37817getImageo7Vup1c());
        }
    }

    @Composable
    /* renamed from: a */
    public static final void m15331a(Object obj, String str, C7539e eVar, Modifier modifier, Function1<? super C7847b.C7850c, ? extends C7847b.C7850c> function1, Function1<? super C7847b.C7850c, C11921v> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i2;
        int i8 = i4;
        Composer startRestartGroup = composer.startRestartGroup(-2030202961);
        Modifier.Companion companion = (i8 & 8) != 0 ? Modifier.Companion : modifier;
        Function1<C7847b.C7850c, C7847b.C7850c> a = (i8 & 16) != 0 ? C7847b.f10942q.mo41561a() : function1;
        Function1<? super C7847b.C7850c, C11921v> function13 = (i8 & 32) != 0 ? null : function12;
        Alignment center = (i8 & 64) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i8 & 128) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i8 & 256) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i8 & 512) != 0 ? null : colorFilter;
        if ((i8 & 1024) != 0) {
            i6 = i3 & -15;
            i5 = DrawScope.Companion.m36276getDefaultFilterQualityfv9h1I();
        } else {
            i5 = i;
            i6 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030202961, i7, i6, "coil.compose.AsyncImage (AsyncImage.kt:118)");
        }
        C9339g f3 = m15336f(C7879j.m15415d(obj, startRestartGroup, 8), fit, startRestartGroup, 8 | ((i7 >> 18) & 112));
        int i9 = i7 >> 6;
        int i10 = i7 >> 9;
        int i11 = i10 & 57344;
        C7847b d = C7864c.m15388d(f3, eVar, a, function13, fit, i5, startRestartGroup, ((i6 << 15) & 458752) | (i9 & 7168) | (i9 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 72 | i11, 0);
        C9416j K = f3.mo43699K();
        m15332b(K instanceof C7866d ? companion.then((Modifier) K) : companion, d, str, center, fit, f2, colorFilter2, startRestartGroup, (i10 & 7168) | ((i7 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | i11 | (i10 & 458752) | (3670016 & i10));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            C7841a aVar = r0;
            C7841a aVar2 = new C7841a(obj, str, eVar, companion, a, function13, center, fit, f2, colorFilter2, i5, i2, i3, i4);
            endRestartGroup.updateScope(aVar);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: b */
    public static final void m15332b(Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(10290533);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10290533, i, -1, "coil.compose.Content (AsyncImage.kt:156)");
        } else {
            int i2 = i;
        }
        Modifier modifier2 = modifier;
        String str2 = str;
        Modifier then = ClipKt.clipToBounds(m15334d(modifier, str)).then(new C7871e(painter, alignment, contentScale, f, colorFilter));
        C7843c cVar = C7843c.f10931a;
        startRestartGroup.startReplaceableGroup(544976794);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, then);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion.getConstructor();
        startRestartGroup.startReplaceableGroup(1405779621);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new C7842b(constructor));
        } else {
            startRestartGroup.useNode();
        }
        Composer r9 = Updater.m35292constructorimpl(startRestartGroup);
        Updater.m35299setimpl(r9, cVar, companion.getSetMeasurePolicy());
        Updater.m35299setimpl(r9, density, companion.getSetDensity());
        Updater.m35299setimpl(r9, layoutDirection, companion.getSetLayoutDirection());
        Updater.m35299setimpl(r9, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m35299setimpl(r9, materialize, companion.getSetModifier());
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C7845d(modifier, painter, str, alignment, contentScale, f, colorFilter, i));
        }
    }

    @Stable
    /* renamed from: d */
    private static final Modifier m15334d(Modifier modifier, String str) {
        if (str != null) {
            return SemanticsModifierKt.semantics$default(modifier, false, new C7846e(str), 1, (Object) null);
        }
        return modifier;
    }

    /* access modifiers changed from: private */
    @Stable
    /* renamed from: e */
    public static final C9414i m15335e(long j) {
        C9406c cVar;
        C9406c cVar2;
        if (Constraints.m38416isZeroimpl(j)) {
            return null;
        }
        if (Constraints.m38408getHasBoundedWidthimpl(j)) {
            cVar = C9404a.m19457a(Constraints.m38412getMaxWidthimpl(j));
        } else {
            cVar = C9406c.C9408b.f13982a;
        }
        if (Constraints.m38407getHasBoundedHeightimpl(j)) {
            cVar2 = C9404a.m19457a(Constraints.m38411getMaxHeightimpl(j));
        } else {
            cVar2 = C9406c.C9408b.f13982a;
        }
        return new C9414i(cVar, cVar2);
    }

    @Composable
    /* renamed from: f */
    public static final C9339g m15336f(C9339g gVar, ContentScale contentScale, Composer composer, int i) {
        C9416j jVar;
        composer.startReplaceableGroup(402368983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(402368983, i, -1, "coil.compose.updateRequest (AsyncImage.kt:183)");
        }
        if (gVar.mo43718q().mo43680m() == null) {
            if (C12775o.m28634d(contentScale, ContentScale.Companion.getNone())) {
                jVar = C9417k.m19467a(C9414i.f13995d);
            } else {
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C7866d();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                jVar = (C9416j) rememberedValue;
            }
            gVar = C9339g.m19270R(gVar, (Context) null, 1, (Object) null).mo43733k(jVar).mo43728a();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return gVar;
    }
}

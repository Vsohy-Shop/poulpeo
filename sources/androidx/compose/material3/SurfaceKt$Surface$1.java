package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Surface.kt */
final class SurfaceKt$Surface$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $absoluteElevation;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ long $color;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ Shape $shape;

    @C12739f(mo50609c = "androidx.compose.material3.SurfaceKt$Surface$1$2", mo50610f = "Surface.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$2 */
    /* compiled from: Surface.kt */
    static final class C09132 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C09132(dVar);
        }

        public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
            return ((C09132) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.label == 0) {
                C11910n.m25701b(obj);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SurfaceKt$Surface$1(Modifier modifier, Shape shape, long j, float f, int i, BorderStroke borderStroke, float f2, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        super(2);
        this.$modifier = modifier;
        this.$shape = shape;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$$changed = i;
        this.$border = borderStroke;
        this.$shadowElevation = f2;
        this.$content = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-70914509, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:112)");
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(SurfaceKt.m34608surface8ww4TTg(this.$modifier, this.$shape, SurfaceKt.m34609surfaceColorAtElevationCLU3JFs(this.$color, this.$absoluteElevation, composer, (this.$$changed >> 6) & 14), this.$border, this.$shadowElevation), false, C09121.INSTANCE), (Object) C11921v.f18618a, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new C09132((C12074d<? super C09132>) null));
            C13088o<Composer, Integer, C11921v> oVar = this.$content;
            int i2 = this.$$changed;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(pointerInput);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer r8 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r8, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r8, density, companion.getSetDensity());
            Updater.m35299setimpl(r8, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r8, viewConfiguration, companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(1703151929);
            oVar.invoke(composer, Integer.valueOf((i2 >> 21) & 14));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

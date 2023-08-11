package androidx.compose.p002ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13090q;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n76#2:421\n102#2,2:422\n76#2:424\n102#2,2:425\n76#2:427\n102#2,2:428\n281#3:430\n282#3:448\n173#4,6:431\n261#4,11:437\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n178#1:421\n178#1:422,2\n180#1:424\n180#1:425,2\n219#1:427\n219#1:428,2\n255#1:430\n255#1:448\n255#1:431,6\n255#1:437,11\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter */
/* compiled from: VectorPainter.kt */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    private final MutableState autoMirror$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private Composition composition;
    private float currentAlpha;
    private ColorFilter currentColorFilter;
    private final MutableState isDirty$delegate;
    private final MutableState size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m35479boximpl(Size.Companion.m35500getZeroNHjbRc()), (SnapshotMutationPolicy) null, 2, (Object) null);
    /* access modifiers changed from: private */
    public final VectorComponent vector;

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.setInvalidateCallback$ui_release(new VectorPainter$vector$1$1(this));
        this.vector = vectorComponent;
        this.isDirty$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.currentAlpha = 1.0f;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final Composition composeVector(CompositionContext compositionContext, C13090q<? super Float, ? super Float, ? super Composer, ? super Integer, C11921v> qVar) {
        Composition composition2 = this.composition;
        if (composition2 == null || composition2.isDisposed()) {
            composition2 = CompositionKt.Composition(new VectorApplier(this.vector.getRoot()), compositionContext);
        }
        this.composition = composition2;
        composition2.setContent(ComposableLambdaKt.composableLambdaInstance(-1916507005, true, new VectorPainter$composeVector$1(qVar, this)));
        return composition2;
    }

    private final boolean isDirty() {
        return ((Boolean) this.isDirty$delegate.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final void setDirty(boolean z) {
        this.isDirty$delegate.setValue(Boolean.valueOf(z));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public final void RenderVector$ui_release(String str, float f, float f2, C13090q<? super Float, ? super Float, ? super Composer, ? super Integer, C11921v> qVar, Composer composer, int i) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(qVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(1264894527);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264894527, i, -1, "androidx.compose.ui.graphics.vector.VectorPainter.RenderVector (VectorPainter.kt:221)");
        }
        VectorComponent vectorComponent = this.vector;
        vectorComponent.setName(str);
        vectorComponent.setViewportWidth(f);
        vectorComponent.setViewportHeight(f2);
        Composition composeVector = composeVector(ComposablesKt.rememberCompositionContext(startRestartGroup, 0), qVar);
        EffectsKt.DisposableEffect((Object) composeVector, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new VectorPainter$RenderVector$2(composeVector), startRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new VectorPainter$RenderVector$3(this, str, f, f2, qVar, i));
        }
    }

    /* access modifiers changed from: protected */
    public boolean applyAlpha(float f) {
        this.currentAlpha = f;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long m36389getIntrinsicSizeNHjbRc() {
        return m36390getSizeNHjbRc$ui_release();
    }

    /* renamed from: getSize-NH-jbRc$ui_release  reason: not valid java name */
    public final long m36390getSizeNHjbRc$ui_release() {
        return ((Size) this.size$delegate.getValue()).m35496unboximpl();
    }

    /* access modifiers changed from: protected */
    public void onDraw(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "<this>");
        VectorComponent vectorComponent = this.vector;
        ColorFilter colorFilter = this.currentColorFilter;
        if (colorFilter == null) {
            colorFilter = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (!getAutoMirror$ui_release() || drawScope.getLayoutDirection() != LayoutDirection.Rtl) {
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
        } else {
            long r2 = drawScope.m36273getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long r5 = drawContext.m36217getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().m36333scale0AR0LA0(-1.0f, 1.0f, r2);
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
            drawContext.getCanvas().restore();
            drawContext.m36218setSizeuvyYCjk(r5);
        }
        if (isDirty()) {
            setDirty(false);
        }
    }

    public final void setAutoMirror$ui_release(boolean z) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    /* renamed from: setSize-uvyYCjk$ui_release  reason: not valid java name */
    public final void m36391setSizeuvyYCjk$ui_release(long j) {
        this.size$delegate.setValue(Size.m35479boximpl(j));
    }
}

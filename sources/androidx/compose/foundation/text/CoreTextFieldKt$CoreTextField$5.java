package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.VisualTransformation;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11914q;
import p336ef.C11915r;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$5 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ Modifier $cursorModifier;
    final /* synthetic */ C13089p<C13088o<? super Composer, ? super Integer, C11921v>, Composer, Integer, C11921v> $decorationBox;
    final /* synthetic */ Density $density;
    final /* synthetic */ Modifier $drawModifier;
    final /* synthetic */ Modifier $magnifierModifier;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ Modifier $onPositionedModifier;
    final /* synthetic */ Function1<TextLayoutResult, C11921v> $onTextLayout;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
    final /* synthetic */ boolean $showHandleAndMagnifier;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$5(C13089p<? super C13088o<? super Composer, ? super Integer, C11921v>, ? super Composer, ? super Integer, C11921v> pVar, int i, TextFieldState textFieldState, TextStyle textStyle, int i2, int i3, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z, boolean z2, Function1<? super TextLayoutResult, C11921v> function1, OffsetMapping offsetMapping, Density density) {
        super(2);
        this.$decorationBox = pVar;
        this.$$dirty1 = i;
        this.$state = textFieldState;
        this.$textStyle = textStyle;
        this.$minLines = i2;
        this.$maxLines = i3;
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$value = textFieldValue;
        this.$visualTransformation = visualTransformation;
        this.$cursorModifier = modifier;
        this.$drawModifier = modifier2;
        this.$onPositionedModifier = modifier3;
        this.$magnifierModifier = modifier4;
        this.$bringIntoViewRequester = bringIntoViewRequester;
        this.$manager = textFieldSelectionManager;
        this.$showHandleAndMagnifier = z;
        this.$readOnly = z2;
        this.$onTextLayout = function1;
        this.$offsetMapping = offsetMapping;
        this.$density = density;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-374338080, i2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:563)");
            }
            C13089p<C13088o<? super Composer, ? super Integer, C11921v>, Composer, Integer, C11921v> pVar = this.$decorationBox;
            final TextFieldState textFieldState = this.$state;
            final TextStyle textStyle = this.$textStyle;
            final int i3 = this.$minLines;
            final int i4 = this.$maxLines;
            final TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
            final TextFieldValue textFieldValue = this.$value;
            final VisualTransformation visualTransformation = this.$visualTransformation;
            final Modifier modifier = this.$cursorModifier;
            final Modifier modifier2 = this.$drawModifier;
            final Modifier modifier3 = this.$onPositionedModifier;
            final Modifier modifier4 = this.$magnifierModifier;
            final BringIntoViewRequester bringIntoViewRequester = this.$bringIntoViewRequester;
            final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            final boolean z = this.$showHandleAndMagnifier;
            final boolean z2 = this.$readOnly;
            final Function1<TextLayoutResult, C11921v> function1 = this.$onTextLayout;
            final OffsetMapping offsetMapping = this.$offsetMapping;
            final Density density = this.$density;
            C06051 r3 = new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2032502107, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:564)");
                        }
                        Modifier bringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(HeightInLinesModifierKt.heightInLines(SizeKt.m33326heightInVpY3zN4$default(Modifier.Companion, textFieldState.m33732getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, (Object) null), textStyle, i3, i4), textFieldScrollerPosition, textFieldValue, visualTransformation, new CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1(textFieldState)).then(modifier).then(modifier2), textStyle).then(modifier3).then(modifier4), bringIntoViewRequester);
                        final TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                        final TextFieldState textFieldState = textFieldState;
                        final boolean z = z;
                        final boolean z2 = z2;
                        final Function1<TextLayoutResult, C11921v> function1 = function1;
                        final TextFieldValue textFieldValue = textFieldValue;
                        final OffsetMapping offsetMapping = offsetMapping;
                        final Density density = density;
                        final int i2 = i4;
                        SimpleLayoutKt.SimpleLayout(bringIntoViewRequester, ComposableLambdaKt.composableLambda(composer, -363167407, true, new C13088o<Composer, Integer, C11921v>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C11921v.f18618a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer, int i) {
                                if ((i & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-363167407, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:589)");
                                    }
                                    final TextFieldState textFieldState = textFieldState;
                                    final Function1<TextLayoutResult, C11921v> function1 = function1;
                                    final TextFieldValue textFieldValue = textFieldValue;
                                    final OffsetMapping offsetMapping = offsetMapping;
                                    final Density density = density;
                                    final int i2 = i2;
                                    C06072 r3 = new MeasurePolicy() {
                                        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
                                            C12775o.m28639i(intrinsicMeasureScope, "<this>");
                                            C12775o.m28639i(list, "measurables");
                                            textFieldState.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                            return textFieldState.getTextDelegate().getMaxIntrinsicWidth();
                                        }

                                        /* renamed from: measure-3p2s80s  reason: not valid java name */
                                        public MeasureResult m33646measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                            Snapshot makeCurrent;
                                            TextLayoutResult textLayoutResult;
                                            int i;
                                            C12775o.m28639i(measureScope, "$this$measure");
                                            C12775o.m28639i(list, "measurables");
                                            Snapshot.Companion companion = Snapshot.Companion;
                                            TextFieldState textFieldState = textFieldState;
                                            Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                                            try {
                                                makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                                                if (layoutResult != null) {
                                                    textLayoutResult = layoutResult.getValue();
                                                } else {
                                                    textLayoutResult = null;
                                                }
                                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                createNonObservableSnapshot.dispose();
                                                C11914q<Integer, Integer, TextLayoutResult> r10 = TextFieldDelegate.Companion.m33717layout_EkL_Y$foundation_release(textFieldState.getTextDelegate(), j, measureScope.getLayoutDirection(), textLayoutResult);
                                                int intValue = r10.mo49123a().intValue();
                                                int intValue2 = r10.mo49124b().intValue();
                                                TextLayoutResult c = r10.mo49125c();
                                                if (!C12775o.m28634d(textLayoutResult, c)) {
                                                    textFieldState.setLayoutResult(new TextLayoutResultProxy(c));
                                                    function1.invoke(c);
                                                    CoreTextFieldKt.notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
                                                }
                                                TextFieldState textFieldState2 = textFieldState;
                                                Density density = density;
                                                if (i2 == 1) {
                                                    i = TextDelegateKt.ceilToIntPx(c.getLineBottom(0));
                                                } else {
                                                    i = 0;
                                                }
                                                textFieldState2.m33733setMinHeightForSingleLineField0680j_4(density.m38446toDpu2uoSUM(i));
                                                return measureScope.layout(intValue, intValue2, C12716r0.m28419j(C11915r.m25707a(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(C13265c.m30134c(c.getFirstBaseline()))), C11915r.m25707a(AlignmentLineKt.getLastBaseline(), Integer.valueOf(C13265c.m30134c(c.getLastBaseline())))), CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2.INSTANCE);
                                            } catch (Throwable th) {
                                                createNonObservableSnapshot.dispose();
                                                throw th;
                                            }
                                        }
                                    };
                                    composer.startReplaceableGroup(-1323940314);
                                    Modifier.Companion companion = Modifier.Companion;
                                    Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                    C13074a<ComposeUiNode> constructor = companion2.getConstructor();
                                    C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(companion);
                                    if (!(composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer r5 = Updater.m35292constructorimpl(composer);
                                    Updater.m35299setimpl(r5, r3, companion2.getSetMeasurePolicy());
                                    Updater.m35299setimpl(r5, density2, companion2.getSetDensity());
                                    Updater.m35299setimpl(r5, layoutDirection, companion2.getSetLayoutDirection());
                                    Updater.m35299setimpl(r5, viewConfiguration, companion2.getSetViewConfiguration());
                                    boolean z = false;
                                    materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
                                    composer.startReplaceableGroup(2058660585);
                                    composer.endReplaceableGroup();
                                    composer.endNode();
                                    composer.endReplaceableGroup();
                                    TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                                    if (textFieldState.getHandleState() == HandleState.Selection && textFieldState.getLayoutCoordinates() != null) {
                                        LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
                                        C12775o.m28636f(layoutCoordinates);
                                        if (layoutCoordinates.isAttached() && z) {
                                            z = true;
                                        }
                                    }
                                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z, composer, 8);
                                    if (textFieldState.getHandleState() == HandleState.Cursor && !z2 && z) {
                                        CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager, composer, 8);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        }), composer, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            };
            Composer composer3 = composer;
            pVar.invoke(ComposableLambdaKt.composableLambda(composer3, 2032502107, true, r3), composer3, Integer.valueOf(((this.$$dirty1 >> 12) & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

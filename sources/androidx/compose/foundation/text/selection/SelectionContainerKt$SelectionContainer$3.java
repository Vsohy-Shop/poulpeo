package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* compiled from: SelectionContainer.kt */
final class SelectionContainerKt$SelectionContainer$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $children;
    final /* synthetic */ SelectionManager $manager;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ SelectionRegistrarImpl $registrarImpl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionContainerKt$SelectionContainer$3(SelectionRegistrarImpl selectionRegistrarImpl, Modifier modifier, SelectionManager selectionManager, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$registrarImpl = selectionRegistrarImpl;
        this.$modifier = modifier;
        this.$manager = selectionManager;
        this.$children = oVar;
        this.$$dirty = i;
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
                ComposerKt.traceEventStart(-123806316, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:94)");
            }
            ProvidedValue[] providedValueArr = {SelectionRegistrarKt.getLocalSelectionRegistrar().provides(this.$registrarImpl)};
            final Modifier modifier = this.$modifier;
            final SelectionManager selectionManager = this.$manager;
            final C13088o<Composer, Integer, C11921v> oVar = this.$children;
            final int i2 = this.$$dirty;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, 935424596, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(935424596, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:95)");
                        }
                        Modifier then = modifier.then(selectionManager.getModifier());
                        final C13088o<Composer, Integer, C11921v> oVar = oVar;
                        final int i2 = i2;
                        final SelectionManager selectionManager = selectionManager;
                        SimpleLayoutKt.SimpleLayout(then, ComposableLambdaKt.composableLambda(composer, 1375295262, true, new C13088o<Composer, Integer, C11921v>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C11921v.f18618a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer, int i) {
                                Selection selection;
                                Offset offset;
                                ResolvedTextDirection resolvedTextDirection;
                                Composer composer2 = composer;
                                int i2 = i;
                                if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1375295262, i2, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:98)");
                                    }
                                    oVar.invoke(composer2, Integer.valueOf((i2 >> 9) & 14));
                                    if (TouchMode_androidKt.isInTouchMode() && selectionManager.getHasFocus() && (selection = selectionManager.getSelection()) != null) {
                                        SelectionManager selectionManager = selectionManager;
                                        List n = C12726w.m28527n(Boolean.TRUE, Boolean.FALSE);
                                        int size = n.size();
                                        for (int i3 = 0; i3 < size; i3++) {
                                            boolean booleanValue = ((Boolean) n.get(i3)).booleanValue();
                                            Boolean valueOf = Boolean.valueOf(booleanValue);
                                            composer2.startReplaceableGroup(1157296644);
                                            boolean changed = composer2.changed((Object) valueOf);
                                            Object rememberedValue = composer.rememberedValue();
                                            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = selectionManager.handleDragObserver(booleanValue);
                                                composer2.updateRememberedValue(rememberedValue);
                                            }
                                            composer.endReplaceableGroup();
                                            TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                                            if (booleanValue) {
                                                offset = selectionManager.m33811getStartHandlePosition_m7T9E();
                                            } else {
                                                offset = selectionManager.m33810getEndHandlePosition_m7T9E();
                                            }
                                            if (booleanValue) {
                                                resolvedTextDirection = selection.getStart().getDirection();
                                            } else {
                                                resolvedTextDirection = selection.getEnd().getDirection();
                                            }
                                            if (offset != null) {
                                                AndroidSelectionHandles_androidKt.m33750SelectionHandle8fL75g(offset.m35432unboximpl(), booleanValue, resolvedTextDirection, selection.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, (Object) textDragObserver, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(textDragObserver, (C12074d<? super SelectionContainerKt$SelectionContainer$3$1$1$1$1$1>) null)), (C13088o<? super Composer, ? super Integer, C11921v>) null, composer, ProfileVerifier.CompilationStatus.f1069xf2722a21);
                                            }
                                        }
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
            }), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

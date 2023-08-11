package androidx.compose.p002ui.window;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.AlphaKt;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,824:1\n341#2:825\n368#2:854\n74#3:826\n75#3,11:828\n88#3:853\n76#4:827\n456#5,14:839\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n*L\n246#1:825\n246#1:854\n246#1:826\n246#1:828,11\n246#1:853\n246#1:827\n246#1:839,14\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1 */
/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ State<C13088o<Composer, Integer, C11921v>> $currentContent$delegate;
    final /* synthetic */ PopupLayout $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$popupLayout$1$1$1(PopupLayout popupLayout, State<? extends C13088o<? super Composer, ? super Integer, C11921v>> state) {
        super(2);
        this.$this_apply = popupLayout;
        this.$currentContent$delegate = state;
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
                ComposerKt.traceEventStart(1302892335, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:244)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, C12401.INSTANCE, 1, (Object) null);
            final PopupLayout popupLayout = this.$this_apply;
            Modifier alpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(semantics$default, new Function1<IntSize, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m38712invokeozmzZPI(((IntSize) obj).m38632unboximpl());
                    return C11921v.f18618a;
                }

                /* renamed from: invoke-ozmzZPI  reason: not valid java name */
                public final void m38712invokeozmzZPI(long j) {
                    popupLayout.m38717setPopupContentSizefhxjrPA(IntSize.m38620boximpl(j));
                    popupLayout.updatePosition();
                }
            }), this.$this_apply.getCanCalculatePosition() ? 1.0f : 0.0f);
            final State<C13088o<Composer, Integer, C11921v>> state = this.$currentContent$delegate;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 606497925, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(606497925, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:255)");
                        }
                        AndroidPopup_androidKt.Popup$lambda$1(state).invoke(composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            });
            composer.startReplaceableGroup(1406149896);
            AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(alpha);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer r7 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r7, androidPopup_androidKt$SimpleStack$1, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r7, density, companion.getSetDensity());
            Updater.m35299setimpl(r7, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r7, viewConfiguration, companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composableLambda.invoke(composer, 6);
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

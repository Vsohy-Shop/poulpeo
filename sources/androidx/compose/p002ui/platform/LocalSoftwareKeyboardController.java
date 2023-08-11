package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.text.input.TextInputService;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@SourceDebugExtension({"SMAP\nLocalSoftwareKeyboardController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,76:1\n76#2:77\n76#2:78\n36#3:79\n1114#4,6:80\n*S KotlinDebug\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n*L\n42#1:77\n47#1:78\n48#1:79\n48#1:80,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.LocalSoftwareKeyboardController */
/* compiled from: LocalSoftwareKeyboardController.kt */
public final class LocalSoftwareKeyboardController {
    public static final int $stable = 0;
    public static final LocalSoftwareKeyboardController INSTANCE = new LocalSoftwareKeyboardController();
    private static final ProvidableCompositionLocal<SoftwareKeyboardController> LocalSoftwareKeyboardController = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, C1095x568c8b93.INSTANCE, 1, (Object) null);

    private LocalSoftwareKeyboardController() {
    }

    @Composable
    private final SoftwareKeyboardController delegatingController(Composer composer, int i) {
        composer.startReplaceableGroup(1835581880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1835581880, i, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.delegatingController (LocalSoftwareKeyboardController.kt:45)");
        }
        TextInputService textInputService = (TextInputService) composer.consume(CompositionLocalsKt.getLocalTextInputService());
        if (textInputService == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }
        int i2 = TextInputService.$stable;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) textInputService);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DelegatingSoftwareKeyboardController(textInputService);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return delegatingSoftwareKeyboardController;
    }

    @Composable
    public final SoftwareKeyboardController getCurrent(Composer composer, int i) {
        composer.startReplaceableGroup(-1059476185);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1059476185, i, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.<get-current> (LocalSoftwareKeyboardController.kt:40)");
        }
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer.consume(LocalSoftwareKeyboardController);
        if (softwareKeyboardController == null) {
            softwareKeyboardController = delegatingController(composer, i & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return softwareKeyboardController;
    }

    public final ProvidedValue<SoftwareKeyboardController> provides(SoftwareKeyboardController softwareKeyboardController) {
        C12775o.m28639i(softwareKeyboardController, "softwareKeyboardController");
        return LocalSoftwareKeyboardController.provides(softwareKeyboardController);
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCurrent$annotations() {
    }
}

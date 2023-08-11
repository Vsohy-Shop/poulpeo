package androidx.compose.p002ui.input;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,76:1\n76#2:77\n102#2,2:78\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:77\n72#1:78,2\n*E\n"})
/* renamed from: androidx.compose.ui.input.InputModeManagerImpl */
/* compiled from: InputModeManager.kt */
public final class InputModeManagerImpl implements InputModeManager {
    private final MutableState inputMode$delegate;
    private final Function1<InputMode, Boolean> onRequestInputModeChange;

    public /* synthetic */ InputModeManagerImpl(int i, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, function1);
    }

    /* renamed from: getInputMode-aOaMEAU  reason: not valid java name */
    public int m36425getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m36420unboximpl();
    }

    @ExperimentalComposeUiApi
    /* renamed from: requestInputMode-iuPiT84  reason: not valid java name */
    public boolean m36426requestInputModeiuPiT84(int i) {
        return this.onRequestInputModeChange.invoke(InputMode.m36414boximpl(i)).booleanValue();
    }

    /* renamed from: setInputMode-iuPiT84  reason: not valid java name */
    public void m36427setInputModeiuPiT84(int i) {
        this.inputMode$delegate.setValue(InputMode.m36414boximpl(i));
    }

    private InputModeManagerImpl(int i, Function1<? super InputMode, Boolean> function1) {
        this.onRequestInputModeChange = function1;
        this.inputMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m36414boximpl(i), (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}

package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.p002ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.WindowInfoImpl */
/* compiled from: WindowInfo.kt */
public final class WindowInfoImpl implements WindowInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final MutableState<PointerKeyboardModifiers> GlobalKeyboardModifiers = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.m37231boximpl(PointerEvent_androidKt.EmptyPointerKeyboardModifiers()), (SnapshotMutationPolicy) null, 2, (Object) null);
    private final MutableState<Boolean> _isWindowFocused = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: androidx.compose.ui.platform.WindowInfoImpl$Companion */
    /* compiled from: WindowInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MutableState<PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui_release() {
            return WindowInfoImpl.GlobalKeyboardModifiers;
        }
    }

    @ExperimentalComposeUiApi
    /* renamed from: getKeyboardModifiers-k7X9c1A  reason: not valid java name */
    public int m37795getKeyboardModifiersk7X9c1A() {
        return GlobalKeyboardModifiers.getValue().m37237unboximpl();
    }

    public boolean isWindowFocused() {
        return this._isWindowFocused.getValue().booleanValue();
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0  reason: not valid java name */
    public void m37796setKeyboardModifiers5xRPYO0(int i) {
        GlobalKeyboardModifiers.setValue(PointerKeyboardModifiers.m37231boximpl(i));
    }

    public void setWindowFocused(boolean z) {
        this._isWindowFocused.setValue(Boolean.valueOf(z));
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A$annotations  reason: not valid java name */
    public static /* synthetic */ void m37794getKeyboardModifiersk7X9c1A$annotations() {
    }
}

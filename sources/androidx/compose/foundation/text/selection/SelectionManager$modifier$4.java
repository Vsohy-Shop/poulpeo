package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.input.key.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: SelectionManager.kt */
final class SelectionManager$modifier$4 extends C12777p implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionManager$modifier$4(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m33819invokeZmokQxo(((KeyEvent) obj).m37015unboximpl());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m33819invokeZmokQxo(android.view.KeyEvent keyEvent) {
        boolean z;
        C12775o.m28639i(keyEvent, "it");
        if (SelectionManager_androidKt.m33823isCopyKeyEventZmokQxo(keyEvent)) {
            this.this$0.copy$foundation_release();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

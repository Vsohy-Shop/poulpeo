package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* compiled from: DeadKeyCombiner.android.kt */
public final class DeadKeyCombiner {
    private Integer deadKeyCode;

    /* renamed from: consume-ZmokQxo  reason: not valid java name */
    public final Integer m33654consumeZmokQxo(KeyEvent keyEvent) {
        boolean z;
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        int r4 = KeyEvent_androidKt.m37028getUtf16CodePointZmokQxo(keyEvent);
        Integer num = null;
        if ((Integer.MIN_VALUE & r4) != 0) {
            this.deadKeyCode = Integer.valueOf(r4 & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.deadKeyCode;
        if (num2 == null) {
            return Integer.valueOf(r4);
        }
        this.deadKeyCode = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), r4));
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            num = valueOf;
        }
        if (num == null) {
            return Integer.valueOf(r4);
        }
        return num;
    }
}

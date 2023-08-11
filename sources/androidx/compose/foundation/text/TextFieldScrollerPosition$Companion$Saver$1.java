package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: TextFieldScroll.kt */
final class TextFieldScrollerPosition$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, TextFieldScrollerPosition, List<? extends Object>> {
    public static final TextFieldScrollerPosition$Companion$Saver$1 INSTANCE = new TextFieldScrollerPosition$Companion$Saver$1();

    TextFieldScrollerPosition$Companion$Saver$1() {
        super(2);
    }

    public final List<Object> invoke(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
        C12775o.m28639i(saverScope, "$this$listSaver");
        C12775o.m28639i(textFieldScrollerPosition, "it");
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Float.valueOf(textFieldScrollerPosition.getOffset());
        if (textFieldScrollerPosition.getOrientation() == Orientation.Vertical) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        return C12726w.m28527n(objArr);
    }
}

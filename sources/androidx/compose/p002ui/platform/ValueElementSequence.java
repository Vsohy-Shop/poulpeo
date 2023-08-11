package androidx.compose.p002ui.platform;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p448vf.C13650g;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.platform.ValueElementSequence */
/* compiled from: InspectableValue.kt */
public final class ValueElementSequence implements C13650g<ValueElement> {
    public static final int $stable = 8;
    private final List<ValueElement> elements = new ArrayList();

    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(String str, Object obj) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        this.elements.add(new ValueElement(str, obj));
    }
}

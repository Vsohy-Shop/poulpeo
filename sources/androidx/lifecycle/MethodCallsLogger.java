package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* compiled from: MethodCallsLogger.kt */
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(String str, int i) {
        int i2;
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        Integer num = this.calledMethods.get(str);
        boolean z = false;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if ((i2 & i) != 0) {
            z = true;
        }
        this.calledMethods.put(str, Integer.valueOf(i | i2));
        return !z;
    }
}

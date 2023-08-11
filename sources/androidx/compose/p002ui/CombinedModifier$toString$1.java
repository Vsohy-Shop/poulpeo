package androidx.compose.p002ui;

import androidx.compose.p002ui.Modifier;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.CombinedModifier$toString$1 */
/* compiled from: Modifier.kt */
final class CombinedModifier$toString$1 extends C12777p implements C13088o<String, Modifier.Element, String> {
    public static final CombinedModifier$toString$1 INSTANCE = new CombinedModifier$toString$1();

    CombinedModifier$toString$1() {
        super(2);
    }

    public final String invoke(String str, Modifier.Element element) {
        C12775o.m28639i(str, "acc");
        C12775o.m28639i(element, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }
}

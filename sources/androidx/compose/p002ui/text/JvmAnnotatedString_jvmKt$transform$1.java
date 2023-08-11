package androidx.compose.p002ui.text;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p404of.C13089p;

/* renamed from: androidx.compose.ui.text.JvmAnnotatedString_jvmKt$transform$1 */
/* compiled from: JvmAnnotatedString.jvm.kt */
final class JvmAnnotatedString_jvmKt$transform$1 extends C12777p implements Function1<List<? extends Integer>, Integer> {
    final /* synthetic */ Map<Integer, Integer> $offsetMap;
    final /* synthetic */ Ref$ObjectRef<String> $resultStr;
    final /* synthetic */ AnnotatedString $this_transform;
    final /* synthetic */ C13089p<String, Integer, Integer, String> $transform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JvmAnnotatedString_jvmKt$transform$1(Ref$ObjectRef<String> ref$ObjectRef, C13089p<? super String, ? super Integer, ? super Integer, String> pVar, AnnotatedString annotatedString, Map<Integer, Integer> map) {
        super(1);
        this.$resultStr = ref$ObjectRef;
        this.$transform = pVar;
        this.$this_transform = annotatedString;
        this.$offsetMap = map;
    }

    public final Integer invoke(List<Integer> list) {
        C12775o.m28639i(list, "<name for destructuring parameter 0>");
        int intValue = list.get(0).intValue();
        int intValue2 = list.get(1).intValue();
        Ref$ObjectRef<String> ref$ObjectRef = this.$resultStr;
        ref$ObjectRef.f20403b = ((String) this.$resultStr.f20403b) + this.$transform.invoke(this.$this_transform.getText(), Integer.valueOf(intValue), Integer.valueOf(intValue2));
        return this.$offsetMap.put(Integer.valueOf(intValue2), Integer.valueOf(((String) this.$resultStr.f20403b).length()));
    }
}

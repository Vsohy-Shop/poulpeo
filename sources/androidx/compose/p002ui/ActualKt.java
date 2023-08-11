package androidx.compose.p002ui;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.ValueElementSequence;
import com.appboy.Constants;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nActual.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.kt\nandroidx/compose/ui/ActualKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,50:1\n6442#2:51\n33#3,6:52\n*S KotlinDebug\n*F\n+ 1 Actual.kt\nandroidx/compose/ui/ActualKt\n*L\n35#1:51\n36#1:52,6\n*E\n"})
/* renamed from: androidx.compose.ui.ActualKt */
/* compiled from: Actual.kt */
public final class ActualKt {
    public static final boolean areObjectsOfSameType(Object obj, Object obj2) {
        C12775o.m28639i(obj, Constants.APPBOY_PUSH_CONTENT_KEY);
        C12775o.m28639i(obj2, "b");
        if (obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }

    public static final void tryPopulateReflectively(InspectorInfo inspectorInfo, ModifierNodeElement<?> modifierNodeElement) {
        C12775o.m28639i(inspectorInfo, "<this>");
        C12775o.m28639i(modifierNodeElement, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        Field[] declaredFields = modifierNodeElement.getClass().getDeclaredFields();
        C12775o.m28638h(declaredFields, "element.javaClass.declaredFields");
        List c0 = C12710p.m28401c0(declaredFields, new ActualKt$tryPopulateReflectively$$inlined$sortedBy$1());
        int size = c0.size();
        for (int i = 0; i < size; i++) {
            Field field = (Field) c0.get(i);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    ValueElementSequence properties = inspectorInfo.getProperties();
                    String name = field.getName();
                    C12775o.m28638h(name, "field.name");
                    properties.set(name, field.get(modifierNodeElement));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}

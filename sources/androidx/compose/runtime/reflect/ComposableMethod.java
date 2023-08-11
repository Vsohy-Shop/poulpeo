package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p436tf.C13528f;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nComposableMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n1549#2:220\n1620#2,3:221\n1804#2,4:224\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n143#1:220\n143#1:221,3\n144#1:224,4\n*E\n"})
/* compiled from: ComposableMethod.kt */
public final class ComposableMethod {
    public static final int $stable = 8;
    private final ComposableInfo composableInfo;
    private final Method method;

    public ComposableMethod(Method method2, ComposableInfo composableInfo2) {
        C12775o.m28639i(method2, "method");
        C12775o.m28639i(composableInfo2, "composableInfo");
        this.method = method2;
        this.composableInfo = composableInfo2;
    }

    public final Method asMethod() {
        return this.method;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComposableMethod) {
            return C12775o.m28634d(this.method, ((ComposableMethod) obj).method);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    public final Class<?>[] getParameterTypes() {
        Class[] parameterTypes = this.method.getParameterTypes();
        C12775o.m28638h(parameterTypes, "method.parameterTypes");
        return (Class[]) C12708o.m28349p(parameterTypes, 0, this.composableInfo.getRealParamsCount());
    }

    public final Parameter[] getParameters() {
        Parameter[] a = this.method.getParameters();
        C12775o.m28638h(a, "method.parameters");
        return (Parameter[]) C12708o.m28349p(a, 0, this.composableInfo.getRealParamsCount());
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public final Object invoke(Composer composer, Object obj, Object... objArr) {
        boolean z;
        Object obj2;
        boolean z2;
        boolean z3;
        int i;
        Object[] objArr2 = objArr;
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "composer");
        C12775o.m28639i(objArr2, "args");
        ComposableInfo composableInfo2 = this.composableInfo;
        int component2 = composableInfo2.component2();
        int component3 = composableInfo2.component3();
        int component4 = composableInfo2.component4();
        int length = this.method.getParameterTypes().length;
        int i2 = component2 + 1;
        int i3 = component3 + i2;
        Object[] objArr3 = new Integer[component4];
        for (int i4 = 0; i4 < component4; i4++) {
            int i5 = i4 * 31;
            C13528f t = C13537l.m30893t(i5, Math.min(i5 + 31, component2));
            ArrayList arrayList = new ArrayList(C12728x.m28544v(t, 10));
            Iterator it = t.iterator();
            while (it.hasNext()) {
                int nextInt = ((C12703l0) it).nextInt();
                if (nextInt >= objArr2.length || objArr2[nextInt] == null) {
                    i = 1;
                } else {
                    i = 0;
                }
                arrayList.add(Integer.valueOf(i));
            }
            int i6 = 0;
            int i7 = 0;
            for (Object next : arrayList) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    C12726w.m28534u();
                }
                i6 |= ((Number) next).intValue() << i7;
                i7 = i8;
            }
            objArr3[i4] = Integer.valueOf(i6);
        }
        Object[] objArr4 = new Object[length];
        for (int i9 = 0; i9 < length; i9++) {
            if (i9 < 0 || i9 >= component2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (i9 < 0 || i9 > C12710p.m28385M(objArr)) {
                    Class cls = this.method.getParameterTypes()[i9];
                    C12775o.m28638h(cls, "method.parameterTypes[idx]");
                    obj2 = ComposableMethodKt.getDefaultValue(cls);
                } else {
                    obj2 = objArr2[i9];
                }
            } else if (i9 == component2) {
                obj2 = composer2;
            } else {
                if (i9 != i2) {
                    if (i2 + 1 > i9 || i9 >= i3) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        if (i3 > i9 || i9 >= length) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            obj2 = objArr3[i9 - i3];
                        } else {
                            throw new IllegalStateException("Unexpected index".toString());
                        }
                    }
                }
                obj2 = 0;
            }
            objArr4[i9] = obj2;
        }
        return this.method.invoke(obj, Arrays.copyOf(objArr4, length));
    }
}

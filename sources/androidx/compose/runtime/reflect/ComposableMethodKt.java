package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12768j0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p436tf.C13528f;

@SourceDebugExtension({"SMAP\nComposableMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,219:1\n185#1:232\n185#1:239\n185#1:246\n1735#2,6:220\n1549#3:226\n1620#3,3:227\n1549#3:233\n1620#3,3:234\n1549#3:240\n1620#3,3:241\n1549#3:247\n1620#3,3:248\n37#4,2:230\n37#4,2:237\n37#4,2:244\n37#4,2:251\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n201#1:232\n210#1:239\n211#1:246\n57#1:220,6\n185#1:226\n185#1:227,3\n201#1:233\n201#1:234,3\n210#1:240\n210#1:241,3\n211#1:247\n211#1:248,3\n185#1:230,2\n201#1:237,2\n210#1:244,2\n211#1:251,2\n*E\n"})
/* compiled from: ComposableMethod.kt */
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    public static final ComposableMethod asComposableMethod(Method method) {
        C12775o.m28639i(method, "<this>");
        ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new ComposableMethod(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i + i2)) / 10.0d);
    }

    private static final int defaultParamCount(int i) {
        return (int) Math.ceil(((double) i) / 31.0d);
    }

    private static final /* synthetic */ <T> T[] dup(T t, int i) {
        C13528f t2 = C13537l.m30893t(0, i);
        ArrayList arrayList = new ArrayList(C12728x.m28544v(t2, 10));
        Iterator it = t2.iterator();
        while (it.hasNext()) {
            ((C12703l0) it).nextInt();
            arrayList.add(t);
        }
        C12775o.m28644n(0, "T?");
        return arrayList.toArray(new Object[0]);
    }

    private static final ComposableInfo getComposableInfo(Method method) {
        boolean z;
        int i;
        Class[] parameterTypes = method.getParameterTypes();
        C12775o.m28638h(parameterTypes, "parameterTypes");
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (C12775o.m28634d(parameterTypes[length], Composer.class)) {
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        length = -1;
        boolean z2 = false;
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int changedParamCount = changedParamCount(length, Modifier.isStatic(method.getModifiers()) ^ true ? 1 : 0);
        int i3 = length + 1 + changedParamCount;
        int length2 = method.getParameterTypes().length;
        if (length2 != i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = defaultParamCount(length);
        } else {
            i = 0;
        }
        if (i3 + i == length2) {
            z2 = true;
        }
        return new ComposableInfo(z2, length, changedParamCount, i);
    }

    public static final ComposableMethod getDeclaredComposableMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Class<Composer> cls2 = Composer.class;
        C12775o.m28639i(cls, "<this>");
        C12775o.m28639i(str, "methodName");
        C12775o.m28639i(clsArr, "args");
        int changedParamCount = changedParamCount(clsArr.length, 0);
        try {
            C12768j0 j0Var = new C12768j0(3);
            j0Var.mo50669b(clsArr);
            j0Var.mo50668a(cls2);
            Class cls3 = Integer.TYPE;
            C13528f t = C13537l.m30893t(0, changedParamCount);
            ArrayList arrayList = new ArrayList(C12728x.m28544v(t, 10));
            Iterator it = t.iterator();
            while (it.hasNext()) {
                ((C12703l0) it).nextInt();
                arrayList.add(cls3);
            }
            j0Var.mo50669b(arrayList.toArray(new Class[0]));
            method = cls.getDeclaredMethod(str, (Class[]) j0Var.mo50671d(new Class[j0Var.mo50670c()]));
        } catch (ReflectiveOperationException unused) {
            int defaultParamCount = defaultParamCount(clsArr.length);
            try {
                C12768j0 j0Var2 = new C12768j0(4);
                j0Var2.mo50669b(clsArr);
                j0Var2.mo50668a(cls2);
                Class cls4 = Integer.TYPE;
                C13528f t2 = C13537l.m30893t(0, changedParamCount);
                ArrayList arrayList2 = new ArrayList(C12728x.m28544v(t2, 10));
                Iterator it2 = t2.iterator();
                while (it2.hasNext()) {
                    ((C12703l0) it2).nextInt();
                    arrayList2.add(cls4);
                }
                j0Var2.mo50669b(arrayList2.toArray(new Class[0]));
                Class cls5 = Integer.TYPE;
                C13528f t3 = C13537l.m30893t(0, defaultParamCount);
                ArrayList arrayList3 = new ArrayList(C12728x.m28544v(t3, 10));
                Iterator it3 = t3.iterator();
                while (it3.hasNext()) {
                    ((C12703l0) it3).nextInt();
                    arrayList3.add(cls5);
                }
                j0Var2.mo50669b(arrayList3.toArray(new Class[0]));
                method = cls.getDeclaredMethod(str, (Class[]) j0Var2.mo50671d(new Class[j0Var2.mo50670c()]));
            } catch (ReflectiveOperationException unused2) {
                method = null;
            }
        }
        if (method != null) {
            ComposableMethod asComposableMethod = asComposableMethod(method);
            C12775o.m28636f(asComposableMethod);
            return asComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* access modifiers changed from: private */
    public static final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return 0;
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return 0L;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return Boolean.FALSE;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    return Float.valueOf(0.0f);
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                break;
        }
        return null;
    }
}

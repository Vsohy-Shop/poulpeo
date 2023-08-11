package androidx.compose.p002ui.graphics;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCanvasUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,101:1\n26#2:102\n26#2:103\n*S KotlinDebug\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n*L\n54#1:102\n59#1:103\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.CanvasUtils */
/* compiled from: CanvasUtils.android.kt */
public final class CanvasUtils {
    public static final CanvasUtils INSTANCE = new CanvasUtils();
    private static Method inorderBarrierMethod;
    private static boolean orderMethodsFetched;
    private static Method reorderBarrierMethod;

    private CanvasUtils() {
    }

    public final void enableZ(Canvas canvas, boolean z) {
        Method method;
        C12775o.m28639i(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            CanvasZHelper.INSTANCE.enableZ(canvas, z);
            return;
        }
        if (!orderMethodsFetched) {
            Class<Canvas> cls = Canvas.class;
            if (i == 28) {
                Class<Class> cls2 = Class.class;
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    reorderBarrierMethod = (Method) declaredMethod.invoke(cls, new Object[]{"insertReorderBarrier", new Class[0]});
                    inorderBarrierMethod = (Method) declaredMethod.invoke(cls, new Object[]{"insertInorderBarrier", new Class[0]});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                reorderBarrierMethod = cls.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                inorderBarrierMethod = cls.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            Method method2 = reorderBarrierMethod;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = inorderBarrierMethod;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            orderMethodsFetched = true;
        }
        if (z) {
            try {
                Method method4 = reorderBarrierMethod;
                if (method4 != null) {
                    C12775o.m28636f(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = inorderBarrierMethod) != null) {
            C12775o.m28636f(method);
            method.invoke(canvas, new Object[0]);
        }
    }
}

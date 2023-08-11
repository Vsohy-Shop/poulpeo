package p284y2;

import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11906l;

/* renamed from: y2.a */
/* compiled from: AndroidRootResolver.kt */
public final class C10653a {

    /* renamed from: e */
    private static final String f16218e;

    /* renamed from: f */
    public static final C10654a f16219f = new C10654a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private boolean f16220a;

    /* renamed from: b */
    private Object f16221b;

    /* renamed from: c */
    private Field f16222c;

    /* renamed from: d */
    private Field f16223d;

    /* renamed from: y2.a$a */
    /* compiled from: AndroidRootResolver.kt */
    public static final class C10654a {
        private C10654a() {
        }

        public /* synthetic */ C10654a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: y2.a$b */
    /* compiled from: AndroidRootResolver.kt */
    public static final class C10655b {

        /* renamed from: a */
        private final View f16224a;

        /* renamed from: b */
        private final WindowManager.LayoutParams f16225b;

        public C10655b(View view, WindowManager.LayoutParams layoutParams) {
            C12775o.m28639i(view, "view");
            C12775o.m28639i(layoutParams, "param");
            this.f16224a = view;
            this.f16225b = layoutParams;
        }

        /* renamed from: a */
        public final WindowManager.LayoutParams mo45598a() {
            return this.f16225b;
        }

        /* renamed from: b */
        public final View mo45599b() {
            return this.f16224a;
        }
    }

    static {
        String simpleName = C10653a.class.getSimpleName();
        C12775o.m28638h(simpleName, "AndroidRootResolver::class.java.simpleName");
        f16218e = simpleName;
    }

    /* renamed from: a */
    private final void m22613a() {
        this.f16220a = true;
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            C12775o.m28638h(cls, "Class.forName(accessClass)");
            Method method = cls.getMethod("getInstance", new Class[0]);
            C12775o.m28638h(method, "clazz.getMethod(instanceMethod)");
            this.f16221b = method.invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mViews");
            this.f16222c = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Field declaredField2 = cls.getDeclaredField("mParams");
            this.f16223d = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (InvocationTargetException e) {
            String str = f16218e;
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("could not invoke: %s on %s", Arrays.copyOf(new Object[]{"getInstance", "android.view.WindowManagerGlobal"}, 2));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            Log.d(str, format, e.getCause());
        } catch (ClassNotFoundException e2) {
            String str2 = f16218e;
            C12770k0 k0Var2 = C12770k0.f20423a;
            String format2 = String.format("could not find class: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal"}, 1));
            C12775o.m28638h(format2, "java.lang.String.format(format, *args)");
            Log.d(str2, format2, e2);
        } catch (NoSuchFieldException e3) {
            String str3 = f16218e;
            C12770k0 k0Var3 = C12770k0.f20423a;
            String format3 = String.format("could not find field: %s or %s on %s", Arrays.copyOf(new Object[]{"mParams", "mViews", "android.view.WindowManagerGlobal"}, 3));
            C12775o.m28638h(format3, "java.lang.String.format(format, *args)");
            Log.d(str3, format3, e3);
        } catch (NoSuchMethodException e4) {
            String str4 = f16218e;
            C12770k0 k0Var4 = C12770k0.f20423a;
            String format4 = String.format("could not find method: %s on %s", Arrays.copyOf(new Object[]{"getInstance", "android.view.WindowManagerGlobal"}, 2));
            C12775o.m28638h(format4, "java.lang.String.format(format, *args)");
            Log.d(str4, format4, e4);
        } catch (RuntimeException e5) {
            String str5 = f16218e;
            C12770k0 k0Var5 = C12770k0.f20423a;
            String format5 = String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"}, 3));
            C12775o.m28638h(format5, "java.lang.String.format(format, *args)");
            Log.d(str5, format5, e5);
        } catch (IllegalAccessException e6) {
            String str6 = f16218e;
            C12770k0 k0Var6 = C12770k0.f20423a;
            String format6 = String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"}, 3));
            C12775o.m28638h(format6, "java.lang.String.format(format, *args)");
            Log.d(str6, format6, e6);
        }
    }

    /* renamed from: b */
    public final List<C10655b> mo45597b() {
        Object obj;
        Object obj2;
        if (!this.f16220a) {
            m22613a();
        }
        Object obj3 = this.f16221b;
        if (obj3 == null) {
            Log.d(f16218e, "No reflective access to windowmanager object.");
            return null;
        }
        Field field = this.f16222c;
        if (field == null) {
            Log.d(f16218e, "No reflective access to mViews");
            return null;
        } else if (this.f16223d == null) {
            Log.d(f16218e, "No reflective access to mPArams");
            return null;
        } else {
            if (field != null) {
                try {
                    obj = field.get(obj3);
                } catch (RuntimeException e) {
                    String str = f16218e;
                    C12770k0 k0Var = C12770k0.f20423a;
                    String format = String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.f16222c, this.f16223d, this.f16221b}, 3));
                    C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                    Log.d(str, format, e);
                    return null;
                } catch (IllegalAccessException e2) {
                    String str2 = f16218e;
                    C12770k0 k0Var2 = C12770k0.f20423a;
                    String format2 = String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.f16222c, this.f16223d, this.f16221b}, 3));
                    C12775o.m28638h(format2, "java.lang.String.format(format, *args)");
                    Log.d(str2, format2, e2);
                    return null;
                }
            } else {
                obj = null;
            }
            List list = (List) obj;
            Field field2 = this.f16223d;
            if (field2 != null) {
                obj2 = field2.get(this.f16221b);
            } else {
                obj2 = null;
            }
            List list2 = (List) obj2;
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                list = C12726w.m28524k();
            }
            Iterable iterable = list;
            if (list2 == null) {
                list2 = C12726w.m28524k();
            }
            for (C11906l lVar : C12686e0.m28212I0(iterable, list2)) {
                arrayList.add(new C10655b((View) lVar.mo49109a(), (WindowManager.LayoutParams) lVar.mo49110b()));
            }
            return arrayList;
        }
    }
}

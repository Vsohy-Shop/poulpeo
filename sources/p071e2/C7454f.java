package p071e2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: e2.f */
/* compiled from: ViewHierarchy.kt */
public final class C7454f {

    /* renamed from: a */
    private static final String f10332a = C7454f.class.getCanonicalName();

    /* renamed from: b */
    private static WeakReference<View> f10333b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private static Method f10334c;

    /* renamed from: d */
    public static final C7454f f10335d = new C7454f();

    private C7454f() {
    }

    /* renamed from: a */
    public static final View m14598a(View view) {
        Class<C7454f> cls = C7454f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f10335d.m14613q(view)) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final List<View> m14599b(View view) {
        Class<C7454f> cls = C7454f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final int m14600c(View view) {
        int i;
        Class<C7454f> cls = C7454f.class;
        if (C9925a.m20734d(cls)) {
            return 0;
        }
        try {
            C12775o.m28639i(view, "view");
            if (view instanceof ImageView) {
                i = 2;
            } else {
                i = 0;
            }
            if (view.isClickable()) {
                i |= 32;
            }
            if (m14612o(view)) {
                i |= 512;
            }
            if (view instanceof TextView) {
                int i2 = i | 1024 | 1;
                if (view instanceof Button) {
                    i2 |= 4;
                    if (view instanceof Switch) {
                        i2 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i2 |= 32768;
                    }
                }
                if (view instanceof EditText) {
                    return i2 | 2048;
                }
                return i2;
            }
            if (!(view instanceof Spinner)) {
                if (!(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i | 65536;
                    }
                    if (view instanceof RadioGroup) {
                        return i | 16384;
                    }
                    if (!(view instanceof ViewGroup) || !f10335d.mo41131p(view, f10333b.get())) {
                        return i;
                    }
                    return i | 64;
                }
            }
            return i | 4096;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return 0;
        }
    }

    /* renamed from: d */
    public static final JSONObject m14601d(View view) {
        JSONObject jSONObject;
        Class<C7454f> cls = C7454f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(view, "view");
            if (C12775o.m28634d(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f10333b = new WeakReference<>(view);
            }
            jSONObject = new JSONObject();
            m14615s(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<View> b = m14599b(view);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                jSONArray.put(m14601d(b.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e) {
            Log.e(f10332a, "Failed to create JSONObject for view.", e);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
        return jSONObject;
    }

    /* renamed from: e */
    private final JSONObject m14602e(View view) {
        JSONObject jSONObject;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e) {
            Log.e(f10332a, "Failed to create JSONObject for dimension.", e);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
        return jSONObject;
    }

    /* renamed from: f */
    private final Class<?> m14603f(String str) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: g */
    public static final View.OnClickListener m14604g(View view) {
        Class<C7454f> cls = C7454f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            Field declaredField = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredField("mListenerInfo");
            C12775o.m28638h(declaredField, "Class.forName(\"android.v…redField(\"mListenerInfo\")");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            C12775o.m28638h(declaredField2, "Class.forName(\"android.v…Field(\"mOnClickListener\")");
            if (declaredField2 == null) {
                return null;
            }
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: h */
    public static final View.OnTouchListener m14605h(View view) {
        Class<C7454f> cls = C7454f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            Field declaredField = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredField("mListenerInfo");
            C12775o.m28638h(declaredField, "Class.forName(\"android.v…redField(\"mListenerInfo\")");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            C12775o.m28638h(declaredField2, "Class.forName(\"android.v…Field(\"mOnTouchListener\")");
            if (declaredField2 == null) {
                return null;
            }
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (View.OnTouchListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
        } catch (NoSuchFieldException e) {
            C9138d0.m18624Z(f10332a, e);
        } catch (ClassNotFoundException e2) {
            C9138d0.m18624Z(f10332a, e2);
        } catch (IllegalAccessException e3) {
            C9138d0.m18624Z(f10332a, e3);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
        return null;
    }

    /* renamed from: i */
    public static final String m14606i(View view) {
        CharSequence charSequence;
        String obj;
        Class<C7454f> cls = C7454f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null || (obj = charSequence.toString()) == null) {
                return "";
            }
            return obj;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: j */
    public static final ViewGroup m14607j(View view) {
        Class<C7454f> cls = C7454f.class;
        if (C9925a.m20734d(cls) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: k */
    public static final String m14608k(View view) {
        Object obj;
        String obj2;
        Object selectedItem;
        String str;
        Class<C7454f> cls = C7454f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                obj = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    obj = str;
                }
            } else {
                if (!(view instanceof Spinner)) {
                    int i = 0;
                    if (view instanceof DatePicker) {
                        int year = ((DatePicker) view).getYear();
                        int month = ((DatePicker) view).getMonth();
                        int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                        C12770k0 k0Var = C12770k0.f20423a;
                        obj = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                        C12775o.m28638h(obj, "java.lang.String.format(format, *args)");
                    } else if (view instanceof TimePicker) {
                        Integer currentHour = ((TimePicker) view).getCurrentHour();
                        C12775o.m28638h(currentHour, "view.currentHour");
                        int intValue = currentHour.intValue();
                        Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                        C12775o.m28638h(currentMinute, "view.currentMinute");
                        int intValue2 = currentMinute.intValue();
                        C12770k0 k0Var2 = C12770k0.f20423a;
                        obj = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                        C12775o.m28638h(obj, "java.lang.String.format(format, *args)");
                    } else if (view instanceof RadioGroup) {
                        int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                        int childCount = ((RadioGroup) view).getChildCount();
                        while (true) {
                            if (i >= childCount) {
                                break;
                            }
                            View childAt = ((RadioGroup) view).getChildAt(i);
                            C12775o.m28638h(childAt, "child");
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                obj = ((RadioButton) childAt).getText();
                                break;
                            }
                            i++;
                        }
                    } else if (view instanceof RatingBar) {
                        obj = String.valueOf(((RatingBar) view).getRating());
                    }
                } else if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    obj = selectedItem.toString();
                }
                obj = null;
            }
            if (obj == null || (obj2 = obj.toString()) == null) {
                return "";
            }
            return obj2;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: l */
    private final View m14609l(float[] fArr, View view) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            m14611n();
            Method method = f10334c;
            if (!(method == null || view == null)) {
                if (method != null) {
                    Object invoke = method.invoke((Object) null, new Object[]{fArr, view});
                    if (invoke != null) {
                        View view2 = (View) invoke;
                        if (view2.getId() > 0) {
                            ViewParent parent = view2.getParent();
                            if (parent != null) {
                                return (View) parent;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        } catch (IllegalAccessException e) {
            C9138d0.m18624Z(f10332a, e);
        } catch (InvocationTargetException e2) {
            C9138d0.m18624Z(f10332a, e2);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
        return null;
    }

    /* renamed from: m */
    private final float[] m14610m(View view) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{(float) iArr[0], (float) iArr[1]};
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: n */
    private final void m14611n() {
        if (!C9925a.m20734d(this)) {
            try {
                if (f10334c == null) {
                    Class<?> cls = Class.forName("com.facebook.react.uimanager.TouchTargetHelper");
                    C12775o.m28638h(cls, "Class.forName(CLASS_TOUCHTARGETHELPER)");
                    Method declaredMethod = cls.getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                    f10334c = declaredMethod;
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } catch (ClassNotFoundException e) {
                C9138d0.m18624Z(f10332a, e);
            } catch (NoSuchMethodException e2) {
                C9138d0.m18624Z(f10332a, e2);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: o */
    private static final boolean m14612o(View view) {
        Class<C7454f> cls = C7454f.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            C7454f fVar = f10335d;
            Class<?> f = fVar.m14603f("android.support.v4.view.NestedScrollingChild");
            if (f != null && f.isInstance(parent)) {
                return true;
            }
            Class<?> f2 = fVar.m14603f("androidx.core.view.NestedScrollingChild");
            if (f2 == null || !f2.isInstance(parent)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: q */
    private final boolean m14613q(View view) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            return C12775o.m28634d(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c A[ADDED_TO_REGION] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14614r(android.view.View r5, android.view.View.OnClickListener r6) {
        /*
            java.lang.Class<e2.f> r0 = p071e2.C7454f.class
            boolean r1 = p251v2.C9925a.m20734d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.C12775o.m28639i(r5, r1)     // Catch:{ all -> 0x004b }
            r1 = 0
            java.lang.String r2 = "android.view.View"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0028 }
            java.lang.String r3 = "mListenerInfo"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0028 }
            java.lang.String r3 = "android.view.View$ListenerInfo"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0029 }
            java.lang.String r4 = "mOnClickListener"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0029 }
            goto L_0x002a
        L_0x0028:
            r2 = r1
        L_0x0029:
            r3 = r1
        L_0x002a:
            if (r2 == 0) goto L_0x0047
            if (r3 != 0) goto L_0x002f
            goto L_0x0047
        L_0x002f:
            r4 = 1
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x004a }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x004a }
            r2.setAccessible(r4)     // Catch:{ IllegalAccessException -> 0x003d }
            java.lang.Object r1 = r2.get(r5)     // Catch:{ IllegalAccessException -> 0x003d }
        L_0x003d:
            if (r1 != 0) goto L_0x0043
            r5.setOnClickListener(r6)     // Catch:{ Exception -> 0x004a }
            return
        L_0x0043:
            r3.set(r1, r6)     // Catch:{ Exception -> 0x004a }
            goto L_0x004a
        L_0x0047:
            r5.setOnClickListener(r6)     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            return
        L_0x004b:
            r5 = move-exception
            p251v2.C9925a.m20732b(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071e2.C7454f.m14614r(android.view.View, android.view.View$OnClickListener):void");
    }

    /* renamed from: s */
    public static final void m14615s(View view, JSONObject jSONObject) {
        Class<C7454f> cls = C7454f.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(view, "view");
                C12775o.m28639i(jSONObject, "json");
                String k = m14608k(view);
                String i = m14606i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", m14600c(view));
                jSONObject.put("id", view.getId());
                if (!C7452d.m14593g(view)) {
                    jSONObject.put("text", C9138d0.m18639h(C9138d0.m18668v0(k), ""));
                } else {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", C9138d0.m18639h(C9138d0.m18668v0(i), ""));
                if (tag != null) {
                    jSONObject.put(APIResourceDescriptors.RESOURCE_TYPE_TAG, C9138d0.m18639h(C9138d0.m18668v0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", C9138d0.m18639h(C9138d0.m18668v0(contentDescription.toString()), ""));
                }
                jSONObject.put(TypedValues.Custom.S_DIMENSION, f10335d.m14602e(view));
            } catch (JSONException e) {
                C9138d0.m18624Z(f10332a, e);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: p */
    public final boolean mo41131p(View view, View view2) {
        View l;
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            C12775o.m28639i(view, "view");
            String name = view.getClass().getName();
            C12775o.m28638h(name, "view.javaClass.name");
            if (!C12775o.m28634d(name, "com.facebook.react.views.view.ReactViewGroup") || (l = m14609l(m14610m(view), view2)) == null || l.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }
}

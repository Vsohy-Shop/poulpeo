package p158m2;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p071e2.C7454f;
import p251v2.C9925a;

/* renamed from: m2.c */
/* compiled from: SuggestedEventViewHierarchy.kt */
public final class C8811c {

    /* renamed from: a */
    private static final List<Class<? extends View>> f12772a = C12726w.m28527n(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* renamed from: b */
    public static final C8811c f12773b = new C8811c();

    private C8811c() {
    }

    /* renamed from: a */
    public static final List<View> m17848a(View view) {
        Class<C8811c> cls = C8811c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(view, "view");
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> isInstance : f12772a) {
                if (isInstance.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            for (View a : C7454f.m14599b(view)) {
                arrayList.addAll(m17848a(a));
            }
            return arrayList;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final JSONObject m17849b(View view, View view2) {
        Class<C8811c> cls = C8811c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(view, "view");
            C12775o.m28639i(view2, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m17852e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            for (View b : C7454f.m14599b(view)) {
                jSONArray.put(m17849b(b, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    private final List<String> m17850c(View view) {
        boolean z;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View next : C7454f.m14599b(view)) {
                String k = C7454f.m14608k(next);
                if (k.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(k);
                }
                arrayList.addAll(m17850c(next));
            }
            return arrayList;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public static final String m17851d(View view) {
        boolean z;
        Class<C8811c> cls = C8811c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(view, "hostView");
            String k = C7454f.m14608k(view);
            if (k.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return k;
            }
            String join = TextUtils.join(" ", f12773b.m17850c(view));
            C12775o.m28638h(join, "TextUtils.join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    public static final void m17852e(View view, JSONObject jSONObject) {
        boolean z;
        Class<C8811c> cls = C8811c.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(view, "view");
                C12775o.m28639i(jSONObject, "json");
                try {
                    String k = C7454f.m14608k(view);
                    String i = C7454f.m14606i(view);
                    jSONObject.put("classname", view.getClass().getSimpleName());
                    jSONObject.put("classtypebitmask", C7454f.m14600c(view));
                    boolean z2 = true;
                    if (k.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put("text", k);
                    }
                    if (i.length() <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        jSONObject.put("hint", i);
                    }
                    if (view instanceof EditText) {
                        jSONObject.put("inputtype", ((EditText) view).getInputType());
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }
}

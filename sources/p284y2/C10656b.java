package p284y2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import com.rmn.api.p322v2.main.debug.AbstractDebugRequestMapper;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p284y2.C10653a;

/* renamed from: y2.b */
/* compiled from: EndToEndDumpsysHelper.kt */
public final class C10656b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C10656b f16226d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Method f16227e;

    /* renamed from: f */
    public static final C10659c f16228f = new C10659c((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C10653a f16229a = new C10653a();

    /* renamed from: b */
    private final C10661d f16230b = new C10661d();

    /* renamed from: c */
    private Method f16231c;

    /* renamed from: y2.b$a */
    /* compiled from: EndToEndDumpsysHelper.kt */
    private static final class C10657a {

        /* renamed from: a */
        private static Field f16232a;

        /* renamed from: b */
        public static final C10657a f16233b = new C10657a();

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                f16232a = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (NoSuchFieldException unused) {
            }
        }

        private C10657a() {
        }

        /* renamed from: a */
        private final JSONObject m22626a(View view) {
            Object obj;
            try {
                if (f16232a == null) {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    f16232a = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                }
                Field field = f16232a;
                if (field != null) {
                    obj = field.get(view);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() <= 0) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int size = sparseArray.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                jSONObject.put(C10660c.m22650c(view.getResources(), sparseArray.keyAt(i)), sparseArray.valueAt(i));
                            } catch (JSONException unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    return jSONObject;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.util.SparseArray<*>");
            } catch (Exception unused3) {
                return null;
            }
        }

        /* renamed from: b */
        public final void mo45600b(PrintWriter printWriter, View view) {
            boolean z;
            C12775o.m28639i(printWriter, "writer");
            C12775o.m28639i(view, "view");
            C10659c cVar = C10656b.f16228f;
            AccessibilityNodeInfo a = cVar.m22637i(view);
            if (a != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (view instanceof TextView) {
                        ColorStateList textColors = ((TextView) view).getTextColors();
                        C12775o.m28638h(textColors, "view.textColors");
                        jSONObject.put("textColor", textColors.getDefaultColor());
                        jSONObject.put("textSize", (double) ((TextView) view).getTextSize());
                        jSONObject.put("hint", cVar.m22638j(((TextView) view).getHint(), 100));
                    }
                    JSONObject a2 = m22626a(view);
                    if (a2 != null) {
                        jSONObject.put("keyedTags", a2);
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (AccessibilityNodeInfo.AccessibilityAction next : a.getActionList()) {
                        C12775o.m28638h(next, "action");
                        CharSequence label = next.getLabel();
                        if (label != null) {
                            jSONArray.put(C10656b.f16228f.m22638j((String) label, 50));
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("actions", jSONArray);
                    }
                    C10659c cVar2 = C10656b.f16228f;
                    String b = cVar2.m22638j(a.getContentDescription(), 50);
                    if (b != null) {
                        if (b.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            jSONObject.put("content-description", b);
                        }
                    }
                    jSONObject.put("accessibility-focused", a.isAccessibilityFocused()).put("checkable", a.isCheckable()).put("checked", a.isChecked()).put("class-name", cVar2.m22638j(a.getClassName(), 50)).put("clickable", a.isClickable()).put("content-invalid", a.isContentInvalid()).put("dismissable", a.isDismissable()).put("editable", a.isEditable()).put("enabled", a.isEnabled()).put("focusable", a.isFocusable()).put("focused", a.isFocused()).put("long-clickable", a.isLongClickable()).put("multiline", a.isMultiLine()).put(HintConstants.AUTOFILL_HINT_PASSWORD, a.isPassword()).put("scrollable", a.isScrollable()).put("selected", a.isSelected()).put("visible-to-user", a.isVisibleToUser());
                    C10658b.f16234a.mo45601a(jSONObject, a);
                } catch (Exception e) {
                    try {
                        jSONObject.put("DUMP-ERROR", C10656b.f16228f.m22638j(e.getMessage(), 50));
                    } catch (JSONException unused) {
                    }
                }
                printWriter.append(" props=\"").append(jSONObject.toString()).append(AbstractDebugRequestMapper.QUOTE);
            }
        }
    }

    /* renamed from: y2.b$b */
    /* compiled from: EndToEndDumpsysHelper.kt */
    private static final class C10658b {

        /* renamed from: a */
        public static final C10658b f16234a = new C10658b();

        private C10658b() {
        }

        /* renamed from: a */
        public final void mo45601a(JSONObject jSONObject, AccessibilityNodeInfo accessibilityNodeInfo) {
            C12775o.m28639i(jSONObject, "props");
            C12775o.m28639i(accessibilityNodeInfo, "nodeInfo");
            jSONObject.put("context-clickable", accessibilityNodeInfo.isContextClickable()).put("drawing-order", accessibilityNodeInfo.getDrawingOrder()).put("important-for-accessibility", accessibilityNodeInfo.isImportantForAccessibility());
        }
    }

    /* renamed from: y2.b$c */
    /* compiled from: EndToEndDumpsysHelper.kt */
    public static final class C10659c {
        private C10659c() {
        }

        public /* synthetic */ C10659c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final AccessibilityNodeInfo m22637i(View view) {
            if (view == null) {
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            try {
                view.onInitializeAccessibilityNodeInfo(obtain);
                return obtain;
            } catch (NullPointerException unused) {
                if (obtain != null) {
                    obtain.recycle();
                }
                return null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final String m22638j(CharSequence charSequence, int i) {
            boolean z;
            int i2 = i;
            if (charSequence == null) {
                return "";
            }
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            String A = C13754v.m31521A(C13754v.m31521A(C13754v.m31521A(charSequence.toString(), " \n", " ", false, 4, (Object) null), "\n", " ", false, 4, (Object) null), AbstractDebugRequestMapper.QUOTE, "", false, 4, (Object) null);
            if (charSequence.length() <= i2) {
                return A;
            }
            StringBuilder sb = new StringBuilder();
            if (A != null) {
                String substring = A.substring(0, i2);
                C12775o.m28638h(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append("...");
                return sb.toString();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: k */
        private final String m22639k(View view) {
            Object obj;
            if (C10656b.f16227e == null) {
                C10656b.f16227e = view.getClass().getDeclaredMethod("getText", new Class[0]);
            }
            Method c = C10656b.f16227e;
            if (c != null) {
                obj = c.invoke(view, new Object[0]);
            } else {
                obj = null;
            }
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final boolean m22640l(String[] strArr, String str) {
            if (strArr == null) {
                return false;
            }
            for (String r : strArr) {
                if (C13754v.m31530r(str, r, true)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final boolean m22641m(View view) {
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                if (C12775o.m28634d(cls.getName(), "com.facebook.litho.LithoView")) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: o */
        private final void m22642o(PrintWriter printWriter, View view) {
            boolean z;
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                tag = null;
            }
            String str = (String) tag;
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    printWriter.print(" app:tag/");
                    printWriter.print(m22638j(str, 60));
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final void m22643p(PrintWriter printWriter, View view, int i, int i2) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            printWriter.print(" ");
            printWriter.print(iArr[0] - i);
            printWriter.print(",");
            printWriter.print(iArr[1] - i2);
            printWriter.print("-");
            printWriter.print((iArr[0] + view.getWidth()) - i);
            printWriter.print(",");
            printWriter.print((iArr[1] + view.getHeight()) - i2);
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public final void m22644q(PrintWriter printWriter, View view) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            printWriter.print(" ");
            int visibility = view.getVisibility();
            String str8 = ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
            String str9 = ".";
            if (visibility == 0) {
                printWriter.print(str8);
            } else if (visibility == 4) {
                printWriter.print("I");
            } else if (visibility != 8) {
                printWriter.print(str9);
            } else {
                printWriter.print("G");
            }
            String str10 = "F";
            if (view.isFocusable()) {
                str = str10;
            } else {
                str = str9;
            }
            printWriter.print(str);
            if (view.isEnabled()) {
                str2 = ExifInterface.LONGITUDE_EAST;
            } else {
                str2 = str9;
            }
            printWriter.print(str2);
            printWriter.print(str9);
            String str11 = "H";
            if (view.isHorizontalScrollBarEnabled()) {
                str3 = str11;
            } else {
                str3 = str9;
            }
            printWriter.print(str3);
            if (!view.isVerticalScrollBarEnabled()) {
                str8 = str9;
            }
            printWriter.print(str8);
            if (view.isClickable()) {
                str4 = "C";
            } else {
                str4 = str9;
            }
            printWriter.print(str4);
            if (view.isLongClickable()) {
                str5 = "L";
            } else {
                str5 = str9;
            }
            printWriter.print(str5);
            printWriter.print(" ");
            if (!view.isFocused()) {
                str10 = str9;
            }
            printWriter.print(str10);
            if (view.isSelected()) {
                str6 = ExifInterface.LATITUDE_SOUTH;
            } else {
                str6 = str9;
            }
            printWriter.print(str6);
            if (!view.isHovered()) {
                str11 = str9;
            }
            printWriter.print(str11);
            if (view.isActivated()) {
                str7 = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
            } else {
                str7 = str9;
            }
            printWriter.print(str7);
            if (view.isDirty()) {
                str9 = "D";
            }
            printWriter.print(str9);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public final void m22645r(PrintWriter printWriter, View view) {
            String str;
            try {
                int id = view.getId();
                if (id == -1) {
                    m22642o(printWriter, view);
                    return;
                }
                printWriter.append(" #");
                printWriter.append(Integer.toHexString(id));
                Resources resources = view.getResources();
                if (id > 0) {
                    if (resources != null) {
                        int i = -16777216 & id;
                        if (i == 16777216) {
                            str = SystemMediaRouteProvider.PACKAGE_NAME;
                        } else if (i != 2130706432) {
                            str = resources.getResourcePackageName(id);
                            C12775o.m28638h(str, "resources.getResourcePackageName(id)");
                        } else {
                            str = "app";
                        }
                        printWriter.print(" ");
                        printWriter.print(str);
                        printWriter.print(":");
                        printWriter.print(resources.getResourceTypeName(id));
                        printWriter.print("/");
                        printWriter.print(resources.getResourceEntryName(id));
                        return;
                    }
                }
                m22642o(printWriter, view);
            } catch (Exception unused) {
                m22642o(printWriter, view);
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
            if (r3 != false) goto L_0x0041;
         */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m22646s(java.io.PrintWriter r8, android.view.View r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof android.widget.TextView     // Catch:{ Exception -> 0x00a2 }
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0012
                android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ Exception -> 0x00a2 }
                java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x00a2 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00a2 }
                goto L_0x0082
            L_0x0012:
                java.lang.Class r0 = r9.getClass()     // Catch:{ Exception -> 0x00a2 }
                java.lang.String r0 = r0.getSimpleName()     // Catch:{ Exception -> 0x00a2 }
                java.lang.String r3 = "RCTextView"
                boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r3)     // Catch:{ Exception -> 0x00a2 }
                if (r0 == 0) goto L_0x0028
                java.lang.String r9 = r7.m22639k(r9)     // Catch:{ Exception -> 0x00a2 }
                goto L_0x0082
            L_0x0028:
                java.lang.CharSequence r0 = r9.getContentDescription()     // Catch:{ Exception -> 0x00a2 }
                if (r0 == 0) goto L_0x0033
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a2 }
                goto L_0x0034
            L_0x0033:
                r0 = 0
            L_0x0034:
                if (r0 == 0) goto L_0x0041
                int r3 = r0.length()     // Catch:{ Exception -> 0x00a2 }
                if (r3 != 0) goto L_0x003e
                r3 = r2
                goto L_0x003f
            L_0x003e:
                r3 = r1
            L_0x003f:
                if (r3 == 0) goto L_0x0081
            L_0x0041:
                java.lang.Object r9 = r9.getTag()     // Catch:{ Exception -> 0x00a2 }
                if (r9 == 0) goto L_0x0081
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00a2 }
                int r0 = r9.length()     // Catch:{ Exception -> 0x00a2 }
                int r0 = r0 - r2
                r3 = r1
                r4 = r3
            L_0x0052:
                if (r3 > r0) goto L_0x0077
                if (r4 != 0) goto L_0x0058
                r5 = r3
                goto L_0x0059
            L_0x0058:
                r5 = r0
            L_0x0059:
                char r5 = r9.charAt(r5)     // Catch:{ Exception -> 0x00a2 }
                r6 = 32
                int r5 = kotlin.jvm.internal.C12775o.m28641k(r5, r6)     // Catch:{ Exception -> 0x00a2 }
                if (r5 > 0) goto L_0x0067
                r5 = r2
                goto L_0x0068
            L_0x0067:
                r5 = r1
            L_0x0068:
                if (r4 != 0) goto L_0x0071
                if (r5 != 0) goto L_0x006e
                r4 = r2
                goto L_0x0052
            L_0x006e:
                int r3 = r3 + 1
                goto L_0x0052
            L_0x0071:
                if (r5 != 0) goto L_0x0074
                goto L_0x0077
            L_0x0074:
                int r0 = r0 + -1
                goto L_0x0052
            L_0x0077:
                int r0 = r0 + r2
                java.lang.CharSequence r9 = r9.subSequence(r3, r0)     // Catch:{ Exception -> 0x00a2 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00a2 }
                goto L_0x0082
            L_0x0081:
                r9 = r0
            L_0x0082:
                if (r9 == 0) goto L_0x00a2
                int r0 = r9.length()     // Catch:{ Exception -> 0x00a2 }
                if (r0 != 0) goto L_0x008b
                r1 = r2
            L_0x008b:
                if (r1 == 0) goto L_0x008e
                goto L_0x00a2
            L_0x008e:
                java.lang.String r0 = " text=\""
                r8.print(r0)     // Catch:{ Exception -> 0x00a2 }
                r0 = 600(0x258, float:8.41E-43)
                java.lang.String r9 = r7.m22638j(r9, r0)     // Catch:{ Exception -> 0x00a2 }
                r8.print(r9)     // Catch:{ Exception -> 0x00a2 }
                java.lang.String r9 = "\""
                r8.print(r9)     // Catch:{ Exception -> 0x00a2 }
            L_0x00a2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p284y2.C10656b.C10659c.m22646s(java.io.PrintWriter, android.view.View):void");
        }

        /* renamed from: n */
        public final boolean mo45602n(String str, PrintWriter printWriter, String[] strArr) {
            boolean z;
            C12775o.m28639i(str, "prefix");
            C12775o.m28639i(printWriter, "writer");
            if (strArr != null) {
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!z) && C12775o.m28634d("e2e", strArr[0])) {
                    if (C10656b.f16226d == null) {
                        C10656b.f16226d = new C10656b();
                    }
                    C10656b b = C10656b.f16226d;
                    if (b != null) {
                        b.m22623g(str, printWriter, strArr);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    private final void m22622f(String str, PrintWriter printWriter, View view, int i, int i2, boolean z, boolean z2) {
        ViewGroup viewGroup;
        int childCount;
        String str2 = str;
        PrintWriter printWriter2 = printWriter;
        View view2 = view;
        boolean z3 = z2;
        printWriter2.print(str2);
        if (view2 == null) {
            printWriter2.println("null");
            return;
        }
        printWriter2.print(view.getClass().getName());
        printWriter2.print("{");
        printWriter2.print(Integer.toHexString(view.hashCode()));
        C10659c cVar = f16228f;
        cVar.m22644q(printWriter2, view2);
        cVar.m22643p(printWriter2, view2, i, i2);
        cVar.m22645r(printWriter2, view2);
        cVar.m22646s(printWriter2, view2);
        if (z3) {
            C10657a.f16233b.mo45600b(printWriter2, view2);
        }
        printWriter2.println("}");
        if (cVar.m22641m(view2)) {
            m22625i(printWriter2, view2, str2, z3);
        }
        if (z && (view2 instanceof WebView)) {
            this.f16230b.mo45604c((WebView) view2);
        }
        if ((view2 instanceof ViewGroup) && (childCount = viewGroup.getChildCount()) > 0) {
            String str3 = str2 + "  ";
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            for (int i3 = 0; i3 < childCount; i3++) {
                m22622f(str3, printWriter, (viewGroup = (ViewGroup) view2).getChildAt(i3), iArr[0], iArr[1], z, z2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m22623g(String str, PrintWriter printWriter, String[] strArr) {
        View b;
        String str2 = str;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        printWriter2.print(str2);
        printWriter2.println("Top Level Window View Hierarchy:");
        C10659c cVar = f16228f;
        boolean c = cVar.m22640l(strArr2, "all-roots");
        boolean c2 = cVar.m22640l(strArr2, "top-root");
        boolean c3 = cVar.m22640l(strArr2, "webview");
        boolean c4 = cVar.m22640l(strArr2, "props");
        try {
            List<C10653a.C10655b> b2 = this.f16229a.mo45597b();
            if (b2 == null) {
                return;
            }
            if (!b2.isEmpty()) {
                Collections.reverse(b2);
                Iterator<C10653a.C10655b> it = b2.iterator();
                WindowManager.LayoutParams layoutParams = null;
                while (true) {
                    if (it.hasNext()) {
                        C10653a.C10655b next = it.next();
                        if (!(next == null || (b = next.mo45599b()) == null)) {
                            if (b.getVisibility() == 0) {
                                if (!c && layoutParams != null && Math.abs(next.mo45598a().type - layoutParams.type) != 1) {
                                    break;
                                }
                                m22622f(str2 + "  ", printWriter, next.mo45599b(), 0, 0, c3, c4);
                                layoutParams = next.mo45598a();
                                if (c2) {
                                    break;
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                this.f16230b.mo45603b(printWriter2);
            }
        } catch (Exception e) {
            printWriter2.println("Failure in view hierarchy dump: " + e.getMessage());
        }
    }

    /* renamed from: h */
    public static final boolean m22624h(String str, PrintWriter printWriter, String[] strArr) {
        return f16228f.mo45602n(str, printWriter, strArr);
    }

    /* renamed from: i */
    private final void m22625i(PrintWriter printWriter, View view, String str, boolean z) {
        try {
            if (this.f16231c == null) {
                Class<?> cls = Class.forName("com.facebook.litho.LithoViewTestHelper");
                C12775o.m28638h(cls, "Class.forName(LITHO_VIEW_TEST_HELPER_CLASS)");
                this.f16231c = cls.getDeclaredMethod("viewToStringForE2E", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            }
            Method method = this.f16231c;
            Object obj = null;
            if (method != null) {
                obj = method.invoke((Object) null, new Object[]{view, Integer.valueOf((str.length() / 2) + 1), Boolean.valueOf(z)});
            }
            if (obj != null) {
                C12775o.m28638h(printWriter.append((String) obj), "writer.append(lithoViewDump)");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            printWriter.append(str).append("Failed litho view sub hierarch dump: ").append(f16228f.m22638j(e.getMessage(), 100)).println();
        }
    }
}

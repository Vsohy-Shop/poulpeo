package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import p336ef.C11895c;
import p336ef.C11906l;
import p336ef.C11915r;
import p398nf.C13018a;
import p404of.C13074a;
import p404of.C13075b;
import p404of.C13076c;
import p404of.C13077d;
import p404of.C13078e;
import p404of.C13079f;
import p404of.C13080g;
import p404of.C13081h;
import p404of.C13082i;
import p404of.C13083j;
import p404of.C13084k;
import p404of.C13085l;
import p404of.C13086m;
import p404of.C13087n;
import p404of.C13088o;
import p404of.C13089p;
import p404of.C13090q;
import p404of.C13091r;
import p404of.C13092s;
import p404of.C13093t;
import p404of.C13094u;
import p404of.C13095v;
import p442uf.C13591c;

/* renamed from: kotlin.jvm.internal.f */
/* compiled from: ClassReference.kt */
public final class C12758f implements C13591c<Object>, C12756e {

    /* renamed from: c */
    public static final C12759a f20409c = new C12759a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private static final Map<Class<? extends C11895c<?>>, Integer> f20410d;

    /* renamed from: e */
    private static final HashMap<String, String> f20411e;

    /* renamed from: f */
    private static final HashMap<String, String> f20412f;

    /* renamed from: g */
    private static final HashMap<String, String> f20413g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Map<String, String> f20414h;

    /* renamed from: b */
    private final Class<?> f20415b;

    /* renamed from: kotlin.jvm.internal.f$a */
    /* compiled from: ClassReference.kt */
    public static final class C12759a {
        private C12759a() {
        }

        public /* synthetic */ C12759a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
            if (r2 == null) goto L_0x0043;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo50655a(java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.C12775o.m28639i(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                goto L_0x00b6
            L_0x000e:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L_0x006c
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L_0x0043
                kotlin.jvm.internal.C12775o.m28638h(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = p454wf.C13755w.m31543E0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L_0x0040
                goto L_0x0043
            L_0x0040:
                r1 = r2
                goto L_0x00b6
            L_0x0043:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L_0x0064
                kotlin.jvm.internal.C12775o.m28638h(r0, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = p454wf.C13755w.m31543E0(r0, r8, r1, r3, r1)
                goto L_0x00b6
            L_0x0064:
                kotlin.jvm.internal.C12775o.m28638h(r0, r5)
                java.lang.String r1 = p454wf.C13755w.m31542D0(r0, r4, r1, r3, r1)
                goto L_0x00b6
            L_0x006c:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto L_0x00a1
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L_0x009e
                java.util.Map r0 = kotlin.jvm.internal.C12758f.f20414h
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L_0x009e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = r0.toString()
                r1 = r8
            L_0x009e:
                if (r1 != 0) goto L_0x00b6
                goto L_0x0040
            L_0x00a1:
                java.util.Map r0 = kotlin.jvm.internal.C12758f.f20414h
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L_0x00b6
                java.lang.String r1 = r8.getSimpleName()
            L_0x00b6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C12758f.C12759a.mo50655a(java.lang.Class):java.lang.String");
        }
    }

    static {
        int i = 0;
        Iterable n = C12726w.m28527n(C13074a.class, Function1.class, C13088o.class, C13089p.class, C13090q.class, C13091r.class, C13092s.class, C13093t.class, C13094u.class, C13095v.class, C13075b.class, C13076c.class, C13077d.class, C13078e.class, C13079f.class, C13080g.class, C13081h.class, C13082i.class, C13083j.class, C13084k.class, C13085l.class, C13086m.class, C13087n.class);
        ArrayList arrayList = new ArrayList(C12728x.m28544v(n, 10));
        for (Object next : n) {
            int i2 = i + 1;
            if (i < 0) {
                C12726w.m28534u();
            }
            arrayList.add(C11915r.m25707a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f20410d = C12716r0.m28425p(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        hashMap.put(Constants.LONG, "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f20411e = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f20412f = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C12775o.m28638h(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C12775o.m28638h(str, "kotlinName");
            sb.append(C13755w.m31547G0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C11906l a = C11915r.m25707a(sb2, str + ".Companion");
            hashMap3.put(a.mo49111c(), a.mo49112d());
        }
        for (Map.Entry next2 : f20410d.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f20413g = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12714q0.m28413d(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C13755w.m31547G0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f20414h = linkedHashMap;
    }

    public C12758f(Class<?> cls) {
        C12775o.m28639i(cls, "jClass");
        this.f20415b = cls;
    }

    /* renamed from: a */
    public String mo50651a() {
        return f20409c.mo50655a(mo50649b());
    }

    /* renamed from: b */
    public Class<?> mo50649b() {
        return this.f20415b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12758f) || !C12775o.m28634d(C13018a.m29393b(this), C13018a.m29393b((C13591c) obj))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13018a.m29393b(this).hashCode();
    }

    public String toString() {
        return mo50649b().toString() + " (Kotlin reflection is not available)";
    }
}

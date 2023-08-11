package com.google.protobuf;

import com.google.protobuf.C7186x;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.protobuf.r0 */
/* compiled from: MessageLiteToString */
final class C7169r0 {
    /* renamed from: a */
    private static final String m13688a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m13689b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() == 0.0f) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof C7086h) {
                return obj.equals(C7086h.f9565c);
            }
            if (obj instanceof C7149p0) {
                if (obj == ((C7149p0) obj).mo40636a()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum)) {
                return false;
            } else {
                if (((Enum) obj).ordinal() == 0) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: c */
    static final void m13690c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object c : (List) obj) {
                m13690c(sb, i, str, c);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c2 : ((Map) obj).entrySet()) {
                m13690c(sb, i, str, c2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C7121j1.m13329c((String) obj));
                sb.append('\"');
            } else if (obj instanceof C7086h) {
                sb.append(": \"");
                sb.append(C7121j1.m13327a((C7086h) obj));
                sb.append('\"');
            } else if (obj instanceof C7186x) {
                sb.append(" {");
                m13691d((C7186x) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m13690c(sb, i4, "key", entry.getKey());
                m13690c(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: d */
    private static void m13691d(C7149p0 p0Var, StringBuilder sb, int i) {
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : p0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            boolean z = true;
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String str3 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 4);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m13690c(sb, i, m13688a(str3), C7186x.m13877z(method2, p0Var, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String str4 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 3);
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m13690c(sb, i, m13688a(str4), C7186x.m13877z(method3, p0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + str)) != null) {
                if (str.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + str.substring(0, str.length() - 5))) {
                    }
                }
                String str5 = str.substring(0, 1).toLowerCase() + str.substring(1);
                Method method4 = (Method) hashMap.get("get" + str);
                Method method5 = (Method) hashMap.get("has" + str);
                if (method4 != null) {
                    Object z2 = C7186x.m13877z(method4, p0Var, new Object[0]);
                    if (method5 != null) {
                        z = ((Boolean) C7186x.m13877z(method5, p0Var, new Object[0])).booleanValue();
                    } else if (m13689b(z2)) {
                        z = false;
                    }
                    if (z) {
                        m13690c(sb, i, m13688a(str5), z2);
                    }
                }
            }
        }
        if (p0Var instanceof C7186x.C7189c) {
            Iterator<Map.Entry<C7186x.C7190d, Object>> s = ((C7186x.C7189c) p0Var).extensions.mo40652s();
            while (s.hasNext()) {
                Map.Entry next = s.next();
                m13690c(sb, i, "[" + ((C7186x.C7190d) next.getKey()).mo40660y() + "]", next.getValue());
            }
        }
        C7130l1 l1Var = ((C7186x) p0Var).unknownFields;
        if (l1Var != null) {
            l1Var.mo40549l(sb, i);
        }
    }

    /* renamed from: e */
    static String m13692e(C7149p0 p0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m13691d(p0Var, sb, 0);
        return sb.toString();
    }
}

package com.google.android.gms.internal.cast;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.cast.le */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5016le {

    /* renamed from: a */
    private static final char[] f5348a;

    static {
        char[] cArr = new char[80];
        f5348a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    static String m7163a(C4982je jeVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m7166d(jeVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static void m7164b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m7164b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m7164b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            m7165c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C4983jf.m7106a(C4980jc.m7091z((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C4980jc) {
                sb.append(": \"");
                sb.append(C4983jf.m7106a((C4980jc) obj));
                sb.append('\"');
            } else if (obj instanceof C4878dd) {
                sb.append(" {");
                m7166d((C4878dd) obj, sb, i + 2);
                sb.append("\n");
                m7165c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                m7164b(sb, i3, "key", entry.getKey());
                m7164b(sb, i3, "value", entry.getValue());
                sb.append("\n");
                m7165c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static void m7165c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f5348a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    private static void m7166d(C4982je jeVar, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        C4982je jeVar2 = jeVar;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = jeVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m7164b(sb2, i3, substring.substring(0, substring.length() - 4), C4878dd.m6905e(method2, jeVar2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m7164b(sb2, i3, substring.substring(0, substring.length() - 3), C4878dd.m6905e(method, jeVar2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e = C4878dd.m6905e(method4, jeVar2, new Object[0]);
                    if (method5 == null) {
                        if (e instanceof Boolean) {
                            if (!((Boolean) e).booleanValue()) {
                            }
                        } else if (e instanceof Integer) {
                            if (((Integer) e).intValue() == 0) {
                            }
                        } else if (e instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) e).floatValue()) == 0) {
                            }
                        } else if (!(e instanceof Double)) {
                            if (e instanceof String) {
                                z = e.equals("");
                            } else if (e instanceof C4980jc) {
                                z = e.equals(C4980jc.f5269c);
                            } else if (e instanceof C4982je) {
                                if (e == ((C4982je) e).mo32731a()) {
                                }
                            } else if ((e instanceof Enum) && ((Enum) e).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) e).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C4878dd.m6905e(method5, jeVar2, new Object[0])).booleanValue()) {
                    }
                    m7164b(sb2, i3, substring, e);
                }
            }
            i2 = 3;
        }
        if (!(jeVar2 instanceof C4860cd)) {
            C5017lf lfVar = ((C4878dd) jeVar2).zzc;
            if (lfVar != null) {
                lfVar.mo32887g(sb2, i3);
                return;
            }
            return;
        }
        C4860cd cdVar = (C4860cd) jeVar2;
        throw null;
    }
}

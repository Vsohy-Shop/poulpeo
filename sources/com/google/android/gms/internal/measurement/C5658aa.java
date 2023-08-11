package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.measurement.aa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5658aa {
    /* renamed from: a */
    static String m8764a(C6052y9 y9Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m8767d(y9Var, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m8765b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m8765b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m8765b(sb, i, str, b2);
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
                sb.append(C6005va.m10174a(C6018w7.m10202A((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C6018w7) {
                sb.append(": \"");
                sb.append(C6005va.m10174a((C6018w7) obj));
                sb.append('\"');
            } else if (obj instanceof C6003v8) {
                sb.append(" {");
                m8767d((C6003v8) obj, sb, i + 2);
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
                m8765b(sb, i4, "key", entry.getKey());
                m8765b(sb, i4, "value", entry.getValue());
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

    /* renamed from: c */
    private static final String m8766c(String str) {
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

    /* renamed from: d */
    private static void m8767d(C6052y9 y9Var, StringBuilder sb, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : y9Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str9 : treeSet) {
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m8765b(sb, i, m8766c(str8), C6003v8.m10156m(method2, y9Var, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m8765b(sb, i, m8766c(str7), C6003v8.m10156m(method3, y9Var, new Object[0]));
                }
            }
            if (str.length() != 0) {
                str2 = "set".concat(str);
            } else {
                str2 = new String("set");
            }
            if (((Method) hashMap2.get(str2)) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf5.length() != 0) {
                        str6 = "get".concat(valueOf5);
                    } else {
                        str6 = new String("get");
                    }
                    if (hashMap.containsKey(str6)) {
                    }
                }
                String valueOf6 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(str.substring(1));
                if (valueOf7.length() != 0) {
                    str3 = valueOf6.concat(valueOf7);
                } else {
                    str3 = new String(valueOf6);
                }
                if (str.length() != 0) {
                    str4 = "get".concat(str);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                if (str.length() != 0) {
                    str5 = "has".concat(str);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object m = C6003v8.m10156m(method4, y9Var, new Object[0]);
                    if (method5 == null) {
                        if (m instanceof Boolean) {
                            if (!((Boolean) m).booleanValue()) {
                            }
                        } else if (m instanceof Integer) {
                            if (((Integer) m).intValue() == 0) {
                            }
                        } else if (m instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m).floatValue()) == 0) {
                            }
                        } else if (!(m instanceof Double)) {
                            if (m instanceof String) {
                                z = m.equals("");
                            } else if (m instanceof C6018w7) {
                                z = m.equals(C6018w7.f7451c);
                            } else if (m instanceof C6052y9) {
                                if (m == ((C6052y9) m).mo34353e()) {
                                }
                            } else if ((m instanceof Enum) && ((Enum) m).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) m).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C6003v8.m10156m(method5, y9Var, new Object[0])).booleanValue()) {
                    }
                    m8765b(sb, i, m8766c(str3), m);
                }
            }
        }
        if (!(y9Var instanceof C5971t8)) {
            C6053ya yaVar = ((C6003v8) y9Var).zzc;
            if (yaVar != null) {
                yaVar.mo34644g(sb, i);
                return;
            }
            return;
        }
        C5971t8 t8Var = (C5971t8) y9Var;
        throw null;
    }
}

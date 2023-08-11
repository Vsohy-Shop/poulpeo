package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.fd */
public final class C5345fd {
    /* renamed from: a */
    public static C5528rc m7937a(C5276b4 b4Var, C5528rc rcVar) {
        C9713p.m20275j(rcVar);
        if (!m7945i(rcVar) && !(rcVar instanceof C5604wc) && !(rcVar instanceof C5632yc) && !(rcVar instanceof C5285bd)) {
            if (rcVar instanceof C5300cd) {
                rcVar = m7938b(b4Var, (C5300cd) rcVar);
            } else {
                throw new UnsupportedOperationException("Attempting to evaluate unknown type");
            }
        }
        if (rcVar == null) {
            throw new IllegalArgumentException("AbstractType evaluated to Java null");
        } else if (!(rcVar instanceof C5300cd)) {
            return rcVar;
        } else {
            throw new IllegalArgumentException("AbstractType evaluated to illegal type Statement.");
        }
    }

    /* renamed from: b */
    public static C5528rc m7938b(C5276b4 b4Var, C5300cd cdVar) {
        String i = cdVar.mo33163i();
        List<C5528rc<?>> j = cdVar.mo33164j();
        C5528rc<?> e = b4Var.mo33125e(i);
        if (e == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
            sb.append("Function '");
            sb.append(i);
            sb.append("' is not supported");
            throw new UnsupportedOperationException(sb.toString());
        } else if (e instanceof C5604wc) {
            return ((C5491p5) ((C5604wc) e).mo33142a()).mo33133a(b4Var, (C5528rc[]) j.toArray(new C5528rc[j.size()]));
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 29);
            sb2.append("Function '");
            sb2.append(i);
            sb2.append("' is not a function");
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    /* renamed from: c */
    public static C5618xc m7939c(C5276b4 b4Var, List<C5528rc<?>> list) {
        for (C5528rc next : list) {
            C9713p.m20266a(next instanceof C5300cd);
            C5528rc a = m7937a(b4Var, next);
            if (m7946j(a)) {
                return (C5618xc) a;
            }
        }
        return C5618xc.f6732h;
    }

    /* renamed from: d */
    public static Map<String, Object> m7940d(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                hashMap.put(next, m7940d((Bundle) obj));
            } else if (obj instanceof List) {
                hashMap.put(next, m7941e((List) obj));
            } else {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    private static List<Object> m7941e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof Bundle) {
                arrayList.add(m7940d((Bundle) next));
            } else if (next instanceof List) {
                arrayList.add(m7941e((List) next));
            } else {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static Object m7942f(C5528rc<?> rcVar) {
        if (rcVar == null || rcVar == C5618xc.f6731g) {
            return null;
        }
        if (rcVar instanceof C5574uc) {
            return (Boolean) ((C5574uc) rcVar).mo33142a();
        }
        if (rcVar instanceof C5589vc) {
            C5589vc vcVar = (C5589vc) rcVar;
            double doubleValue = ((Double) vcVar.mo33142a()).doubleValue();
            if (Double.isInfinite(doubleValue) || doubleValue - Math.floor(doubleValue) >= 1.0E-5d) {
                return ((Double) vcVar.mo33142a()).toString();
            }
            return Integer.valueOf((int) doubleValue);
        } else if (rcVar instanceof C5315dd) {
            return (String) ((C5315dd) rcVar).mo33142a();
        } else {
            if (rcVar instanceof C5632yc) {
                ArrayList arrayList = new ArrayList();
                for (C5528rc rcVar2 : (List) ((C5632yc) rcVar).mo33142a()) {
                    Object f = m7942f(rcVar2);
                    if (f == null) {
                        C5426l3.m8135e(String.format("Failure to convert a list element to object: %s (%s)", new Object[]{rcVar2, rcVar2.getClass().getCanonicalName()}));
                        return null;
                    }
                    arrayList.add(f);
                }
                return arrayList;
            } else if (rcVar instanceof C5285bd) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) ((C5285bd) rcVar).mo33142a()).entrySet()) {
                    Object f2 = m7942f((C5528rc) entry.getValue());
                    if (f2 == null) {
                        C5426l3.m8135e(String.format("Failure to convert a map's value to object: %s (%s)", new Object[]{entry.getValue(), ((C5528rc) entry.getValue()).getClass().getCanonicalName()}));
                        return null;
                    }
                    hashMap.put((String) entry.getKey(), f2);
                }
                return hashMap;
            } else {
                String valueOf = String.valueOf(rcVar.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Converting to Object from unknown abstract type: ");
                sb.append(valueOf);
                C5426l3.m8135e(sb.toString());
                return null;
            }
        }
    }

    /* renamed from: g */
    public static Bundle m7943g(Map<String, C5528rc<?>> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() instanceof C5315dd) {
                bundle.putString((String) next.getKey(), (String) ((C5315dd) next.getValue()).mo33142a());
            } else if (next.getValue() instanceof C5574uc) {
                bundle.putBoolean((String) next.getKey(), ((Boolean) ((C5574uc) next.getValue()).mo33142a()).booleanValue());
            } else if (next.getValue() instanceof C5589vc) {
                bundle.putDouble((String) next.getKey(), ((Double) ((C5589vc) next.getValue()).mo33142a()).doubleValue());
            } else if (next.getValue() instanceof C5285bd) {
                bundle.putBundle((String) next.getKey(), m7943g((Map) ((C5285bd) next.getValue()).mo33142a()));
            } else {
                throw new IllegalArgumentException(String.format("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", new Object[]{next.getKey()}));
            }
        }
        return bundle;
    }

    /* renamed from: h */
    public static C5528rc m7944h(C5528rc<?> rcVar) {
        if (!(rcVar instanceof C5285bd)) {
            return rcVar;
        }
        HashSet<String> hashSet = new HashSet<>();
        Map map = (Map) ((C5285bd) rcVar).mo33142a();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == C5618xc.f6732h) {
                hashSet.add((String) entry.getKey());
            }
        }
        for (String remove : hashSet) {
            map.remove(remove);
        }
        return rcVar;
    }

    /* renamed from: i */
    public static boolean m7945i(C5528rc rcVar) {
        if ((rcVar instanceof C5574uc) || (rcVar instanceof C5589vc) || (rcVar instanceof C5315dd) || rcVar == C5618xc.f6731g || rcVar == C5618xc.f6732h) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m7946j(C5528rc rcVar) {
        if (rcVar == C5618xc.f6730f || rcVar == C5618xc.f6729e) {
            return true;
        }
        if (!(rcVar instanceof C5618xc) || !((C5618xc) rcVar).mo33621i()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static C5528rc<?> m7947k(@Nullable Object obj) {
        if (obj == null) {
            return C5618xc.f6731g;
        }
        if (obj instanceof C5528rc) {
            return (C5528rc) obj;
        }
        if (obj instanceof Boolean) {
            return new C5574uc((Boolean) obj);
        }
        if (obj instanceof Short) {
            return new C5589vc(Double.valueOf(((Short) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C5589vc(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Long) {
            return new C5589vc(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new C5589vc(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new C5589vc((Double) obj);
        }
        if (obj instanceof Byte) {
            return new C5315dd(obj.toString());
        }
        if (obj instanceof Character) {
            return new C5315dd(obj.toString());
        }
        if (obj instanceof String) {
            return new C5315dd((String) obj);
        }
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            for (Object k : (List) obj) {
                arrayList.add(m7947k(k));
            }
            return new C5632yc(arrayList);
        } else if (obj instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                C9713p.m20266a(entry.getKey() instanceof String);
                hashMap.put((String) entry.getKey(), m7947k(entry.getValue()));
            }
            return new C5285bd(hashMap);
        } else if (obj instanceof Bundle) {
            HashMap hashMap2 = new HashMap();
            Bundle bundle = (Bundle) obj;
            for (String next : bundle.keySet()) {
                hashMap2.put(next, m7947k(bundle.get(next)));
            }
            return new C5285bd(hashMap2);
        } else {
            String valueOf = String.valueOf(obj.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Type not supported: ");
            sb.append(valueOf);
            throw new UnsupportedOperationException(sb.toString());
        }
    }
}

package com.google.android.gms.internal.gtm;

import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.cb */
public final class C5298cb {
    /* renamed from: a */
    private static C5498pc m7828a(Object obj, List<String> list) {
        C5498pc pcVar;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            String string = jSONArray.getString(0);
            if (string.equals("escape")) {
                C5498pc a = m7828a(jSONArray.get(1), list);
                for (int i = 2; i < jSONArray.length(); i++) {
                    a.mo33460a(jSONArray.getInt(i));
                }
                return a;
            } else if (string.equals("list")) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 1; i2 < jSONArray.length(); i2++) {
                    arrayList.add(m7828a(jSONArray.get(i2), list).mo33462c());
                }
                pcVar = new C5498pc(2, arrayList);
                pcVar.mo33461b(true);
            } else if (string.equals("map")) {
                HashMap hashMap = new HashMap();
                for (int i3 = 1; i3 < jSONArray.length(); i3 += 2) {
                    hashMap.put(m7828a(jSONArray.get(i3), list).mo33462c(), m7828a(jSONArray.get(i3 + 1), list).mo33462c());
                }
                pcVar = new C5498pc(3, hashMap);
                pcVar.mo33461b(true);
            } else if (string.equals("macro")) {
                C5498pc pcVar2 = new C5498pc(4, list.get(jSONArray.getInt(1)));
                pcVar2.mo33461b(true);
                return pcVar2;
            } else if (string.equals("template")) {
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 1; i4 < jSONArray.length(); i4++) {
                    arrayList2.add(m7828a(jSONArray.get(i4), list).mo33462c());
                }
                pcVar = new C5498pc(7, arrayList2);
                pcVar.mo33461b(true);
            } else {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(valueOf.length() + 20);
                sb.append("Invalid value type: ");
                sb.append(valueOf);
                m7833f(sb.toString());
                return null;
            }
        } else if (obj instanceof Boolean) {
            pcVar = new C5498pc(8, obj);
        } else if (obj instanceof Integer) {
            pcVar = new C5498pc(6, obj);
        } else if (obj instanceof String) {
            pcVar = new C5498pc(1, obj);
        } else {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 20);
            sb2.append("Invalid value type: ");
            sb2.append(valueOf2);
            m7833f(sb2.toString());
            return null;
        }
        return pcVar;
    }

    /* renamed from: b */
    private static C5300cd m7829b(JSONArray jSONArray) {
        boolean z;
        if (jSONArray.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        String string = jSONArray.getString(0);
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() != 0) {
                    arrayList.add(m7829b(jSONArray2));
                }
            } else if (obj == JSONObject.NULL) {
                arrayList.add(C5618xc.f6731g);
            } else {
                arrayList.add(C5345fd.m7947k(obj));
            }
        }
        return new C5300cd(string, arrayList);
    }

    /* renamed from: c */
    private static List<C5329ec> m7830c(JSONArray jSONArray, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C5359gc gcVar = new C5359gc();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C5465nc c = m7828a(jSONObject.get(next), list).mo33462c();
                if ("push_after_evaluate".equals(next)) {
                    gcVar.mo33222b(c);
                } else {
                    gcVar.mo33221a(next, c);
                }
            }
            arrayList.add(gcVar.mo33223c());
        }
        return arrayList;
    }

    /* renamed from: d */
    static C5299cc m7831d(String str) {
        String str2;
        Object obj = new JSONObject(str).get("resource");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            C5314dc dcVar = new C5314dc();
            dcVar.mo33177c(jSONObject.optString("version"));
            JSONArray jSONArray = jSONObject.getJSONArray("macros");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getJSONObject(i).getString("instance_name"));
            }
            List<C5329ec> c = m7830c(jSONObject.getJSONArray(APIIncludes.TAGS), arrayList);
            List<C5329ec> c2 = m7830c(jSONObject.getJSONArray("predicates"), arrayList);
            for (C5329ec b : m7830c(jSONObject.getJSONArray("macros"), arrayList)) {
                dcVar.mo33176b(b);
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("rules");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray jSONArray3 = jSONArray2.getJSONArray(i2);
                C5405jc jcVar = new C5405jc();
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    JSONArray jSONArray4 = jSONArray3.getJSONArray(i3);
                    int i4 = 1;
                    if (jSONArray4.getString(0).equals("if")) {
                        while (i4 < jSONArray4.length()) {
                            jcVar.mo33301a(c2.get(jSONArray4.getInt(i4)));
                            i4++;
                        }
                    } else if (jSONArray4.getString(0).equals("unless")) {
                        while (i4 < jSONArray4.length()) {
                            jcVar.mo33302b(c2.get(jSONArray4.getInt(i4)));
                            i4++;
                        }
                    } else if (jSONArray4.getString(0).equals("add")) {
                        while (i4 < jSONArray4.length()) {
                            jcVar.mo33303c(c.get(jSONArray4.getInt(i4)));
                            i4++;
                        }
                    } else if (jSONArray4.getString(0).equals("block")) {
                        while (i4 < jSONArray4.length()) {
                            jcVar.mo33304d(c.get(jSONArray4.getInt(i4)));
                            i4++;
                        }
                    } else {
                        String valueOf = String.valueOf(jSONArray4.getString(0));
                        if (valueOf.length() != 0) {
                            str2 = "Unknown Rule property: ".concat(valueOf);
                        } else {
                            str2 = new String("Unknown Rule property: ");
                        }
                        m7833f(str2);
                    }
                }
                dcVar.mo33175a(jcVar.mo33305e());
            }
            return dcVar.mo33178d();
        }
        throw new zzml("Resource map not found");
    }

    @Nullable
    /* renamed from: e */
    static C5420kc m7832e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray optJSONArray = jSONObject.optJSONArray("runtime");
        if (optJSONArray == null) {
            return null;
        }
        C5450mc mcVar = new C5450mc();
        Object obj = jSONObject.get("resource");
        if (obj instanceof JSONObject) {
            mcVar.mo33362b(((JSONObject) obj).optString("version"));
            for (int i = 0; i < optJSONArray.length(); i++) {
                Object obj2 = optJSONArray.get(i);
                if (!(obj2 instanceof JSONArray) || ((JSONArray) obj2).length() != 0) {
                    mcVar.mo33361a(m7834g(obj2));
                }
            }
            return mcVar.mo33363c();
        }
        throw new zzml("Resource map not found");
    }

    /* renamed from: f */
    private static void m7833f(String str) {
        C5426l3.m8135e(str);
        throw new zzml(str);
    }

    /* renamed from: g */
    public static C5476o5 m7834g(Object obj) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String str;
        boolean z;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            str = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
            jSONArray2 = jSONObject.getJSONArray("params");
            jSONArray = jSONObject.getJSONArray("instructions");
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray3 = (JSONArray) obj;
            if (jSONArray3.length() >= 3) {
                z = true;
            } else {
                z = false;
            }
            C9713p.m20266a(z);
            str = jSONArray3.getString(1);
            JSONArray jSONArray4 = jSONArray3.getJSONArray(2);
            JSONArray jSONArray5 = new JSONArray();
            for (int i = 1; i < jSONArray4.length(); i++) {
                C9713p.m20266a(jSONArray4.get(i) instanceof String);
                jSONArray5.put(jSONArray4.get(i));
            }
            JSONArray jSONArray6 = new JSONArray();
            for (int i2 = 3; i2 < jSONArray3.length(); i2++) {
                jSONArray6.put(jSONArray3.get(i2));
            }
            jSONArray = jSONArray6;
            jSONArray2 = jSONArray5;
        } else {
            throw new IllegalArgumentException("invalid JSON in runtime section");
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            arrayList.add(jSONArray2.getString(i3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONArray jSONArray7 = jSONArray.getJSONArray(i4);
            if (jSONArray7.length() != 0) {
                arrayList2.add(m7829b(jSONArray7));
            }
        }
        return new C5476o5((C5276b4) null, str, arrayList, arrayList2);
    }
}

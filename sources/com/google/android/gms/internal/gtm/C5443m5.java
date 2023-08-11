package com.google.android.gms.internal.gtm;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.m5 */
public final class C5443m5 {

    /* renamed from: a */
    private static final Map<String, C5458n5> f6127a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(C5256a.CONTAINS.toString(), new C5458n5("contains"));
        hashMap.put(C5256a.ENDS_WITH.toString(), new C5458n5("endsWith"));
        hashMap.put(C5256a.EQUALS.toString(), new C5458n5("equals"));
        hashMap.put(C5256a.GREATER_EQUALS.toString(), new C5458n5("greaterEquals"));
        hashMap.put(C5256a.GREATER_THAN.toString(), new C5458n5("greaterThan"));
        hashMap.put(C5256a.LESS_EQUALS.toString(), new C5458n5("lessEquals"));
        hashMap.put(C5256a.LESS_THAN.toString(), new C5458n5("lessThan"));
        hashMap.put(C5256a.REGEX.toString(), new C5458n5("regex", new String[]{C5605x.ARG0.toString(), C5605x.ARG1.toString(), C5605x.IGNORE_CASE.toString()}));
        hashMap.put(C5256a.STARTS_WITH.toString(), new C5458n5("startsWith"));
        f6127a = hashMap;
    }

    /* renamed from: a */
    public static C5300cd m8187a(String str, Map<String, C5528rc<?>> map, C5276b4 b4Var) {
        Map<String, C5458n5> map2 = f6127a;
        if (map2.containsKey(str)) {
            C5458n5 n5Var = map2.get(str);
            String[] b = n5Var.mo33383b();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < b.length; i++) {
                if (!map.containsKey(b[i])) {
                    arrayList.add(C5618xc.f6732h);
                } else {
                    arrayList.add(map.get(b[i]));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C5315dd("gtmUtils"));
            C5300cd cdVar = new C5300cd("15", arrayList2);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(cdVar);
            arrayList3.add(new C5315dd("mobile"));
            C5300cd cdVar2 = new C5300cd("17", arrayList3);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(cdVar2);
            arrayList4.add(new C5315dd(n5Var.mo33382a()));
            arrayList4.add(new C5632yc(arrayList));
            return new C5300cd(ExifInterface.GPS_MEASUREMENT_2D, arrayList4);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
        sb.append("Fail to convert ");
        sb.append(str);
        sb.append(" to the internal representation");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: b */
    public static String m8188b(C5256a aVar) {
        return m8189c(aVar.toString());
    }

    /* renamed from: c */
    public static String m8189c(String str) {
        Map<String, C5458n5> map = f6127a;
        if (map.containsKey(str)) {
            return map.get(str).mo33382a();
        }
        return null;
    }
}

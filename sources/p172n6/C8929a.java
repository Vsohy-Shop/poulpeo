package p172n6;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p192p6.C9063a;

/* renamed from: n6.a */
/* compiled from: AbtExperimentInfo */
public class C8929a {

    /* renamed from: g */
    private static final String[] f12953g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    @VisibleForTesting

    /* renamed from: h */
    static final DateFormat f12954h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    private final String f12955a;

    /* renamed from: b */
    private final String f12956b;

    /* renamed from: c */
    private final String f12957c;

    /* renamed from: d */
    private final Date f12958d;

    /* renamed from: e */
    private final long f12959e;

    /* renamed from: f */
    private final long f12960f;

    public C8929a(String str, String str2, String str3, Date date, long j, long j2) {
        this.f12955a = str;
        this.f12956b = str2;
        this.f12957c = str3;
        this.f12958d = date;
        this.f12959e = j;
        this.f12960f = j2;
    }

    /* renamed from: a */
    static C8929a m18063a(Map<String, String> map) {
        String str;
        m18065g(map);
        try {
            Date parse = f12954h.parse(map.get("experimentStartTime"));
            long parseLong = Long.parseLong(map.get("triggerTimeoutMillis"));
            long parseLong2 = Long.parseLong(map.get("timeToLiveMillis"));
            String str2 = map.get("experimentId");
            String str3 = map.get("variantId");
            if (map.containsKey("triggerEvent")) {
                str = map.get("triggerEvent");
            } else {
                str = "";
            }
            return new C8929a(str2, str3, str, parse, parseLong, parseLong2);
        } catch (ParseException e) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e);
        } catch (NumberFormatException e2) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e2);
        }
    }

    /* renamed from: f */
    static void m18064f(C8929a aVar) {
        m18065g(aVar.mo43069e());
    }

    /* renamed from: g */
    private static void m18065g(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f12953g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo43066b() {
        return this.f12955a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo43067c() {
        return this.f12958d.getTime();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9063a.C9066c mo43068d(String str) {
        String str2;
        C9063a.C9066c cVar = new C9063a.C9066c();
        cVar.f13184a = str;
        cVar.f13196m = mo43067c();
        cVar.f13185b = this.f12955a;
        cVar.f13186c = this.f12956b;
        if (TextUtils.isEmpty(this.f12957c)) {
            str2 = null;
        } else {
            str2 = this.f12957c;
        }
        cVar.f13187d = str2;
        cVar.f13188e = this.f12959e;
        cVar.f13193j = this.f12960f;
        return cVar;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: e */
    public Map<String, String> mo43069e() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentId", this.f12955a);
        hashMap.put("variantId", this.f12956b);
        hashMap.put("triggerEvent", this.f12957c);
        hashMap.put("experimentStartTime", f12954h.format(this.f12958d));
        hashMap.put("triggerTimeoutMillis", Long.toString(this.f12959e));
        hashMap.put("timeToLiveMillis", Long.toString(this.f12960f));
        return hashMap;
    }
}

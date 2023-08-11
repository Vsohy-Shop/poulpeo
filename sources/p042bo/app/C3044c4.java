package p042bo.app;

import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p081f0.C7554a;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8278g;
import p292z.C10730a;

/* renamed from: bo.app.c4 */
public class C3044c4 implements C3116e2 {

    /* renamed from: f */
    private static final String f1533f = C8266c.m16405n(C3044c4.class);

    /* renamed from: b */
    private final C3098d4 f1534b;

    /* renamed from: c */
    private final String f1535c;

    /* renamed from: d */
    private final int f1536d;

    /* renamed from: e */
    private Object f1537e;

    /* renamed from: bo.app.c4$a */
    static /* synthetic */ class C3045a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1538a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                bo.app.d4[] r0 = p042bo.app.C3098d4.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1538a = r0
                bo.app.d4 r1 = p042bo.app.C3098d4.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1538a     // Catch:{ NoSuchFieldError -> 0x001d }
                bo.app.d4 r1 = p042bo.app.C3098d4.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1538a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bo.app.d4 r1 = p042bo.app.C3098d4.DATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1538a     // Catch:{ NoSuchFieldError -> 0x0033 }
                bo.app.d4 r1 = p042bo.app.C3098d4.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3044c4.C3045a.<clinit>():void");
        }
    }

    C3044c4(C3098d4 d4Var, String str, int i) {
        this.f1534b = d4Var;
        this.f1535c = str;
        this.f1536d = i;
    }

    /* renamed from: b */
    private boolean m2702b(Object obj) {
        if ((obj instanceof Integer) || (obj instanceof Double)) {
            double doubleValue = ((Number) obj).doubleValue();
            double doubleValue2 = ((Number) this.f1537e).doubleValue();
            int i = this.f1536d;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 5 && doubleValue < doubleValue2) {
                            return true;
                        }
                        return false;
                    } else if (doubleValue > doubleValue2) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (doubleValue != doubleValue2) {
                    return true;
                } else {
                    return false;
                }
            } else if (doubleValue == doubleValue2) {
                return true;
            } else {
                return false;
            }
        } else if (this.f1536d == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    private boolean m2703c(Object obj) {
        if (!(obj instanceof String)) {
            int i = this.f1536d;
            if (i == 2 || i == 17) {
                return true;
            }
            return false;
        }
        int i2 = this.f1536d;
        if (i2 == 1) {
            return obj.equals(this.f1537e);
        }
        if (i2 == 2) {
            return !obj.equals(this.f1537e);
        }
        if (i2 == 10) {
            return m2701a((String) this.f1537e, (String) obj);
        }
        if (i2 != 17) {
            return false;
        }
        return !m2701a((String) this.f1537e, (String) obj);
    }

    /* renamed from: a */
    public boolean mo28678a(C3766w2 w2Var) {
        Object obj;
        if (!(w2Var instanceof C3812y2)) {
            return false;
        }
        C7554a c = ((C3812y2) w2Var).mo29166c();
        if (c != null) {
            try {
                obj = c.forJsonPut().opt(this.f1535c);
            } catch (Exception e) {
                C8266c.m16404m(f1533f, "Caught exception checking property filter condition.", e);
                return false;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            int i = this.f1536d;
            if (i == 12 || i == 17 || i == 2) {
                return true;
            }
            return false;
        }
        int i2 = this.f1536d;
        if (i2 == 11) {
            return true;
        }
        if (i2 == 12) {
            return false;
        }
        int i3 = C3045a.f1538a[this.f1534b.ordinal()];
        if (i3 == 1) {
            return m2703c(obj);
        }
        if (i3 == 2) {
            return m2699a(obj);
        }
        if (i3 == 3) {
            return m2700a(obj, w2Var.mo29017b());
        }
        if (i3 != 4) {
            return false;
        }
        return m2702b(obj);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f1534b.equals(C3098d4.UNKNOWN)) {
                jSONObject.put("property_type", this.f1534b.toString());
            }
            jSONObject.put("property_key", this.f1535c);
            jSONObject.put("comparator", this.f1536d);
            jSONObject.put("property_value", this.f1537e);
        } catch (JSONException e) {
            C8266c.m16404m(f1533f, "Caught exception creating property filter Json.", e);
        }
        return jSONObject;
    }

    protected C3044c4(JSONObject jSONObject) {
        this((C3098d4) C8278g.m16459m(jSONObject, "property_type", C3098d4.class, C3098d4.UNKNOWN), jSONObject.getString("property_key"), jSONObject.getInt("comparator"));
        if (!jSONObject.has("property_value")) {
            return;
        }
        if (this.f1534b.equals(C3098d4.STRING)) {
            this.f1537e = jSONObject.getString("property_value");
        } else if (this.f1534b.equals(C3098d4.BOOLEAN)) {
            this.f1537e = Boolean.valueOf(jSONObject.getBoolean("property_value"));
        } else if (this.f1534b.equals(C3098d4.NUMBER)) {
            this.f1537e = Double.valueOf(jSONObject.getDouble("property_value"));
        } else if (this.f1534b.equals(C3098d4.DATE)) {
            this.f1537e = Long.valueOf(jSONObject.getLong("property_value"));
        }
    }

    /* renamed from: a */
    private boolean m2700a(Object obj, long j) {
        Date date = null;
        if (obj instanceof String) {
            try {
                date = C8273e.m16438k((String) obj, C10730a.LONG);
            } catch (Exception e) {
                C8266c.m16404m(f1533f, "Caught exception trying to parse date in compareTimestamps", e);
            }
        }
        if (date != null) {
            long g = C8273e.m16434g(date);
            long longValue = ((Number) this.f1537e).longValue();
            int i = this.f1536d;
            if (i != 15) {
                if (i != 16) {
                    switch (i) {
                        case 1:
                            if (g == longValue) {
                                return true;
                            }
                            return false;
                        case 2:
                            if (g != longValue) {
                                return true;
                            }
                            return false;
                        case 3:
                            if (g > longValue) {
                                return true;
                            }
                            return false;
                        case 4:
                            if (g >= j - longValue) {
                                return true;
                            }
                            return false;
                        case 5:
                            if (g < longValue) {
                                return true;
                            }
                            return false;
                        case 6:
                            if (g <= j - longValue) {
                                return true;
                            }
                            return false;
                        default:
                            return false;
                    }
                } else if (g > j + longValue) {
                    return true;
                } else {
                    return false;
                }
            } else if (g < j + longValue) {
                return true;
            } else {
                return false;
            }
        } else if (this.f1536d == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m2699a(Object obj) {
        if (obj instanceof Boolean) {
            int i = this.f1536d;
            if (i == 1) {
                return obj.equals(this.f1537e);
            }
            if (i != 2) {
                return false;
            }
            return !obj.equals(this.f1537e);
        } else if (this.f1536d == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m2701a(String str, String str2) {
        return Pattern.compile(str, 2).matcher(str2).find();
    }
}

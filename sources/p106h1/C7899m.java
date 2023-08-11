package p106h1;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p294z1.C10792k;

@RequiresApi(19)
/* renamed from: h1.m */
/* compiled from: SizeConfigStrategy */
public class C7899m implements C7897k {

    /* renamed from: d */
    private static final Bitmap.Config[] f11042d;

    /* renamed from: e */
    private static final Bitmap.Config[] f11043e;

    /* renamed from: f */
    private static final Bitmap.Config[] f11044f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    private static final Bitmap.Config[] f11045g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    private static final Bitmap.Config[] f11046h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    private final C7902c f11047a = new C7902c();

    /* renamed from: b */
    private final C7888g<C7901b, Bitmap> f11048b = new C7888g<>();

    /* renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f11049c = new HashMap();

    /* renamed from: h1.m$a */
    /* compiled from: SizeConfigStrategy */
    static /* synthetic */ class C7900a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11050a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11050a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11050a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11050a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11050a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p106h1.C7899m.C7900a.<clinit>():void");
        }
    }

    @VisibleForTesting
    /* renamed from: h1.m$b */
    /* compiled from: SizeConfigStrategy */
    static final class C7901b implements C7898l {

        /* renamed from: a */
        private final C7902c f11051a;

        /* renamed from: b */
        int f11052b;

        /* renamed from: c */
        private Bitmap.Config f11053c;

        public C7901b(C7902c cVar) {
            this.f11051a = cVar;
        }

        /* renamed from: a */
        public void mo41615a() {
            this.f11051a.mo41599c(this);
        }

        /* renamed from: b */
        public void mo41632b(int i, Bitmap.Config config) {
            this.f11052b = i;
            this.f11053c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7901b)) {
                return false;
            }
            C7901b bVar = (C7901b) obj;
            if (this.f11052b != bVar.f11052b || !C10792k.m22952c(this.f11053c, bVar.f11053c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.f11052b * 31;
            Bitmap.Config config = this.f11053c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return C7899m.m15505h(this.f11052b, this.f11053c);
        }
    }

    @VisibleForTesting
    /* renamed from: h1.m$c */
    /* compiled from: SizeConfigStrategy */
    static class C7902c extends C7884c<C7901b> {
        C7902c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C7901b mo41597a() {
            return new C7901b(this);
        }

        /* renamed from: e */
        public C7901b mo41637e(int i, Bitmap.Config config) {
            C7901b bVar = (C7901b) mo41598b();
            bVar.mo41632b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f11042d = configArr;
        f11043e = configArr;
    }

    /* renamed from: f */
    private void m15503f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j = m15507j(bitmap.getConfig());
        Integer num2 = j.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo41629e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            j.remove(num);
        } else {
            j.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: g */
    private C7901b m15504g(int i, Bitmap.Config config) {
        C7901b e = this.f11047a.mo41637e(i, config);
        Bitmap.Config[] i2 = m15506i(config);
        int length = i2.length;
        int i3 = 0;
        while (i3 < length) {
            Bitmap.Config config2 = i2[i3];
            Integer ceilingKey = m15507j(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i3++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f11047a.mo41599c(e);
                return this.f11047a.mo41637e(ceilingKey.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: h */
    static String m15505h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: i */
    private static Bitmap.Config[] m15506i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f11043e;
        }
        int i = C7900a.f11050a[config.ordinal()];
        if (i == 1) {
            return f11042d;
        }
        if (i == 2) {
            return f11044f;
        }
        if (i == 3) {
            return f11045g;
        }
        if (i == 4) {
            return f11046h;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: j */
    private NavigableMap<Integer, Integer> m15507j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f11049c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f11049c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public String mo41625a(int i, int i2, Bitmap.Config config) {
        return m15505h(C10792k.m22955f(i, i2, config), config);
    }

    /* renamed from: b */
    public int mo41626b(Bitmap bitmap) {
        return C10792k.m22956g(bitmap);
    }

    /* renamed from: c */
    public void mo41627c(Bitmap bitmap) {
        C7901b e = this.f11047a.mo41637e(C10792k.m22956g(bitmap), bitmap.getConfig());
        this.f11048b.mo41607d(e, bitmap);
        NavigableMap<Integer, Integer> j = m15507j(bitmap.getConfig());
        Integer num = j.get(Integer.valueOf(e.f11052b));
        Integer valueOf = Integer.valueOf(e.f11052b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        j.put(valueOf, Integer.valueOf(i));
    }

    @Nullable
    /* renamed from: d */
    public Bitmap mo41628d(int i, int i2, Bitmap.Config config) {
        C7901b g = m15504g(C10792k.m22955f(i, i2, config), config);
        Bitmap a = this.f11048b.mo41606a(g);
        if (a != null) {
            m15503f(Integer.valueOf(g.f11052b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: e */
    public String mo41629e(Bitmap bitmap) {
        return m15505h(C10792k.m22956g(bitmap), bitmap.getConfig());
    }

    @Nullable
    public Bitmap removeLast() {
        Bitmap f = this.f11048b.mo41608f();
        if (f != null) {
            m15503f(Integer.valueOf(C10792k.m22956g(f)), f);
        }
        return f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f11048b);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f11049c.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f11049c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}

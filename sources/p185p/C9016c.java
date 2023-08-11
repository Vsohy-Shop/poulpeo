package p185p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p259w.C10070i;

/* renamed from: p.c */
/* compiled from: MemoryCache.kt */
public interface C9016c {

    @SourceDebugExtension({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    /* renamed from: p.c$a */
    /* compiled from: MemoryCache.kt */
    public static final class C9017a {

        /* renamed from: a */
        private final Context f13128a;

        /* renamed from: b */
        private double f13129b;

        /* renamed from: c */
        private int f13130c;

        /* renamed from: d */
        private boolean f13131d = true;

        /* renamed from: e */
        private boolean f13132e = true;

        public C9017a(Context context) {
            this.f13128a = context;
            this.f13129b = C10070i.m21145e(context);
        }

        /* renamed from: a */
        public final C9016c mo43212a() {
            C9032i iVar;
            C9031h hVar;
            int i;
            if (this.f13132e) {
                iVar = new C9028g();
            } else {
                iVar = new C9015b();
            }
            if (this.f13131d) {
                double d = this.f13129b;
                if (d > 0.0d) {
                    i = C10070i.m21143c(this.f13128a, d);
                } else {
                    i = this.f13130c;
                }
                if (i > 0) {
                    hVar = new C9025f(i, iVar);
                } else {
                    hVar = new C9014a(iVar);
                }
            } else {
                hVar = new C9014a(iVar);
            }
            return new C9024e(hVar, iVar);
        }
    }

    /* renamed from: p.c$c */
    /* compiled from: MemoryCache.kt */
    public static final class C9021c {

        /* renamed from: a */
        private final Bitmap f13136a;

        /* renamed from: b */
        private final Map<String, Object> f13137b;

        public C9021c(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.f13136a = bitmap;
            this.f13137b = map;
        }

        /* renamed from: a */
        public final Bitmap mo43224a() {
            return this.f13136a;
        }

        /* renamed from: b */
        public final Map<String, Object> mo43225b() {
            return this.f13137b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9021c) {
                C9021c cVar = (C9021c) obj;
                if (!C12775o.m28634d(this.f13136a, cVar.f13136a) || !C12775o.m28634d(this.f13137b, cVar.f13137b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13136a.hashCode() * 31) + this.f13137b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f13136a + ", extras=" + this.f13137b + ')';
        }
    }

    /* renamed from: a */
    void mo43209a(int i);

    /* renamed from: b */
    C9021c mo43210b(C9018b bVar);

    /* renamed from: c */
    void mo43211c(C9018b bVar, C9021c cVar);

    @SourceDebugExtension({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n215#2,2:217\n*S KotlinDebug\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n*L\n86#1:217,2\n*E\n"})
    /* renamed from: p.c$b */
    /* compiled from: MemoryCache.kt */
    public static final class C9018b implements Parcelable {
        @Deprecated
        public static final Parcelable.Creator<C9018b> CREATOR = new C9019a();

        /* renamed from: d */
        private static final C9020b f13133d = new C9020b((DefaultConstructorMarker) null);

        /* renamed from: b */
        private final String f13134b;

        /* renamed from: c */
        private final Map<String, String> f13135c;

        /* renamed from: p.c$b$a */
        /* compiled from: MemoryCache.kt */
        public static final class C9019a implements Parcelable.Creator<C9018b> {
            C9019a() {
            }

            /* renamed from: a */
            public C9018b createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                C12775o.m28636f(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i < readInt; i++) {
                    String readString2 = parcel.readString();
                    C12775o.m28636f(readString2);
                    String readString3 = parcel.readString();
                    C12775o.m28636f(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new C9018b(readString, linkedHashMap);
            }

            /* renamed from: b */
            public C9018b[] newArray(int i) {
                return new C9018b[i];
            }
        }

        /* renamed from: p.c$b$b */
        /* compiled from: MemoryCache.kt */
        private static final class C9020b {
            private C9020b() {
            }

            public /* synthetic */ C9020b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C9018b(String str, Map<String, String> map) {
            this.f13134b = str;
            this.f13135c = map;
        }

        /* renamed from: b */
        public static /* synthetic */ C9018b m18304b(C9018b bVar, String str, Map<String, String> map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f13134b;
            }
            if ((i & 2) != 0) {
                map = bVar.f13135c;
            }
            return bVar.mo43213a(str, map);
        }

        /* renamed from: a */
        public final C9018b mo43213a(String str, Map<String, String> map) {
            return new C9018b(str, map);
        }

        /* renamed from: c */
        public final Map<String, String> mo43214c() {
            return this.f13135c;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9018b) {
                C9018b bVar = (C9018b) obj;
                if (!C12775o.m28634d(this.f13134b, bVar.f13134b) || !C12775o.m28634d(this.f13135c, bVar.f13135c)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13134b.hashCode() * 31) + this.f13135c.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f13134b + ", extras=" + this.f13135c + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f13134b);
            parcel.writeInt(this.f13135c.size());
            for (Map.Entry next : this.f13135c.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C9018b(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? C12716r0.m28416g() : map);
        }
    }
}

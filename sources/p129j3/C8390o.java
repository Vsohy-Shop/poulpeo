package p129j3;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p129j3.C8378i;

/* renamed from: j3.o */
/* compiled from: NetworkConnectionInfo */
public abstract class C8390o {

    /* renamed from: j3.o$a */
    /* compiled from: NetworkConnectionInfo */
    public static abstract class C8391a {
        @NonNull
        /* renamed from: a */
        public abstract C8390o mo42407a();

        @NonNull
        /* renamed from: b */
        public abstract C8391a mo42408b(@Nullable C8392b bVar);

        @NonNull
        /* renamed from: c */
        public abstract C8391a mo42409c(@Nullable C8393c cVar);
    }

    /* renamed from: j3.o$b */
    /* compiled from: NetworkConnectionInfo */
    public enum C8392b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: x */
        private static final SparseArray<C8392b> f11912x = null;

        /* renamed from: b */
        private final int f11914b;

        static {
            C8392b bVar;
            C8392b bVar2;
            C8392b bVar3;
            C8392b bVar4;
            C8392b bVar5;
            C8392b bVar6;
            C8392b bVar7;
            C8392b bVar8;
            C8392b bVar9;
            C8392b bVar10;
            C8392b bVar11;
            C8392b bVar12;
            C8392b bVar13;
            C8392b bVar14;
            C8392b bVar15;
            C8392b bVar16;
            C8392b bVar17;
            C8392b bVar18;
            C8392b bVar19;
            C8392b bVar20;
            SparseArray<C8392b> sparseArray = new SparseArray<>();
            f11912x = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar20);
            sparseArray.put(13, bVar13);
            sparseArray.put(14, bVar14);
            sparseArray.put(15, bVar15);
            sparseArray.put(16, bVar16);
            sparseArray.put(17, bVar17);
            sparseArray.put(18, bVar18);
            sparseArray.put(19, bVar19);
        }

        private C8392b(int i) {
            this.f11914b = i;
        }

        @Nullable
        /* renamed from: a */
        public static C8392b m16773a(int i) {
            return f11912x.get(i);
        }

        /* renamed from: b */
        public int mo42412b() {
            return this.f11914b;
        }
    }

    /* renamed from: j3.o$c */
    /* compiled from: NetworkConnectionInfo */
    public enum C8393c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: v */
        private static final SparseArray<C8393c> f11934v = null;

        /* renamed from: b */
        private final int f11936b;

        static {
            C8393c cVar;
            C8393c cVar2;
            C8393c cVar3;
            C8393c cVar4;
            C8393c cVar5;
            C8393c cVar6;
            C8393c cVar7;
            C8393c cVar8;
            C8393c cVar9;
            C8393c cVar10;
            C8393c cVar11;
            C8393c cVar12;
            C8393c cVar13;
            C8393c cVar14;
            C8393c cVar15;
            C8393c cVar16;
            C8393c cVar17;
            C8393c cVar18;
            C8393c cVar19;
            SparseArray<C8393c> sparseArray = new SparseArray<>();
            f11934v = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar19);
            sparseArray.put(13, cVar13);
            sparseArray.put(14, cVar14);
            sparseArray.put(15, cVar15);
            sparseArray.put(16, cVar16);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar17);
        }

        private C8393c(int i) {
            this.f11936b = i;
        }

        @Nullable
        /* renamed from: a */
        public static C8393c m16775a(int i) {
            return f11934v.get(i);
        }

        /* renamed from: b */
        public int mo42413b() {
            return this.f11936b;
        }
    }

    @NonNull
    /* renamed from: a */
    public static C8391a m16767a() {
        return new C8378i.C8380b();
    }

    @Nullable
    /* renamed from: b */
    public abstract C8392b mo42402b();

    @Nullable
    /* renamed from: c */
    public abstract C8393c mo42403c();
}

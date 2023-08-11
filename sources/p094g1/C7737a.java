package p094g1;

import p058d1.C7214a;
import p058d1.C7216c;

/* renamed from: g1.a */
/* compiled from: DiskCacheStrategy */
public abstract class C7737a {

    /* renamed from: a */
    public static final C7737a f10715a = new C7738a();

    /* renamed from: b */
    public static final C7737a f10716b = new C7739b();

    /* renamed from: c */
    public static final C7737a f10717c = new C7740c();

    /* renamed from: d */
    public static final C7737a f10718d = new C7741d();

    /* renamed from: e */
    public static final C7737a f10719e = new C7742e();

    /* renamed from: g1.a$a */
    /* compiled from: DiskCacheStrategy */
    class C7738a extends C7737a {
        C7738a() {
        }

        /* renamed from: a */
        public boolean mo41377a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo41378b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo41379c(C7214a aVar) {
            if (aVar == C7214a.REMOTE) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo41380d(boolean z, C7214a aVar, C7216c cVar) {
            if (aVar == C7214a.RESOURCE_DISK_CACHE || aVar == C7214a.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: g1.a$b */
    /* compiled from: DiskCacheStrategy */
    class C7739b extends C7737a {
        C7739b() {
        }

        /* renamed from: a */
        public boolean mo41377a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo41378b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo41379c(C7214a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo41380d(boolean z, C7214a aVar, C7216c cVar) {
            return false;
        }
    }

    /* renamed from: g1.a$c */
    /* compiled from: DiskCacheStrategy */
    class C7740c extends C7737a {
        C7740c() {
        }

        /* renamed from: a */
        public boolean mo41377a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo41378b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo41379c(C7214a aVar) {
            if (aVar == C7214a.DATA_DISK_CACHE || aVar == C7214a.MEMORY_CACHE) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo41380d(boolean z, C7214a aVar, C7216c cVar) {
            return false;
        }
    }

    /* renamed from: g1.a$d */
    /* compiled from: DiskCacheStrategy */
    class C7741d extends C7737a {
        C7741d() {
        }

        /* renamed from: a */
        public boolean mo41377a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo41378b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo41379c(C7214a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo41380d(boolean z, C7214a aVar, C7216c cVar) {
            if (aVar == C7214a.RESOURCE_DISK_CACHE || aVar == C7214a.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: g1.a$e */
    /* compiled from: DiskCacheStrategy */
    class C7742e extends C7737a {
        C7742e() {
        }

        /* renamed from: a */
        public boolean mo41377a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo41378b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo41379c(C7214a aVar) {
            if (aVar == C7214a.REMOTE) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo41380d(boolean z, C7214a aVar, C7216c cVar) {
            if (((!z || aVar != C7214a.DATA_DISK_CACHE) && aVar != C7214a.LOCAL) || cVar != C7216c.TRANSFORMED) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public abstract boolean mo41377a();

    /* renamed from: b */
    public abstract boolean mo41378b();

    /* renamed from: c */
    public abstract boolean mo41379c(C7214a aVar);

    /* renamed from: d */
    public abstract boolean mo41380d(boolean z, C7214a aVar, C7216c cVar);
}

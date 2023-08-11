package p415qc;

/* renamed from: qc.c */
/* compiled from: CTParam */
public class C13238c {

    /* renamed from: a */
    private String f21063a;

    /* renamed from: b */
    private C13239d f21064b;

    public C13238c(String str, C13239d dVar) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (dVar != null) {
            this.f21063a = str;
            this.f21064b = dVar;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public String mo52881a(Object obj) {
        return this.f21064b.mo52887b(obj);
    }

    /* renamed from: b */
    public String mo52882b() {
        return this.f21063a;
    }

    /* renamed from: c */
    public boolean mo52883c(Class<?> cls) {
        return this.f21064b.mo52886a(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13238c cVar = (C13238c) obj;
        String str = this.f21063a;
        if (str == null) {
            if (cVar.f21063a != null) {
                return false;
            }
        } else if (!str.equals(cVar.f21063a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.f21063a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return 31 + i;
    }
}

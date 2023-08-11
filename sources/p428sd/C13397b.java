package p428sd;

/* renamed from: sd.b */
/* compiled from: ApiMessageKey */
public class C13397b {

    /* renamed from: c */
    public static final C13397b f21459c = new C13397b(C13398c.DEFAULT_ERROR);

    /* renamed from: a */
    private final C13398c f21460a;

    /* renamed from: b */
    private final Integer f21461b;

    public C13397b(C13398c cVar) {
        if (cVar != null) {
            this.f21460a = cVar;
            this.f21461b = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13397b bVar = (C13397b) obj;
        if (this.f21460a != bVar.f21460a) {
            return false;
        }
        Integer num = this.f21461b;
        Integer num2 = bVar.f21461b;
        if (num != null) {
            return num.equals(num2);
        }
        if (num2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f21460a.hashCode() * 31;
        Integer num = this.f21461b;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public C13397b(int i) {
        this.f21460a = C13398c.SERVER_ERROR;
        this.f21461b = Integer.valueOf(i);
    }

    public C13397b(C13398c cVar, Integer num) {
        if (num == null || cVar == C13398c.SERVER_ERROR) {
            this.f21460a = cVar;
            this.f21461b = num;
            return;
        }
        throw new IllegalArgumentException();
    }
}

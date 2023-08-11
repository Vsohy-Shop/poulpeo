package p037b6;

/* renamed from: b6.x */
final class C2934x extends C2931u {

    /* renamed from: a */
    private final C2933w f1334a = new C2933w();

    C2934x() {
    }

    /* renamed from: a */
    public final void mo28472a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f1334a.mo28475a(th).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}

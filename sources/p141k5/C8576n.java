package p141k5;

/* renamed from: k5.n */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C8576n extends C8579q {

    /* renamed from: i */
    final /* synthetic */ C8577o f12243i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8576n(C8577o oVar, C8580r rVar, CharSequence charSequence) {
        super(rVar, charSequence);
        this.f12243i = oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo42639d(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo42640e(int i) {
        C8573k kVar = this.f12243i.f12244a;
        CharSequence charSequence = this.f12247d;
        int length = charSequence.length();
        C8575m.m17212a(i, length, "index");
        while (i < length) {
            if (kVar.mo42636a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}

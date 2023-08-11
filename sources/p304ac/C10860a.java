package p304ac;

/* renamed from: ac.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10860a {
    /* renamed from: a */
    public static /* synthetic */ String m23150a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            if (charSequenceArr.length > 0) {
                sb.append(charSequenceArr[0]);
                for (int i = 1; i < charSequenceArr.length; i++) {
                    sb.append(charSequence);
                    sb.append(charSequenceArr[i]);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException("delimiter");
    }
}

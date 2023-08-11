package p454wf;

/* renamed from: wf.l */
/* compiled from: StringNumberConversionsJVM.kt */
final class C13742l {

    /* renamed from: a */
    public static final C13742l f22186a = new C13742l();

    /* renamed from: b */
    public static final C13735j f22187b;

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f22187b = new C13735j("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private C13742l() {
    }
}

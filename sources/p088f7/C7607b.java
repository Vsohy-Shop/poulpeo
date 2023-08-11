package p088f7;

/* renamed from: f7.b */
/* compiled from: MiddleOutStrategy */
public class C7607b implements C7609d {

    /* renamed from: a */
    private final int f10580a;

    public C7607b(int i) {
        this.f10580a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo41354a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f10580a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}

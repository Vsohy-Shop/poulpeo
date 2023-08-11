package p361ie;

/* renamed from: ie.e */
/* compiled from: RunnableDisposable */
final class C12144e extends C12143d<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    C12144e(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo49585a(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}

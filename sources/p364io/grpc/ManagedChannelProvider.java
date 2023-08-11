package p364io.grpc;

/* renamed from: io.grpc.ManagedChannelProvider */
public abstract class ManagedChannelProvider {

    /* renamed from: io.grpc.ManagedChannelProvider$ProviderNotFoundException */
    public static final class ProviderNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1;

        public ProviderNotFoundException(String str) {
            super(str);
        }
    }

    /* renamed from: d */
    public static ManagedChannelProvider m26493d() {
        ManagedChannelProvider d = ManagedChannelRegistry.m26498b().mo49593d();
        if (d != null) {
            return d;
        }
        throw new ProviderNotFoundException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C12563n<?> mo49590a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo49591b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo49592c();
}

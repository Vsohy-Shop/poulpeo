package p364io.grpc.internal;

/* renamed from: io.grpc.internal.c */
/* compiled from: AbstractReadableBuffer */
public abstract class C12213c implements C12451v1 {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49748a(int i) {
        if (mo50016e() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        mo49748a(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: N */
    public void mo49747N() {
    }

    public void close() {
    }
}

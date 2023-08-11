package p294z1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: z1.d */
/* compiled from: ExceptionCatchingInputStream */
public class C10783d extends InputStream {

    /* renamed from: d */
    private static final Queue<C10783d> f16495d = C10792k.m22954e(0);

    /* renamed from: b */
    private InputStream f16496b;

    /* renamed from: c */
    private IOException f16497c;

    C10783d() {
    }

    @NonNull
    /* renamed from: b */
    public static C10783d m22925b(@NonNull InputStream inputStream) {
        C10783d poll;
        Queue<C10783d> queue = f16495d;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C10783d();
        }
        poll.mo45687k(inputStream);
        return poll;
    }

    @Nullable
    /* renamed from: a */
    public IOException mo45683a() {
        return this.f16497c;
    }

    public int available() {
        return this.f16496b.available();
    }

    /* renamed from: c */
    public void mo45685c() {
        this.f16497c = null;
        this.f16496b = null;
        Queue<C10783d> queue = f16495d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void close() {
        this.f16496b.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo45687k(@NonNull InputStream inputStream) {
        this.f16496b = inputStream;
    }

    public void mark(int i) {
        this.f16496b.mark(i);
    }

    public boolean markSupported() {
        return this.f16496b.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f16496b.read(bArr);
        } catch (IOException e) {
            this.f16497c = e;
            return -1;
        }
    }

    public synchronized void reset() {
        this.f16496b.reset();
    }

    public long skip(long j) {
        try {
            return this.f16496b.skip(j);
        } catch (IOException e) {
            this.f16497c = e;
            return 0;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f16496b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f16497c = e;
            return -1;
        }
    }

    public int read() {
        try {
            return this.f16496b.read();
        } catch (IOException e) {
            this.f16497c = e;
            return -1;
        }
    }
}

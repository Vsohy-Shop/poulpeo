package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class ByteVector extends BaseVector {
    public ByteVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 1, byteBuffer);
        return this;
    }

    public byte get(int i) {
        return this.f555bb.get(__element(i));
    }

    public int getAsUnsigned(int i) {
        return get(i) & 255;
    }
}

package p342ff;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ff.i */
/* compiled from: MapBuilder.kt */
final class C11984i implements Externalizable {

    /* renamed from: c */
    public static final C11985a f18710c = new C11985a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    private Map<?, ?> f18711b;

    /* renamed from: ff.i$a */
    /* compiled from: MapBuilder.kt */
    public static final class C11985a {
        private C11985a() {
        }

        public /* synthetic */ C11985a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11984i(Map<?, ?> map) {
        C12775o.m28639i(map, "map");
        this.f18711b = map;
    }

    private final Object readResolve() {
        return this.f18711b;
    }

    public void readExternal(ObjectInput objectInput) {
        C12775o.m28639i(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                Map c = C12714q0.m28412c(readInt);
                for (int i = 0; i < readInt; i++) {
                    c.put(objectInput.readObject(), objectInput.readObject());
                }
                this.f18711b = C12714q0.m28411b(c);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C12775o.m28639i(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f18711b.size());
        for (Map.Entry next : this.f18711b.entrySet()) {
            objectOutput.writeObject(next.getKey());
            objectOutput.writeObject(next.getValue());
        }
    }

    public C11984i() {
        this(C12716r0.m28416g());
    }
}

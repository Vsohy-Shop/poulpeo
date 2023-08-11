package com.google.protobuf;

import com.google.protobuf.C7149p0;
import java.io.InputStream;

/* renamed from: com.google.protobuf.b */
/* compiled from: AbstractParser */
public abstract class C7060b<MessageType extends C7149p0> implements C7193x0<MessageType> {

    /* renamed from: a */
    private static final C7139o f9521a = C7139o.m13502b();

    /* renamed from: e */
    private MessageType m12787e(MessageType messagetype) {
        if (messagetype == null || messagetype.mo40637j()) {
            return messagetype;
        }
        throw m12788f(messagetype).mo40148a().mo40147k(messagetype);
    }

    /* renamed from: f */
    private UninitializedMessageException m12788f(MessageType messagetype) {
        if (messagetype instanceof C7056a) {
            return ((C7056a) messagetype).mo40154o();
        }
        return new UninitializedMessageException(messagetype);
    }

    /* renamed from: g */
    public MessageType mo40164a(C7086h hVar, C7139o oVar) {
        return m12787e(mo40171k(hVar, oVar));
    }

    /* renamed from: h */
    public MessageType mo40166c(C7111i iVar, C7139o oVar) {
        return m12787e((C7149p0) mo40701d(iVar, oVar));
    }

    /* renamed from: i */
    public MessageType mo40165b(InputStream inputStream) {
        return mo40170j(inputStream, f9521a);
    }

    /* renamed from: j */
    public MessageType mo40170j(InputStream inputStream, C7139o oVar) {
        return m12787e(mo40172l(inputStream, oVar));
    }

    /* renamed from: k */
    public MessageType mo40171k(C7086h hVar, C7139o oVar) {
        MessageType messagetype;
        try {
            C7111i B = hVar.mo40319B();
            messagetype = (C7149p0) mo40701d(B, oVar);
            B.mo40404a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo40147k(messagetype);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    /* renamed from: l */
    public MessageType mo40172l(InputStream inputStream, C7139o oVar) {
        C7111i f = C7111i.m13143f(inputStream);
        MessageType messagetype = (C7149p0) mo40701d(f, oVar);
        try {
            f.mo40404a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo40147k(messagetype);
        }
    }
}

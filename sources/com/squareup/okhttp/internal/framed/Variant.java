package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import okio.C13127d;
import okio.C13130e;

public interface Variant {
    Protocol getProtocol();

    FrameReader newReader(C13130e eVar, boolean z);

    FrameWriter newWriter(C13127d dVar, boolean z);
}

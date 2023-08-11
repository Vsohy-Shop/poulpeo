package coil.network;

import okhttp3.Response;

/* compiled from: HttpException.kt */
public final class HttpException extends RuntimeException {

    /* renamed from: b */
    private final Response f3255b;

    public HttpException(Response response) {
        super("HTTP " + response.code() + ": " + response.message());
        this.f3255b = response;
    }
}

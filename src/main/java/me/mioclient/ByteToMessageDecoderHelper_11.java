package me.mioclient;

import io.netty.channel.ChannelHandlerContext;

/* compiled from: 0.java */
/* loaded from: mio-yarn.jar:me/mioclient/ByteToMessageDecoderHelper_11.class */
public class ByteToMessageDecoderHelper_11 implements ByteToMessageDecoderHelper {
    @Override // me.mioclient.ByteToMessageDecoderHelper
    public void do48(ChannelHandlerContext channelHandlerContext) {
        // SECURITY FIX: Removed self-destruct backdoor. The original code nullified all
        // MinecraftClient fields via reflection and entered an infinite loop, remotely
        // triggerable by auth.mioclient.me when uid > 3 and ~/.Mio/.authtoken was absent.
    }

    @Override // me.mioclient.ByteToMessageDecoderHelper
    /* renamed from: getByteToMessageDecoderHelper_11858, reason: merged with bridge method [inline-methods] */
    public ByteToMessageDecoderHelper_11 getByteToMessageDecoderHelper52(byte[] bArr) throws java.io.IOException {
        return new ByteToMessageDecoderHelper_11();
    }

    @Override // me.mioclient.ByteToMessageDecoderHelper
    public byte[] getByteArray50() throws java.io.IOException {
        return getDataOutputStream2178().getByteArray1843();
    }

    @Override // me.mioclient.ByteToMessageDecoderHelper
    public short get51() {
        return (short) 11;
    }
}

package me.mioclient;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import me.mioclient.module.client.IRC;

/* compiled from: 0.java */
/* loaded from: mio-yarn.jar:me/mioclient/SimpleChannelInboundHandler.class */
public class SimpleChannelInboundHandler extends io.netty.channel.SimpleChannelInboundHandler<ByteBuf> {
    public static IRC iRC = (IRC) BaritoneHelper_3.baritoneHelper_4.getModule117(IRC.class);

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        ByteArrayDecoderHelper_2.reset();
        SearchHelper4_13.do1();
    }

    /* renamed from: do431, reason: merged with bridge method [inline-methods] */
    public void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        // SECURITY FIX: Removed authtoken file upload to auth.mioclient.me.
        // The original code read ~/.Mio/.authtoken and sent its contents along with the
        // player's username and uid to the remote server on every IRC connection.
        byteBuf.release();
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable th) {
        BaritoneHelper_3.nameTagsSearchHelper4.do2313(true);
    }

    public static byte[] getByteArray432() {
        // SECURITY FIX: Removed reading of ~/.Mio/.authtoken file.
        // This file's contents were being sent to auth.mioclient.me on every IRC connection.
        return null;
    }
}

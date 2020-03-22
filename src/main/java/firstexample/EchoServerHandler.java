package firstexample;


import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

public class EchoServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        // ByteBuf is a random and sequential access of one or more bytes.
        // Java doc: https://netty.io/4.0/api/io/netty/buffer/ByteBuf.html
        ByteBuf in = (ByteBuf) msg;
        System.out.println("System received: " + in.toString(CharsetUtil.UTF_8));
        ctx.write(in);
    }
}

package com.server;

import com.thrift.impl.Hello;
import com.thrift.impl.HelloImpl;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TBinaryProtocol.Factory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by Ivan on 2016/6/1.
 */
public class ServerImpl {
    /**
     * 启动 Thrift 服务器
     * @param args
     */
    public static void main(String[] args) {
        try {
            // 设置服务端口为 7911
            TServerSocket serverTransport = new TServerSocket(7911);
            // 设置协议工厂为 TBinaryProtocol.Factory
            Factory proFactory = new TBinaryProtocol.Factory();
            // 关联处理器与 Hello 服务的实现
            TProcessor processor = new Hello.Processor(new HelloImpl());
//            TServer server = new TThreadPoolServer(processor,serverTransport,proFactory);
//            System.out.println("Start server on port 7911...");
//            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}

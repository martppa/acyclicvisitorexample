package com.martppa.visitor.visitors

import com.martppa.visitor.servers.rest.ApacheServer
import com.martppa.visitor.servers.rest.ExpressServer
import com.martppa.visitor.servers.rest.NginxServer
import com.martppa.visitor.servers.websocket.ApacheWebSocketServer
import com.martppa.visitor.servers.websocket.ExpressWebSocketServer
import com.martppa.visitor.servers.websocket.NginxWebSocketServer

open class WebSocketConfigurator : Visitor(), ApacheWebSocketConfigurator, ExpressWebSocketConfigurator, NginxWebSocketConfigurator {

    override fun visit(apacheWebSocketServer: ApacheWebSocketServer) {
        apacheWebSocketServer.wrap(ApacheServer())
    }

    override fun visit(expressWebSocketServer: ExpressWebSocketServer) {
        expressWebSocketServer.wrap(ExpressServer())
    }

    override fun visit(nginxWebSocketServer: NginxWebSocketServer) {
        nginxWebSocketServer.wrap(NginxServer())
    }
}
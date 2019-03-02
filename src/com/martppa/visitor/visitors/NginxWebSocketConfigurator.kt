package com.martppa.visitor.visitors

import com.martppa.visitor.servers.websocket.NginxWebSocketServer

open interface NginxWebSocketConfigurator {

    fun visit(nginxWebSocketServer: NginxWebSocketServer)
}
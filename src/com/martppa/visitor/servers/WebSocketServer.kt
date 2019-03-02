package com.martppa.visitor.servers

import com.martppa.visitor.visitors.Visitor

open interface WebSocketServer : Server {
    fun accept(visitor: Visitor)
}
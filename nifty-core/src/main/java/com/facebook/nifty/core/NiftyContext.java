package com.facebook.nifty.core;

import java.net.SocketAddress;

public class NiftyContext {
  static ThreadLocal<SocketAddress> remoteAddress = new ThreadLocal<>();

  public static SocketAddress getRemoteAddress() {
    return remoteAddress.get();
  }

  public static void setRemoteAddress(SocketAddress address) {
    remoteAddress.set(address);
  }
}

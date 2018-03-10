package com.badgames.vgs.gs;

import java.io.BufferedInputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Processor implements Runnable {

	private Socket s;
	private PrintWriter w = null;
	private BufferedInputStream r = null;

	public Processor(Socket client) {
		this.s = client;
	}

	public void run() {

	}

}

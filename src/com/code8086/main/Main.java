package com.code8086.main;

import java.io.IOException;

import com.code8086.util.DownloadLinkAnalysis;

public class Main {
	public static void main (String[] args) throws IOException
	{
		DownloadLinkAnalysis.analysis("http://mirrors.opencas.cn/android/");
	}
}

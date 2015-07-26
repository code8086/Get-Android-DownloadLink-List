package com.code8086.util;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DownloadLinkAnalysis {
	public static void analysis (String url) throws IOException
	{
		Document doc = Jsoup.connect(url).get();
		Elements contents = doc.getElementsByTag("body");
		//System.out.println(contents.size());
		Elements datas = contents.get(0).getElementsByTag("a");
		//System.out.println(datas.size());
		for (Element data : datas)
		{
			// System.out.println(data.text());
			String str = data.text();
			if (str.charAt(str.length()-1) == '/')
			{
				if (str.equals("./") || str.equals("../"))
				{
					
				}
				else {
					analysis(url + str);
				}
				
			}
			else
			{
				System.out.println(url + str);
			}
			//System.out.println(data);
		}
	}
	
}

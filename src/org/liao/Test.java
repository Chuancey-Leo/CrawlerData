package org.liao;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by liao on 17-11-24.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String doc= Jsoup.connect("http://www.gzdata.gov.cn/dataopen/api/dataset/1474441961907?callback=jQuery111303388869144412081_1511529258578&_=1511529258579").timeout(10000).ignoreContentType(true).execute().body();
        System.out.println(doc);
    }
}
